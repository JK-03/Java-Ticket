/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorUsuarios;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author jenniferbueso
 */
public abstract class UsuariosInfo {
    private String usuario, contra, tipoUsuario, nombreCompleto;
    private int edad;
    
    public UsuariosInfo(String nombreCompleto, String usuario, String contra, int edad){
        this.nombreCompleto = nombreCompleto;
        this.usuario = usuario;
        this.contra = contra;
        this.tipoUsuario = tipoUsuario;
        this.edad = edad;
    }

    //Setters y Getters

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public boolean equals(Object otroObjeto) {
        if (this == otroObjeto) {
            return true;
        }
        if (otroObjeto == null || getClass() != otroObjeto.getClass()) {
            return false;
        }
        
        UsuariosInfo otroUsuario = (UsuariosInfo) otroObjeto;
        return Objects.equals(nombreCompleto, otroUsuario.nombreCompleto) &&
               Objects.equals(usuario, otroUsuario.usuario) &&
               Objects.equals(contra, otroUsuario.contra) &&
               edad == otroUsuario.edad;
    }
    
    @Override
    public String toString() {
        return this.getUsuario();
    }
}

    
