/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_herencia;

/**
 *
 * @author capacita_mecon
 */
public class Empleado extends SerHumano{
    
    private float _sueldo;
    
    public Empleado(String nombre, int peso, int altura, String sexo, float sueldo)
    {
        super(nombre, peso, altura, sexo);
        this._sueldo= sueldo;
    }
            
    public void Trabajar()
    {
        System.out.println("Trabajo mucho muy duro");
    }
    
}
