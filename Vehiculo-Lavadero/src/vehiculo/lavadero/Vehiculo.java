/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo.lavadero;

import java.util.Comparator;

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
    
    //----------CONSTRUCTOR-----------
    
    public Vehiculo(String patente, int cantRuedas, eMarcas marca)
    {
        this._patente= patente;
        this._cantRuedas= cantRuedas;
        this._marca= marca;
    }
    
    //----------MÉTODOS-----------
    
    protected String Mostrar()
    {
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append("Patente: ").append(this._patente);
        miCadena.append(" || Ruedas: ").append(this._cantRuedas);
        miCadena.append(" || Marca: ").append(this._marca);
    
        return miCadena.toString();
    }
    
    //Si las patentes y marcas son iguales, retorna TRUE.
    public static boolean ComparaVehiculos(Vehiculo unVehiculo, Vehiculo otroVehiculo)
    {
        boolean retorno= false;
        
        if(unVehiculo.getPatente().equalsIgnoreCase(otroVehiculo.getPatente()))
        {
            if(unVehiculo.getMarca().equals(otroVehiculo.getMarca()))
            {
                retorno= true;
            }
        }
        
        return retorno;
    }
    
    /**
     * Generar un método estático (OrdenarVehiculosPorPatente : int) que reciba
     * dos vehículos y retorne un 0 (cero), si ambas patentes son iguales, si la
     * primera patente es ‘mayor’ que la segunda, retornará un 1 (uno) y si no,
     * retornará un -1 (menos uno).
     */
    public static Comparator<Vehiculo> OrdenarVehiculosPorPatente = new Comparator<Vehiculo>() {

        @Override
	public int compare(Vehiculo vehiculo, Vehiculo vehiculo1) {
	   String Patente1 = vehiculo.getPatente().toUpperCase();
	   String Patente2 = vehiculo1.getPatente().toUpperCase();

	   return Patente1.compareTo(Patente2);
    }};
    
    /**
     * Generar un método estático (OrdenarVehiculosPorPatente : int) que reciba
     * dos vehículos y retorne un 0 (cero), si ambas patentes son iguales, si la
     * primera patente es ‘mayor’ que la segunda, retornará un 1 (uno) y si no,
     * retornará un -1 (menos uno).
     */
    public static Comparator<Vehiculo> OrdenarPorPatente = (Vehiculo vehiculo1, Vehiculo vehiculo2)    ->
    {
        int aux = 0;

        if (vehiculo1.getPatente().toUpperCase().compareTo(vehiculo2.getPatente().toUpperCase()) > 0)
        {
            aux = 1;

        } else if (vehiculo1.getPatente().toUpperCase().compareTo(vehiculo2.getPatente().toUpperCase()) < 0)
        {
            aux = -1;
        }

        return aux;
    };
    
    
    
    
    /**
     * •Generar un método de instancia (OrdenarVehiculosPorMarca: int) que
     * reciba dos vehículos retorne un 0 (cero), si ambas marcas son iguales, si
     * la primera marca es ‘mayor’ que la segunda, retornará un 1 (uno) y si no,
     * retornará un -1 (menos uno).
     */
    public static Comparator<Vehiculo> OrdenarVehiculosPorMarca = (Vehiculo vehiculo1, Vehiculo vehiculo2) ->
    {
        int retorno = 0;
        if (vehiculo1.getMarca().name().compareTo( vehiculo2.getMarca().name())>0)
        {
            retorno = 1;
        } else if (vehiculo1.getMarca().name().compareTo( vehiculo2.getMarca().name())<0)
        {
            retorno = -1;
        }
        return retorno;
    };

    
}
