/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author capacita_mecon
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //ClaseUno One= new ClaseUno("Uno");
        
        ArrayList <ClaseUno> lista= new ArrayList<>();
        ClaseDos Two= new ClaseDos("Hola", 2);
        ClaseUno One= Two;
        ClaseTres Three= new ClaseTres("Chau", 3, 3.14f);
        
        lista.add(Two);
        lista.add(Three);
        
        System.out.println("-----------MUESTRO LA LISTA------------");
        for (ClaseUno objetito : lista) {
            System.out.println(objetito.Mostrar());
        }
        
        System.out.println("---------MUESTRO LOS OBJETOS-----------");
        System.out.println(One.Mostrar());
        System.out.println(Two.Mostrar());
        System.out.println(Three.Mostrar());
        System.out.println("-----MUESTRO LOS OBJETOS CON TO STRING------");
        System.out.println(Two.toString());
        
    }
    
}
