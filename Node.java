/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 4
 * @author Juan Miguel Gonzalez-Campo 21077
 * @author Sebastian Franco 21484
 * @author Dimitrio Badani 20092
 * Clase Nodo
 */

public class Node<E> {
    private E element;
    private Node<E> next;
    private Node<E> prev;

    public Node(E element){ ///Se escoge solo el elemento que se va a trabajar.
        this.element = element;
        this.next = null;
        this.prev = null;
    }
    public E getElement(){
        return element;
    } //Se indica que elemento es
    public Node<E> getNext(){
        return next;
    } //Al finalizar con el primero, se escoge el siguiente
    public void setElement(E element){
        this.element = element;
    } //Se indica cual es el elemento con el que se va a trabajar
    public void setNext(Node<E> next){
        this.next = next;
    } //Se indica el siguiente elemento
    public Node<E> getPrev(){
        return prev;
    } //Elemento previo
    public void setPrev(Node<E> prev){
        this.prev = prev;
    } //Set de elemento previo
}
