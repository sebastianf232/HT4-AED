import java.sql.Struct;

/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 4
 * @author Juan Miguel Gonzalez-Campo 21077
 * @author Sebastian Franco 21484
 * @author Dimitrio Badani 20092
 * Interfaz Listas
 */
public interface InterfazListas<E>{
    public int size();
    // post: returns number of elements in list
    public boolean isEmpty();
    // post: returns true iff list has no elements
    public void addFirst(E item);
    // post: value is added to beginning of list
    public void addLast(E item);
    // post: value is added to end of list
    public Node<E> getFirst();
    // pre: list is not empty
    // post: returns first value in list
    public Node<E> getLast();
    // pre: list is not empty
    // post: returns last value in list
    public Node<E> removeFirst();
    // pre: list is not empty
    // post: removes first value from list
    public Node<E> removeLast();
    // pre: list is not empty
    // post: removes last value from list
}
