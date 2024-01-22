/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorUsuarios;

import java.util.ArrayList;

/**
 *
 * @author jenniferbueso
 */
public abstract class UsuariosInfo {
    private String usuario, contra, tipoUsuario, nombreCompleto;
    private int edad;
    private ArrayList<UsuariosInfo> listaUsuarios = new ArrayList<>();
    
    public UsuariosInfo(String nombreCompleto, String usuario, String contra, int edad, String tipoUsuario){
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

    public ArrayList<UsuariosInfo> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<UsuariosInfo> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    //Funcion recursiva
    public boolean agregarUsuario(String usuario, String contra, String tipoUsuario, int index) {
        if (index == listaUsuarios.size()) {
            //UsuariosInfo nuevoUsuario = new UsuariosInfo(usuario, contra);
            //listaUsuarios.add(nuevoUsuario);
            return true;
        }

        // Verificar si el usuario ya existe en la lista
        UsuariosInfo usuarioExistente = listaUsuarios.get(index);
        if (usuarioExistente.getUsuario().equals(usuario)) {
            // Si el usuario ya existe, retornar false
            return false;
        }

        // Si el usuario no existe, continuar con el siguiente usuario en la lista
        return agregarUsuario(usuario, contra, tipoUsuario, index + 1);
        }
    
    }

    
