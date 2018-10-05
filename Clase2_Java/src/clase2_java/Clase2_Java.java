
package clase2_java;

/**
 *
 * @author mechulinda
 */
public class Clase2_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Automovil miAuto= new Automovil();//como un malloc
        
        miAuto.velocidadActual= 50;
        
        Automovil.cantidadDeRuedas= 4;
        
        //System.out.println("Cantidad de ruedas: " + Automovil.cantidadDeRuedas);
        
        Automovil.MostrarCantidadRuedas();
        
        miAuto.Acelerar(100);
        
        System.out.println("Velocidad: " + miAuto.velocidadActual);
        
    }
    
}
