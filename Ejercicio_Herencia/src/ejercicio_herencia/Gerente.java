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
public class Gerente extends SerHumano{
    
    private float _sueldo;
    private String _area;
    
    public Gerente(String nombre, int peso, int altura, String sexo, float sueldo, String cargo)
    {
        super(nombre, peso, altura, sexo);
        this._sueldo= sueldo;
        this._area= cargo;
    }
            
    public void Trabajar()
    {
        System.out.println("Trabajo no tanto");
    }
    
    
    
}
