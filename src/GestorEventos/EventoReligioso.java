/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorEventos;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author jenniferbueso
 */
public class EventoReligioso extends EventosInfo {
    private static final int AFORO_MAXIMO = 30000;
    public static final int CUOTA_SEGURO = 2000;
    private int aforo;
    private int convertidos;

    public EventoReligioso(String codigo, String titulo, String descripcion, Date fecha, double montoRenta,int aforo) {
        super(codigo, titulo, descripcion, fecha, montoRenta);
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

    public void setConvertidos(int cantidad) {
        convertidos = cantidad;
    }

    public int getConvertidos() {
        return convertidos;
    }
}
