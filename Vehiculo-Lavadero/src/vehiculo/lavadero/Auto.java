/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo.lavadero;

/**
 *
 * @author capacita_mecon
 */
public class Auto extends Vehiculo{
    
    protected int _cantidadAsientos;
    
    
    public Auto(int _cantidadAsientos, String _patente, int _cantRuedas, eMarcas _marca)
    {
        super(_patente, _cantRuedas, _marca);
        this._cantidadAsientos = _cantidadAsientos;
    }
    
    public Auto(int _cantidadAsientos, String _patente, eMarcas _marca)
    {
        this(_cantidadAsientos, _patente, 4, _marca);
    }
    
    @Override
    protected String Mostrar()
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append(super.Mostrar());//hereda atributos de la clase Vehiculo
        cadena.append("  Asientos: ").append(this._cantidadAsientos);
        
        return cadena.toString();
    }
    
}
