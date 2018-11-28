/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author capacita_mecon
 */
public abstract class ClaseUno {
    
    protected String _atributoUno;

    public ClaseUno(String atributoUno)
    {
        this._atributoUno= atributoUno;
    }
    
    public abstract String Mostrar();
     /**
    {
       
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append("Clase Uno");
        
        return miCadena.toString();
         
    }
    */
    
    public String getUno()
    {
        return _atributoUno;
    }

    
}
