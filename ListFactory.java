import java.util.Scanner;

public class ListFactory<E> {
    private Listas<E> list;
    public Listas<E> getList(){
        Scanner scan = new Scanner(System.in);
        boolean on = true;
        int i = 0;
        while (on){
            System.out.println("Ingrese tipo de lista a utilziar: \n1.Single linked \n2. Double linked \n3. Circularly linked");
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
            list = new ListasSingle<>();
        } if (i == 2){
            list = new ListasDouble<>();
        } if (i == 3){
            list = new ListasCircular<>();
        }
        return list;
    }
}
