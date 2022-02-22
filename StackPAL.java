import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 4
 * @author Juan Miguel Gonzalez-Campo 21077
 * @author Sebastian Franco 21484
 * @author Dimitrio Badani 20092
 * Clase Stack Pilas ArrayList
 */
public class StackPAL<E> extends Pilas<E> {
    ArrayList<E> v = new ArrayList<E>();

    @Override
    public void add(E item) {
        v.add(item);
    } ///Permite aniadir elementos al Stack

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
    public boolean empty() {
        //Post: indica si hay un elemento en ArrayList

        if(v.size()>0){
            return false;
        }
        return true;
    }

    @Override
    public int size() {
        return v.size();
    }
    
}
