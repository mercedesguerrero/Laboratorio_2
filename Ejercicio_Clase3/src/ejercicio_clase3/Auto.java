/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_clase3;

/**
 *
 * @author capacita_mecon
 */
public class Auto {
    //Atributo
    public String fabricante;
    
    //Instancias de la clase rueda
    public Rueda RuedaDD;//agregacion compuesta, una clase agrega otra clase
    public Rueda RuedaDI;
    public Rueda RuedaTD;
    public Rueda RuedaTI;
    
    public Auto()
    {
        this.fabricante= "Mercedes";
        this.RuedaDD= new Rueda();
        this.RuedaDI= new Rueda();
        this.RuedaTD= new Rueda();
        this.RuedaTI= new Rueda();
    }
    
}


