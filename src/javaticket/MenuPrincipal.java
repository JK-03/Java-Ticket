/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaticket;

import GestorUsuarios.GestionarUsuarios;
import GestorUsuarios.UsuariosInfo;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author jenniferbueso
 */
public class MenuPrincipal extends javax.swing.JFrame {
    ArrayList<UsuariosInfo> listaUsuarios;
    private String nombreLabel;
    private GestionarUsuarios gestionarUsuarios;
    private UsuariosInfo usuarioLogueado;
    private Calendar hora = Calendar.getInstance();
    
    public MenuPrincipal(ArrayList<UsuariosInfo> listaUsuariosExterna, String nombreLabel, UsuariosInfo usuarioLogueado) {
        listaUsuarios = listaUsuariosExterna;
        this.nombreLabel = nombreLabel;
        gestionarUsuarios = new GestionarUsuarios(listaUsuarios);
        this.usuarioLogueado = usuarioLogueado;
        initComponents();
        
        UsuarioLabel.setText(usuarioLogueado.toString());
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
        BotonSalir = new javax.swing.JLabel();
        BotonRegresar = new javax.swing.JLabel();
        BotonUsuarios = new javax.swing.JLabel();
        BotonReportes = new javax.swing.JLabel();
        BotonEventos = new javax.swing.JLabel();
        UsuarioLabel = new javax.swing.JLabel();
        HoraLabel = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSalirMouseClicked(evt);
            }
        });
        jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 210, 40));

        BotonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 153, 60, 50));

        BotonUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonUsuariosMouseClicked(evt);
            }
        });
        jPanel1.add(BotonUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 230, 200));

        BotonReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonReportesMouseClicked(evt);
            }
        });
        jPanel1.add(BotonReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 220, 210));

        BotonEventos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEventos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEventosMouseClicked(evt);
            }
        });
        jPanel1.add(BotonEventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 220, 210));

        UsuarioLabel.setFont(new java.awt.Font("Avenir Next Condensed", 1, 36)); // NOI18N
        UsuarioLabel.setForeground(new java.awt.Color(0, 0, 0));
        UsuarioLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuarioLabel.setText("Usuario");
        jPanel1.add(UsuarioLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 350, 60));

        HoraLabel.setFont(new java.awt.Font("Avenir Next Condensed", 1, 36)); // NOI18N
        HoraLabel.setForeground(new java.awt.Color(239, 169, 187));
        jPanel1.add(HoraLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 507, 220, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/MenuPrincipal.png"))); // NOI18N
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

    private void BotonEventosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEventosMouseClicked
        AdministracionEventos administracionEventos = new AdministracionEventos(listaUsuarios, nombreLabel, usuarioLogueado);
        administracionEventos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonEventosMouseClicked

    private void BotonReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonReportesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonReportesMouseClicked

    private void BotonUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonUsuariosMouseClicked
        String clase = usuarioLogueado.getClass().getName();
    
        if (clase.equals("GestorUsuarios.Administrador")) {
            AdministracionUsuarios administracionUsuarios = new AdministracionUsuarios(listaUsuarios, nombreLabel, usuarioLogueado);
            administracionUsuarios.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Lo siento, esta opción solo está disponible para usuarios con privilegios de administrador. Por favor, contacta a un administrador si necesitas acceder a esta función.", "Acceso Denegado", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BotonUsuariosMouseClicked

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        LogIn logIn = new LogIn(listaUsuarios, usuarioLogueado);
        logIn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void BotonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSalirMouseClicked
        int opcionSalir = JOptionPane.showConfirmDialog(null, "¿Desea salir del programa?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (opcionSalir == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_BotonSalirMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal(null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonEventos;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JLabel BotonReportes;
    private javax.swing.JLabel BotonSalir;
    private javax.swing.JLabel BotonUsuarios;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel HoraLabel;
    private javax.swing.JLabel UsuarioLabel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
