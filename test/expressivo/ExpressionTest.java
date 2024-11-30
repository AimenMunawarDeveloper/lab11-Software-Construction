/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test suite for the Expression implementations: Variable, Number, and BinaryOperation.
 */
public class ExpressionTest {
	// Testing strategy
	//  TODO

	@Test(expected=AssertionError.class)
		public void testAssertionsEnabled() {
			assert false; // make sure assertions are enabled with VM argument: -ea
	}
	//TODO tests for Expression
	//tests for variables
	@Test
	// This test ensures that the "Variable" class correctly converts the variable to its string representation.
	public void testVariableToStringRepresentation() {
	    Expression variableX = new Variable("x");
	    String variableXString = variableX.toString();
	    System.out.println("after converting variable to string:" + variableXString);
	    assertEquals("x", variableXString);
	}
	@Test
	// This test checks if the "Variable" class correctly compares two variables for equality based on their names.
	public void testVariableEquals() {
	    Expression variable1 = new Variable("y");
	    Expression variable2 = new Variable("y");
	    Expression variable3 = new Variable("z");

	    System.out.println("Variable1 equals Variable2: " + variable1.equals(variable2));
	    System.out.println("Variable1 equals Variable3: " + variable1.equals(variable3));

	    assertEquals(variable1, variable2);
	    assertNotEquals(variable1, variable3);
	}
	@Test
	// This test verifies that the "Variable" class generates consistent hash codes for variables with the same or different names.
	public void testVariableHashCode() {
	    Expression variable1 = new Variable("x");
	    Expression variable2 = new Variable("x");
	    Expression variable3 = new Variable("y");

	    System.out.println("Variable1 hashCode equals Variable2 hashCode: " + (variable1.hashCode() == variable2.hashCode()));
	    System.out.println("Variable1 hashCode equals Variable3 hashCode: " + (variable1.hashCode() == variable3.hashCode()));

	    assertEquals(variable1.hashCode(), variable2.hashCode());
	    assertNotEquals(variable1.hashCode(), variable3.hashCode());
	}
	// testing for numbers
	@Test
	// This test checks if the"Number" class correctly converts the number to a string format.
	public void testNumberToStringRepresentation() {
	    Expression numberValue = new Number(4.556);
	    String numberString = numberValue.toString();
	    System.out.println("number in the string format is: " + numberString);
	    assertEquals("4.556", numberString);
	}
	@Test
	// This test checks if two numbers with the same value are considered equal.
	public void testNumberEquals() {
	    Expression number1 = new Number(2.34);
	    Expression number2 = new Number(2.34);
	    Expression number3 = new Number(5.67);
	    System.out.println("Number1 equals Number2: " + number1.equals(number2));
	    System.out.println("Number1 equals Number3: " + number1.equals(number3));
	    assertEquals(number1, number2);
	    assertNotEquals(number1, number3);
	}
	@Test
	// This test checks if numbers with the same value return the same hash code.
	public void testNumberHashCode() {
	    Expression number1 = new Number(1.02);
	    Expression number2 = new Number(1.02);
	    Expression number3 = new Number(6.88);
	    System.out.println("Number1 hashCode equals Number2 hashCode: " + (number1.hashCode() == number2.hashCode()));
	    System.out.println("Number1 hashCode equals Number3 hashCode: " + (number1.hashCode() == number3.hashCode()));

	    assertEquals(number1.hashCode(), number2.hashCode());
	    assertNotEquals(number1.hashCode(), number3.hashCode());
	}
	// testing for binary operation
	@Test
	// This test checks if the "BinaryOperation" class correctly converts the operation to a string format.
	public void testBinaryOperationToStringRepresentation() {
	    Expression variableX = new Variable("x");
	    Expression variableY = new Variable("y");
	    Expression additionOperation = new BinaryOperation("+", variableX, variableY);
	    String result = additionOperation.toString();
	    System.out.println("Binary Operation toString: " + result);
	    assertEquals("(x + y)", result);
	}
	@Test
	// This test checks if the "BinaryOperation" class correctly compares equality between two operations with the same or different expressions.
	public void testBinaryOperationEquals() {
	    Expression variableX = new Variable("x");
	    Expression variableY = new Variable("y");
	    Expression additionOperation1 = new BinaryOperation("+", variableX, variableY);
	    Expression additionOperation2 = new BinaryOperation("+", new Variable("x"), new Variable("y"));
	    Expression subtractionOperation = new BinaryOperation("-", variableX, variableY);
	    System.out.println("Addition Operation 1 equals Addition Operation 2: " + additionOperation1.equals(additionOperation2));
	    System.out.println("Addition Operation 1 equals Subtraction Operation: " + additionOperation1.equals(subtractionOperation));

	    assertEquals(additionOperation1, additionOperation2);
	    assertNotEquals(additionOperation1, subtractionOperation);
	}
	@Test
	// This test checks if the "BinaryOperation" class generates the correct hashCode for operations.
	public void testBinaryOperationHashCode() {
	    Expression variableX = new Variable("x");
	    Expression variableY = new Variable("y");
	    Expression additionOperation1 = new BinaryOperation("+", variableX, variableY);
	    Expression additionOperation2 = new BinaryOperation("+", new Variable("x"), new Variable("y"));
	    Expression subtractionOperation = new BinaryOperation("-", variableX, variableY);

	    System.out.println("Addition Operation 1 hashCode equals Addition Operation 2 hashCode: " + (additionOperation1.hashCode() == additionOperation2.hashCode()));
	    System.out.println("Addition Operation 1 hashCode equals Subtraction Operation hashCode: " + (additionOperation1.hashCode() == subtractionOperation.hashCode()));

	    assertEquals(additionOperation1.hashCode(), additionOperation2.hashCode());
	    assertNotEquals(additionOperation1.hashCode(), subtractionOperation.hashCode());
	}
}

