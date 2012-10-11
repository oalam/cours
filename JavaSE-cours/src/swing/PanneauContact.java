/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

/**
 *
 * @author adminl
 */
import java.awt.*;
import javax.swing.*;

/**
* Panneau de saisie d'un individu.
*/
public class PanneauContact extends JPanel  {
    private final static String [] TITRES = {"Mr", "Mme", "Melle"};
    private JComboBox  saisieTitre   = new JComboBox (TITRES);
    private JTextField saisieNom     = new JTextField (10);
    private JTextField saisiePrenom  = new JTextField (10);
    private JTextArea  saisieAdresse = new JTextArea  (4, 20);

    public PanneauContact (){
        JPanel panneauLabels = new JPanel (new GridLayout (4, 1, 5, 5));
        panneauLabels.add (new JLabel ("Titre :"));
        panneauLabels.add (new JLabel ("Nom :"));
        panneauLabels.add (new JLabel ("Pr\u00e9nom :"));
        panneauLabels.add (new JLabel ("Adresse :"));

        JPanel panneauSaisie = new JPanel (new GridLayout (4, 1, 5, 5));
        panneauSaisie.add (this.saisieTitre);
        panneauSaisie.add (this.saisieNom);
        panneauSaisie.add (this.saisiePrenom);

        setLayout (new BorderLayout (5, 5));
        add (panneauLabels, BorderLayout.WEST);
        add (panneauSaisie, BorderLayout.CENTER);
        add (new JScrollPane (saisieAdresse), BorderLayout.SOUTH);
    }

    public String getTitre () {
        return (String)this.saisieTitre.getSelectedItem ();
    }

    public String getNom () {
        return this.saisieNom.getText ();
    }

    public String getPrenom () {
        return this.saisiePrenom.getText ();
    }

    public String getAdresse () {
        return this.saisieAdresse.getText ();
    }
}

class SaisieContact {

    public static void main(String[] args) {
        PanneauContact panneau = new PanneauContact();
        int reponse = JOptionPane.showConfirmDialog(null, panneau,
            "Contact", JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE);
        
        if (reponse == JOptionPane.OK_OPTION) {
          JOptionPane.showMessageDialog(null, "Contact :\n"
            + panneau.getTitre() + " "
            + panneau.getPrenom() + " " + panneau.getNom()
            + "\n" + panneau.getAdresse());
        }
        
        System.exit(0);
    }
}