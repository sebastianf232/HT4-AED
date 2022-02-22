import java.util.Scanner;

/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 4
 * @author Juan Miguel Gonzalez-Campo 21077
 * @author Sebastian Franco 21484
 * @author Dimitrio Badani 20092
 * Clase Factory
 */
public class Factory<E> {
    private Pilas<E> stack;
    public Pilas<E> getStack(){
        Scanner scan = new Scanner(System.in);
        boolean on = true;
        int i = 0;
        while (on){
            System.out.println("Ingrese tipo de stacka a utilziar: \n1.Vector \n2. ArrayList \n3. Lista (debera escoger tipo de lista)");
            try{
                i = scan.nextInt();
            } catch (Exception e){
                System.out.println("Ingrese solo 1, 2 o 3");
                continue;
            }
            if (i <= 0 || i > 3){
                System.out.println("Ingrese solo 1, 2 o 3");
                continue;
            }
            break;
        }
        
        
        if(i == 1){
            stack = new StackPV<>();
        } if (i == 2){
            stack = new StackPAL<>();
        } if (i == 3){
            stack = new StackPL<>();
        }
        return stack;
    }
}
