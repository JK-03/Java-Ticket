/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaticket;

import GestorEventos.GestionarEventos;

/**
 *
 * @author jenniferbueso
 */
public class Main_JavaTicket {
    public static GestionarEventos gestionarEventos = new GestionarEventos();
    
    public static void main(String[] args) {
        PantallaInicio pantallaInicio = new PantallaInicio(null);
        pantallaInicio.setVisible(true);
    }
}
