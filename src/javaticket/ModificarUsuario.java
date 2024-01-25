/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaticket;

import GestorUsuarios.GestionarUsuarios;
import GestorUsuarios.UsuariosInfo;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jenniferbueso
 */
public class ModificarUsuario extends javax.swing.JFrame {
    private GestionarUsuarios gestionarUsuarios;
    ArrayList<UsuariosInfo> listaUsuarios;
    private String nombreLabel;
    private UsuariosInfo usuarioLogueado;
    int index;
   
    public ModificarUsuario(ArrayList<UsuariosInfo> listaUsuariosExterna, UsuariosInfo usuarioLogueado) {
        listaUsuarios = listaUsuariosExterna;
        gestionarUsuarios = new GestionarUsuarios(listaUsuarios);
        this.usuarioLogueado = usuarioLogueado;
        
        initComponents();
        
        gestionarUsuarios.cargarUsuario(tiposUsuariosBox);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tiposUsuariosBox = new javax.swing.JComboBox<>();
        EdadField = new javax.swing.JTextField();
        ContraField = new javax.swing.JTextField();
        UsuarioField = new javax.swing.JTextField();
        NombreCompletoField = new javax.swing.JTextField();
        BotonRegresar = new javax.swing.JLabel();
        BotonModificar = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tiposUsuariosBox.setBackground(new java.awt.Color(253, 228, 240));
        tiposUsuariosBox.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        tiposUsuariosBox.setForeground(new java.awt.Color(0, 0, 0));
        tiposUsuariosBox.setBorder(null);
        tiposUsuariosBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tiposUsuariosBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiposUsuariosBoxActionPerformed(evt);
            }
        });
        jPanel1.add(tiposUsuariosBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 220, 180, 40));

        EdadField.setBackground(new java.awt.Color(253, 228, 240));
        EdadField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        EdadField.setForeground(new java.awt.Color(0, 0, 0));
        EdadField.setBorder(null);
        jPanel1.add(EdadField, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 442, 230, 40));

        ContraField.setBackground(new java.awt.Color(253, 228, 240));
        ContraField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        ContraField.setForeground(new java.awt.Color(0, 0, 0));
        ContraField.setBorder(null);
        jPanel1.add(ContraField, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 443, 230, 40));

        UsuarioField.setBackground(new java.awt.Color(253, 228, 240));
        UsuarioField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        UsuarioField.setForeground(new java.awt.Color(0, 0, 0));
        UsuarioField.setBorder(null);
        jPanel1.add(UsuarioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 340, 230, 40));

        NombreCompletoField.setBackground(new java.awt.Color(253, 228, 240));
        NombreCompletoField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        NombreCompletoField.setForeground(new java.awt.Color(0, 0, 0));
        NombreCompletoField.setBorder(null);
        jPanel1.add(NombreCompletoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 230, 40));

        BotonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 120, 50, 60));

        BotonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonModificarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 220, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/ModificarUsuario.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonModificarMouseClicked
        String tipoUsuario = tiposUsuariosBox.getSelectedItem().toString().toUpperCase();
        String nombreCompleto = NombreCompletoField.getText();
        String usuario = UsuarioField.getText();
        String contra = ContraField.getText();
        int edad = Integer.parseInt(EdadField.getText());
        
        boolean mensaje = gestionarUsuarios.modificarUsuario(nombreCompleto, usuario, contra, edad);
        
        if (mensaje) {
            JOptionPane.showMessageDialog(null, "¡Usuario modificado exitosamente!", "Usuario Modificado", JOptionPane.INFORMATION_MESSAGE);
            NombreCompletoField.setText("");
            UsuarioField.setText("");
            ContraField.setText("");
            EdadField.setText("");
        }
    }//GEN-LAST:event_BotonModificarMouseClicked

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        AdministracionUsuarios administracionUsuarios = new AdministracionUsuarios(listaUsuarios, nombreLabel, usuarioLogueado);
        administracionUsuarios.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void tiposUsuariosBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiposUsuariosBoxActionPerformed
        UsuariosInfo usuarioSeleccionado = (UsuariosInfo) tiposUsuariosBox.getSelectedItem();
        index = listaUsuarios.indexOf(usuarioSeleccionado);
        NombreCompletoField.setText(usuarioSeleccionado.getNombreCompleto());
        UsuarioField.setText(usuarioSeleccionado.getUsuario());
        ContraField.setText(usuarioSeleccionado.getContra());
        EdadField.setText(Integer.toString(usuarioSeleccionado.getEdad()));
    }//GEN-LAST:event_tiposUsuariosBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarUsuario(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonModificar;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JTextField ContraField;
    private javax.swing.JTextField EdadField;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField NombreCompletoField;
    private javax.swing.JTextField UsuarioField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<UsuariosInfo> tiposUsuariosBox;
    // End of variables declaration//GEN-END:variables
}
