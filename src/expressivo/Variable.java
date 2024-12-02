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
     * If the variable of the expression matches the given variable, the derivative is 1.Otherwise, the derivative is 0, as the variable does not affect the expression.
     */
    public Expression differentiate(String variable) {
        return this.variableName.equals(variable) ? new Number(1) : new Number(0);
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
