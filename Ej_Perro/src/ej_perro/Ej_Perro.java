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
public class Ej_Perro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean aux;
        
        //Perro miPerrito= new Perro("Pichichus", 5, );
        ArrayList<Perro> ListaPerro= new ArrayList<>();
        
        Veterinaria vet1= new Veterinaria("Pulguitas");
        
        Perro Perrito1= new Perro("Pichichus", 5, eRaza.CANICHE);
        Perro Perrito2= new Perro("Lazy", 3, eRaza.LABRADOR);
        Perro Perrito3= new Perro("Boby", 2, eRaza.PEKINES);
        Perro Perrito4= new Perro("Puchi", 4, eRaza.LABRADOR);
        Perro Perrito5= Perrito3;//Son el mismo objeto
        
        //MÉTODO PARA VER SI SON LA MISMA INSTANCIA
        aux= Perrito5.equals(Perrito3);
        //System.out.println(aux);//PARA VER SI SON =
        
        ListaPerro.add(Perrito1);
        ListaPerro.add(Perrito2);
        ListaPerro.add(Perrito3);
        ListaPerro.add(Perrito4);
        ListaPerro.add(Perrito5);
        
        for(Perro perrito: ListaPerro)
        {
           System.out.println("------------------------------");
           Perro.Mostrar_Perro(perrito);
        }
        
        //ListaPerro.remove(Perrito3);
        int index= ListaPerro.indexOf(Perrito4);
        ListaPerro.remove(index);
        //ListaPerro.remove(0);
        
        System.out.println("_SIN ELIMINADOS_");
        
        for(Perro perrito: ListaPerro)
        {
           System.out.println("------------------------------");
           Perro.Mostrar_Perro(perrito);
        }
        
        System.out.println("-------------VETERINARIA-------------");
        
        vet1.AgregarPerro(Perrito1);
        vet1.AgregarPerro(Perrito2);
        vet1.AgregarPerro(Perrito3);
        
        vet1.Quitar_Perro(0);
        
        vet1.MostrarVeterinaria();
        
        /**
        ArrayList<Integer> Lista= new ArrayList<>();
        
        Lista.add(7);
        Lista.add(1);
        Lista.add(4);
        
        for(Integer i: Lista)
        {
            System.out.println(i);
        }
       
        Collections.sort(Lista);
        
        System.out.println("---------Ordenado-----------");
        
        for(Integer i: Lista)
        {
            System.out.println(i);
        }
        */
    }
    
}
