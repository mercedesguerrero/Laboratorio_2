/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author capacita_mecon
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int[] miVector;
        int[] miVector2;
        
        miVector= new int[5];//instanciar
                
        for (int i=0; i<miVector.length; i++) 
        {
            System.out.println("Ingrese un numero: ");
            Scanner lector= new Scanner(System.in);//Rserva memoria en el heap

            miVector[i]= lector.nextInt();
        }
        
        miVector2= miVector.clone();
        
        miVector[2]= 15;
        
        System.out.println("Vector 1: ");
        
        for (int i=0; i<miVector.length; i++) 
        {
            System.out.print("Pos " + i + ": " + miVector[i] + " || ");
        }
        
        System.out.println("Vector 2: ");
        
        for (int i=0; i<miVector2.length; i++) 
        {
            System.out.print("Pos " + i + ": " + miVector2[i] + " || ");
        }
        
        System.out.println("Vector 1 con for each: ");
        
        for(int i : miVector)
        {
            System.out.print(i + " || ");
        }

    }
    
}
