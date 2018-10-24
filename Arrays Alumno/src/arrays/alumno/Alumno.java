/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.alumno;

/**
 *
 * @author capacita_mecon
 */
public class Alumno {
    
    private int _id;
    private String _apellidoNombre;
    private  String _eMail;
    private String _direccion;
    private float _promedio;
    private int[] _notasIngreso;
    
    //CONSTRUCTORES
    
    public Alumno()//constructor explícito
    {
        _notasIngreso= new int[3];
    }
    
    public Alumno(int id, String nombre, String eMail, String dire)
    {
        this(id, nombre);
        this._eMail= eMail;
        this._direccion= dire;
    }
    
    public Alumno(int id, String nombre)
    {
        this(id);
        this._apellidoNombre= nombre;
    }
    
    public Alumno(int id)
    {
        this();
        this._id= id;
    }
    
    //SETTERS y GETTERS
    
    public void Set_nombre(String nombre)
    {
        this._apellidoNombre= nombre;//hace referencia al objeto actual instanciado en esta clase
    }

    public int getId() {
        return _id;
    }

    public String getApellidoNombre() {
        return _apellidoNombre;
    }

    public String geteMail() {
        return _eMail;
    }

    public String getDireccion() {
        return _direccion;
    }

    public float getPromedio() {
        return _promedio;
    }

    public int[] getNotasIngreso() {
        return _notasIngreso;
    }
    
    public void Set_eMail(String eMail)
    {
        this._eMail= eMail;
    }
    
    public void Set_notasIngreso(int[] notasIngreso)
    {
        this._notasIngreso= notasIngreso;
    }
    
    public void Set_direccion(String direccion)
    {
        this._direccion= direccion;
    }
    /*
    public String alumno_to_String()
    {
        String miCadena= null;
        
        miCadena= this._apellidoNombre + this._id + this._eMail + this._direccion + this._promedio;
        
        for(int nota: this._notasIngreso)
        {
            miCadena+= " " + nota; 
        }
        
        return miCadena;
    }
    **/
    //OTRA MANERA....................
    
    public String alumno_to_String()
    {
        /*
        StringBuilder cadena= new StringBuilder();//es una clase que me permite construír de manera dinámica un string
        
        cadena.append(this._apellidoNombre);
        cadena.append(this._id);
        cadena.append(this.eMail);
        cadena.append(this.direccion);
        cadena.append(this.promedio);
        **/
        StringBuilder miCadena= new StringBuilder();
        
        miCadena.append("Nombre: ").append(this._apellidoNombre);
        miCadena.append(" || id: ").append(this._id);
        miCadena.append(" || eMail: ").append(this._eMail);
        miCadena.append(" || Direccion: ").append(this._direccion);
        miCadena.append(" || Promedio: ").append(this._promedio);
        
        for(int nota: this._notasIngreso)
        {
            miCadena.append(" || Nota: ").append(nota);
        }
        
        return miCadena.toString();
    }
    
    public void MostrarAlumno()
    {
        System.out.println("ID: " + this._id);
        System.out.println("Nombre: " + this._apellidoNombre);
        System.out.println("E-Mail: " + this._eMail);
        System.out.println("Direccion: " + this._direccion);
        for(int nota: this._notasIngreso)
        {
            System.out.print(" || Nota: " + nota + " || ");
        }
        System.out.println("Promedio: " + this._promedio);
    }
    
    public void CalcularPromedio()
    {
        int suma=0;
        int cantidad= this._notasIngreso.length;
        
        if(cantidad != 0)
        {
            for (int nota: this._notasIngreso) 
            {
               suma+= nota;
            }
        }
        
        this._promedio= suma/ cantidad;
    }
    
}
