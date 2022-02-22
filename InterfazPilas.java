/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 4
 * @author Juan Miguel Gonzalez-Campo 21077
 * @author Sebastian Franco 21484
 * @author Dimitrio Badani 20092
 * Interfaz Pilas
 */
public interface InterfazPilas<E> {
    /**
     * Add an item to the stack. Will be popped next.
     * @param item
     */
    public void add(E item);

    /**
     * If the Stack is not empty, the most recent item will be removed and returned.
     * @return Item
     */
    public E remove();

    /**
     * Get the current Item on the Stack (without popping it).
     * @return Item
     */
    public E peek();

    /**
     * Check if the Stack is empty.
     * @return Boolean indicating if the Stack is empty
     */
    public boolean empty();

    /**
     * Get the size of the Stack.
     * @return Integer indicating the size of the Stack
     */
    public int size();
}
