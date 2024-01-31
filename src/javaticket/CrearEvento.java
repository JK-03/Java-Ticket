/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaticket;

import GestorEventos.DeportesTipo;
import GestorEventos.EventoDeportivo;
import GestorEventos.EventoMusical;
import GestorEventos.EventosInfo;
import GestorEventos.MusicalTipo;
import GestorUsuarios.UsuariosInfo;
import GestorEventos.GestionarEventos;
import GestorUsuarios.Administrador;
import GestorUsuarios.Contenidos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author jenniferbueso
 */
public class CrearEvento extends javax.swing.JFrame {
    private GestionarEventos gestionarEventos;
    private ArrayList<EventosInfo> listaEventos;
    private ArrayList<UsuariosInfo> listaUsuarios;
    private String nombreLabel, fechaReservada;
    private UsuariosInfo usuarioLogueado;
    
    public CrearEvento(ArrayList<UsuariosInfo> listaUsuariosExterna, String nombreLabel, UsuariosInfo usuarioLogueado) {
        listaUsuarios = listaUsuariosExterna;
        this.nombreLabel = nombreLabel;
        this.usuarioLogueado = usuarioLogueado;
        gestionarEventos = new GestionarEventos(listaEventos);
        fechaReservada = CalendarioVisual.fechaSeleccionada;
        CalendarioVisual.addObserver(this);
        
        initComponents();
        
        InicioPanel.setVisible(true);
        DeportePanel.setVisible(false);
        MusicalPanel.setVisible(false);
        ReligiosoPanel.setVisible(false);
        
        String codigoUnico = gestionarEventos.generarCodigoUnico();
        CódigoField.setText(codigoUnico);
        FechaField.setText(fechaReservada);
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
        TipoEventoBox = new javax.swing.JComboBox<>();
        FechaField = new javax.swing.JTextField();
        RentaField = new javax.swing.JTextField();
        RentaField1 = new javax.swing.JTextField();
        TituloField = new javax.swing.JTextField();
        CódigoField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        DescripcionField = new javax.swing.JTextArea();
        MusicalPanel = new javax.swing.JPanel();
        TipoMusicalBox = new javax.swing.JComboBox<>(MusicalTipo.values());
        SeguroFieldM = new javax.swing.JTextField();
        AforoFieldM = new javax.swing.JTextField();
        FondoMusical = new javax.swing.JLabel();
        ReligiosoPanel = new javax.swing.JPanel();
        SeguroFieldR = new javax.swing.JTextField();
        AforoFieldR = new javax.swing.JTextField();
        FondoReligioso = new javax.swing.JLabel();
        DeportePanel = new javax.swing.JPanel();
        TipoDeporteBox = new javax.swing.JComboBox<>(DeportesTipo.values());
        AforoFieldD = new javax.swing.JTextField();
        EquipoDosField = new javax.swing.JTextField();
        EquipoUnoField = new javax.swing.JTextField();
        FondoDeportivo = new javax.swing.JLabel();
        InicioPanel = new javax.swing.JPanel();
        FondoInicio = new javax.swing.JLabel();
        BotonRegresar = new javax.swing.JLabel();
        BotonCrear = new javax.swing.JLabel();
        BotonCalendario = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TipoEventoBox.setBackground(new java.awt.Color(253, 228, 240));
        TipoEventoBox.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        TipoEventoBox.setForeground(new java.awt.Color(0, 0, 0));
        TipoEventoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Deportivo", "Musical", "Religioso" }));
        TipoEventoBox.setBorder(null);
        TipoEventoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoEventoBoxActionPerformed(evt);
            }
        });
        jPanel1.add(TipoEventoBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 193, 180, 40));

        FechaField.setEditable(false);
        FechaField.setBackground(new java.awt.Color(253, 228, 240));
        FechaField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        FechaField.setForeground(new java.awt.Color(0, 0, 0));
        FechaField.setBorder(null);
        FechaField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        FechaField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FechaFieldMouseClicked(evt);
            }
        });
        FechaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaFieldActionPerformed(evt);
            }
        });
        FechaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FechaFieldKeyTyped(evt);
            }
        });
        jPanel1.add(FechaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 483, 300, 40));

        RentaField.setBackground(new java.awt.Color(253, 228, 240));
        RentaField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        RentaField.setForeground(new java.awt.Color(0, 0, 0));
        RentaField.setBorder(null);
        RentaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentaFieldActionPerformed(evt);
            }
        });
        RentaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RentaFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RentaFieldKeyTyped(evt);
            }
        });
        jPanel1.add(RentaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 481, 220, 40));

        RentaField1.setEditable(false);
        RentaField1.setBackground(new java.awt.Color(253, 228, 240));
        RentaField1.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        RentaField1.setForeground(new java.awt.Color(0, 0, 0));
        RentaField1.setText("Lps.");
        RentaField1.setBorder(null);
        RentaField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RentaField1ActionPerformed(evt);
            }
        });
        RentaField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RentaField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RentaField1KeyTyped(evt);
            }
        });
        jPanel1.add(RentaField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 481, 30, 40));

        TituloField.setBackground(new java.awt.Color(253, 228, 240));
        TituloField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        TituloField.setForeground(new java.awt.Color(0, 0, 0));
        TituloField.setBorder(null);
        jPanel1.add(TituloField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 387, 260, 40));

        CódigoField.setEditable(false);
        CódigoField.setBackground(new java.awt.Color(253, 228, 240));
        CódigoField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        CódigoField.setForeground(new java.awt.Color(0, 0, 0));
        CódigoField.setBorder(null);
        jPanel1.add(CódigoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 298, 260, 40));

        jScrollPane1.setBorder(null);

        DescripcionField.setBackground(new java.awt.Color(253, 228, 240));
        DescripcionField.setColumns(20);
        DescripcionField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        DescripcionField.setForeground(new java.awt.Color(0, 0, 0));
        DescripcionField.setLineWrap(true);
        DescripcionField.setRows(5);
        jScrollPane1.setViewportView(DescripcionField);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 313, 370, 110));

        MusicalPanel.setBackground(new java.awt.Color(255, 255, 255));
        MusicalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TipoMusicalBox.setBackground(new java.awt.Color(253, 228, 240));
        TipoMusicalBox.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        TipoMusicalBox.setForeground(new java.awt.Color(0, 0, 0));
        TipoMusicalBox.setBorder(null);
        MusicalPanel.add(TipoMusicalBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 26, 170, 40));

        SeguroFieldM.setEditable(false);
        SeguroFieldM.setBackground(new java.awt.Color(253, 228, 240));
        SeguroFieldM.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        SeguroFieldM.setForeground(new java.awt.Color(0, 0, 0));
        SeguroFieldM.setBorder(null);
        SeguroFieldM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeguroFieldMActionPerformed(evt);
            }
        });
        SeguroFieldM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SeguroFieldMKeyTyped(evt);
            }
        });
        MusicalPanel.add(SeguroFieldM, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 105, 270, 40));

        AforoFieldM.setBackground(new java.awt.Color(253, 228, 240));
        AforoFieldM.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        AforoFieldM.setForeground(new java.awt.Color(0, 0, 0));
        AforoFieldM.setBorder(null);
        AforoFieldM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AforoFieldMKeyTyped(evt);
            }
        });
        MusicalPanel.add(AforoFieldM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 26, 270, 40));

        FondoMusical.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/InterfazMusical.png"))); // NOI18N
        MusicalPanel.add(FondoMusical, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(MusicalPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 540, 870, 170));

        ReligiosoPanel.setBackground(new java.awt.Color(255, 255, 255));
        ReligiosoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SeguroFieldR.setEditable(false);
        SeguroFieldR.setBackground(new java.awt.Color(253, 228, 240));
        SeguroFieldR.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        SeguroFieldR.setForeground(new java.awt.Color(0, 0, 0));
        SeguroFieldR.setBorder(null);
        SeguroFieldR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SeguroFieldRKeyTyped(evt);
            }
        });
        ReligiosoPanel.add(SeguroFieldR, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 65, 270, 40));

        AforoFieldR.setBackground(new java.awt.Color(253, 228, 240));
        AforoFieldR.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        AforoFieldR.setForeground(new java.awt.Color(0, 0, 0));
        AforoFieldR.setBorder(null);
        AforoFieldR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AforoFieldRKeyTyped(evt);
            }
        });
        ReligiosoPanel.add(AforoFieldR, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 65, 270, 40));

        FondoReligioso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/InterfazReligioso.png"))); // NOI18N
        ReligiosoPanel.add(FondoReligioso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(ReligiosoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 540, 870, 170));

        DeportePanel.setBackground(new java.awt.Color(255, 255, 255));
        DeportePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TipoDeporteBox.setBackground(new java.awt.Color(253, 228, 240));
        TipoDeporteBox.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        TipoDeporteBox.setForeground(new java.awt.Color(0, 0, 0));
        TipoDeporteBox.setBorder(null);
        DeportePanel.add(TipoDeporteBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 109, 170, 40));

        AforoFieldD.setBackground(new java.awt.Color(253, 228, 240));
        AforoFieldD.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        AforoFieldD.setForeground(new java.awt.Color(0, 0, 0));
        AforoFieldD.setBorder(null);
        AforoFieldD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AforoFieldDKeyTyped(evt);
            }
        });
        DeportePanel.add(AforoFieldD, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 22, 260, 40));

        EquipoDosField.setBackground(new java.awt.Color(253, 228, 240));
        EquipoDosField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        EquipoDosField.setForeground(new java.awt.Color(0, 0, 0));
        EquipoDosField.setBorder(null);
        DeportePanel.add(EquipoDosField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 109, 260, 40));

        EquipoUnoField.setBackground(new java.awt.Color(253, 228, 240));
        EquipoUnoField.setFont(new java.awt.Font("Avenir Next Condensed", 1, 18)); // NOI18N
        EquipoUnoField.setForeground(new java.awt.Color(0, 0, 0));
        EquipoUnoField.setBorder(null);
        DeportePanel.add(EquipoUnoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 22, 260, 40));

        FondoDeportivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/InterfazDeporte.png"))); // NOI18N
        DeportePanel.add(FondoDeportivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(DeportePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 540, 870, 170));

        InicioPanel.setBackground(new java.awt.Color(255, 255, 255));
        InicioPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/InterfazInicio.png"))); // NOI18N
        InicioPanel.add(FondoInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.add(InicioPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 540, 870, 170));

        BotonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarMouseClicked(evt);
            }
        });
        jPanel1.add(BotonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 120, 60, 50));

        BotonCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCrearMouseClicked(evt);
            }
        });
        jPanel1.add(BotonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 720, 210, 40));

        BotonCalendario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCalendario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCalendarioMouseClicked(evt);
            }
        });
        jPanel1.add(BotonCalendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 480, 60, 50));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Elementos/CrearEvento.png"))); // NOI18N
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

    private void TipoEventoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoEventoBoxActionPerformed
        int tipoEvento = TipoEventoBox.getSelectedIndex();
        
        if (tipoEvento == 0) {
            InicioPanel.setVisible(true);
            DeportePanel.setVisible(false);
            MusicalPanel.setVisible(false);
            ReligiosoPanel.setVisible(false);
        } else if (tipoEvento == 1) {
            InicioPanel.setVisible(false);
            DeportePanel.setVisible(true);
            MusicalPanel.setVisible(false);
            ReligiosoPanel.setVisible(false);
        } else if (tipoEvento == 2) {
            InicioPanel.setVisible(false);
            DeportePanel.setVisible(false);
            MusicalPanel.setVisible(true);
            ReligiosoPanel.setVisible(false);
        } else if (tipoEvento == 3) {
            InicioPanel.setVisible(false);
            DeportePanel.setVisible(false);
            MusicalPanel.setVisible(false);
            ReligiosoPanel.setVisible(true);
        }
    }//GEN-LAST:event_TipoEventoBoxActionPerformed

    private void AforoFieldDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AforoFieldDKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;

        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_AforoFieldDKeyTyped

    private void RentaFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RentaFieldKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;

        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_RentaFieldKeyTyped

    public void updateFechaReservada(String fecha) {
        fechaReservada = fecha;
        FechaField.setText(fechaReservada);
    }
    
    private void AforoFieldMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AforoFieldMKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_AforoFieldMKeyTyped

    private void SeguroFieldMKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SeguroFieldMKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_SeguroFieldMKeyTyped

    private void SeguroFieldRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SeguroFieldRKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_SeguroFieldRKeyTyped

    private void AforoFieldRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AforoFieldRKeyTyped
        int tecla = evt.getKeyChar();
        boolean valido = tecla >= 48 && tecla <= 57;

        if(!valido){
            evt.consume();
        }
    }//GEN-LAST:event_AforoFieldRKeyTyped

    private void BotonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarMouseClicked
        AdministracionEventos administracionEventos = new AdministracionEventos(listaUsuarios, nombreLabel, usuarioLogueado);
        administracionEventos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BotonRegresarMouseClicked

    private void BotonCrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearMouseClicked
        String tipoEvento = TipoEventoBox.getSelectedItem().toString();
        String codigo = CódigoField.getText();
        String titulo = TituloField.getText();
        String descripcion = DescripcionField.getText();
        String rentaS = RentaField.getText();
        String fechaS = FechaField.getText();
        
        if (tipoEvento.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Elije un Tipo de Evento.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (titulo.isEmpty() || titulo.isBlank()) {
            JOptionPane.showMessageDialog(null, "Completa el campo de Título.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (descripcion.isEmpty() || descripcion.isBlank()) {
            JOptionPane.showMessageDialog(null, "Completa el campo de Descripción.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (fechaS.isEmpty() || fechaS.isBlank()) {
            JOptionPane.showMessageDialog(null, "Completa el campo de Fecha.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (rentaS.isEmpty() || rentaS.isBlank()) {
            JOptionPane.showMessageDialog(null, "Completa el campo de Renta.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        double renta = Integer.parseInt(rentaS);
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("es", "ES"));
        Date fecha = null;
        try {
            fecha = formatoFecha.parse(fechaS);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        switch (tipoEvento) {
            case "Deportivo":
                //Panel Musical
                AforoFieldM = null;
                SeguroFieldM = null;
                
                //Panel Religioso
                AforoFieldR = null;
                SeguroFieldR = null;
                
                String equipoUno = EquipoUnoField.getText();
                String equipoDos = EquipoDosField.getText();
                String aforoS = AforoFieldD.getText();
                DeportesTipo tipoDeporte = (DeportesTipo) TipoDeporteBox.getSelectedItem();
                
                if (equipoUno.isEmpty() || equipoUno.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Completa el campo de Equipo 1.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (equipoDos.isEmpty() || equipoDos.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Completa el campo de Equipo 2.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (aforoS.isEmpty() || aforoS.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Completa el campo de Aforo.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                int aforoD = Integer.parseInt(AforoFieldD.getText());
               
                EventoDeportivo eventoD = new EventoDeportivo(codigo, titulo, descripcion, fecha, renta, aforoD, equipoUno, equipoDos, tipoDeporte);

                if (eventoD.setAforo(aforoD)) {
                    PantallaInicio.gestionarEventos.agregarEvento(eventoD);
                    agregarIdAlUsuario(codigo);
                    
                    AdministracionEventos administracionEventos = new AdministracionEventos(listaUsuarios, nombreLabel, usuarioLogueado);
                    administracionEventos.setVisible(true);
                    this.setVisible(false);
                }
                break;
                
            case "Musical":
                //Panel Religioso
                AforoFieldR = null;
                SeguroFieldR = null;
                
                //Panel Deportivo
                AforoFieldD = null;
                EquipoUnoField = null;
                EquipoDosField = null;
                
                String aforoMS = AforoFieldM.getText();
                MusicalTipo tipoMusical = (MusicalTipo) TipoMusicalBox.getSelectedItem();
                
                if (aforoMS.isEmpty() || aforoMS.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Completa el campo de Aforo.", "Campo Incompleto", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                int aforoM = Integer.parseInt(AforoFieldM.getText());
                
                EventoMusical eventoM = new EventoMusical(codigo, titulo, descripcion, fecha, renta, aforoM, tipoMusical);
                
                if (eventoM.setAforo(aforoM)) {
                    PantallaInicio.gestionarEventos.agregarEvento(eventoM);
                    agregarIdAlUsuario(codigo);
                    
                    AdministracionEventos administracionEventos = new AdministracionEventos(listaUsuarios, nombreLabel, usuarioLogueado);
                    administracionEventos.setVisible(true);
                    this.setVisible(false);
                }
                break;
                
            case "Religioso":
                
        }

    }//GEN-LAST:event_BotonCrearMouseClicked
    
    private void agregarIdAlUsuario(String id) {
	if (usuarioLogueado instanceof Administrador) {
            ((Administrador) usuarioLogueado).agregarIdEvento(id);
        } else {
            ((Contenidos) usuarioLogueado).agregarIdEvento(id);
        }
    }
    
    private void BotonCalendarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCalendarioMouseClicked
        CalendarioVisual calendarioVisual = new CalendarioVisual();
        calendarioVisual.setVisible(true);
        this.setVisible(true);
    }//GEN-LAST:event_BotonCalendarioMouseClicked

    private void FechaFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaFieldKeyTyped

    private void FechaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaFieldActionPerformed
        FechaField.setText(fechaReservada);
    }//GEN-LAST:event_FechaFieldActionPerformed

    private void FechaFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaFieldMouseClicked
        JOptionPane.showMessageDialog(null, "Si deseas reservar una fecha, por favor haz clic en el ícono del calendario.", "Información de Reserva", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_FechaFieldMouseClicked

    private void SeguroFieldMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeguroFieldMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeguroFieldMActionPerformed

    private void RentaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RentaFieldActionPerformed

    private void RentaFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RentaFieldKeyReleased
        String tipoEvento = TipoEventoBox.getSelectedItem().toString();
        
        if (!RentaField.getText().isEmpty() && tipoEvento.equals("Musical")) {
            double renta = Integer.parseInt(RentaField.getText());
            double seguro = renta * EventoMusical.CUOTA_SEGURO / 100;
            SeguroFieldM.setText("Lps. " + String.valueOf(seguro));
        } if (RentaField.getText().isEmpty() || RentaField.getText().isBlank()) {
            SeguroFieldM.setText(null);
            
        }
    }//GEN-LAST:event_RentaFieldKeyReleased

    private void RentaField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RentaField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RentaField1ActionPerformed

    private void RentaField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RentaField1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_RentaField1KeyReleased

    private void RentaField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RentaField1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_RentaField1KeyTyped

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
            java.util.logging.Logger.getLogger(CrearEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearEvento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearEvento(null, null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AforoFieldD;
    private javax.swing.JTextField AforoFieldM;
    private javax.swing.JTextField AforoFieldR;
    private javax.swing.JLabel BotonCalendario;
    private javax.swing.JLabel BotonCrear;
    private javax.swing.JLabel BotonRegresar;
    private javax.swing.JTextField CódigoField;
    private javax.swing.JPanel DeportePanel;
    private javax.swing.JTextArea DescripcionField;
    private javax.swing.JTextField EquipoDosField;
    private javax.swing.JTextField EquipoUnoField;
    private javax.swing.JTextField FechaField;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel FondoDeportivo;
    private javax.swing.JLabel FondoInicio;
    private javax.swing.JLabel FondoMusical;
    private javax.swing.JLabel FondoReligioso;
    private javax.swing.JPanel InicioPanel;
    private javax.swing.JPanel MusicalPanel;
    private javax.swing.JPanel ReligiosoPanel;
    private javax.swing.JTextField RentaField;
    private javax.swing.JTextField RentaField1;
    private javax.swing.JTextField SeguroFieldM;
    private javax.swing.JTextField SeguroFieldR;
    private javax.swing.JComboBox<DeportesTipo> TipoDeporteBox;
    private javax.swing.JComboBox<String> TipoEventoBox;
    private javax.swing.JComboBox<MusicalTipo> TipoMusicalBox;
    private javax.swing.JTextField TituloField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
