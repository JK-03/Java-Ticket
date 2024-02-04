/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AdministracionUsuario_Interfaz;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
/**
 *
 * @author jenniferbueso
 */
public class CalendarioSwing {
    public JFrame getCalendarioSwingFrame() {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(737, 507);
        frame.setLayout(new BorderLayout());

        JTextField textField = new JTextField(10);
        JPanel calendarPanel = new JPanel(new GridLayout(0, 7));
        String[] days = {"Dom", "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb"};
        for (String day : days) {
            calendarPanel.add(new JLabel(day, SwingConstants.CENTER));
        }

        JComboBox<String> monthComboBox = new JComboBox<>(new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"});
        Calendar now = Calendar.getInstance();
        SpinnerNumberModel yearModel = new SpinnerNumberModel(now.get(Calendar.YEAR), now.get(Calendar.YEAR), 2100, 1);
        JSpinner yearSpinner = new JSpinner(yearModel);
        monthComboBox.setSelectedIndex(now.get(Calendar.MONTH));
        JPanel monthYearPanel = new JPanel();
        monthYearPanel.add(monthComboBox);
        monthYearPanel.add(yearSpinner);

        updateCalendar(calendarPanel, monthComboBox, yearSpinner, textField);

        monthComboBox.addActionListener(e -> updateCalendar(calendarPanel, monthComboBox, yearSpinner, textField));
        yearSpinner.addChangeListener(e -> updateCalendar(calendarPanel, monthComboBox, yearSpinner, textField));

        frame.add(monthYearPanel, BorderLayout.NORTH);
        frame.add(calendarPanel, BorderLayout.CENTER);
        frame.add(textField, BorderLayout.SOUTH);
        return frame;
    }

    private static void updateCalendar(JPanel calendarPanel, JComboBox<String> monthComboBox, JSpinner yearSpinner, JTextField textField) {
        calendarPanel.removeAll();
        for (String day : new String[]{"Dom", "Lun", "Mar", "Mié", "Jue", "Vie", "Sáb"}) {
            calendarPanel.add(new JLabel(day, SwingConstants.CENTER));
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, monthComboBox.getSelectedIndex());
        calendar.set(Calendar.YEAR, (Integer) yearSpinner.getValue());
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        for (int i = 1; i < firstDayOfWeek; i++) {
            calendarPanel.add(new JLabel(""));
        }
        int maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        Calendar today = Calendar.getInstance();
        for (int indice = 1; indice <= maxDay; indice++) {
            JButton dayButton = new JButton(String.valueOf(indice));
            dayButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dayButton.getText()));
                    Date date = calendar.getTime();
                    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                    String dateString = format.format(date);
                    textField.setText(dateString);
                }
            });
            calendar.set(Calendar.DAY_OF_MONTH, indice);
            if (calendar.before(today)) {
                dayButton.setEnabled(false);
            }
            calendarPanel.add(dayButton);
        }
        calendarPanel.revalidate();
        calendarPanel.repaint();
    }
}