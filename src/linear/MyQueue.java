package linear;

/**
 * Abstract data structure of type Queue
 *
 * @author Miroslav Petkov
 */
public interface MyQueue {

    /**
     * Adds element to the end of the collection
     *
     * @param element to be added
     */
    void offer(Object element);

    /**
     * Takes the element from the beginning of the collection and removes it
     *
     * @return the element on the beginning of the collection, null if collection if empty
     */
    Object poll();

    /**
     * Takes the element from the beginning of the collection
     *
     * @return the element on the beginning of the collection, null if collection if empty
     */
    Object peek();

    /**
     * Clears the collection
     */
    void clear();

    /**
     * Checks if element exists in the collection
     *
     * @param element the element to check if exists
     * @return true if the collection contains the given element, false otherwise
     */
    boolean contains(Object element);
}
