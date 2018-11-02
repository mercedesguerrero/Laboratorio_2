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
public class Local extends Llamada{
    
    protected float _costo;
    
    //--------CONSTRUCTOR-----------
    
    public Local(Llamada unaLlamada, float costo)
    {
        super(unaLlamada._duracion, unaLlamada._nroDestino, unaLlamada._nroOrigen);
        this._costo= costo;
    }

    public Local(float duracion, String destino, String origen, float costo) 
    {
        super(duracion, destino, origen);
        this._costo= costo;
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
        float valor;
        
        valor= super._duracion * this._costo;
        
        return valor;
    }
    
    @Override
    public void Mostrar()
    {
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append("Costo: ").append(CostoLlamada());//use el getter, sino usar el this
        
        System.out.println("Costo: " + miCadena.toString());
        super.Mostrar();
     
    }
    
    
    
}
