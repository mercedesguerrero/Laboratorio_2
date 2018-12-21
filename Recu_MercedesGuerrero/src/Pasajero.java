/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author capacita_mecon
 */
public class Pasajero {
    
    private String _apellido;
    private String _nombre;
    private String _dni; 
    private boolean _esPlus;
   
    /** Realizar un constructor parametrizado que permita inicializar 
     * todos los atributos de la clase llamando a otras dos sobrecargas
     * @param apellido
     * @param dni
     * @param _esPlus
    */
    
    public Pasajero(String apellido, String dni, boolean _esPlus)
    {
        this(apellido, dni);
        this._esPlus= _esPlus;
    }
    
    public Pasajero(String apellido, String nombre, String dni, boolean _esPlus)
    {
        this(apellido, dni, _esPlus);
        this._nombre= nombre;
    }
    
    public Pasajero(String apellido, String dni)
    {
        this._apellido= apellido;
        this._dni= dni;
    }

    public boolean getEsPlus() 
    {
        return _esPlus;
    }
    
    /**
    * Crear el método CompararPasajeros que recibirá como parámetro una 
     * instancia de la clase
     * @param unPasajero
     * @return Retornará verdadero cuando el dni de ambas instancias sean iguales
    */
    protected boolean CompararPasajeros(Pasajero unPasajero)
    {
        boolean retorno= false;
        
        if(this._dni.equals(unPasajero._dni))
        {
            retorno= true;
        }
        
        return retorno;
    }

    /**
     * Un getter llamado getInfo permitirá construir un String con toda la 
     * información del pasajero y la retornará. Utilizar StringBuilder
     * @return 
    */
    public String getInfo() 
    {
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append("\n");
        miCadena.append(" Apellido: ").append(this._apellido);
        miCadena.append(" || Nombre: ").append(this._nombre);
        miCadena.append(" || Dni: ").append(this._dni);
        miCadena.append(" || Es plus: ").append(this._esPlus);
                
        return miCadena.toString();
    }
    
    /** El método MostrarPasajero recibirá un pasajero y mostrará 
     * por consola toda su información
     * @param unPasajero
    */
    public static void MostrarPasajero(Pasajero unPasajero)
    {
        System.out.println(unPasajero.getInfo());
    }
    
    
    
}
