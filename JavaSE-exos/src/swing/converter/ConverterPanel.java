/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.converter;

/**
 *
 * @author adminl
 */
import swing.converter.Converter.CURRENCY;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.*;

/**
 * Panneau de saisie d'un individu.
 */
public class ConverterPanel extends JPanel {

    private JComboBox currencyChoice = new JComboBox(CURRENCY.values());
    private JTextField valueToConvert = new JTextField(10);
    private JLabel convertedValue = new JLabel();
    private JButton convertButton = new JButton("convertir");

    public ConverterPanel() {
        JPanel panneauLabels = new JPanel(new GridLayout(3, 1, 5, 5));
        panneauLabels.add(new JLabel("Valeur à convertir :"));
        panneauLabels.add(new JLabel("Valeur convertie   :"));

        JPanel panneauSaisie = new JPanel(new GridLayout(3, 1, 5, 5));
        panneauSaisie.add(this.valueToConvert);
        panneauSaisie.add(this.convertedValue);

        setLayout(new BorderLayout(5, 5));
        add(panneauLabels, BorderLayout.WEST);
        add(panneauSaisie, BorderLayout.CENTER);
        add(currencyChoice, BorderLayout.NORTH);
        add(convertButton, BorderLayout.SOUTH);

        initListeners();
    }

    private void initListeners() {
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                convert();
            }
        });

     
      
        
        
        valueToConvert.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                convert();
            }

            @Override
            public void keyPressed(KeyEvent e) {
                convert();
            }

            @Override
            public void keyReleased(KeyEvent e) {
                convert();
            }
        });

        currencyChoice.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                convert();
            }
        });
    }

    private void convert() {
        // get the selected currency
        CURRENCY currency = (CURRENCY) this.currencyChoice.getSelectedItem();

        try {
            // convert user entry as a double value
            double newValue = Double.parseDouble(this.valueToConvert.getText());

            // call business method to convert
            double convertedNewValue = Converter.convert(newValue, currency);

            // set the new value
            convertedValue.setForeground(Color.BLACK);
            convertedValue.setText(Double.toString(convertedNewValue));

        } catch (NumberFormatException ex) {
            convertedValue.setForeground(Color.red);
            convertedValue.setText("bad number format");
        }
    }

    public static void main(String[] args) {
        ConverterPanel panel = new ConverterPanel();
        JFrame window = new JFrame("converter");

        window.setContentPane(panel);
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
