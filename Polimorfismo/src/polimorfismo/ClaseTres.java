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
public final class ClaseTres extends ClaseDos{
    
    protected float _atributoTres;
    
    public ClaseTres(String atClaseUno, int atClaseDos, float atributoTres)
    {
        super(atClaseUno, atClaseDos);
        this._atributoTres= atributoTres;
    }

    @Override
    public String Mostrar()
    {
        StringBuilder miCadena= new StringBuilder();
         
        miCadena.append(super.Mostrar());
        miCadena.append(" Clase Tres");
        
        return miCadena.toString();
    }

    public float getTres() {
        return _atributoTres;
    }

    
}
