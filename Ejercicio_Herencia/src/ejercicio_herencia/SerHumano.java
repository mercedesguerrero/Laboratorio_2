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
public class SerHumano {
    
    private String _nombre;//podria ser protected
    private int _peso;
    private int _altura;
    private String _sexo;
    
    public SerHumano(String nombre, int peso, int altura, String sexo)
    {
        this._nombre= nombre;
        this._peso= peso;
        this._altura= altura;
        this._sexo= sexo;
    }
    
    public void Comer(String comida)
    {
        System.out.println("Estoy comiendo");
    }
    
    public void Dormir()
    {
        System.out.println("Estoy durmiendo");
    }
    
    public void MostrarNombreHumano()
    {
        System.out.println("Nombre: " + _nombre);
    }
    
}
