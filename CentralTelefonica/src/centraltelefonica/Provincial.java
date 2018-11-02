/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraltelefonica;

/**
 *
 * @author capacita_mecon
 */
public class Provincial extends Llamada{
    
    protected float _costo;
    protected Franja _franjaHoraria;
    
    //--------CONSTRUCTOR-----------
    
    public Provincial(Franja miFranja, Llamada unaLlamada)
    {
        super(unaLlamada._duracion, unaLlamada._nroDestino, unaLlamada._nroOrigen);
        this._franjaHoraria= miFranja;
    }
    
    public Provincial(float duracion, String destino, String origen, Franja miFranja)
    {
        super(duracion, destino, origen);
        this._franjaHoraria= miFranja;
    }
    
     //----------GETTERS-------------

    public float CostoLlamada() 
    {
        return _costo= CalcularCosto();
    }
    
    //----------MÉTODOS-------------
    
    //Retornará el valor de la llamada a partir del costo y la duración de la misma
    private float CalcularCosto()
    {
        float valor=0;
        
        return valor;
    }
    
    @Override
    public void Mostrar()
    {
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append("Costo: ").append(CostoLlamada());//use el getter, sino usar el this
        
        System.out.println("Franja horaria: " + this._franjaHoraria);
        System.out.println("Costo: " + miCadena.toString());
        super.Mostrar();
     
    }
    
}
