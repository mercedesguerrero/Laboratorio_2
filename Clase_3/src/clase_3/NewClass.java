/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_3;

/**
 *
 * @author capacita_mecon
 */
public class NewClass {
    
    public int x;
    public String cadena;
    
    public static int entero;
    
    
    public NewClass()//constructor explìcito
    {
        this.x= 40;
        this.cadena= "Hola ameo";
        
    }
     
    public NewClass(int entero, String texto)//constructor parametrizado
    {
        this.x= entero;
        this.cadena= texto;
    }

    static
    {
        entero= 9;
    }
   
    
}
