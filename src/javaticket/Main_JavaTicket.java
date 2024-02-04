/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaticket;

import GestorEventos.ContadoresReportes;
import GestorEventos.GestionarEventos;
import GestorUsuarios.GestionarUsuarios;

/**
 *
 * @author jenniferbueso
 */
public class Main_JavaTicket {
    public static GestionarEventos gestionarEventos = new GestionarEventos();
    public static GestionarUsuarios gestionarUsuarios = new GestionarUsuarios();
    public static ContadoresReportes contadoresReportes = new ContadoresReportes(gestionarEventos.getListaEventos());
    
    public static void main(String[] args) {
        PantallaInicio pantallaInicio = new PantallaInicio(null);
        pantallaInicio.setVisible(true);
    }
}
