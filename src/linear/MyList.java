package linear;

/**
 * Abstract data structure of type List
 *
 * @author Miroslav Petkov
 */
public interface MyList {

    /**
     * Adds element in the list
     *
     * @param element the element to be added
     */
    void add(Object element);

    /**
     * Inserts certain element on specific index
     *
     * @param index   the position of the element that needs to be added
     * @param element the element to add in the collection on the desired index
     */
    void add(int index, Object element);

    /**
     * Removes the element from the collection, if the element exists in the collection,
     * and returns the removed object, if the element does not exist it returns null.
     *
     * @param element the element to remove from the collection
     */
    Object remove(Object element);

    /**
     * Removes the element from the collection on the specified index
     *
     * @param index the position of the element that needs to be removed
     */
    Object remove(int index);

    /**
     * Retrieve the element at the given index
     *
     * @param index of the searched element
     * @return the object that is on the given index
     */
    Object get(int index);

    /**
     * Retrieve index of certain element
     *
     * @param index the element to find
     * @return the object that is on the given position, or -1 if the object does not exist in the collection
     */
    int indexOf(Object element);

    /**
     * Clears the collection
     */
    void clear();

    /**
     * @return the count of elements in the collection
     */
    int size();
}
