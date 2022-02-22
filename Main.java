import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    static String path = "datos.txt";
    static String line = null;
    static Calculadora calc = new Calculadora();
    static ArrayList<String> a = new ArrayList<String>();
    
    
    public static int prec(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        } return -1;
    }

    public static String espaciado(String s){
        return s.replaceAll(".(?!$)", "$0 ");
    }

    public static String convertir(String exp){
        // initializing empty String for result
        String result = new String("");
         
        // initializing empty stack
        StackPV<Character> stack = new StackPV<>();
         
        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);
             
            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;
              
            // If the scanned character is an '(',
            // push it to the stack.
            else if (c == '(')
                stack.add(c);
             
            //  If the scanned character is an ')',
            // pop and output from the stack
            // until an '(' is encountered.
            else if (c == ')')
            {
                while (!stack.empty() &&
                        stack.peek() != '(')
                    result += stack.remove();
                 
                    stack.remove();
            }
            else // an operator is encountered
            {
                while (!stack.empty() && prec(c)
                         <= prec(stack.peek())){
                   
                    result += stack.remove();
             }
                stack.add(c);
            }
      
        }
      
        // pop all the operators from the stack
        while (!stack.empty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            result += stack.remove();
         }
        
        return espaciado(result);
    }

    public static void leerArchivo(){
        try {
            /**
             * Mientras haya un archivo, se lee.
             */
            BufferedReader reader = new BufferedReader(new FileReader(path));
            while((line = reader.readLine()) != null){
                a.add(line);
            }
        } catch(Exception e){
            System.out.println("Error al leer archivo");
        }
    }
    public static void main(String args[]) {
        leerArchivo();
        System.out.println("Respuestas:");
        for (int i = 0; i < a.size(); i++){
            System.out.println(calc.calculate(convertir(a.get(i))));
        }
        
    } 
}
