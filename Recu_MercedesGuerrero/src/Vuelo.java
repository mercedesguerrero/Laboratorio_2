
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author capacita_mecon
 */
public class Vuelo {
    
    private String _fecha;
    private String _empresa; 
    private float _precio; 
    private ArrayList<Pasajero> _listaDePasajeros;
    private int _cantMaxima;
    
    public Vuelo(int cantMaxima)
    {
        this._listaDePasajeros= new ArrayList<>();
        this._cantMaxima= cantMaxima;
    }
    
    public Vuelo(int cantMax, String fecha, float precio)
    {
        this(cantMax);
        this._fecha= fecha;
        this._precio= precio;
    }
    
    public Vuelo(int cantMax, String fecha, String empresa, float precio)
    {
        this(cantMax, fecha, precio);
        this._empresa= empresa;
    }

    public int getCantMaxima() 
    {
        return _cantMaxima;
    }
    
    public String getVuelo() 
    {
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append("\n").append("*************************************************").append("\n");
        miCadena.append(" Empresa:").append(this._empresa);
        miCadena.append(" || Fecha: ").append(this._fecha);
        miCadena.append(" || Precio: ").append(this._precio);
        miCadena.append(" || Cantidad máxima: ").append(this._cantMaxima);
        miCadena.append("\n").append(" Pasajeros: ");
        
        for (Pasajero unPasajero : _listaDePasajeros) 
        {
            miCadena.append(unPasajero.getInfo());
        }
        miCadena.append("\n").append("*************************************************").append("\n");
                
        return miCadena.toString();
    }
    
    private boolean EstaEnLaLista(Pasajero otroPasajero)
    {
        boolean retorno = false;
        
        for (Pasajero unPasajero : _listaDePasajeros)
        {
            if(unPasajero.CompararPasajeros(otroPasajero))
            {
                retorno = true;
                break;
            }
        }
        
        return retorno;
    }
    
    /** Crear un método de instancia llamado AgregarPasajero, en el caso que no 
     * exista en la lista, se agregará. Además tener en cuenta la capacidad del vuelo
     * @param unPasajero
     * @return El valor de retorno de este método indicará si se agregó o no
    */
    public boolean AgregarPasajero(Pasajero unPasajero)
    {
        boolean retorno= false;
        
        if(!EstaEnLaLista(unPasajero) && this._listaDePasajeros.size() <= this._cantMaxima)
        {
            this._listaDePasajeros.add(unPasajero);
            retorno= true;
        }
        
        return retorno;
    }
    
    public static void MostrarVuelo(Vuelo unVuelo)
    {
        System.out.println(unVuelo.getVuelo());
    }
    
    private static float AplicarDescuento(Vuelo unVuelo, Pasajero miPasajero)
    {
        float precioDesc=0;
        float porcentajeDesc= 20;
       
        precioDesc += unVuelo._precio - ((unVuelo._precio* porcentajeDesc)/100);
        
        return precioDesc;
    }
    
    /** Crear un metodo ValorarVuelo qué reciba un vuelo. 
     * Tener en cuenta que si un pasajero es Plus, se le hará un descuento del 20% en el precio del vuelo
     * @param unVuelo
     * @return El valor devuelto deberá ser de tipo float,
     *  y representará el valor recaudado por el vuelo
    */
    public static float ValorarVuelo(Vuelo unVuelo)
    {
        float valorVuelo=0;
        
        for (Pasajero miPasajero : unVuelo._listaDePasajeros) 
        {
            if(miPasajero.getEsPlus())
            {
                valorVuelo += Vuelo.AplicarDescuento(unVuelo, miPasajero);
            }
            else
            {
                valorVuelo += unVuelo._precio;
            }
        }
        
        return valorVuelo;
    }
    
    /** Crear el método de clase CalcularGastoPasajero que recibe un array de vuelos 
     * y una instancia de un pasajero
     * @param listaDeVuelos
     * @param unPasajero
     * @return El método deberá devolver cuánto abonará un pasajero por los vuelos que ha comprado
    */
    public float CalcularGastoPasajero(ArrayList<Vuelo> listaDeVuelos, Pasajero unPasajero)
    {
        float gastoPasajero=0;
        
        for (Vuelo listita : listaDeVuelos) 
        {
            if(listita.EstaEnLaLista(unPasajero))
            {
                if(unPasajero.getEsPlus())
                {
                    gastoPasajero += Vuelo.AplicarDescuento(listita, unPasajero);
                }
                else
                {
                    gastoPasajero += listita._precio;
                }
            }
        }
        
        return gastoPasajero;
    }
}
