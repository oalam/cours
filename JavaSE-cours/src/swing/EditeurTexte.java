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

public class EditeurTexte {

    static class ChargeurRessource {

        private String base;

        public ChargeurRessource(String base) {
            this.base = base;
        }

        public ChargeurRessource() {
            this("");
        }

        /**
        * Renvoie l'icone du fichier icon relatif a la base.
        */
        public ImageIcon getIcon(String icon) {
            Class classe = getClass();
            return new ImageIcon(classe.getResource(this.base + icon));
        }
    }

    public static void main(String[] args) {
        JFrame fenetre = new JFrame("Editeur");
        Container contenu = fenetre.getContentPane();
        // Utilisation d'un gestionnaire de layout BorderLayout
        // avec un ecart de 2 pixels entre les composants
        contenu.setLayout(new BorderLayout(2, 2));

        // Ajout de la barre d'outils en haut
        // Creation d'une barre d'outils utilisant les icones 
        // nouveau, couper, copier, coller
        JToolBar outils = new JToolBar();
        ChargeurRessource chargeur =
        new ChargeurRessource("/toolbarButtonGraphics/general/");
        outils.add(new JButton(chargeur.getIcon("New16.gif")));
        outils.addSeparator();
        outils.add(new JButton(chargeur.getIcon("Cut16.gif")));
        outils.add(new JButton(chargeur.getIcon("Copy16.gif")));
        outils.add(new JButton(chargeur.getIcon("Paste16.gif")));

        contenu.add(outils, BorderLayout.NORTH);
        // Ajout d'une zone de saisie de taille preferee 
        // 10 lignes x 50 colonnes
        contenu.add(new JScrollPane(new JTextArea(10, 50)),
        BorderLayout.CENTER);
        // Ajout d'un label d'etat avec un bord en bas
        JLabel etat = new JLabel(" Application d\u00e9marr\u00e9e");
        etat.setBorder(BorderFactory.createLoweredBevelBorder());
        contenu.add(etat, BorderLayout.SOUTH);

        // Calcul de la taille preferee de la fenetre
        // en fonction de son contenu
        fenetre.pack();
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.show();
    }
}