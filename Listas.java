import org.w3c.dom.Node;
/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 4
 * @author Juan Miguel Gonzalez-Campo 21077
 * @author Sebastian Franco 21484
 * @author Dimitrio Badani 20092
 * Abstract Class Listas
 */
public abstract class Listas<E> implements InterfazListas<E>{
    @Override
    public boolean isEmpty(){
        return size() == 0;
    }
}
