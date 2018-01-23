/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajunit;

/**
 *
 * @author diurno
 */
public class PruebaJUnit {
    
    /**Metodo que realiza una división entera
     * @param numerador entero
     * @param denominador entero
     * @return
     */
    public static int division(int numerador, int denominador){
        return (numerador/denominador);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Resultado de la operación: "+ division(2,3));
    }
    
}
