/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorEventos;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jenniferbueso
 */
public class EventoDeportivo extends EventosInfo {
    private static final int AFORO_MAXIMO = 20000;
    private int aforo;
    private String equipo1, equipo2, jugadores1, jugadores2;
    private DeportesTipo tipoDeporte;
    
    //private ArrayList<String> jugadores1;
    //private ArrayList<String> jugadores2;
    
    public EventoDeportivo(String codigo, String titulo, String descripcion, Date fecha, double montoRenta, int aforo, String equipo1, String equipo2, DeportesTipo tipoDeporte) {
        super(codigo, titulo, descripcion, fecha, montoRenta);
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.tipoDeporte = tipoDeporte;
        //this.jugadores1 = new ArrayList<String>();
        //this.jugadores2 = new ArrayList<String>();
    }

    public int getAforo() {
        return aforo;
    }

    public final boolean setAforo(int aforo) {
        if (aforo > AFORO_MAXIMO) {
            JOptionPane.showMessageDialog(null, "El aforo indicado supera el límite establecido de " + AFORO_MAXIMO + ". Por favor, introduce un nuevo valor.", "Crear Evento Deportivo", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            this.aforo = aforo;
            return true;
        }
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public DeportesTipo getTipoDeporte() {
        return tipoDeporte;
    }

    public void setTipoDeporte(DeportesTipo tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public void setJugadores1(String nombre) {
        this.jugadores1 = nombre;
    }

    public void setJugadores2(String nombre) {
        this.jugadores2 = nombre;
    }

    public String getJugadores1() {
        return jugadores1;
    }

    public String getJugadores2() {
        return jugadores2;
    }
}
