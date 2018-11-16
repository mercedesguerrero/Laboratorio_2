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
public class Camion extends Vehiculo{
    
    protected float _tara;
    
    
    public Camion(float _tara, String _patente, int _cantRuedas, eMarcas _marca)
    {
        super(_patente, _cantRuedas, _marca);
        this._tara = _tara;
    }
    
    public Camion(Vehiculo unVehiculo, float _tara)
    {
        super(unVehiculo.getPatente(), unVehiculo.getCantRuedas(), unVehiculo.getMarca());
        this._tara = _tara;   
    }
    
    @Override
    protected String Mostrar()
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append(super.Mostrar());//hereda atributos de la clase Vehiculo
        cadena.append(this._tara);
        
        return cadena.toString();
    }
    
}
