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
    
    
    //Funcion recursiva
    public boolean agregarUsuario(String nombreCompleto, String usuario, String contra, int edad, int index) {
        if (index == listaUsuarios.size()) {
            UsuariosInfo nuevoUsuario = new UsuariosInfo(nombreCompleto, usuario, contra, edad) {};
            listaUsuarios.add(nuevoUsuario);
            return true;
        }

        UsuariosInfo usuarioExistente = listaUsuarios.get(index);
        if (usuarioExistente.getUsuario().equals(usuario)) {
            return false;
        }

        return agregarUsuario(nombreCompleto, usuario, contra, edad, index + 1);
    }
}
