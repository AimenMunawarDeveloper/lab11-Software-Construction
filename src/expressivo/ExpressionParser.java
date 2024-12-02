package expressivo;

import java.util.Stack;

public class ExpressionParser {

    /**
     * Parses an input mathematical expression string into an Expression object.It takes the string representing the mathematical expression as input and returns the parsed Expression object
     */
    public static Expression parse(String input) {
        input = input.replaceAll("\\s+", "");         // Remove all whitespace 
        return parseExpression(input);
    }
    /**
     * method to parse the input string into an Expression.This method takes the string to parse as input and return the parsed Expression
     */
    private static Expression parseExpression(String input) {
        Stack<Expression> terms = new Stack<>();   // to store operands 
        Stack<Character> operators = new Stack<>(); // to store operators
        int i = 0;
        while (i < input.length()) {
            char current = input.charAt(i);

            // Parse numbers 
            if (Character.isDigit(current) || current == '.') {
                int start = i;
                while (i < input.length() && (Character.isDigit(input.charAt(i)) || input.charAt(i) == '.')) {
                    i++;
                }
                double value = Double.parseDouble(input.substring(start, i));
                terms.push(new Number(value));
            // Parse variable names 
            } else if (Character.isLetter(current)) {
                int start = i;
                while (i < input.length() && Character.isLetterOrDigit(input.charAt(i))) { // Continue reading letters or digits to form the full variable name
                    i++;
                }
                String varName = input.substring(start, i);
                terms.push(new Variable(varName));
            // Handle parentheses
            } else if (current == '(') {
                operators.push(current); // Push the '(' onto the stack
                i++;
            // Handle parentheses
            } else if (current == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') { // Pop and apply operators until a matching '(' is found
                    applyOperator(terms, operators.pop());
                }
                if (operators.isEmpty() || operators.pop() != '(') {   // Ensure there is a matching '('
                    throw new IllegalArgumentException("Mismatched parentheses");
                }
                i++;
            // Handle operators
            } else if (current == '+' || current == '-' || current == '*' || current == '/') {
                while (!operators.isEmpty() && precedence(operators.peek()) >= precedence(current)) {  // Pop and apply operators with higher or equal precedence
                    applyOperator(terms, operators.pop());
                }
                // Push the current operator onto the stack
                operators.push(current);
                i++;

            // Handle invalid characters in the input
            } else {
                throw new IllegalArgumentException("Invalid character in input: " + current);
            }
        }

        // Apply any remaining operators
        while (!operators.isEmpty()) {
            applyOperator(terms, operators.pop());
        }
        // Ensure there is exactly one term left on the stack, representing the final expression
        if (terms.size() != 1) {
            throw new IllegalArgumentException("Invalid expression");
        }

        return terms.pop();
    }

    /**
     * Applies an operator to the top two expressions on the terms stack.It takes the terms the stack of operands as input and return the the operator to apply
     */
    private static void applyOperator(Stack<Expression> terms, char operator) {
        if (terms.size() < 2) {       // Ensure there are at least two operands for the operator
            throw new IllegalArgumentException("Invalid expression: missing operands for operator " + operator);
        }
        Expression right = terms.pop(); // Right operand
        Expression left = terms.pop();  // Left operand
        terms.push(new BinaryOperation(String.valueOf(operator), left, right));  // Create a new BinaryOperation and push it onto the terms stack
    }
    /**
     * Returns the precedence of the given operator.Higher precedence value means the operator binds more tightly.
     */
    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2; 
            default:
                return 0; 
        }
    }
}
