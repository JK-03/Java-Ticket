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
public class GestionarUsuarios {
    private ArrayList<UsuariosInfo> listaUsuarios;
    
    public GestionarUsuarios(ArrayList<UsuariosInfo> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
    //Funcion Recursiva
    public boolean agregarUsuario(String nombreCompleto, String usuario, String contra, int edad, String tipoUsuario) {
        return agregarUsuario(nombreCompleto, usuario, contra, edad, tipoUsuario, 0);
    }
    
    private boolean agregarUsuario(String nombreCompleto, String usuario, String contra, int edad, String tipoUsuario, int index) {
        if (index == listaUsuarios.size()) {
            UsuariosInfo nuevoUsuario = new UsuariosInfo(nombreCompleto, usuario, contra, edad, tipoUsuario) {};
            listaUsuarios.add(nuevoUsuario);
            return true;
        }

        UsuariosInfo usuarioExistente = listaUsuarios.get(index);
        if (usuarioExistente.getUsuario().equals(usuario)) {
            return false;
        }

        return agregarUsuario(nombreCompleto, usuario, contra, edad, tipoUsuario, index + 1);
    }
    
    //Función Recursiva
    public int logIn(String usuario, String contra) {
        return logIn(usuario, contra, 0);
    }
    
    private int logIn(String usuario, String contra, int index) {
        if (index == listaUsuarios.size()) {
            return 1;
        }

        UsuariosInfo usuarioExistente = listaUsuarios.get(index);
        if (usuarioExistente.getUsuario().equals(usuario)) {
            if (usuarioExistente.getContra().equals(contra)) {
                return 0;
            } else {
                return 2;
            }
        }
        
        return logIn(usuario, contra, index + 1);
    }
    
    //Función Recursiva
    public String getTipoUsuario(String nombreUsuario) {
        return getTipoUsuarioRecursivo(nombreUsuario, 0);
    }
    
    private String getTipoUsuarioRecursivo(String nombreUsuario, int index) {
        if (index == listaUsuarios.size()) {
            return null;
        }

        UsuariosInfo usuarioExistente = listaUsuarios.get(index);
        if (usuarioExistente.getUsuario().equals(nombreUsuario)) {
            return usuarioExistente.getTipoUsuario();
        }

        return getTipoUsuarioRecursivo(nombreUsuario, index + 1);
    }
}
