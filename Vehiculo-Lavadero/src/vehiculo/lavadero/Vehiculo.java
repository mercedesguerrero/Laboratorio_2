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
public class Vehiculo {
    
    protected String _patente;
    protected int _cantRuedas; 
    protected eMarcas _marca;
    
    //----------GETTERS y SETTERS-----------

    public String getPatente() {
        return _patente;
    }

    public int getCantRuedas() {
        return _cantRuedas;
    }

    public void setCantRuedas(int _cantRuedas) {
        this._cantRuedas = _cantRuedas;
    }

    public eMarcas getMarca() {
        return _marca;
    }

    public void setMarca(eMarcas _marca) {
        this._marca = _marca;
    }
    
    public Vehiculo(String patente, int cantRuedas, eMarcas marca)
    {
        this._patente= patente;
        this._cantRuedas= cantRuedas;
        this._marca= marca;
    }
    
    protected String Mostrar()
    {
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append("Patente: ").append(this._patente);
        miCadena.append(" || Ruedas: ").append(this._cantRuedas);
        miCadena.append(" || Marca: ").append(this._marca);
    
        return miCadena.toString();
    }
    
    //Si las patentes y marcas son iguales, retorna TRUE.
    public static boolean ComparaVehiculos(UnVehiculo, OtroVehiculo)
    {
        
    }

    
}
