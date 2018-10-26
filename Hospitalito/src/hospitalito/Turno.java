/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalito;

/**
 *
 * @author capacita_mecon
 */
public class Turno {
    
    private int _orden;
    private Paciente _paciente;
    private eTipo _tipo;
    
    //CONSTRUCTOR PARAMETRIZADO
    
    public Turno(int orden, Paciente pacient, eTipo tipo_nah)
    {
        this._orden= orden;
        this._paciente= pacient;
        this._tipo= tipo_nah;
    }

    public int getOrden() {
        return _orden;
    }

    public void setOrden(int _orden) {
        this._orden = _orden;
    }
    
    public void MostrarPaciente()
    {
        System.out.println("Orden: " + this._orden);
        System.out.println("Paciente: " + this._paciente);
        System.out.println("Tipo: " + this._tipo);
    }
}
