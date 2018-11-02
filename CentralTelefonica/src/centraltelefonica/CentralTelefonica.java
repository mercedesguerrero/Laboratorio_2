/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraltelefonica;

/**
 *
 * @author capacita_mecon
 */
public class CentralTelefonica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Llamada unaLlamada= new Llamada(25, "dest", "orig");
        
        Local unaLocal= new Local(unaLlamada, 10);
        
        if(unaLocal instanceof Local)// pregunta si es una instancia de local
        {
            System.out.println("si");
        }
        
    }
    
}
