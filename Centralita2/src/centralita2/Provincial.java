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

    @Override
    public float getCostoLlamado()
    {
        return _costo= CalcularCosto();
    }
    
    //----------MÉTODOS-------------
    
    //Retornará el valor de la llamada a partir del costo y la duración de la misma
    private float CalcularCosto()
    {   
        switch(this._franjaHoraria)
        {
            case Franja_1:
                this._costo= 0.99f;
                break;
            case Franja_2:
                this._costo= 1.25f;
                break;
            case Franja_3:
                this._costo= 0.66f;
                break;
            default:
                this._costo= 0.00f;
        }
        return this._duracion* this._costo;
    }
    
    @Override
    protected String Mostrar()
    {
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append("Costo: ").append(getCostoLlamado());//use el getter, sino usar el this
        
        System.out.println("Franja horaria: " + this._franjaHoraria);
        super.toString();
        
        return miCadena.toString();
    }
    
    @Override
    public boolean equals(Object objeto)
    {
        boolean retorno= false;
        
        if(objeto instanceof Provincial)
        {
            retorno= true;
        }
        
        return retorno;
    }
    
}
