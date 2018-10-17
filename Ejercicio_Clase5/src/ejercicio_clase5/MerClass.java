/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_clase5;

import java.util.Date;

/**
 *
 * @author capacita_mecon
 */
public final class MerClass {
    
    private int _entero;
    private String _cadena;
    private Date _fecha;
    
    
    public MerClass()//constructor explícito
    {
        this._fecha= new Date();
    }
    
    public MerClass(int entero, String mensaje)
    {
        this.CargarValor(entero, mensaje); 
    }
    
    public MerClass(int enterito, String mensajito, Date fecha)//sobreescribe al constructor implícito hay que hacer el explicito como el arriba
    {
        this(enterito, mensajito);//estoy llamando al constructor de la clase
        this._fecha= fecha;
    }
    
    //EJEMPLO DE SOBRECARGA DE MÉTODOS - SETTERS
    
    public void CargarValor(int enterito)
    {
        this._entero= enterito;//hace referencia al objeto actual instanciado en esta clase
    }
    
    public void CargarValor(String cadenita)
    {
        this._cadena= cadenita;
    }
    
    public void CargarValor(Date fechita)
    {
        this._fecha= fechita;
    }
    
    public void CargarValor(int enterito, String mensajin)
    {
        this._entero= enterito;
        this._cadena= mensajin;
    }
    
    public void MostrarDatos()
    {
        System.out.println("Num: " + this._entero);
        System.out.println("Mensaje: " + this._cadena);
        System.out.println("Fecha: " + this._fecha);
    }
    
}


