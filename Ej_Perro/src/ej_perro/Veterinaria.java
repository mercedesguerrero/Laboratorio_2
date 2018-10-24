/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_perro;

import java.util.ArrayList;

/**
 *
 * @author capacita_mecon
 */
public class Veterinaria {
    
    public String nombre;
    public ArrayList<Perro> lista;
    
    //CONSTRUCTOR
    
    public Veterinaria(String nombre)
    {
        this.nombre= nombre;
        lista= new ArrayList<>();
    }

    public String getNombre() 
    {
        return nombre;
    }
    
    public boolean AgregarPerro(Perro unPerrito)
    {
        boolean aux= false;
        int flag=0;
        
        for (Perro perro : lista) 
        {
            aux= unPerrito.equals(perro);
            
            if(aux== true)
            {
                flag=1;
                break;
            }
        }    
        
        if(flag== 1)
        {
            System.out.println("Ya existe ese perrito");
        }
        else
        {
            lista.add(unPerrito);
        }
        
        return aux;
    }
    
    public void Quitar_Perro(int index)
    {
        lista.remove(index);
    }
    
    public void MostrarVeterinaria()
    {
        System.out.println("Vet: " + this.nombre);
        System.out.println("Perros: ");
        for (Perro perro : lista) 
        {
            Perro.Mostrar_Perro(perro);
        }
    }        
            
    
    
         
        
}
