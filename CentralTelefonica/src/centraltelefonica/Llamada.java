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
public class Llamada {
    
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
    
    //----------MÉTODOS-------------
    
    public int OrdenarPorDuracion(Llamada uno, Llamada dos)
    {
        int x=0;
        
        return x;
    }
    
    public void Mostrar()
    {
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append("Duracion: ").append(this._duracion);
        miCadena.append(" || Nro. Destino: ").append(this._nroDestino);
        miCadena.append(" || Nro. Origen: ").append(this._nroOrigen);
        
        System.out.println("Costo por seg: " + miCadena.toString());
    }
    
    
}
