/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaticket;

import GestorUsuarios.GestionarUsuarios;
import GestorUsuarios.UsuariosInfo;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jenniferbueso
 */
public class LogIn extends javax.swing.JFrame {
    private GestionarUsuarios gestionarUsuarios;
    ArrayList<UsuariosInfo> listaUsuarios;
    private String nombreLabel;
    
    public LogIn(ArrayList<UsuariosInfo> listaUsuariosExterna) {
        listaUsuarios = listaUsuariosExterna;
        gestionarUsuarios = new GestionarUsuarios(listaUsuarios);
        
        initComponents();
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
        BotonIngresar = new javax.swing.JLabel();
        UsuarioField = new javax.swing.JTextField();
        ContraField = new javax.swing.JPasswordField();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonIngresarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, 280, 50));

        UsuarioField.setBackground(new java.awt.Color(255, 204, 231));
        UsuarioField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        UsuarioField.setForeground(new java.awt.Color(0, 0, 0));
        UsuarioField.setBorder(null);
        jPanel1.add(UsuarioField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 270, 40));

        ContraField.setBackground(new java.awt.Color(255, 204, 231));
        ContraField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 13)); // NOI18N
        ContraField.setForeground(new java.awt.Color(0, 0, 0));
        ContraField.setBorder(null);
        jPanel1.add(ContraField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 270, 40));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/LogIn.png"))); // NOI18N
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 590));

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

    private void BotonIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIngresarMouseClicked
        int indiceUsuario = -1;
        String nombreUsuario = UsuarioField.getText();
        String contra = ContraField.getText();
        nombreLabel = nombreUsuario;
        
        int resultado = gestionarUsuarios.logIn(nombreUsuario, contra);
        
        switch (resultado) {
        case 0:
            JOptionPane.showMessageDialog(null, "¡Bienvenido(a) a Java Ticket, " + nombreUsuario + "!", "Inicio de Sesión Exitoso", JOptionPane.INFORMATION_MESSAGE);
            MenuPrincipal menuPrincipal = new MenuPrincipal(listaUsuarios, nombreLabel);
            menuPrincipal.setVisible(true);
            this.setVisible(false);
            break;
        case 1:
            JOptionPane.showMessageDialog(null, "El usuario ingresado no existe. Por favor, inténtelo nuevamente.", "Usuario Inexistente", JOptionPane.ERROR_MESSAGE);
            break;
        case 2:
            JOptionPane.showMessageDialog(null, "La contraseña ingresada es incorrecta. Por favor, inténtelo nuevamente.", "Contraseña Incorrecta", JOptionPane.ERROR_MESSAGE);
            break;
        }
    }//GEN-LAST:event_BotonIngresarMouseClicked
   
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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonIngresar;
    private javax.swing.JPasswordField ContraField;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField UsuarioField;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
