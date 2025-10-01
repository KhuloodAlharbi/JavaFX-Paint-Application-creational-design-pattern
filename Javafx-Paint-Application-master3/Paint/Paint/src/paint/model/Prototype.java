package paint.model;
    // Added: new Prototype interface to define cloning behavior
    // Classes implementing this interface must provide makeCopy()
public interface Prototype extends Cloneable {
    Prototype makeCopy() throws CloneNotSupportedException;
}