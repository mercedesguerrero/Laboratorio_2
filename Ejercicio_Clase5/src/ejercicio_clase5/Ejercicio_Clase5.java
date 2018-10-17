/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_clase5;

import java.util.Date;

/**
 *
 * @author capacita_mecon
 */
public class Ejercicio_Clase5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        MerClass miObjeto= new MerClass();
        
        miObjeto.CargarValor(35);
        miObjeto.CargarValor("Pto el que lee");
        miObjeto.CargarValor(new Date());
        
        miObjeto.MostrarDatos();
        
        MerClass miObjete= new MerClass(100, "TODES", new Date());
        
        miObjete.MostrarDatos();
        
        MerClass otroObjeto= (miObjete);
        
        otroObjeto.MostrarDatos();
        
    }
    
}
