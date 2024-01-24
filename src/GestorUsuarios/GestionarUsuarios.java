/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestorUsuarios;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

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
            switch (tipoUsuario) {
                case "ADMINISTRADOR":
                    listaUsuarios.add(new Administrador(nombreCompleto, usuario, contra, edad));
                    break;
                case "CONTENIDO":
                    listaUsuarios.add(new Contenidos(nombreCompleto, usuario, contra, edad));
                    break;
                default:
                    listaUsuarios.add(new Limitado(nombreCompleto, usuario, contra, edad));
            }
            return true;
        }

        UsuariosInfo usuarioExistente = listaUsuarios.get(index);
        if (usuarioExistente.getUsuario().equals(usuario)) {
            return false;
        }

        return agregarUsuario(nombreCompleto, usuario, contra, edad, tipoUsuario, index + 1);
    }
    
    //Función Recursiva
    public UsuariosInfo logIn(String usuario, String contra) {
        return logIn(usuario, contra, 0);
    }

    private UsuariosInfo logIn(String usuario, String contra, int index) {
        if (index == listaUsuarios.size()) {
            JOptionPane.showMessageDialog(null, "El usuario ingresado no existe. Por favor, inténtelo nuevamente.", "Usuario Inexistente", JOptionPane.ERROR_MESSAGE);
            return null;
        }

        UsuariosInfo usuarioExistente = listaUsuarios.get(index);
        if (usuarioExistente.getUsuario().equals(usuario)) {
            if (usuarioExistente.getContra().equals(contra)) {
                return usuarioExistente;
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña ingresada es incorrecta. Por favor, inténtelo nuevamente.", "Contraseña Incorrecta", JOptionPane.ERROR_MESSAGE);
                return null;
            }
        }
        
        return logIn(usuario, contra, index + 1);
    }
    
    //Función Recursiva
    public String getTipoUsuario(String nombreUsuario) {
        return getTipoUsuario(nombreUsuario, 0);
    }
    
    private String getTipoUsuario(String nombreUsuario, int index) {
        if (index == listaUsuarios.size()) {
            return null;
        }

        UsuariosInfo usuarioExistente = listaUsuarios.get(index);
        if (usuarioExistente.getUsuario().equals(nombreUsuario)) {
            return usuarioExistente.getTipoUsuario();
        }

        return getTipoUsuario(nombreUsuario, index + 1);
    }
    
    //Función Recursiva
    public void cargarUsuario(JComboBox<String> comboBox) {
        cargarUsuario(comboBox, 0);
    }

    private void cargarUsuario(JComboBox<String> comboBox, int index) {
        if (index < listaUsuarios.size()) {
            comboBox.addItem(listaUsuarios.get(index).getUsuario());
            cargarUsuario(comboBox, index + 1);
        }
    }
    
    
}
