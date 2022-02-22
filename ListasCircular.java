/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 4
 * @author Juan Miguel Gonzalez-Campo 21077
 * @author Sebastian Franco 21484
 * @author Dimitrio Badani 20092
 * Clase Stack Listas Circular
 */
public class ListasCircular<E> extends Listas<E> {
    Node head, tail = null;
    int size = 0;
    @Override
    public void addFirst(E item){
        Node<E> Node = new Node(item);
        if (head == null){
            head = tail = Node;
        }
        Node.setNext(head);
        head = Node;

        size++;
    }
    @Override
    public void addLast(E item){
        Node<E> node = new Node(item);
        if (tail == null){
            head = tail = node;
        }     
        tail.setNext(node);
        tail = node;
        tail.setNext(head);

        size++;
    }
    @Override
    public Node<E> removeFirst(){
        if (head == null){
            System.out.println("lista vacia");
            return null;
        }
        Node<E> node, node2;
        node = head;
        head = head.getNext();
        node.setNext(null);
        size--;
        return node;
    }
    public Node<E> removeLast(){
        Node<E> nodoAntes, nodoRemover;

        if (tail == null){
            return null;
        }
        nodoAntes = getFirst();
        for (int a = 0; a < size-2; a++){
            nodoAntes = nodoAntes.getNext();
        }
        nodoRemover = tail;
        nodoAntes.setNext(head);
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
