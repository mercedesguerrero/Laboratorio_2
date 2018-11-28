/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author capacita_mecon
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<IJugable> lista = new ArrayList<>();
        
        IJugable Gatito = new Gato("Oliver", 2, true);
        IJugable Perrito = new Perro("Lazy", 3, true);
        IJugable Niñito = new Niño("Leandro");
        
        lista.add(Niñito);
        lista.add(Gatito);
        lista.add(Perrito);
        
        for (IJugable juega : lista) {
            
            System.out.println(juega.toString());
        }
    }
    
}
