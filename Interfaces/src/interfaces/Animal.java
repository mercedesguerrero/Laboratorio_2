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
public abstract class Animal implements IComportamiento, IJugable{
    
    private String _nombre;
    private int _edad;
    
    public Animal(String nombre, int edad)
    {
        this._nombre= nombre;
        this._edad= edad;
    }

    @Override
    public String toString() {
        
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append("Nombre: ").append(this._nombre);
        miCadena.append(" || Edad: ").append(this._edad);
      
        return miCadena.toString();
    }
    
    @Override
    public abstract void Alimentarse(eComida comidita);
    @Override
    public abstract void Dormir(int tiempo);
    @Override
    public abstract void Jugar(String juego);
}
