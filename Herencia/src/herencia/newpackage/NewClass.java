/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.newpackage;
import herencia.ClasePadre;

/**
 *
 * @author capacita_mecon
 */
public class NewClass {
    
    ClasePadre p;
    
    public NewClass()
    {
        p= new ClasePadre(4, 'm', "Pepe");
    }
    
    //estando en otro paquete no funcionan los mètodos
}
