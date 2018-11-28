/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author capacita_mecon
 */
public abstract class Persona implements IComportamiento {
    
    private String _nombre;
    
    public Persona(String nombre)
    {
        this._nombre= nombre;
    }
    
    @Override
    public String toString() {
        
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append("Nombre: ").append(this._nombre);
      
        return miCadena.toString();
    }
    
    @Override
    public void Alimentarse(eComida comidita)
    {
        System.out.println("Come: " + comidita);
    }
    
    @Override
    public void Dormir(int tiempo)
    {
        System.out.println("Duerme: " + tiempo);
    }
}
