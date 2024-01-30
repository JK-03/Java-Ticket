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
    private MusicalTipo tipoMusica;
    private ArrayList<String> staff;

    public EventoMusical(String codigo, String titulo, String descripcion, Date fecha, double montoRenta, int aforo, MusicalTipo tipoMusica) {
        super(codigo, titulo, descripcion, fecha, montoRenta);
        setAforo(aforo);
        this.tipoMusica = tipoMusica;
        this.staff = new ArrayList<String>();
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        if (aforo > AFORO_MAXIMO) {
            JOptionPane.showMessageDialog(null, "El aforo indicado supera el límite establecido."  + "El aforo será establecido a " + AFORO_MAXIMO, "Crear Evento Musical",  JOptionPane.WARNING_MESSAGE);
            this.aforo = AFORO_MAXIMO;
        } else {
            this.aforo = aforo;
        }
    }

    public MusicalTipo getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(MusicalTipo tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    public double getImporteSeguro() {
        return  montoRenta * CUOTA_SEGURO / 100;
    }

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
}
