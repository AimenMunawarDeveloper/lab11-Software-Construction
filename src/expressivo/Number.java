package expressivo;
import java.util.Objects;

/**
 * Number represents a number in the expression.
 */
public class Number implements Expression {
	private final double numericValue; 
	 /**
     * Constructor to create a number.It takes a numericValue as input that is the number's value.
     */
    public Number(double numericValue) {
        this.numericValue = numericValue;
    }
    /**
     * Converts the number to a string and return the string representation of the number.
     */
    @Override
    public String toString() {
        return Double.toString(numericValue); 
    }
    /**
     * Checks if two numbers are the same.It takes the "otherObj" the object to compare as input.It returns true if the numbers are equal, otherwise false.
     */
    @Override
    public boolean equals(Object otherObj) { 
        if (this == otherObj) {
        	return true;
        }
        if (!(otherObj instanceof Number)) {
        	return false;
        }
        Number other = (Number) otherObj;
        return Double.compare(this.numericValue, other.numericValue) == 0; 
    }
    /**
     * Returns a unique hash code for this number.
     */
    @Override
    public int hashCode() {
        return Objects.hash(numericValue); 
    }
}

