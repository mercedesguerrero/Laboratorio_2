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
public class Gato extends Animal{
    
    private Boolean _esAmigable;
    
    public Gato(String nombre, int edad, Boolean amigable)
    {
        super(nombre, edad);
        this._esAmigable= amigable;
    }
    
    @Override
    public String toString() {
        
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append(super.toString());
        miCadena.append("|| Es amigable? ").append(this._esAmigable);
        
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
    @Override
    public void Jugar(String juego)
    {
        System.out.println("Juego: " + juego);
    }
}
