package linear;

/**
 * Abstract data structure of type Stack
 *
 * @author Miroslav Petkov
 */
public interface MyStack {

    /**
     * Adds element in the collection
     *
     * @param element - the element to be added
     */
    void push(Object element);

    /**
     * Returns the last element that was added into the stack,
     * and removes it from the stack
     *
     * @return the last element from the stack, null if stack is empty
     */
    Object pop();

    /**
     * Returns the last element that was added into the collection
     *
     * @return the last element from the stack, null if stack is empty
     */
    Object peek();

    /**
     * Returns the count of the elements in the collection
     *
     * @return the count of the elements
     */
    int size();

    /**
     * Clears the stack
     */
    void clear();

    /**
     * Checks if given element is inside the collection
     *
     * @return true if element exists, else false
     */
    boolean contains(Object element);

    /**
     * @return array containing all the elements from the collection
     */
    Object[] toArray();
}
