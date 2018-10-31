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
public class ClasePadre {
    
    protected int _entero;
    protected char _caracter;
    public String cadena;
    
    public ClasePadre(int _entero, char _caracter, String cadena)
    {
        this._entero= _entero;
        this._caracter= _caracter;
        this.cadena= cadena;
    }
    
    public void MostrarPublico()
    {
        System.out.println("Hola metodo publico" + cadena);
    }
    
    public void MostrarProtegido()
    {
        System.out.println("Hola metodo protegido" + _entero);
    }
    
    private void mostrarPrivado()
    {
        System.out.println("Hola metodo privado" + _caracter);
    }
    
}
