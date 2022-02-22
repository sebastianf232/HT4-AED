import java.util.Scanner;

/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 4
 * @author Juan Miguel Gonzalez-Campo 21077
 * @author Sebastian Franco 21484
 * @author Dimitrio Badani 20092
 * Clase ListFactory
 */

public class ListFactory<E> { ///Ellige que tipo de lista quiere utilizar
    private Listas<E> list;
    public Listas<E> getList(){
        Scanner scan = new Scanner(System.in);
        boolean on = true;
        int i = 0;
        while (on){
            System.out.println("Ingrese tipo de lista a utilziar: \n1.Single linked \n2. Double linked \n3. Circularly linked");
            try{
                i = scan.nextInt();
            } catch (Exception e){ //Errores
                System.out.println("Ingrese solo 1, 2 o 3");
                continue;
            }
            if (i <= 0 || i > 3){ //Errores
                System.out.println("Ingrese solo 1, 2 o 3");
                continue;
            }
            break;
        }
        
        
        if(i == 1){ // Se escogen Single Lists
            list = new ListasSingle<>();
        } if (i == 2){ //Se escogen Double Lists
            list = new ListasDouble<>();
        } if (i == 3){ //Se escogen Circular Lists
            list = new ListasCircular<>();
        }
        return list;
    }
}
