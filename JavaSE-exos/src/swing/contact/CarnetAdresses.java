package swing.contact;

import java.awt.Toolkit;
import java.awt.event.*;
import javax.swing.*;

class CarnetAdresses {

    public static void main(String[] args) {
        // La variable locale fenetre doit etre declaree final pour etre utilisable
        // dans la classe anonyme qui implemente ActionListener
        final JFrame fenetre = new JFrame("Contacts");
        final ContactTableModel modele = new ContactTableModel();
        JTable tableau = new JTable(modele);

        fenetre.getContentPane().add(new JScrollPane(tableau));

        // Recuperation de la touche utilisee pour les raccourcis (Ctrl ou Pomme)
        int toucheRaccourcis = Toolkit.getDefaultToolkit().getMenuShortcutKeyMask();
        // Creation de l'element de menu Nouveau et son listener associe
        JMenuItem menuNouveau = new JMenuItem("Nouveau", 'N');
        menuNouveau.setAccelerator(
                KeyStroke.getKeyStroke(KeyEvent.VK_N, toucheRaccourcis));


        menuNouveau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                // Saisie d'un nouveau contact
                PanneauContact panneau = new PanneauContact();
                int reponse = JOptionPane.showConfirmDialog(fenetre,
                        panneau, "Nouveau contact",
                        JOptionPane.OK_CANCEL_OPTION,
                        JOptionPane.PLAIN_MESSAGE);
                // Ajout d'une ligne au tableau des adresses avec les
                // valeurs saisies
                if (reponse == JOptionPane.OK_OPTION) {
                    Contact c = new Contact(panneau.getTitre(),
                            panneau.getNom(), panneau.getPrenom(), 
                            panneau.getAdresse());
                    modele.addRow(c);
                }
            }
        });

        // Creation de l'element de menu Quitter avec son listener associe
        JMenuItem menuQuitter = new JMenuItem("Quitter", 'Q');
        menuQuitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ev) {
                if (JOptionPane.showConfirmDialog(fenetre,
                        "Voulez-vous vraiment quitter ?", "Quitter",
                        JOptionPane.YES_NO_OPTION)
                        == JOptionPane.YES_OPTION) {
                    System.exit(0); // Arret de la JVM
                }
            }
        });

        // Creation d'une barre de menu avec le
        // menu Fichier et ses elements de menu
        JMenuBar barreMenu = new JMenuBar();
        fenetre.setJMenuBar(barreMenu);
        JMenu menuFichier = new JMenu("Fichier");
        barreMenu.add(menuFichier);
        menuFichier.add(menuNouveau);
        menuFichier.add(menuQuitter);

        // Affichage de la fenetre
        fenetre.setSize(300, 200);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
    }
}
