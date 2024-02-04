/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorEventos;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author jenniferbueso
 */
public class ContadoresReportes {
    private ArrayList<EventosInfo> listaEventos;
    
    public ContadoresReportes(ArrayList<EventosInfo> listaEventos) {
        this.listaEventos = listaEventos;
    }
    
    //Reportes - Eventos Realizados
   public String buscarEventosRealizados() {
        Collections.sort(listaEventos, new Comparator<EventosInfo>() {
                @Override
                public int compare(EventosInfo e1, EventosInfo e2) {
                    return e1.getFecha().compareTo(e2.getFecha());
                }
            });

        return buscarEventosRealizados(new StringBuilder(), 0).toString();
    }

    private StringBuilder buscarEventosRealizados(StringBuilder eventosRealizados, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            String tipo = "";
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy", new Locale("es", "ES"));
            String fecha = formato.format(evento.getFecha());
            if (evento.yaRealizado()) {
                if (evento instanceof EventoDeportivo) {
                   tipo = "Deportivo";
                } else if (evento instanceof EventoMusical) {
                    tipo = "Musical";
                } else if (evento instanceof EventoReligioso) {
                    tipo = "Religioso";
                }
                    eventosRealizados.append(evento.getCodigo() + " - ").append(tipo + " - ").append(evento.getTitulo() + " - ").append(fecha + " - ").append("Lps. " + evento.getMontoRenta() + "\n");
            }
            return buscarEventosRealizados(eventosRealizados, index + 1);
        }
        return eventosRealizados;
    }

    public int contadorDeportivoRealizado() {
        return contadorDeportivoRealizado(0,0);
    }
    
    private int contadorDeportivoRealizado(int contadorD, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoDeportivo && evento.yaRealizado()) {
                contadorD++;
            }
            return contadorDeportivoRealizado(contadorD, index + 1);
        }
        return contadorD;
    }        
    
    public int contadorMusicalRealizado() {
        return contadorMusicalRealizado(0,0);
    }
    
    private int contadorMusicalRealizado(int contadorM, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoMusical && evento.yaRealizado()) {
                contadorM++;
            }
            return contadorMusicalRealizado(contadorM, index + 1);
        }
        return contadorM;
    }   
    
    public int contadorReligiosoRealizado() {
        return contadorReligiosoRealizado(0,0);
    }
    
    private int contadorReligiosoRealizado(int contadorR, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoReligioso && evento.yaRealizado()) {
                contadorR++;
            }
            return contadorReligiosoRealizado(contadorR, index + 1);
        }
        return contadorR;
    }   
    
    public double montoGeneradoRealizado() {
        return montoGeneradoRealizado(0, 0);
    }
    
    private double montoGeneradoRealizado(double montoGenerado, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento.yaRealizado()) {
                montoGenerado += evento.montoRenta;
            }
            return montoGeneradoRealizado(montoGenerado, index + 1);
        }
        return montoGenerado;
    }
    
    //Reportes - Eventos Cancelados
    public String buscarEventosCancelados() {
        return buscarEventosCancelados(new StringBuilder(), 0).toString();
    }

    private StringBuilder buscarEventosCancelados(StringBuilder eventosCancelados, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            String tipo = "";
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy", new Locale("es", "ES"));
            String fecha = formato.format(evento.getFecha());
            if (evento.isCancelado()) {
                if (evento instanceof EventoDeportivo) {
                   tipo = "Deportivo";
                } else if (evento instanceof EventoMusical) {
                    tipo = "Musical";
                } else if (evento instanceof EventoReligioso) {
                    tipo = "Religioso";
                }
                    eventosCancelados.append(evento.getCodigo() + " - ").append(tipo + " - ").append(evento.getTitulo() + " - ").append(fecha + " - ").append("Lps. " + evento.getMontoRenta() + "\n");
            }
            return buscarEventosCancelados(eventosCancelados, index + 1);
        }
        return eventosCancelados;
    }
    
    public int contadorDeportivoCancelado() {
        return contadorDeportivoCancelado(0,0);
    }
    
    private int contadorDeportivoCancelado(int contadorD, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoDeportivo && evento.isCancelado()) {
                contadorD++;
            }
            return contadorDeportivoCancelado(contadorD, index + 1);
        }
        return contadorD;
    }        
    
    public int contadorMusicalCancelado() {
        return contadorMusicalCancelado(0,0);
    }
    
    private int contadorMusicalCancelado(int contadorM, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoMusical && evento.isCancelado()) {
                contadorM++;
            }
            return contadorMusicalCancelado(contadorM, index + 1);
        }
        return contadorM;
    }   
    
    public int contadorReligiosoCancelado() {
        return contadorReligiosoCancelado(0,0);
    }
    
    private int contadorReligiosoCancelado(int contadorR, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoReligioso && evento.isCancelado()) {
                contadorR++;
            }
            return contadorReligiosoCancelado(contadorR, index + 1);
        }
        return contadorR;
    }   
    
    public double MultaGenerada() {
        return MultaGenerada(0, 0);
    }
    
    private double MultaGenerada(double montoGenerado, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento.isCancelado()) {
                montoGenerado += evento.getMulta();
            }
            return MultaGenerada(montoGenerado, index + 1);
        }
        return montoGenerado;
    }
    
    //Reportes - Eventos Futuros
    public String buscarEventosFuturos() {
        return buscarEventosFuturos(new StringBuilder(), 0).toString();
    }

    private StringBuilder buscarEventosFuturos(StringBuilder eventosFuturos, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            String tipo = "";
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy", new Locale("es", "ES"));
            String fecha = formato.format(evento.getFecha());
            if (!evento.yaRealizado() && !evento.isCancelado()) {
                if (evento instanceof EventoDeportivo) {
                   tipo = "Deportivo";
                } else if (evento instanceof EventoMusical) {
                    tipo = "Musical";
                } else if (evento instanceof EventoReligioso) {
                    tipo = "Religioso";
                }
                    eventosFuturos.append(evento.getCodigo() + " - ").append(tipo + " - ").append(evento.getTitulo() + " - ").append(fecha + " - ").append("Lps. " + evento.getMontoRenta() + "\n");
            }
            return buscarEventosFuturos(eventosFuturos, index + 1);
        }
        return eventosFuturos;
    }
    
    public int contadorDeportivoFuturo() {
        return contadorDeportivoFuturo(0,0);
    }
    
    private int contadorDeportivoFuturo(int contadorD, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoDeportivo && !evento.yaRealizado() && !evento.isCancelado()) {
                contadorD++;
            }
            return contadorDeportivoFuturo(contadorD, index + 1);
        }
        return contadorD;
    }        
    
    public int contadorMusicalFuturo() {
        return contadorMusicalFuturo(0,0);
    }
    
    private int contadorMusicalFuturo(int contadorM, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoMusical && !evento.yaRealizado() && !evento.isCancelado()) {
                contadorM++;
            }
            return contadorMusicalFuturo(contadorM, index + 1);
        }
        return contadorM;
    }   
    
    public int contadorReligiosoFuturo() {
        return contadorReligiosoFuturo(0,0);
    }
    
    private int contadorReligiosoFuturo(int contadorR, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (evento instanceof EventoReligioso && !evento.yaRealizado() && !evento.isCancelado()) {
                contadorR++;
            }
            return contadorReligiosoFuturo(contadorR, index + 1);
        }
        return contadorR;
    }   
    
    public double MontoTotal() {
        return MontoTotal(0, 0);
    }
    
    private double MontoTotal(double montoGenerado, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            
            if (!evento.yaRealizado() && !evento.isCancelado()) {
                montoGenerado += evento.getMontoRenta();
            }
            return MontoTotal(montoGenerado, index + 1);
        }
        return montoGenerado;
    }
    
    //Reportes - Generado por Fecha
    public String filtrarEventosPorFechas(Date fechaInicial, Date fechaFinal) {
        return filtrarEventosPorFechas(new StringBuilder(), fechaInicial, fechaFinal, 0).toString();
    }
    
    private StringBuilder filtrarEventosPorFechas(StringBuilder eventosFiltrados, Date fechaInicial, Date fechaFinal, int index) {
        int contadorD = 0;
        String tipo="", estado="";
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            Date fechaEvento = evento.getFecha();
            if (fechaEvento != null && !fechaEvento.before(fechaInicial) && !fechaEvento.after(fechaFinal)) {
                
                    if (evento instanceof EventoDeportivo) {
                        tipo = "Deportivo";
                    } else if (evento instanceof EventoMusical) {
                        tipo = "Musical";
                    } else if (evento instanceof EventoReligioso) {
                        tipo = "Religioso";
                    }
                    
                    if (evento.yaRealizado()) {
                        estado = "Realizado";
                    } if (evento.isCancelado()) {
                        estado = "Cancelado";
                    } else {
                        estado = "Activo";
                    }
                
                eventosFiltrados.append(evento.getCodigo()).append(" - ").append(tipo).append(" - ").append(evento.getTitulo()).append(" - ").append(estado + " - ").append("Lps. " + String.valueOf(evento.getMontoRenta())).append("\n");
            }
            return filtrarEventosPorFechas(eventosFiltrados, fechaInicial, fechaFinal, index + 1);
        }
        return eventosFiltrados;
    }
    
    public int contarEventosDeportivosFecha(Date fechaInicial, Date fechaFinal) {
        return contarEventosFecha(0, fechaInicial, fechaFinal, 0);
    }
    
    private int contarEventosFecha(int contador, Date fechaInicial, Date fechaFinal, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            Date fechaEvento = evento.getFecha();
            if (fechaEvento != null && !fechaEvento.before(fechaInicial) && !fechaEvento.after(fechaFinal)) {
                if (evento instanceof EventoDeportivo) {
                    contador++;
                }
            }
            return contarEventosFecha(contador, fechaInicial, fechaFinal, index + 1);
        }
        return contador;
    }

    public int contarEventosMusicalesFecha(Date fechaInicial, Date fechaFinal) {
        return contarEventosMusicalesFecha(0, fechaInicial, fechaFinal, 0);
    }
    
    private int contarEventosMusicalesFecha(int contador, Date fechaInicial, Date fechaFinal, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            Date fechaEvento = evento.getFecha();
            if (fechaEvento != null && !fechaEvento.before(fechaInicial) && !fechaEvento.after(fechaFinal)) {
                if (evento instanceof EventoMusical) {
                    contador++;
                }
            }
            return contarEventosMusicalesFecha(contador, fechaInicial, fechaFinal, index + 1);
        }
        return contador;
    }
    
    public int contarEventosReligiososFecha(Date fechaInicial, Date fechaFinal) {
        return contarEventosReligiososFecha(0, fechaInicial, fechaFinal, 0);
    }
    
    private int contarEventosReligiososFecha(int contador, Date fechaInicial, Date fechaFinal, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            Date fechaEvento = evento.getFecha();
            if (fechaEvento != null && !fechaEvento.before(fechaInicial) && !fechaEvento.after(fechaFinal)) {
                if (evento instanceof EventoReligioso) {
                    contador++;
                }
            }
            return contarEventosReligiososFecha(contador, fechaInicial, fechaFinal, index + 1);
        }
        return contador;
    }
    
    public double montoGeneradoFecha(Date fechaInicial, Date fechaFinal) {
        return montoGeneradoFecha(0, fechaInicial, fechaFinal, 0);
    }
    
    private double montoGeneradoFecha(double montoGenerado, Date fechaInicial, Date fechaFinal, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            Date fechaEvento = evento.getFecha();
            if (fechaEvento != null && !fechaEvento.before(fechaInicial) && !fechaEvento.after(fechaFinal) && !evento.isCancelado()) {
                montoGenerado += evento.montoRenta;
            }
            return montoGeneradoFecha(montoGenerado, fechaInicial, fechaFinal, index + 1);
        }
        return montoGenerado;
    }
    
    public double multaGeneradoFecha(Date fechaInicial, Date fechaFinal) {
        return multaGeneradoFecha(0, fechaInicial, fechaFinal, 0);
    }
    
    private double multaGeneradoFecha(double multaGenerada, Date fechaInicial, Date fechaFinal, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            Date fechaEvento = evento.getFecha();
            if (fechaEvento != null && !fechaEvento.before(fechaInicial) && !fechaEvento.after(fechaFinal) && evento.isCancelado()) {
                multaGenerada += evento.multa;
            }
            return multaGeneradoFecha(multaGenerada, fechaInicial, fechaFinal, index + 1);
        }
        return multaGenerada;
    }
    
    public double totalFecha(Date fechaInicial, Date fechaFinal) {
        return totalFecha(0, fechaInicial, fechaFinal, 0);
    }
    
    private double totalFecha(double totalGenerado, Date fechaInicial, Date fechaFinal, int index) {
        if (index < listaEventos.size()) {
            EventosInfo evento = listaEventos.get(index);
            Date fechaEvento = evento.getFecha();
            if (fechaEvento != null && !fechaEvento.before(fechaInicial) && !fechaEvento.after(fechaFinal) && !evento.isCancelado()) {
                totalGenerado += evento.montoRenta;
            } else if (fechaEvento != null && !fechaEvento.before(fechaInicial) && !fechaEvento.after(fechaFinal) && evento.isCancelado()) {
                totalGenerado += evento.multa;
            }
            return totalFecha(totalGenerado, fechaInicial, fechaFinal, index + 1);
        }
        return totalGenerado;
    }
    
}
