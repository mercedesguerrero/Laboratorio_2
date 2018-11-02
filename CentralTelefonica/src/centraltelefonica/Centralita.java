/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centraltelefonica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author capacita_mecon
 */
public class Centralita {
    
    private List<Llamada> _listaDeLlamadas;
    protected String razonSocial;

    //--------CONSTRUCTOR-----------
    
    Centralita()
    {
        this._listaDeLlamadas= new ArrayList<>();
    }
    
    Centralita(String NombreEmpresa)
    {
        this.razonSocial= NombreEmpresa;
    }
    
    //----------GETTERS-------------
    
    //Retornarán el precio de lo facturado según el criterio elegido
    public float GananciaPorLocal()
    {
       
    }
    
    public float GananciaPorProvincial()
    {
        return ;
    }
    
    public float GananciaTotal()
    {
        return ;
    }
    
    public List<Llamada> Llamadas() 
    {
        return _listaDeLlamadas;
    }
    
    //----------MÉTODOS-------------
    
    private float CalcularGanancia(TipoLlamada tipo)
    {   
        float ganancia;
        
        for(Llamada llama: _listaDeLlamadas)
        {
            if(llama instanceof Local)// pregunta si es una instancia de local
            {
                
            }        
            
        }
        
        switch(tipo)
        {
            case Local:
                
                {
                    
                }
                
                break;
            
            case Provincial:
                break;
                
            case Todas:
                break;
        }
        
        return ganancia;
    }
    
    
    
    
}
