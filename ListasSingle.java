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
        Node<E> Node = new Node(item);
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
        if (tail != null){
            tail.setNext(Node);
            tail = Node;
            size++;
        } else {
            tail = head = Node;
            size++;
        }
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

        if (head == null){
            System.out.println("Lista vacia");
            return null;
        } 
        if(size == 1){
            nodoAntes = tail;
            head = tail = null;
            return nodoAntes;
        }
        else{
        nodoRemover = head;
        nodoAntes = null;
        while(nodoRemover.getNext()!=null){
            nodoAntes = nodoRemover;
            nodoRemover = nodoRemover.getNext();
        }
        if (nodoAntes != null){
            nodoAntes.setNext(null);
            tail = nodoAntes;
        }
        size--;
        return nodoRemover;
        }
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
