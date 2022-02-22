import java.util.Vector;

/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 4
 * @author Juan Miguel Gonzalez-Campo 21077
 * @author Sebastian Franco 21484
 * @author Dimitrio Badani 20092
 * Clase Stack Pilas Vector
 */
public class StackPV<E> extends Pilas<E>{
    Vector<E> v = new Vector<E>();

    @Override
    public void add(E item) {
        v.addElement(item);
    }

    @Override
    public E remove() {
        //Pre: hay un elemento
        //Post: le quita un elemento al ArrayList
        if (v.size()>0){
            return v.remove(v.size()-1);
        }
        return null;
    }

    @Override
    public E peek() {
        //Pre: hay un elemento
        //Post: se obtiene el numero de elementos
        if (v.size()>0){
            return v.get(v.size()-1);
        }
        return null;
    }
    @Override
    public int size() {
        return v.size();
    }
}
