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
public class Niño extends Persona implements IJugable{
    
    public Niño(String nombre)
    {
        super(nombre);
    }
    
    @Override
    public String toString() {
        
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append(super.toString());
        
        return miCadena.toString();
    }
    
    @Override
    public void Jugar(String juego)
    {
        System.out.println("Juego: " + juego);
    }
    
}
