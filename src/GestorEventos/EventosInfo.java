/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorEventos;

import java.util.Date;

/**
 *
 * @author jenniferbueso
 */
public abstract class EventosInfo {
    protected String codigo;
    protected String titulo;
    protected String descripcion;
    protected Date fecha;
    protected double montoRenta, multa;
    protected boolean cancelado = false, realizado = false, indemnizacion = false;

    public EventosInfo(String codigo, String titulo, String descripcion, Date fecha, double montoRenta) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.montoRenta = montoRenta;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMontoRenta() {
        return montoRenta;
    }

    public void setMontoRenta(double montoRenta) {
        this.montoRenta = montoRenta;
    }
    
    public boolean isCancelado() {
        return cancelado;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }
    
    public boolean yaRealizado() {
        return realizado;
    }

    public void setRealizado(boolean realizado) {
        this.realizado = realizado;
    }
    
    public void verificarSiYaRealizado() {
        Date hoy = new Date();
        if (fecha != null && !fecha.after(hoy)) {
            setRealizado(true);
        }
    }

    public boolean isIndemnizacion() {
        return indemnizacion;
    }

    public void setIndemnizacion(boolean indemnizacion) {
        this.indemnizacion = indemnizacion;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }
}
