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
        int resultado = 0;
        try{
            resultado = numerador/denominador;
            
        return (numerador/denominador);
        
        }catch(Exception e){
            System.out.println("Se ha producido un error: "+e.getMessage());
                    
        }
        
        return resultado;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Resultado de la operación: "+ division(6,3));
    }
    
}
