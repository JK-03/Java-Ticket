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
public final class Administrador extends UsuariosInfo {
    private ArrayList<String> idEventos;
    
    public Administrador(String nombreCompleto, String usuario, String contra, int edad) {
        super(nombreCompleto, usuario, contra, edad);
        this.idEventos = new ArrayList<>();
    }
    
    public ArrayList<String> getIdEventos() {
        return this.idEventos;
    }

    public void setIdEventos(ArrayList<String> idEventos) {
        this.idEventos = idEventos;
    }

    public void agregarIdEvento(String id) {
        this.idEventos.add(id);
    }

    public void eliminaIdEvento(String id) throws Exception {
        if (esCreadorDeEvento(id)) {
            this.idEventos.remove(id);
        } else {
            throw new Exception("Este evento no ha sido creado por este usuario");
        }
    }

    public boolean esCreadorDeEvento(String id) {
        return this.idEventos.contains(id);
    }
}
