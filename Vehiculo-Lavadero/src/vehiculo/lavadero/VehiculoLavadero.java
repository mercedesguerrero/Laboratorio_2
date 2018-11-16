/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculo.lavadero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author capacita_mecon
 */
public class VehiculoLavadero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lavadero nuevoLavadero = new Lavadero("LAVACLEAN");
        
         /**
        Vehiculo unVehiculo= new Vehiculo("AH345", 4, eMarcas.Ford);
        Vehiculo otroVehiculo= new Vehiculo("AJ789", 4, eMarcas.Fiat);
        
        System.out.println("Marca:" + unVehiculo._marca.toString());
        System.out.println("Marca:" + otroVehiculo._marca.toString());
        
        if(Vehiculo.ComparaVehiculos(unVehiculo, otroVehiculo))
        {
            System.out.println("Los vehiculos son de igual marca y patente");
        }
        else
        {
            System.out.println("Los vehiculos tienen marca y/o patente distintos");
        }
        */
         
        Auto auto1 = new Auto(3, "hzc689", eMarcas.Ford);
        Auto auto2 = new Auto(4, "jzw514", eMarcas.Honda);
        Auto auto3 = new Auto(2, "amb458", eMarcas.Fiat);
        Camion camion1 = new Camion((float)15.4, "YTR453", 10, eMarcas.Scania);
        Camion camion2 = new Camion((float)18.9, "QWE453", 12, eMarcas.Iveco);
        Moto moto1 = new Moto((float)99.9, "cvb011", 2, eMarcas.Zanella);
        Moto moto2 = new Moto((float)159.9, "vcx011", 2, eMarcas.Zanella);
        
        Lavadero.AgregarVehiculo(nuevoLavadero, auto1);
        Lavadero.AgregarVehiculo(nuevoLavadero, auto2);
        Lavadero.AgregarVehiculo(nuevoLavadero, auto3);
        Lavadero.AgregarVehiculo(nuevoLavadero, moto1);
        Lavadero.AgregarVehiculo(nuevoLavadero, moto2);
        Lavadero.AgregarVehiculo(nuevoLavadero, camion2);
        
        System.out.println("Total Facturado: "+ nuevoLavadero.MostrarTotalFacturado());
        System.out.println("Detalle - Autos: "+ nuevoLavadero.MostrarTotalFacturado(eVehiculo.Auto));
        System.out.println("Detalle - Camiones:  "+ nuevoLavadero.MostrarTotalFacturado(eVehiculo.Camion));
        System.out.println("Detalle - Motos: "+ nuevoLavadero.MostrarTotalFacturado(eVehiculo.Moto));
        
        
        
        System.out.println("----------------------------------\n");
        
        
        nuevoLavadero.getVehiculos().sort(Vehiculo.OrdenarVehiculosPorPatente);
        
        System.out.println( nuevoLavadero.LavaderoString());
        
        
        if(Lavadero.EstaEnLavadero(nuevoLavadero, camion2))
            System.out.println("Esta en lavadero");
        else    
            System.out.println("No esta en lavadero");
        System.out.println("----------------------------------\n");
        Lavadero.AgregarVehiculo(nuevoLavadero, camion2);
        System.out.println( nuevoLavadero.LavaderoString());
       

    }
    
}
