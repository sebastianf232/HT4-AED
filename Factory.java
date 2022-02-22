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
        while (on){ ///Mientras este activa el Factory se hace el proceso. Se ingresa que tipo de stack o ista a usar.
            System.out.println("Ingrese tipo de stack a utilziar: \n1.Vector \n2. ArrayList \n3. Lista (debera escoger tipo de lista)");
            try{
                i = scan.nextInt();
            } catch (Exception e){
                /// Se pone la Exception para obtener errores del usuario.
                System.out.println("Ingrese solo 1, 2 o 3");
                continue;
            }
            if (i <= 0 || i > 3){
                /// Se pone la Exception para obtener errores del usuario.
                System.out.println("Ingrese solo 1, 2 o 3");
                continue;
            }
            break;
        }

        if(i == 1){ ///Stack de Pilas de Vector
            stack = new StackPV<>();
        } if (i == 2){ ///Stack de Pilas de ArrayList
            stack = new StackPAL<>();
        } if (i == 3){ ///Stack de Listas, donde tendra que escoger el tipo de lista.
            stack = new StackPL<>();
        }
        return stack; ///Se regresa el Stack segun el orden que se escogio.
    }
}
