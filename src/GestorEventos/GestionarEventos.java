/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorEventos;

import GestorUsuarios.UsuariosInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author jenniferbueso
 */
public class GestionarEventos {
    private ArrayList<EventosInfo> listaEventos;
    private static int contador = 0;
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
    private EventoMusical eventoM;

    public GestionarEventos(ArrayList<EventosInfo> listaEventos) {
        if (listaEventos != null) {
            this.listaEventos = listaEventos;
        } else {
            this.listaEventos = new ArrayList<>();
        }
    }
    
   public String generarCodigoUnico() {
        return "EV" + sdf.format(new Date()) + (contador++);
    }
   
   public boolean agregarEvento(EventosInfo evento) {
       if (listaEventos.contains(evento)) {
            JOptionPane.showMessageDialog(null, "El evento con el código " + evento.getCodigo() + " ya existe. Por favor, intenta agregar un evento diferente.", "Evento Existente", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            boolean isAdded = listaEventos.add(evento);
            if (isAdded) {
                JOptionPane.showMessageDialog(null, "El evento '" + evento.getTitulo() + "' ha sido agregado con éxito.", "Evento Creado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Hubo un problema al agregar el evento. Por favor, intenta de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            return isAdded;
        }
   }
   
   
}
