package expressivo;
import java.util.Objects;

/**
 * Variable represents a variable in the expression.
 */
public class Variable implements Expression {
	private final String variableName; 
	 /**
     * Constructor to create a variable with a name.It takes the name of the variable as input.
     */
    public Variable(String variableName) {
        this.variableName = variableName;
    }
    /**
     * Converts the variable to a string.It returns the name of the variable.
     */
    @Override
    public String toString() {
        return variableName; 
    }
    /**
     * Checks if two variables are the same.It takes the otherObj the object to compare as input.It returns true if the variables have the same name, otherwise false.
     */
    @Override
    public boolean equals(Object otherObj) { 
        if (this == otherObj) {
        	return true;
        }
        if (!(otherObj instanceof Variable)) { 
        	return false;
        }
        Variable other = (Variable) otherObj;
        return this.variableName.equals(other.variableName); 
    }
    /**
     * Returns a unique hash code for this variable.
     */
    @Override
    public int hashCode() {
        return Objects.hash(variableName); 
    }
}
