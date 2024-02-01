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
public class EventoMusical extends EventosInfo {
    private static final int AFORO_MAXIMO = 25000;
    public static final double CUOTA_SEGURO = 30d; //30%
    private int aforo;
    private double seguro;
    private MusicalTipo tipoMusica;
    private String musicos, cargos;
    //private ArrayList<String> staff;

    public EventoMusical(String codigo, String titulo, String descripcion, Date fecha, double montoRenta, int aforo, MusicalTipo tipoMusica) {
        super(codigo, titulo, descripcion, fecha, montoRenta);
        this.tipoMusica = tipoMusica;
        this.seguro = seguro;
        //this.staff = new ArrayList<String>();
    }

    public String getMusicos() {
        return musicos;
    }

    public void setMusicos(String musicos) {
        this.musicos = musicos;
    }

    public String getCargos() {
        return cargos;
    }

    public void setCargos(String cargos) {
        this.cargos = cargos;
    }

    public int getAforo() {
        return aforo;
    }

    public boolean setAforo(int aforo) {
        if (aforo > AFORO_MAXIMO) {
            JOptionPane.showMessageDialog(null, "El aforo indicado supera el límite establecido de " + AFORO_MAXIMO + ". Por favor, introduce un nuevo valor.", "Crear Evento Deportivo", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            this.aforo = aforo;
            return true;
        }
    }

    public double getSeguro() {
        return seguro;
    }

    public void setSeguro(double seguro) {
        this.seguro = seguro;
    }
    
    public MusicalTipo getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(MusicalTipo tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    public double getImporteSeguro(double montoRenta) {
        return  montoRenta * CUOTA_SEGURO / 100;
    }

    /*
    public void setStaff(String[] lista) {
        for (String nombre : lista) {
            staff.add(nombre);
        }
    }

    public String getStaff() {
        StringBuilder lista = new StringBuilder();
        for (String nombre : staff) {
            lista.append(nombre + ";\n");
        }
        return lista.toString();
    }
    */
}
