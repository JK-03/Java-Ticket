/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AdministracionUsuario_Interfaz;

import GestorEventos.EventosInfo;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import AdministracionEventos_Interfaz.CrearEvento;
import AdministracionEventos_Interfaz.EditarEvento;
import Reportes_Interfaz.EventosPorFecha;
import javaticket.Main_JavaTicket;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

/**
 *
 * @author jenniferbueso
 */
public class CalendarioVisual extends javax.swing.JFrame {
    public static String fechaSeleccionada;
    private static CalendarioVisual instance;
    private static List<CrearEvento> observers = new ArrayList<>();
    private static List<EditarEvento> observersE = new ArrayList<>();
    private static List<EventosPorFecha> observersPorFecha = new ArrayList<>();
    
    public CalendarioVisual() {
        initComponents();
        instance = this;
        
        Calendar now = Calendar.getInstance();
        SpinnerNumberModel yearModel = new SpinnerNumberModel(now.get(Calendar.YEAR), now.get(Calendar.YEAR), 2100, 1);
        AñosSpinner.setModel(yearModel);
                
        CalendarioPanel.setLayout(new GridLayout(0 ,7));
        String[] days = {"Dom", "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb"};
        for (String day : days) {
            CalendarioPanel.add(new JLabel(day, SwingConstants.CENTER));
        }
        
        int currentMonth = now.get(Calendar.MONTH);
        MesesBox.setSelectedIndex(currentMonth);
        
        updateCalendar(CalendarioPanel, MesesBox, AñosSpinner);
        
        MesesBox.addActionListener(e -> updateCalendar(CalendarioPanel, MesesBox, AñosSpinner));
        AñosSpinner.addChangeListener(e -> updateCalendar(CalendarioPanel, MesesBox, AñosSpinner));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FondoPanel = new javax.swing.JPanel();
        BotonRegresar = new javax.swing.JLabel();
        MesesBox = new javax.swing.JComboBox<>();
        AñosSpinner = new javax.swing.JSpinner();
        CalendarioPanel = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);

        FondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
            }
        });
        FondoPanel.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 40, 40));

        MesesBox.setBackground(new java.awt.Color(253, 228, 240));
        MesesBox.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        MesesBox.setForeground(new java.awt.Color(0, 0, 0));
        MesesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        MesesBox.setBorder(null);
        FondoPanel.add(MesesBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 169, 130, 30));

        AñosSpinner.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        FondoPanel.add(AñosSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 110, 30));

        CalendarioPanel.setBackground(new java.awt.Color(255, 255, 255));
        CalendarioPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 217, 235), 2, true));

        javax.swing.GroupLayout CalendarioPanelLayout = new javax.swing.GroupLayout(CalendarioPanel);
        CalendarioPanel.setLayout(CalendarioPanelLayout);
        CalendarioPanelLayout.setHorizontalGroup(
            CalendarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );
        CalendarioPanelLayout.setVerticalGroup(
            CalendarioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );

        FondoPanel.add(CalendarioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 610, 240));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/CalendarioVisual.png"))); // NOI18N
        FondoPanel.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void addObserverFecha(EventosPorFecha observer) {
        observersPorFecha.add(observer);
    }

    public static void removeObserverFecha(EventosPorFecha observer) {
        observersPorFecha.remove(observer);
    }
    
    public static void addObserver(CrearEvento observer) {
        observers.add(observer);
    }

    public static void removeObserver(CrearEvento observer) {
        observers.remove(observer);
    }

    public static void addObserverE(EditarEvento observer) {
        observersE.add(observer);
    }

    public static void removeObserverE(EditarEvento observer) {
        observersE.remove(observer);
    }
    
    public static void notifyObservers() {
        for (CrearEvento observer : observers) {
            observer.updateFechaReservada(fechaSeleccionada);
        }
    }
    
    public static void notifyObserversE() {
        for (EditarEvento observer : observersE) {
            observer.updateFechaReservada(fechaSeleccionada);
        }
    }
    
    public static void notifyObserversPorFecha() {
        for (EventosPorFecha observer : observersPorFecha) {
            observer.updateFechaReservada(fechaSeleccionada);
        }
    }
    
    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarMouseClicked

    public static void updateCalendar(JPanel calendarPanel, JComboBox<String> monthComboBox, JSpinner yearSpinner) {
        calendarPanel.removeAll();
        for (String day : new String[]{"Dom", "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb"}) {
            calendarPanel.add(new JLabel(day, SwingConstants.CENTER));
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, monthComboBox.getSelectedIndex());
        calendar.set(Calendar.YEAR, (Integer) yearSpinner.getValue());

        Calendar today = Calendar.getInstance();
        int currentDay = today.get(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, currentDay);

        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        for (int i = 1; i < firstDayOfWeek; i++) {
            calendarPanel.add(new JLabel(""));
        }
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        for (int indice = 1; indice <= maxDay; indice++) {
            JButton dayButton = new JButton(String.valueOf(indice));
            dayButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dayButton.getText()));
                    Date date = calendar.getTime();

                    // Formato para mostrar en JOptionPane
                    SimpleDateFormat formatToShow = new SimpleDateFormat("dd/MM/yyyy");
                    String dateStringToShow = formatToShow.format(date);

                    Object[] opciones = {"Reservar", "Cancelar"};
                    JFrame jf = new JFrame();
                    jf.setAlwaysOnTop(true);
                    int escogida = JOptionPane.showOptionDialog(jf, "¿Desea seleccionar la fecha " + dateStringToShow + " ?", "Reservar Fecha", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[1]);

                    if (escogida == 0) {
                       fechaSeleccionada = String.valueOf(dateStringToShow);
                       notifyObservers();
                       notifyObserversE();
                       notifyObserversPorFecha();
                       instance.dispose();
                    }

                }
            });
            calendar.set(Calendar.DAY_OF_MONTH, indice);
            if (calendar.before(today) && calendar.get(Calendar.DAY_OF_MONTH) != currentDay && !Main_JavaTicket.gestionarEventos.isEventoFecha()) {
                dayButton.setEnabled(false);
            } else if (Main_JavaTicket.gestionarEventos.isEventoFecha()) {
                dayButton.setEnabled(true);
            }
            calendarPanel.add(dayButton);
        }
        calendarPanel.revalidate();
        calendarPanel.repaint();
    }

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
            java.util.logging.Logger.getLogger(CalendarioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalendarioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalendarioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalendarioVisual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalendarioVisual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner AñosSpinner;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JPanel CalendarioPanel;
    private javax.swing.JLabel Fondo;
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JComboBox<String> MesesBox;
    // End of variables declaration//GEN-END:variables
}