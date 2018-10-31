/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author capacita_mecon
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClasePadre p= new ClaseDerivada(33, 's', "Pepa");//se puede hacer esto por la herencia y polimorfismo //Hereda los metodos del padre
        
        ClaseDerivada o= (ClaseDerivada)p;//un padre no puede reemplazar a un hijo UNBOXING de un objeto (desencapsulè)
        
        ClaseDerivada unObjetoDerivado= new ClaseDerivada(3, 's', "Hola");
        
        unObjetoDerivado.MostrarDerivada();
        
       
        
        
    }
    
}
