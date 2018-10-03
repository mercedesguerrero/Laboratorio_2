
package clase1_java;

import java.util.Scanner;

/**
 *
 * @author capacita_mecon
 */
public class Clase1_Java {

    /**
   
     */
    public static void main(String lala[]) {
        
        /**
        int unNumero;
        Scanner lector= new Scanner(System.in);//Rserva memoria en el heap
        String nombre;
        
        //sout + tab
        System.out.println("Ingrese un numero: ");
        //crear un objeto de la clase scanner
        unNumero= lector.nextInt();
        
        System.out.println("El numero es: " + unNumero);
        
        System.out.println("Ingrese su nombre: ");
        nombre= lector.next();
        
        System.out.println("Su nombre es: " + nombre);
        
        
         */
        
        int i;
        int miNumero;
        int numMax= 0;
        int numMin= 0;
        int suma= 0;
        int flag= 0;
        float promedio;
        
        mostrarMensaje("Ejercicio 1");
        
        for(i=0; i<5; i++)
        {
            miNumero= tomaUnNumero();
            
            if(flag== 0)
            {
                numMax= miNumero;
                numMin= miNumero;
                flag= 1; 
            }
            if(flag== 1)
            {
                if(miNumero > numMax)
                {
                    numMax= miNumero;
                }
                else if(miNumero < numMin )
                {
                    numMin= miNumero;
                }
            }
            
            
            suma+= miNumero;
        }
        
        mostrarMensaje("El numero maximo es: " + numMax);
        mostrarMensaje("El numero minimo es: " + numMin);
        promedio= (float)suma/5;
        mostrarMensaje("El promedio es: " + promedio);
        
        
        
    }
    
    public static void mostrarMensaje(String mensaje)
    {
        System.out.println(mensaje);
    }
    
    public static int tomaUnNumero()
    {
        int unNumero;
        
        System.out.println("Ingrese un numero: ");
        Scanner lector= new Scanner(System.in);//Rserva memoria en el heap
        
        unNumero= lector.nextInt();
        
        return unNumero;
    }
}
