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
public class Carrera {
    
    public Auto autito1;
    public Auto autito2;
    public Auto autito3;
    public Auto autito4;
    public Auto autito5;
    public Auto autito6;
    
    
    public Carrera()//constructor
    {
        this.autito1= new Auto();
        this.autito2= new Auto();
        this.autito3= new Auto();
        this.autito4= new Auto();
        this.autito5= new Auto();
        this.autito6= new Auto();
        
    }
    
    public void MostrarCarrera()
    {
        this.autito1.MostrarAuto();
        this.autito2.MostrarAuto();
        this.autito3.MostrarAuto();
        this.autito4.MostrarAuto();
        this.autito5.MostrarAuto();
        this.autito6.MostrarAuto();
    }
}
