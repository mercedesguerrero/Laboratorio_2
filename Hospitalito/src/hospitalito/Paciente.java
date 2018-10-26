/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalito;

/**
 *
 * @author capacita_mecon
 */
public class Paciente {
    
    public String dni;
    public String nombre;
    
    //CONSTRUCTOR PARAMETRIZADO
    
    public Paciente(String dni, String nombre)
    {
        this.dni= dni;
        this.nombre= nombre;
    }
    
}
