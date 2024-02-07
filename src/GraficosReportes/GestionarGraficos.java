/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraficosReportes;

import GestorEventos.EventoDeportivo;
import GestorEventos.EventoMusical;
import GestorEventos.EventoReligioso;
import GestorEventos.EventosInfo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author jenniferbueso
 */
public class GestionarGraficos {
    private ArrayList<EventosInfo> listaEventos;
    protected boolean eventosRealizados = false, eventosFuturos = false, eventosCancelados = false, eventosPorFecha = false, fechasInicializador = false;
    protected Date fechaInicial, fechaFinal;
    
    public GestionarGraficos(ArrayList<EventosInfo> listaEventos) {
        this.listaEventos = listaEventos;
    }
    
    //Getters y Setters
    public boolean isFechasInicializador() {
        return fechasInicializador;
    }

    public void setFechasInicializador(boolean fechasInicializador) {
        this.fechasInicializador = fechasInicializador;
    }
    
    public boolean isEventosRealizados() {
        return eventosRealizados;
    }

    public void setEventosRealizados(boolean eventosRealizados) {
        this.eventosRealizados = eventosRealizados;
    }

    public boolean isEventosFuturos() {
        return eventosFuturos;
    }

    public void setEventosFuturos(boolean eventosFuturos) {
        this.eventosFuturos = eventosFuturos;
    }

    public boolean isEventosCancelados() {
        return eventosCancelados;
    }

    public void setEventosCancelados(boolean eventosCancelados) {
        this.eventosCancelados = eventosCancelados;
    }

    public boolean isEventosPorFecha() {
        return eventosPorFecha;
    }

    public void setEventosPorFecha(boolean eventosPorFecha) {
        this.eventosPorFecha = eventosPorFecha;
    }

    public Date getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(Date fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
    
    //Eventos Realizados
    public double contadorDeportivoRealizado() {
        return contadorDeportivoRealizado(0,0);
    }
    
    private double contadorDeportivoRealizado(int contadorD, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoDeportivo && evento.yaRealizado()) {
                contadorD += evento.getMontoRenta();
            }
            return contadorDeportivoRealizado(contadorD, index + 1);
        }
        return contadorD;
    } 
    
    public double contadorMusicalRealizado() {
        return contadorMusicalRealizado(0,0);
    }
    
    private double contadorMusicalRealizado(int contadorM, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoMusical && evento.yaRealizado()) {
                contadorM += evento.getMontoRenta();
            }
            return contadorMusicalRealizado(contadorM, index + 1);
        }
        return contadorM;
    }   
    
    public double contadorReligiosoRealizado() {
        return contadorReligiosoRealizado(0,0);
    }
    
    private double contadorReligiosoRealizado(int contadorR, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoReligioso && evento.yaRealizado()) {
                contadorR += evento.getMontoRenta();
            }
            return contadorReligiosoRealizado(contadorR, index + 1);
        }
        return contadorR;
    }   
    
    //Eventos Cancelados
    public double contadorDeportivoCancelado() {
        return contadorDeportivoCancelado(0,0);
    }
    
    private double contadorDeportivoCancelado(double contadorD, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoDeportivo && evento.isCancelado()) {
                contadorD += evento.getMulta();
            }
            return contadorDeportivoCancelado(contadorD, index + 1);
        }
        return contadorD;
    }        
    
    public double contadorMusicalCancelado() {
        return contadorMusicalCancelado(0,0);
    }
    
    private double contadorMusicalCancelado(double contadorM, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoMusical && evento.isCancelado()) {
                contadorM += evento.getMulta();
            }
            return contadorMusicalCancelado(contadorM, index + 1);
        }
        return contadorM;
    }   
    
    public double contadorReligiosoCancelado() {
        return contadorReligiosoCancelado(0,0);
    }
    
    private double contadorReligiosoCancelado(double contadorR, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoReligioso && evento.isCancelado()) {
                contadorR += evento.getMulta();
            }
            return contadorReligiosoCancelado(contadorR, index + 1);
        }
        return contadorR;
    }   
    
    //Eventos Futuros
    public double contadorDeportivoFuturo() {
        return contadorDeportivoFuturo(0,0);
    }
    
    private double contadorDeportivoFuturo(double contadorD, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoDeportivo && !evento.yaRealizado() && !evento.isCancelado()) {
                contadorD += evento.getMontoRenta();
            }
            return contadorDeportivoFuturo(contadorD, index + 1);
        }
        return contadorD;
    }        
    
    public double contadorMusicalFuturo() {
        return contadorMusicalFuturo(0,0);
    }
    
    private double contadorMusicalFuturo(double contadorM, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoMusical && !evento.yaRealizado() && !evento.isCancelado()) {
                contadorM += evento.getMontoRenta();
            }
            return contadorMusicalFuturo(contadorM, index + 1);
        }
        return contadorM;
    }   
    
    public double contadorReligiosoFuturo() {
        return contadorReligiosoFuturo(0,0);
    }
    
    private double contadorReligiosoFuturo(double contadorR, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoReligioso && !evento.yaRealizado() && !evento.isCancelado()) {
                contadorR += evento.getMontoRenta();
            }
            return contadorReligiosoFuturo(contadorR, index + 1);
        }
        return contadorR;
    }  
    
    //Eventos Por Fecha
    public double contarEventosDeportivosFecha(Date fechaInicial, Date fechaFinal) {
        return contarEventosFecha(0, fechaInicial, fechaFinal, 0);
    }
    
    private double contarEventosFecha(double contador, Date fechaInicial, Date fechaFinal, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            Date fechaEvento = evento.getFecha();
            if (fechaEvento != null && !fechaEvento.before(fechaInicial) && !fechaEvento.after(fechaFinal)) {
                if (evento instanceof EventoDeportivo && !evento.yaRealizado() && !evento.isCancelado()) {
                    contador += evento.getMontoRenta();
                } else if (evento instanceof EventoDeportivo && evento.isCancelado()) {
                    contador += evento.getMulta();
                } else if (evento instanceof EventoDeportivo && evento.yaRealizado()) {
                    contador += evento.getMontoRenta();
                }
            }
            return contarEventosFecha(contador, fechaInicial, fechaFinal, index + 1);
        }
        return contador;
    }

    public double contarEventosMusicalesFecha(Date fechaInicial, Date fechaFinal) {
        return contarEventosMusicalesFecha(0, fechaInicial, fechaFinal, 0);
    }
    
    private double contarEventosMusicalesFecha(double contador, Date fechaInicial, Date fechaFinal, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            Date fechaEvento = evento.getFecha();
            if (fechaEvento != null && !fechaEvento.before(fechaInicial) && !fechaEvento.after(fechaFinal)) {
                if (evento instanceof EventoMusical && !evento.yaRealizado() && !evento.isCancelado()) {
                    contador += evento.getMontoRenta();
                } else if (evento instanceof EventoMusical && evento.isCancelado()) {
                    contador += evento.getMulta();
                } else if (evento instanceof EventoMusical && evento.yaRealizado()) {
                    contador += evento.getMontoRenta();
                }
            }
            return contarEventosMusicalesFecha(contador, fechaInicial, fechaFinal, index + 1);
        }
        return contador;
    }
    
    public double contarEventosReligiososFecha(Date fechaInicial, Date fechaFinal) {
        return contarEventosReligiososFecha(0, fechaInicial, fechaFinal, 0);
    }
    
    private double contarEventosReligiososFecha(double contador, Date fechaInicial, Date fechaFinal, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            Date fechaEvento = evento.getFecha();
            if (fechaEvento != null && !fechaEvento.before(fechaInicial) && !fechaEvento.after(fechaFinal)) {
                if (evento instanceof EventoReligioso && !evento.yaRealizado() && !evento.isCancelado()) {
                    contador += evento.getMontoRenta();
                } else if (evento instanceof EventoReligioso && evento.isCancelado()) {
                    contador += evento.getMulta();
                } else if (evento instanceof EventoReligioso && evento.yaRealizado()) {
                    contador += evento.getMontoRenta();
                }
            }
            return contarEventosReligiososFecha(contador, fechaInicial, fechaFinal, index + 1);
        }
        return contador;
    }
}
