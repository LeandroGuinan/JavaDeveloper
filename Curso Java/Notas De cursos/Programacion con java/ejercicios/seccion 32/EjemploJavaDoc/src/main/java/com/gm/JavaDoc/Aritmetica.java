
package com.gm.JavaDoc;
/**
 * Esta clase permite realizar operaciones de aritmetica como sumar, restar, etc
 * 
 * @author Leandro Guinan
 * @version 1.0
 * 
 */
public class Aritmetica {
    /**
     * primer operando
     */
    int operandoA;
    
    /**
     * segundo operando
     */
    int operandoB;
    
    /**
     * Constructor vacio de la clase
     */
    
    public Aritmetica(){
        
    }
    /**
     * 
     * @param operandoA es el primer operando
     * @param operandoB es el segundo operando 
     */
    public Aritmetica(int operandoA, int operandoB){
        this.operandoA = operandoA;
        this.operandoB = operandoB;
    }
    
    /**
     * este metodo realiza la suma de dos operandos enteros
     * @return int resyltado de la suma
    */
    public int sumar(){
        return this.operandoA + this.operandoB;
    }
    
}
