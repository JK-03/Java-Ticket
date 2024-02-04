/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Reportes_Interfaz;

import AdministracionUsuario_Interfaz.CalendarioVisual;
import GestorUsuarios.UsuariosInfo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javaticket.Main_JavaTicket;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author jenniferbueso
 */
public class EventosPorFecha extends javax.swing.JFrame {
    private UsuariosInfo usuarioLogueado;
    private boolean fechaInicial = false;
    private String fechaReservada;
    private Date fechaInicialD, fechaFinalD;
    
    public EventosPorFecha(UsuariosInfo usuarioLogueado) {
        this.usuarioLogueado = usuarioLogueado;
        fechaReservada = CalendarioVisual.fechaSeleccionada;
        CalendarioVisual.addObserverFecha(this);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        EventosArea = new javax.swing.JTextArea();
        MontoGeneradoLabel = new javax.swing.JLabel();
        MultaGeneradaLabel = new javax.swing.JLabel();
        TotalLabel = new javax.swing.JLabel();
        ReligiosoLabel = new javax.swing.JLabel();
        MusicalLabel = new javax.swing.JLabel();
        DeportivoLabel = new javax.swing.JLabel();
        BotonRegresar = new javax.swing.JLabel();
        BotonCalendario1 = new javax.swing.JLabel();
        BotonCalendario = new javax.swing.JLabel();
        FechaFinalField = new javax.swing.JTextField();
        FechaInicialField = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBorder(null);

        EventosArea.setEditable(false);
        EventosArea.setBackground(new java.awt.Color(253, 228, 240));
        EventosArea.setColumns(20);
        EventosArea.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        EventosArea.setForeground(new java.awt.Color(0, 0, 0));
        EventosArea.setRows(5);
        jScrollPane1.setViewportView(EventosArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 345, 360, 270));

        MontoGeneradoLabel.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        MontoGeneradoLabel.setForeground(new java.awt.Color(0, 0, 0));
        MontoGeneradoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MontoGeneradoLabel.setText("Lps. 0.00");
        jPanel1.add(MontoGeneradoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 703, 220, 30));

        MultaGeneradaLabel.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        MultaGeneradaLabel.setForeground(new java.awt.Color(0, 0, 0));
        MultaGeneradaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MultaGeneradaLabel.setText("Lps. 0.00");
        jPanel1.add(MultaGeneradaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 703, 220, 30));

        TotalLabel.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        TotalLabel.setForeground(new java.awt.Color(0, 0, 0));
        TotalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TotalLabel.setText("Lps. 0.00");
        jPanel1.add(TotalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 703, 220, 30));

        ReligiosoLabel.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        ReligiosoLabel.setForeground(new java.awt.Color(0, 0, 0));
        ReligiosoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ReligiosoLabel.setText("0");
        jPanel1.add(ReligiosoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 559, 140, 40));

        MusicalLabel.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        MusicalLabel.setForeground(new java.awt.Color(0, 0, 0));
        MusicalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MusicalLabel.setText("0");
        jPanel1.add(MusicalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 460, 140, 40));

        DeportivoLabel.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        DeportivoLabel.setForeground(new java.awt.Color(0, 0, 0));
        DeportivoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DeportivoLabel.setText("0");
        jPanel1.add(DeportivoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(714, 361, 140, 40));

        BotonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 50, 60));

        BotonCalendario1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCalendario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCalendario1MouseClicked(evt);
            }
        });
        jPanel1.add(BotonCalendario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, 60, 50));

        BotonCalendario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCalendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCalendarioMouseClicked(evt);
            }
        });
        jPanel1.add(BotonCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 50, 50));

        FechaFinalField.setEditable(false);
        FechaFinalField.setBackground(new java.awt.Color(253, 228, 240));
        FechaFinalField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        FechaFinalField.setForeground(new java.awt.Color(0, 0, 0));
        FechaFinalField.setBorder(null);
        FechaFinalField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FechaFinalField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FechaFinalFieldMouseClicked(evt);
            }
        });
        FechaFinalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaFinalFieldActionPerformed(evt);
            }
        });
        FechaFinalField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FechaFinalFieldKeyTyped(evt);
            }
        });
        jPanel1.add(FechaFinalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 209, 220, 40));

        FechaInicialField.setEditable(false);
        FechaInicialField.setBackground(new java.awt.Color(253, 228, 240));
        FechaInicialField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        FechaInicialField.setForeground(new java.awt.Color(0, 0, 0));
        FechaInicialField.setBorder(null);
        FechaInicialField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FechaInicialField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FechaInicialFieldMouseClicked(evt);
            }
        });
        FechaInicialField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaInicialFieldActionPerformed(evt);
            }
        });
        FechaInicialField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FechaInicialFieldKeyTyped(evt);
            }
        });
        jPanel1.add(FechaInicialField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 208, 220, 40));

        BotonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBuscarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 274, 130, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/EventosPorFecha.png"))); // NOI18N
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

    public void updateFechaReservada(String fecha) {
        fechaReservada = fecha;
        Main_JavaTicket.gestionarEventos.setEventoFecha(false);
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy", new Locale("es", "ES"));
        try {
            if (fechaInicial) {
               this.fechaInicialD = formatoFecha.parse(fechaReservada); 
               FechaInicialField.setText(fechaReservada);
            } else {
               this.fechaFinalD = formatoFecha.parse(fechaReservada); 
               FechaFinalField.setText(fechaReservada);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    
    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        Reportes reportes = new Reportes(usuarioLogueado);
        reportes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void BotonCalendarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCalendarioMouseClicked
        Main_JavaTicket.gestionarEventos.setEventoFecha(true);
        fechaInicial = true;
        CalendarioVisual calendarioVisual = new CalendarioVisual();
        calendarioVisual.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_BotonCalendarioMouseClicked

    private void BotonCalendario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCalendario1MouseClicked
        Main_JavaTicket.gestionarEventos.setEventoFecha(true);
        fechaInicial = false;
        CalendarioVisual calendarioVisual = new CalendarioVisual();
        calendarioVisual.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_BotonCalendario1MouseClicked

    private void FechaFinalFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaFinalFieldMouseClicked
        JOptionPane.showMessageDialog(null, "Si deseas seleccionar una fecha, por favor haz clic en el ícono del calendario.", "Información de Reserva", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_FechaFinalFieldMouseClicked

    private void FechaFinalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaFinalFieldActionPerformed

    }//GEN-LAST:event_FechaFinalFieldActionPerformed

    private void FechaFinalFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaFinalFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaFinalFieldKeyTyped

    private void FechaInicialFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaInicialFieldMouseClicked
        JOptionPane.showMessageDialog(null, "Si deseas seleccionar una fecha, por favor haz clic en el ícono del calendario.", "Información de Reserva", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_FechaInicialFieldMouseClicked

    private void FechaInicialFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaInicialFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaInicialFieldActionPerformed

    private void FechaInicialFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaInicialFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaInicialFieldKeyTyped

    private void BotonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMouseClicked
        if (fechaInicialD == null) {
            JOptionPane.showMessageDialog(null, "Completa el campo de Fecha Inicial.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
        } else if (fechaFinalD == null) {
            JOptionPane.showMessageDialog(null, "Completa el campo de Fecha Final.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
        } else {
            String mostrar = Main_JavaTicket.contadoresReportes.filtrarEventosPorFechas(fechaInicialD, fechaFinalD);
            if (mostrar != null) {
                EventosArea.setText(mostrar);
                DeportivoLabel.setText(String.valueOf(Main_JavaTicket.contadoresReportes.contarEventosDeportivosFecha(fechaInicialD, fechaFinalD)));
                MusicalLabel.setText(String.valueOf(Main_JavaTicket.contadoresReportes.contarEventosMusicalesFecha(fechaInicialD, fechaFinalD)));
                ReligiosoLabel.setText(String.valueOf(Main_JavaTicket.contadoresReportes.contarEventosReligiososFecha(fechaInicialD, fechaFinalD)));
                MontoGeneradoLabel.setText("Lps. " + Double.toString( Main_JavaTicket.contadoresReportes.montoGeneradoFecha(fechaInicialD, fechaFinalD)));
                MultaGeneradaLabel.setText("Lps. " + Double.toString( Main_JavaTicket.contadoresReportes.multaGeneradoFecha(fechaInicialD, fechaFinalD)));
                TotalLabel.setText("Lps. " + Double.toString( Main_JavaTicket.contadoresReportes.totalFecha(fechaInicialD, fechaFinalD)));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron eventos en el rango de fechas seleccionado. Por favor, intenta con un rango de fechas diferente.", "Sin Eventos", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_BotonBuscarMouseClicked

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
            java.util.logging.Logger.getLogger(EventosPorFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventosPorFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventosPorFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventosPorFecha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EventosPorFecha(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonBuscar;
    private javax.swing.JLabel BotonCalendario;
    private javax.swing.JLabel BotonCalendario1;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JLabel DeportivoLabel;
    private javax.swing.JTextArea EventosArea;
    private javax.swing.JTextField FechaFinalField;
    private javax.swing.JTextField FechaInicialField;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel MontoGeneradoLabel;
    private javax.swing.JLabel MultaGeneradaLabel;
    private javax.swing.JLabel MusicalLabel;
    private javax.swing.JLabel ReligiosoLabel;
    private javax.swing.JLabel TotalLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
