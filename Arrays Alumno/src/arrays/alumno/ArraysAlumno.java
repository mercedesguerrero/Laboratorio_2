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
public class ArraysAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Alumno[] listaAlumnos= new Alumno[3];
        
        int notas[]= {5,8,9};
        
        for (int i=0; i<listaAlumnos.length; i++) 
        {
            listaAlumnos[i]= new Alumno();
            
        }
        Alumno miAlumno= new Alumno(77, "Mercedes Guerrero", "mer@mer.com", "Valle 45");
        
        miAlumno.Set_notasIngreso(notas);
        miAlumno.CalcularPromedio();
        System.out.println(miAlumno.alumno_to_String());
        
    }
    
}
