/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_clase3;

/**
 *
 * @author capacita_mecon
 */
public class Ejercicio_Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Rueda ruedita= new Rueda();
        
        Carrera miCarrera= new Carrera();
        
        System.out.println("Cantidad de competidores: " + Auto.contador);
           
        miCarrera.MostrarCarrera();
        
        /**
        eFabricante miMarca;
        
        miMarca= eFabricante.FIAT;
        
        //System.out.println("Marca: " +miMarca);
        System.out.println(miMarca.ordinal());//PARA OBTENER EL VALOR NUMERICO
        * 
        * 
        * int x= (int)(Math.random()* eFabricante.values().length);//me devuelve la cantidad de elementos
        
        System.out.println(x);
        //System.out.println("Auto: " +autito.fabricante);
        * eFabricante marc;
        marc= eFabricante.values()[x];
        
        System.out.println(marc);
        * 
        * 
        for (eFabricante r : eFabricante.values()) //for each recorre colecciones ... r es la variable de control
        {
            System.out.println(r.ordinal() + ": " + r);
            
        }
         */
        
        
        
        
    }

    private static void MostrarCarrera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
