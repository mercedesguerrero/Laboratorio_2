/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author capacita_mecon
 */
public class ClaseDos extends ClaseUno{
    
    protected int _atributoDos;
    
    public ClaseDos(String atributoUno, int atributoDos)
    {
        super(atributoUno);
        this._atributoDos= atributoDos;
    }

    @Override
    public String Mostrar()
    {
        StringBuilder miCadena= new StringBuilder();
        /**
        miCadena.append(super.Mostrar());
         */
        miCadena.append("Clase Dos");
        
        return miCadena.toString();
    }
    
    public int getDos() {
        return _atributoDos;
    }
    
    @Override
    public String toString()
    {
        return "Clase Dos";
    }

}
