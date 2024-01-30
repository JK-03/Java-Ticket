/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorEventos;

import GestorUsuarios.UsuariosInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author jenniferbueso
 */
public class GestionarEventos {
    private ArrayList<EventosInfo> listaEventos;
    private static int contador = 0;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    private String fechaReservada;

    public GestionarEventos(ArrayList<EventosInfo> listaEventos) {
        this.listaEventos = listaEventos;
    }
    
   public String generarCodigoUnico() {
        return "EV" + sdf.format(new Date()) + (contador++);
    }

    public String getFechaReservada() {
        return fechaReservada;
    }

    public void setFechaReservada(String fechaReservada) {
        this.fechaReservada = fechaReservada;
    }

   
}
