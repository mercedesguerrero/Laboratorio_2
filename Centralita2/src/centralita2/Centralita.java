/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centralita2;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author capacita_mecon
 */
public class Centralita {
    
    private ArrayList<Llamada> _listaDeLlamadas;
    protected String _razonSocial;

    public Centralita()
    {
        this._listaDeLlamadas = new ArrayList<>();
    }

    public Centralita(String nombreEmpresa)
    {
        this();
        this._razonSocial = nombreEmpresa;
    }

    public ArrayList<Llamada> Llamadas()
    {
        return _listaDeLlamadas;
    }
    
    public float GananciaPorLocal()
    {
        return this.CalcularGanancia(TipoLlamada.Local);
    }
    
    public float GananciaPorProvincial()
    {
        return this.CalcularGanancia(TipoLlamada.Provincial);
    }
    
    public float GananciaTotal()
    {
        return this.CalcularGanancia(TipoLlamada.Todas);
    }
    
    private float CalcularGanancia(TipoLlamada tipo)
    {
        float ganancia = 0.0F;
        
        for (Llamada unaLlamada : _listaDeLlamadas)
        {
            if(unaLlamada instanceof Local && tipo != TipoLlamada.Provincial)
            {
                ganancia += ((Local) unaLlamada).getCostoLlamado();
            }
            else if(unaLlamada instanceof Provincial && tipo != TipoLlamada.Local)
            {
                ganancia += ((Provincial) unaLlamada).getCostoLlamado();
            }
        }
        
        return ganancia;
    }
    
    public String Mostrar()
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append("---------------------").append("\n");
        cadena.append("Centralita").append("\n");
        cadena.append("---------------------").append("\n");
        
        cadena.append("         Razón Social: ").append(this._razonSocial).append("\n");
        cadena.append("     Ganancia Locales: ").append(this.GananciaPorLocal()).append("\n");
        cadena.append("Ganancia Provinciales: ").append(this.GananciaPorProvincial()).append("\n");
        cadena.append("    Ganancias Totales: ").append(this.GananciaTotal()).append("\n");
        
        cadena.append("---------------------").append("\n");
        cadena.append("Detalle de Llamadas").append("\n");
        cadena.append("---------------------").append("\n");
        
        
        for (Llamada unaLlamada : _listaDeLlamadas)
        {
            if(unaLlamada instanceof Local)
            {
                cadena.append(((Local) unaLlamada).Mostrar());
            }
            else if(unaLlamada instanceof Provincial)
            {
                cadena.append(((Provincial) unaLlamada).Mostrar());
            }
        }
        return cadena.toString();
    }
    
    private static Comparator<Llamada> CompararDuracionAsc = (Llamada s1, Llamada s2) ->
    {
        int aux = 0;
        return (int) Math.signum(s1.getDuracion() - s2.getDuracion());
    };

    private static Comparator<Llamada> CompararDuracionDesc = (Llamada s1, Llamada s2) ->
    {
        return (int) Math.signum(s2.getDuracion() - s1.getDuracion());
    };

    public void ordenarLlamadas(int opcion)
    {

        switch (opcion)
        {
            case 1:
                this._listaDeLlamadas.sort(CompararDuracionAsc);
                break;
            case 0:
                this._listaDeLlamadas.sort(CompararDuracionDesc);
                break;
            default:
                break;
        }

}
    
}
