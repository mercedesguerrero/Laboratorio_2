/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author capacita_mecon
 */
public class ClaseDerivada extends ClasePadre{
    
    //private int z;

    public ClaseDerivada(int _entero, char _caracter, String cadena)
    {
        super(_entero, _caracter, cadena);//construyo el objeto usando el contructor de la clase a
        //this.z= z;
    }
    
    public void MostrarDerivada()
    {
       MostrarProtegido();
       MostrarPublico();
    }
    
}
