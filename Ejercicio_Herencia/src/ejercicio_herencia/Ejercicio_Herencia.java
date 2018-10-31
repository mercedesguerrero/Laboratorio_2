/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_herencia;

/**
 *
 * @author capacita_mecon
 */
public class Ejercicio_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SerHumano unHumano= new SerHumano("Alberto", 76, 168, "masculino");
        
        System.out.println("---------SER HUMANO-----------");
        
        unHumano.MostrarNombreHumano();
        
        Gerente unGerente= new Gerente("Leandro", 78, 172, "masculino", 80000, "Contabilidad");
        
        System.out.println("---------GERENTE-----------");
        
        unGerente.MostrarNombreHumano();
        unGerente.Trabajar();
        
        Empleado unEmpleado= new Empleado("Mercedes", 65, 164, "femenino", 50000);
        
        System.out.println("---------EMPLEADO-----------");
        
        unEmpleado.MostrarNombreHumano();
        unEmpleado.Comer("Pastas");
        unEmpleado.Trabajar();
        
    }
    
}
