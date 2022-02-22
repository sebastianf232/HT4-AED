/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos
 * Hoja de Trabajo 4
 * @author Juan Miguel Gonzalez-Campo 21077
 * @author Sebastian Franco 21484
 * @author Dimitrio Badani 20092
 * Clase Calculadora
 */
public class Calculadora {
    private Pilas<Double> stack = new Factory().getStack();
    static boolean instance_flag = false;

    public Calculadora(){
        if (instance_flag){
            throw new SingletonException("Solo una calculadora permitida");
        } else {
            instance_flag = true;
            System.out.println("Calculadora encendida");
        }
    }
    public double calculate(String operation) throws SingletonException {
        /**
         * Son los atributos que entran al Stack.
         * Dentro del stack se ve que tipo de simbolo es y se hace la operación a base de el.
         */
        double oper1;
        double oper2;
        double res;
        double resFinal;
        String[] op = operation.split(" ");
        for (String a: op){
            /**
             * Permite ver si el simbolo de entrada es una suma.
             */
            if (a.equals("+")){
                oper1 = stack.peek();
                stack.remove();
                oper2 = stack.peek();
                stack.remove();
                res = oper2 + oper1;
                stack.add(res);
            /**
             * Permite ver si el simbolo de entrada es una resta.
             */
            } if (a.equals("-")) {
                oper1 = stack.peek();
                stack.remove();
                oper2 = stack.peek();
                stack.remove();
                res = oper2 - oper1;
                stack.add(res);
            /**
             * Permite ver si el simbolo de entrada es una multiplicacion.
             */
            } if (a.equals("*")) {
                oper1 = stack.peek();
                stack.remove();
                oper2 = stack.peek();
                stack.remove();
                res = oper2 * oper1;
                stack.add(res);
                
            /**
             * Permite ver si el simbolo de entrada es una division.
             */
            } if (a.equals("/")) {
                oper1 = stack.peek();
                stack.remove();
                oper2 = stack.peek();
                stack.remove();
                res = oper2 / oper1;
                stack.add(res); 
            } else {
                 /**
                 * Si no se encuentra ninguno de los simbolos el programa indica la excepcion.
                 */
                try{
                    stack.add(Double.valueOf(a));
                } catch (Exception e){
                    
                }
                
            }            
        }
        /** 
         * Se resuelve la operacion.
         */
        resFinal = stack.peek();
        return resFinal;
        
    }
    public void finalize(){
        instance_flag = false;
    }
    
}

