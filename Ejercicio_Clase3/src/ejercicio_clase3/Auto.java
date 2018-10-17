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
    private eFabricante _fabricante;
    
    public static int contador= 0;
    
    //Instancias de la clase rueda
    public Rueda RuedaDD;//agregacion compuesta, una clase agrega otra clase
    public Rueda RuedaDI;
    public Rueda RuedaTD;
    public Rueda RuedaTI;
    
    private int _kilometrosRecorridos;
    
    public Auto()
    {
        //this.fabricante= eFabricante.FORD;
        
        contador ++;
        
        int x= (int)(Math.random()* eFabricante.values().length);
        
        eFabricante valor= eFabricante.values()[x];
        
        this._fabricante= valor;
        
        /**
        switch(this.fabricante)
        {
            case FORD:
                System.out.println("Hola");
                break;
        }
        */
        this.RuedaDD= new Rueda();
        this.RuedaDI= new Rueda();
        this.RuedaTD= new Rueda();
        this.RuedaTI= new Rueda();
    }
    
    public eFabricante getFabricante()//el fabricante es solo lectura RO(read only)
    {
        return this._fabricante;
    }
    
    public int getKilometros()
    {
        return this._kilometrosRecorridos;
    }
    
    public void AgregarKilometros(int kilometros)
    {
        kilometros+= 20;
    }

    public void VolverACero()
    {
        this._kilometrosRecorridos= 0;
    }
    
    public void MostrarAuto()
    {
        System.out.println("Auto: " + this._fabricante);
    }
    
}


