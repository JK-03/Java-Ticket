/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorEventos;

import GestorUsuarios.Administrador;
import GestorUsuarios.Contenidos;
import GestorUsuarios.UsuariosInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
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

    public GestionarEventos() {
        listaEventos = new ArrayList();
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
   
   //Función Recursiva
   public EventosInfo buscarEvento(String codigo) {
       return buscarEvento(codigo, 0);
   }
   
   private EventosInfo buscarEvento(String codigo, int index) {
        if (index >= listaEventos.size()) {
            return null;
        }

        EventosInfo evento = listaEventos.get(index);
        if (evento.getCodigo().equals(codigo)) {
            return evento;
        }

        return buscarEvento(codigo, index + 1);
    }
   
   public void eliminarEvento(String codigo, UsuariosInfo usuario) {
        EventosInfo evento = buscarEvento(codigo);
        if (evento != null) {
                if (usuario instanceof Administrador && !((Administrador) usuario).esCreadorDeEvento(codigo)) {
                JOptionPane.showMessageDialog(null, "Solo el usuario que creó el evento '" + evento.getTitulo() + "' puede borrarlo.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } else if (usuario instanceof Contenidos && !((Contenidos) usuario).esCreadorDeEvento(codigo)) {
                JOptionPane.showMessageDialog(null, "Solo el usuario que creó el evento '" + evento.getTitulo() + "' puede borrarlo.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (evento.isCancelado()) {
                JOptionPane.showMessageDialog(null, "El evento '" + evento.getTitulo() + "' ya ha sido cancelado.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            // Verificar si el evento ya se ha realizado
            if (evento.yaRealizado()) {
                JOptionPane.showMessageDialog(null, "El evento ya se ha realizado y no puede ser cancelado.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Calcular la diferencia en días entre la fecha actual y la fecha del evento
            long diferenciaEnMilisegundos = Math.abs(new Date().getTime() - evento.getFecha().getTime());
            long diferenciaEnDias = TimeUnit.DAYS.convert(diferenciaEnMilisegundos, TimeUnit.MILLISECONDS);

            // Si la diferencia en días es de 1 o menos, verificar el tipo de evento
            if (diferenciaEnDias <= 1) {
                if (evento instanceof EventoReligioso) {
                    JOptionPane.showMessageDialog(null, "El evento '" + evento.getTitulo() + "' ha sido cancelado sin penalización.", "Evento Cancelado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    double indemnizacion = evento.getMontoRenta() * 0.5;
                    JOptionPane.showMessageDialog(null, "El evento '" + evento.getTitulo() + "' ha sido cancelado. Se cobrará una indemnización del 50%: " + indemnizacion, "Evento Cancelado", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El evento '" + evento.getTitulo() + "' ha sido cancelado sin penalización.", "Evento Cancelado", JOptionPane.INFORMATION_MESSAGE);
            }
            
            evento.setCancelado(true);
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró un evento con el código proporcionado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
   
   public EventosInfo regresarEvento(String codigo) {
       EventosInfo evento = buscarEvento(codigo);
       if (evento!=null) {
           return evento;
       } else {
           return null;
       }
   }





}
