/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

/**
 *
 * @author tom
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.*;

class AfficherHeure {
    public static void main(String[] args) {
        // Creation d'un bouton lie a une instance
        // de com.eteks.test.ListenerHeure
        JButton boutonHeure = new JButton ("Quelle heure est-il ?");
        boutonHeure.addActionListener(new ActionListener () {
	    
	    @Override
            public void actionPerformed(ActionEvent ev) {
                // Creation d'un texte avec 
                // les heures:minutes:secondes du moment
                String heure = DateFormat.getTimeInstance().format(
                    new Date ());
                JOptionPane.showMessageDialog (null, "Il est " + heure);
            }
	    
        });

        // Affichage du bouton dans une fenetre
        JFrame fenetre = new JFrame ("Heure");
        fenetre.getContentPane ().add (boutonHeure);
        fenetre.setResizable(false);
        fenetre.pack();
        fenetre.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        fenetre.show();
    }
}