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
    public void addFirst(E item){ ///Metodo que permite poner la cabeza de la lista
        Node<E> Node = new Node(item);
        if (head == null){
            head = tail = Node;
        }
        Node.setNext(head);
        head = Node;

        size++;
    }
    @Override
    public void addLast(E item){ ///Metodo que quita la cabeza y crea una nueva lista detras de la cabeza.
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
    public Node<E> removeFirst(){ ///Metodo que quita el primer valor de la lista luego de haber asignado el valor correcto.
        if (head == null){ ///Indica que la lista esta vacia
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
    public Node<E> removeLast(){/// Metodo que quita el ultimo valor de la lista.
        Node<E> nodoAntes, nodoRemover;

        if (head == null){ ///Indica que la lista esta vacia
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
        while(nodoRemover.getNext()!=head){
            nodoAntes = nodoRemover;
            nodoRemover = nodoRemover.getNext();
        }
        if (nodoAntes != null){
            nodoAntes.setNext(head);
            tail = nodoAntes;
        }
        size--;
        return nodoRemover;
        }
    }
    public Node<E> getFirst(){
        return head;
    } ///Metodo que regresa la head de la lista
    public Node<E> getLast(){
        return tail;
    } ///Metodo que regresa la tail de la lista
    public int size(){
        return size;
    } ///Metodo que regresa el tamanio de la lista
}
