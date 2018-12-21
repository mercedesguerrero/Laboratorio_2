
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pasajero a= new Pasajero("Guerrero","Mercedes", "34562234", true);
        Pasajero b= new Pasajero("Vaiser","Leandro", "34564234", true);
        Pasajero c= new Pasajero("Valdez","Monica", "38562234", true);
        Pasajero d= new Pasajero("Jhonas","Albert", "39562234", false);
        Pasajero e= new Pasajero("Serrano","Nadia", "41562234", false);
        
        ArrayList<Vuelo>listaDeVuelos= new ArrayList<>();
        
        Vuelo unVuelo = new Vuelo(5, "10 de Septiembre", "Norwegian", 457.3f);
        
        unVuelo.AgregarPasajero(a);
        unVuelo.AgregarPasajero(b);
        unVuelo.AgregarPasajero(c);
        unVuelo.AgregarPasajero(d);
        unVuelo.AgregarPasajero(e);
        
        listaDeVuelos.add(unVuelo);
       
        Vuelo otroVuelo = new Vuelo(5, "15 de Noviembre", "American Airlines", 587.3f);
        otroVuelo.AgregarPasajero(a);
        otroVuelo.AgregarPasajero(b);
        otroVuelo.AgregarPasajero(c);
        
        listaDeVuelos.add(otroVuelo);
        
        for (Vuelo listin : listaDeVuelos) 
        {
            Vuelo.MostrarVuelo(listin);
            System.out.println(" Valor del vuelo: " + Vuelo.ValorarVuelo(listin));
            System.out.println("\n" + " Gasto del pasajero plus a: " + listin.CalcularGastoPasajero(listaDeVuelos, a));
        }
              
        
    }
    
}
