package expressivo;
import java.util.Objects;

/**
 * BinaryOperation represents an operation like addition, subtraction, etc.
 */
public class BinaryOperation implements Expression {
    private final String operator; 
    private final Expression left; 
    private final Expression right; 

    /**
     * Constructor to create a binary operation.It takes the operator (e.g., "+") as input and the leftOperand,rightOperand of the operation.
     */
    public BinaryOperation(String operator, Expression left, Expression right) {
        this.operator = operator;
        this.left = left;
        this.right = right;
        checkRep();
    }
    private void checkRep() {
        assert operator != null : "Operator should not be null";
        assert left != null : "Left operand should not be null";
        assert right != null : "Right operand should not be null";
    }
    /**
     * Converts the binary operation to a string.It returns the string representation of the operation.
     */
    @Override
    public String toString() {
        return "(" + left.toString() + " " + operator + " " + right.toString() + ")";
    }
    /**
     * Checks if two binary operations are the same.It takes the otherObj the object to compare as input and returns true if the operations are the same, otherwise false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof BinaryOperation)) return false;
        BinaryOperation other = (BinaryOperation) obj;
        return this.operator.equals(other.operator) &&
               this.left.equals(other.left) &&
               this.right.equals(other.right);
    }
    /**
     * Returns a unique hash code for this binary operation.
     */
    @Override
    public int hashCode() {
        return Objects.hash(operator, left, right);
    }
}

