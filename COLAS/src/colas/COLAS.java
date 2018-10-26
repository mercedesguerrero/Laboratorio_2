/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author capacita_mecon
 */
public class COLAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Queue<Integer> cola;
        
        cola= new LinkedList();
        
        cola.offer(1);
        cola.offer(9);
        cola.offer(3);
        cola.offer(7);
        
        for (int i: cola) 
        {
            System.out.println(i);
        }
        
        System.out.println("---------SIZE------------");
        System.out.println(cola.size());
        
        //PARA DESENCOLAR LA COLA
        
        System.out.println("---------DESENCOLAR---------");
        
        int len= cola.size();
        
        for (int i= 0; i<len; i++) 
        {
            System.out.println(cola.poll());//LO DESENCOLA Y LO DEVUELVE
        }
        
        System.out.println("---------NEW SIZE------------");
        System.out.println(cola.size());
        
    }
    
}
