/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo.lavadero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 *
 * @author Mechu
 */
public class Lavadero {
    
    protected ArrayList<Vehiculo> _vehiculos;
    private static float _precioAuto = 0.0F;
    private static float _precioCamion = 0.0F;
    private static float _precioMoto = 0.0F;
    private String _razonSocial;
    
    static
    {
        final float PRECIO_MINIMO = 150.0F;
        final float PRECIO_MAXIMO = 415.0F;//565 precio maximo (150+415=565)
        _precioAuto = PRECIO_MINIMO + (float) (Math.random() * PRECIO_MAXIMO) ;
        do
        {            
            _precioCamion = PRECIO_MINIMO +(float) (Math.random() * PRECIO_MAXIMO) ;
        } while (_precioCamion == _precioAuto);
        do
        {            
            _precioMoto = PRECIO_MINIMO + (float) (Math.random() * PRECIO_MAXIMO) ;
        } while (_precioMoto == _precioAuto || _precioMoto == _precioCamion);
    }

    public Lavadero(String _razonSocial)
    {
        this();
        this._razonSocial = _razonSocial;
    }
    
    private Lavadero()
    {
        this._vehiculos = new ArrayList<>();
    }
    
    //Tendrá un metodo llamado LavaderoString que retornará la información completa del lavadero: 
    //razón social, precios vigentes y el listado completo de los vehículos que contiene. 

    public String LavaderoString()
    {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Razon Social - " + this._razonSocial + "\n");
        retorno.append("Precio Auto - " + _precioAuto + "\n");
        retorno.append("Precio Moto - " + _precioMoto + "\n");
        retorno.append("Precio Camion - " + _precioCamion + "\n------\n");
       
        
        for (Vehiculo vehiculo : _vehiculos)
        {
            //retorno.append(vehiculo.Mostrar());
            if (vehiculo instanceof Moto)
            {
                Moto motoAux = (Moto) vehiculo;
                retorno.append(motoAux.Mostrar());
            } else if (vehiculo instanceof Camion)
            {
                Camion camionAux = (Camion) vehiculo;
                retorno.append(camionAux.Mostrar());
            } else if (vehiculo instanceof Auto)
            {
                Auto autoAux = (Auto) vehiculo;
                retorno.append(autoAux.Mostrar());
            }

            retorno.append("\n");
        }

        
        return retorno.toString();

        
        
}
    //También poseerá un getter asociado a la lista genérica.
    public ArrayList<Vehiculo> getVehiculos()
    {
        return _vehiculos;
    }
    
    public static boolean EstaEnLavadero(Lavadero unLavadero, Vehiculo unVehiculo)
    {
        boolean retorno = false;
        
        for (Vehiculo miVehiculo : unLavadero._vehiculos)
        {
            if(Vehiculo.ComparaVehiculos(unVehiculo, miVehiculo))
            {
                retorno = true;
                break;
            }
        }
        
        return retorno;
    }
    
    public static int EstaEnLavadero(Vehiculo unVehiculo, Lavadero unLavadero)
    {
        int retorno = -1;
        int i = 0;
        
        for (Vehiculo miVehiculo : unLavadero._vehiculos)
        {
            if(Vehiculo.ComparaVehiculos(unVehiculo, miVehiculo))
            {
                retorno = i;
                break;
            }
            
            i++;
        }
        
        return retorno;
    }
    
    
    public static void AgregarVehiculo(Lavadero lavadero, Vehiculo unVehiculo)
    {
         if (!lavadero._vehiculos.contains(unVehiculo))
        {
            lavadero._vehiculos.add(unVehiculo);
        }
    }
    
    public boolean QuitarVehiculo(Vehiculo unVehiculo)
    {
        boolean retorno = false;
        int indice = Lavadero.EstaEnLavadero(unVehiculo, this);
        
        if(indice > -1)
        {
            this._vehiculos.remove(indice);
            retorno = true;
        }
        
        return retorno;
    }
    
    
    
    public double MostrarTotalFacturado(eVehiculo tipo)
    {
        /*devolverá la ganancia total del lavadero (Double), 
        dicho método tendrá una sobrecarga que reciba como 
        parámetro la enumeración eVehiculo (con Auto, Camión 
        y Moto como enumerados) y retornará la ganancia 
        del Lavadero por tipo de vehículo.*/
        double resultado  = 0.0F;

        switch (tipo)
        {
            case Camion:
                for (Vehiculo vehiculo : _vehiculos)
                {
                    if (vehiculo instanceof Camion)
                    {
                        resultado += (double) _precioCamion;
                    }
                }
                break;
            case Auto:
                for (Vehiculo vehiculo : _vehiculos)
                {
                    if (vehiculo instanceof Auto)
                    {
                        resultado += (double) _precioAuto;
                    }
                }
                break;
            case Moto:
                for (Vehiculo vehiculo : _vehiculos)
                {
                    if (vehiculo instanceof Moto)
                    {
                        resultado += (double) _precioMoto;
                    }
                }
                break;
        }
        return resultado;
    }
    
    public double MostrarTotalFacturado()
    {
        /*devolverá la ganancia total del lavadero (Double), 
        dicho método tendrá una sobrecarga que reciba como 
        parámetro la enumeración EVehiculos (con Auto, Camión 
        y Moto como enumerados) y retornará la ganancia 
        del Lavadero por tipo de vehículo.*/
        double resultado  = 0.0F;

        for (Vehiculo vehiculo : _vehiculos)
        {
            if (vehiculo instanceof Auto)
            {
                resultado += (double) _precioAuto;
            } 
            else if (vehiculo instanceof Camion)
            {
                resultado += (double) _precioCamion;
            } 
            else if (vehiculo instanceof Moto)
            {
                resultado += (double) _precioMoto;
            }
        }
        return resultado;

    }

    
}
