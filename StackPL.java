/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 4
 * @author Juan Miguel Gonzalez-Campo 21077
 * @author Sebastian Franco 21484
 * @author Dimitrio Badani 20092
 * Clase Stack Pilas List
 */
public class StackPL<E> extends Pilas<E>{
    Listas<E> v;
    
    public StackPL(){
        v = new ListFactory().getList();
    }

    // para istanciar un stack de lista en el test (sin inputs)
    public StackPL(int i){
        if (i == 1){
            v = new ListasSingle<E>();
        } if (i == 2){
            v = new ListasDouble<E>();
        } if (i == 3){
            v = new ListasCircular<E>();
        }
    }
    


    @Override
    public void add(E item) {
        v.addLast(item);
    }

    @Override
    public E remove() {
        //Pre: hay un elemento
        //Post: le quita un elemento al ArrayList
        if (v.size()>0){
            return v.removeLast().getElement();
        }
        return null;
    }

    @Override
    public E peek() {
        //Pre: hay un elemento
        //Post: se obtiene el numero de elementos
        if (v.size()>0){
            return v.getLast().getElement();
        }
        return null;
    }
    @Override
    public int size() {
        return v.size();
    }
}
