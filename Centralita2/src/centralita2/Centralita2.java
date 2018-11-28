/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centralita2;

import java.util.ArrayList;

/**
 *
 * @author capacita_mecon
 */
public class Centralita2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Centralita center1 = new Centralita("Telefonito.URL");
        ArrayList<Llamada> lista = center1.Llamadas();
        
        Llamada ll1 = new Local(5.3f, "Buenos Aires", "Cordoba", 2.65f);
        Llamada ll2 = new Provincial(3.14f, "La Pampa", "Miami", Franja.Franja_1);
        Llamada ll3 = new Local(45.0F, "Almagro", "Villa Urquiza", 1.99F);
        Llamada ll4 = new Provincial(Franja.Franja_3, ll2);
        
        lista.add(ll1);
        lista.add(ll2);
        lista.add(ll3);
        lista.add(ll4);

        center1.ordenarLlamadas(0);//1 ordena ascendente - 0 ordena descendente
       
        System.out.println(center1.Mostrar());
       
    }
    
}
