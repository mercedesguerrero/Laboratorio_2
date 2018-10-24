/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_perro;

/**
 *
 * @author capacita_mecon
 */
public class Perro {
    
    private String _nombre;
    private int _edad;
    private eRaza _raza; //ENUMERADO
    
    //CONSTRUCTOR PARAMETRIZADO
    
    public Perro(String nombre, int edad, eRaza raza)
    {
        this._nombre= nombre;
        this._edad= edad;
        this._raza= raza;
    }
    
    //GETTERS Y SETTERS

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public int getEdad() {
        return _edad;
    }

    public void setEdad(int _edad) {
        this._edad = _edad;
    }

    public eRaza getRaza() {
        return _raza;
    }

    public void setRaza(eRaza _raza) {
        this._raza = _raza;
    }
    
    //MÉTODOS
    
    public static void Mostrar_Perro(Perro nuevoPerro)
    {
        System.out.println("Nombre: " + nuevoPerro._nombre);
        System.out.println("Edad: " + nuevoPerro._edad);
        System.out.println("Raza: " + nuevoPerro._raza);
    }
    
    
}
