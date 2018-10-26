/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.Stack;

public class COLECCIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Stack<Integer> pila = new Stack();
        
        //APILAR
        pila.push(1);
        pila.push(9);
        pila.push(3);
        pila.push(7);
        
        System.out.println("--------------SIZE----------------");
        System.out.println(pila.size());
        
        System.out.println("-----Ùltimo elemento ingresado------");
        System.out.println(pila.peek());//El ultimo elemento ingresado, el primero que esta para desapilar, se usa para hacer el get del ultimo elemento
        
        System.out.println("------------Elementos---------------");
        
        for (int i: pila) 
        {
            System.out.println(i);
        }
        
        System.out.println("----------Desapilar--------------");
        
        int len= pila.size();
        
        for (int i= 0; i<len; i++) 
        {
            System.out.println(pila.pop());//lo puedo mostrar porque el pop devuelve el elemento
        }
        
        System.out.println("-----------NUEVO SIZE----------");
        System.out.println(pila.size());
        
        
    }
    
}
