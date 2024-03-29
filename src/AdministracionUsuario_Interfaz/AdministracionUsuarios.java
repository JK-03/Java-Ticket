/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdministracionUsuario_Interfaz;

import GestorUsuarios.UsuariosInfo;
import java.util.ArrayList;
import javaticket.MenuPrincipal;

/**
 *
 * @author jenniferbueso
 */
public class AdministracionUsuarios extends javax.swing.JFrame {
    private UsuariosInfo usuarioLogueado;
    
    public AdministracionUsuarios(UsuariosInfo usuarioLogueado) {
        this.usuarioLogueado = usuarioLogueado;
        
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
        BotonBorrar = new javax.swing.JLabel();
        BotonEditar = new javax.swing.JLabel();
        BotonCrear = new javax.swing.JLabel();
        BotonRegresar = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonBorrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBorrarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, 250, 210));

        BotonEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEditarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 260, 210));

        BotonCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCrearMouseClicked(evt);
            }
        });
        jPanel1.add(BotonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 260, 210));

        BotonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 150, 60, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/administracionUsuarios.png"))); // NOI18N
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

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        MenuPrincipal menuPrincipal = new MenuPrincipal(usuarioLogueado);
        menuPrincipal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void BotonCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearMouseClicked
        CrearUsuario crearUsuario = new CrearUsuario(usuarioLogueado);
        crearUsuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonCrearMouseClicked

    private void BotonEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarMouseClicked
        ModificarUsuario modificarUsuario = new ModificarUsuario(usuarioLogueado);
        modificarUsuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonEditarMouseClicked

    private void BotonBorrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBorrarMouseClicked
        BorrarUsuario borrarUsuario = new BorrarUsuario(usuarioLogueado);
        borrarUsuario.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonBorrarMouseClicked

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
            java.util.logging.Logger.getLogger(AdministracionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministracionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministracionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministracionUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministracionUsuarios(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonBorrar;
    private javax.swing.JLabel BotonCrear;
    private javax.swing.JLabel BotonEditar;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
