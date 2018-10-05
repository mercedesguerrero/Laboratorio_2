/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2_java;

/**
 *
 * @author capacita_mecon
 */
public class Automovil {
    
    public int velocidadActual;//atributos
    
    public static int cantidadDeRuedas;//atributos
    
    private String conductor;
    
    public static void MostrarCantidadRuedas()
    {
        System.out.println("Cantidad de ruedas: " + cantidadDeRuedas);
//        //System.out.println("Conductor: " + conductor);
    }
    
    public void Acelerar (int velocidad)
    {
        this.velocidadActual += velocidad;
        
        //System.out.println(cantidadDeRuedas);
    }
    
}
