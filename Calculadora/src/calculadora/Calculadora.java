
package calculadora;

/**
 *
 * @author capacita_mecon
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Calcu.PedirNumero();
        Calcu.PedirNumero();
               
        Calcu.SetOperador('+');
        
        Calcu.Calcular(0, 0);
                
        mostrarResultado();
        
        
        
    }
    
}
