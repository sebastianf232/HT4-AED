/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 4
 * @author Juan Miguel Gonzalez-Campo 21077
 * @author Sebastian Franco 21484
 * @author Dimitrio Badani 20092
 * Clase Stack Listas Double linked
 */
public class ListasDouble<E> extends Listas<E> {
    Node head, tail = null;
    int size = 0;
    @Override
    public void addFirst(E item){
        Node<E> Node = new Node(item);
        if (tail == null){
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
        node.setPrev(tail);
        tail.setNext(node);
        tail = node;
        

        size++;
    }
    @Override
    public Node<E> removeFirst(){
        if (head == null){
            System.out.println("lista vacia");
            return null;
        }
        Node<E> node;
        node = head;
        head = head.getNext();
        node.setNext(null);
        size--;
        return node;
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
