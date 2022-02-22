/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 4
 * @author Juan Miguel Gonzalez-Campo 21077
 * @author Sebastian Franco 21484
 * @author Dimitrio Badani 20092
 * Clase Stack Listas Single linked
 */
public class ListasSingle<E> extends Listas<E> {
    private Node<E> head, tail;
    private int size;

    public ListasSingle(){
        head = null;
        tail = null;
        size = 0;
    }
    public void addFirst(E item){
        Node<E> Node = new Node(item)
        if (tail == null){
            tail = Node;
        }
        Node.setNext(head);
        head = Node;

        size++;
    }
    @Override
    public void addLast(E item) {
        Node<E> Node = new Node(item);
        Node.setNext(null);
        tail.setNext(Node);
        tail = Node;
        size++;
    }
    public Node<E> removeFirst() {
        if (head == null){
            return null;
        }
        Node<E> temp = head;
        head = head.getNext();
        temp.setNext(null);
        size--;
 
        return temp;
    } 
    public Node<E> removeLast(){
        Node<E> nodoAntes, nodoRemover;

        if (size == 0){
            return null;
        }
        nodoAntes = getFirst();
        for (int a = 0; a < size-2; a++){
            nodoAntes = nodoAntes.getNext();
        }
        nodoRemover = tail;

        nodoAntes.setNext(null);
        tail = nodoAntes;
        size--;
        return nodoAntes;
    }
    public Node<E> getFirst(){
        return head;
    }
    public Node<E> getLast(){
        return tail;
    }
    public int size(){
        return size;
    }
}
