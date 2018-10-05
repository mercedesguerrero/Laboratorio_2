/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author capacita_mecon
 */
public class Calcu {
    
    private static float resultado;
    private static char operador;
    
    public static void PedirNumero()
    {
        System.out.println("Ingrese un numero: ");
    }
    
    public static void SetOperador(char op)
    {
        operador= op;
    }
    
    private static void Sumar(int numeroA, int numeroB)
    {
        numeroA + numeroB;
    }
    
    private static void Restar(int numeroA, int numeroB)
    {
        numeroA - numeroB;
    }
    
    public static void Calcular(int numeroA, int numeroB)
    {
        switch(operador)
        {
            case '+':
                break;
        }
    }
}
