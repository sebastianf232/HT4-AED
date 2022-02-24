import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class Calculatortesting {
    StackPV<Double> stV = new StackPV<Double>();
    StackPAL<Double> stAL = new StackPAL<Double>();
    StackPL<Double> stLS = new StackPL<Double>(1);
    StackPL<Double> stLD = new StackPL<Double>(2);
    StackPL<Double> stLC = new StackPL<Double>(3);
    Main mn = new Main();
    Double ej = 15.0;
    Double ej1 = 25.0;


    /**
    Test de calculadora con stack basado en vector
    Tests de stack vector
    */
    @Test
    public void testCalculateVector(){
        Calculadora calc = new Calculadora(1);
        String str = "1 2 + 4 * 3 +";
        String str2 = "4 5 + 6 / 9 * 5 -";
        assertEquals(15, calc.calculate(str),  1);
        assertEquals(8.5, calc.calculate(str2), 0.1);

    }
    @Test
    public void testAddVector(){
        stV.add(ej);
        assertEquals(15.0, stV.peek(), 0.01);
        stV.add(ej1);
        assertEquals(25.0, stV.peek(), 0.01);

    }
    @Test
    public void testRemoveVector(){
        stV.add(ej);
        stV.add(ej1);
        assertEquals(25.0, stV.peek(), 0.01);
        stV.remove();
        assertEquals(15.0, stV.remove(), 0.01);
    }
    @Test
    public void testPeekVector(){
        stV.add(ej);
        assertEquals(15.0, stV.peek(), 0.01);
    }
    @Test
    public void testEmptyVector(){
        stV.add(ej);
        assertEquals(false, stV.empty());
        stV.remove();
        assertEquals(true, stV.empty());
    }
    @Test
    public void testSizeVector(){
        stV.add(ej);
        assertEquals(1, stV.size());
        stV.add(ej1);
        assertEquals(2, stV.size());
        stV.remove();
        assertEquals(1, stV.size());
    }
    /**
     * Test de calculadora con stack ArrayList
     * Tests de stack ArrayList
     */
    @Test
    public void testCalculateAL(){
        Calculadora calc = new Calculadora(2);
        String str = "1 2 + 4 * 3 +";
        String str2 = "4 5 + 6 / 9 * 5 -";
        assertEquals(15, calc.calculate(str),  1);
        assertEquals(8.5, calc.calculate(str2), 0.1);

    }
    @Test
    public void testAddAL(){
        stAL.add(ej);
        assertEquals(15.0, stAL.peek(), 0.01);
        stAL.add(ej1);
        assertEquals(25.0, stAL.peek(), 0.01);

    }
    @Test
    public void testRemoveAL(){
        stAL.add(ej);
        stAL.add(ej1);
        assertEquals(25.0, stAL.peek(), 0.01);
        stAL.remove();
        assertEquals(15.0, stAL.remove(), 0.01);
    }
    @Test
    public void testPeekAL(){
        stAL.add(ej);
        assertEquals(15.0, stAL.peek(), 0.01);
    }
    @Test
    public void testEmptyAL(){
        stAL.add(ej);
        assertEquals(false, stAL.empty());
        stAL.remove();
        assertEquals(true, stAL.empty());
    }
    @Test
    public void testSizeAL(){
        stAL.add(ej);
        assertEquals(1, stAL.size());
        stAL.add(ej1);
        assertEquals(2, stAL.size());
        stAL.remove();
        assertEquals(1, stAL.size());
    }
    /**
     * Test de calculadora con stack Lista SingleLinked
     * Tests de stack Lista singlelinked
     */
    @Test
    public void testCalculateLS(){
        Calculadora calc = new Calculadora(3);
        String str = "1 2 + 4 * 3 +";
        String str2 = "4 5 + 6 / 9 * 5 -";
        assertEquals(15, calc.calculate(str),  1);
        assertEquals(8.5, calc.calculate(str2), 0.1);

    }
    @Test
    public void testAddLS(){
        stLS.add(ej);
        assertEquals(15.0, stLS.peek(), 0.01);
        stLS.add(ej1);
        assertEquals(25.0, stLS.peek(), 0.01);

    }
    @Test
    public void testRemoveLS(){
        stLS.add(ej);
        stLS.add(ej1);
        assertEquals(25.0, stLS.peek(), 0.01);
        stLS.remove();
        assertEquals(15.0, stLS.remove(), 0.01);
    }
    @Test
    public void testPeekLS(){
        stLS.add(ej);
        assertEquals(15.0, stLS.peek(), 0.01);
    }
    @Test
    public void testEmptyLS(){
        stLS.add(ej);
        assertEquals(false, stLS.empty());
        stLS.remove();
        assertEquals(true, stLS.empty());
    }
    @Test
    public void testSizeLS(){
        stLS.add(ej);
        assertEquals(1, stLS.size());
        stLS.add(ej1);
        assertEquals(2, stLS.size());
        stLS.remove();
        assertEquals(1, stLS.size());
    }
    /**
     * Test de calculadora con stack Lista DoubleLinked
     * Tests de stack Lista DoubleLinked
     */
    @Test
    public void testCalculateLD(){
        Calculadora calc = new Calculadora(4);
        String str = "1 2 + 4 * 3 +";
        String str2 = "4 5 + 6 / 9 * 5 -";
        assertEquals(15, calc.calculate(str),  1);
        assertEquals(8.5, calc.calculate(str2), 0.1);

    }
    @Test
    public void testAddLD(){
        stLD.add(ej);
        assertEquals(15.0, stLD.peek(), 0.01);
        stLD.add(ej1);
        assertEquals(25.0, stLD.peek(), 0.01);

    }
    @Test
    public void testRemoveLD(){
        stLD.add(ej);
        stLD.add(ej1);
        assertEquals(25.0, stLD.peek(), 0.01);
        stLD.remove();
        assertEquals(15.0, stLD.remove(), 0.01);
    }
    @Test
    public void testPeekLD(){
        stLD.add(ej);
        assertEquals(15.0, stLD.peek(), 0.01);
    }
    @Test
    public void testEmptyLD(){
        stLD.add(ej);
        assertEquals(false, stLD.empty());
        stLD.remove();
        assertEquals(true, stLD.empty());
    }
    @Test
    public void testSizeLD(){
        stLD.add(ej);
        assertEquals(1, stLD.size());
        stLD.add(ej1);
        assertEquals(2, stLD.size());
        stLD.remove();
        assertEquals(1, stLD.size());
    }
    /**
     * Test de calculadora con stack Lista Circular
     * Tests de stack Lista Circular
     */
    @Test
    public void testCalculateLC(){
        Calculadora calc = new Calculadora(5);
        String str = "1 2 + 4 * 3 +";
        String str2 = "4 5 + 6 / 9 * 5 -";
        assertEquals(15, calc.calculate(str),  1);
        assertEquals(8.5, calc.calculate(str2), 0.1);

    }
    @Test
    public void testAddLC(){
        stLC.add(ej);
        assertEquals(15.0, stLC.peek(), 0.01);
        stLC.add(ej1);
        assertEquals(25.0, stLC.peek(), 0.01);

    }
    @Test
    public void testRemoveLC(){
        stLC.add(ej);
        stLC.add(ej1);
        assertEquals(25.0, stLC.peek(), 0.01);
        stLC.remove();
        assertEquals(15.0, stLC.remove(), 0.01);
    }
    @Test
    public void testPeekLC(){
        stLC.add(ej);
        assertEquals(15.0, stLC.peek(), 0.01);
    }
    @Test
    public void testEmptyLC(){
        stLC.add(ej);
        assertEquals(false, stLC.empty());
        stLC.remove();
        assertEquals(true, stLC.empty());
    }
    @Test
    public void testSizeLC(){
        stLC.add(ej);
        assertEquals(1, stLC.size());
        stLC.add(ej1);
        assertEquals(2, stLC.size());
        stLC.remove();
        assertEquals(1, stLC.size());
    }
    /**
     * Test de convertidor de infix a postfix
     */
    @Test
    public void testConvert(){
        assertEquals("2 3 4 * +", mn.convertir("2+3*4"));
        assertEquals("3 4 * 2 5 * +", mn.convertir("3*4+2*5"));
    }
}
