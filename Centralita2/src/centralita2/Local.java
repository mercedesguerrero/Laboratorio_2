/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centralita2;

/**
 *
 * @author capacita_mecon
 */
public final class Local extends Llamada{
    
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
    
    //----------GETTERS------------
    
    @Override
    public float getCostoLlamado()
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
    protected String Mostrar()
    {
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append("Costo: ").append(this.getCostoLlamado());//use el getter, sino usar el this
        super.toString();
     
        return miCadena.toString();
    }
    
    @Override
    public boolean equals(Object objeto)
    {
        boolean retorno= false;
        
        if(objeto instanceof Local)
        {
            retorno= true;
        }
        
        return retorno;
    }
    
}
