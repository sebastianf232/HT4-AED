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
    private Pilas<Double> stack;
    static boolean instance_flag = false;

    public Calculadora(){ ///Constructor de la clase

        if (instance_flag){
            throw new SingletonException("Solo una calculadora permitida"); ///Indica que la calculadora ya estaba encendida.
        } else {
            stack = new Factory().getStack(); ///Se instancia la Factory
            instance_flag = true;
            System.out.println("Calculadora encendida"); ///Indica que la calculadora se encendio
        }
    }

    // Para instanciar la calculadora en el test (sin inputs)
    public Calculadora(int i){
        if (i == 1){
            stack = new StackPV<Double>();
        } if (i == 2){
            stack = new StackPAL<Double>();
        } if (i == 3){
            stack = new StackPL<Double>(1);
        } if (i==4){
            stack = new StackPL<Double>(2);
        }if (i==5){
            stack = new StackPL<Double>(3);
        }
    }
    public double calculate(String operation) throws SingletonException {
        /**
         * Son los atributos que entran al Stack.
         * Dentro del stack se ve que tipo de simbolo es y se hace la operación a base de el.
         * todos los doubles son los digitos/ operadores
         */
        double oper1;
        double oper2;
        double res;
        double resFinal;
        String[] op = operation.split(" "); ///Lista de la operacion del .txt
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
    } ///Se apaga la calculadora al finalizar.
    
}

