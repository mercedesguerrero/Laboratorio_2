/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalito;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author capacita_mecon
 */
public class Hospitalito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Paciente> ListaPaciente= new ArrayList<>();
        
        Paciente Paciente1= new Paciente("34567876", "Carlos");
        Paciente Paciente2= new Paciente("23456765", "Eugenia");
        Paciente Paciente3= new Paciente("23456765", "Mercedes");
        Paciente Paciente4= new Paciente("45675234", "Leandro");
        
        ListaPaciente.add(Paciente1);
        ListaPaciente.add(Paciente2);
        ListaPaciente.add(Paciente3);
        ListaPaciente.add(Paciente4);
        
        ArrayList<Turno> ListaTurnos= new ArrayList<>();
        
        Turno Turno1= new Turno(1, Paciente1, eTipo.NORMAL);
        Turno Turno2= new Turno(2, Paciente2, eTipo.URGENTE);
        Turno Turno3= new Turno(3, Paciente3, eTipo.NORMAL);
        Turno Turno4= new Turno(4, Paciente4, eTipo.URGENTE);
        
        ListaTurnos.add(Turno1);
        ListaTurnos.add(Turno2);
        ListaTurnos.add(Turno3);
        ListaTurnos.add(Turno4);
        
        Queue<Integer> colaUrgente;
        Queue<Integer> colaNormal;
        
        colaUrgente= new LinkedList();
        colaNormal= new LinkedList();
        
        colaUrgente.offer(Turno2.getOrden());
        colaUrgente.offer(Turno4.getOrden());
        colaNormal.offer(Turno1.getOrden());
        colaNormal.offer(Turno3.getOrden());
        
        Turno2.MostrarPaciente();
        
        for (int i: colaUrgente) 
        {
            System.out.println(i);
        }
        
        for (int i: colaNormal) 
        {
            System.out.println(i);
        }
        
        while(colaUrgente.isEmpty())
        {
            System.out.println(colaUrgente.poll());//LO DESENCOLA Y LO DEVUELVE
        }
        
        
        
        
        
        
    }
    
}
