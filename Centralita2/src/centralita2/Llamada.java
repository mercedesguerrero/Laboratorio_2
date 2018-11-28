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
public abstract class Llamada {
    
    protected float _duracion;
    protected String _nroDestino;
    protected String _nroOrigen; 
    
    //--------CONSTRUCTOR-----------
    
    Llamada(float duracion, String destino, String origen)
    {
        this._duracion= duracion;
        this._nroDestino= destino;
        this._nroOrigen= origen;
    }

    //----------GETTERS-------------
    
    public float getDuracion() {
        return _duracion;
    }

    public String getNroDestino() {
        return _nroDestino;
    }

    public String getNroOrigen() {
        return _nroOrigen;
    }
    
    public abstract float getCostoLlamado();
    
    //----------MÉTODOS-------------
    
    protected abstract String Mostrar();
    /**
    {
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append("Duracion: ").append(this._duracion);
        miCadena.append(" || Nro. Destino: ").append(this._nroDestino);
        miCadena.append(" || Nro. Origen: ").append(this._nroOrigen);
        
        return miCadena.toString();
    }
     */
    @Override
    public String toString()
    {
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append("Duracion: ").append(this._duracion);
        miCadena.append(" || Nro. Destino: ").append(this._nroDestino);
        miCadena.append(" || Nro. Origen: ").append(this._nroOrigen);
        
        return miCadena.toString();
    }
    
    public static boolean CompararLlamadas(Llamada unaLlamada, Llamada otraLlamada)
    {
        boolean retorno= false;
        
        if(unaLlamada._nroDestino.equalsIgnoreCase(otraLlamada._nroOrigen))
        {
            retorno= true;
        }
            
        return retorno;
    }
    
}
