/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.GridLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author adminl
 */
public class MVCList extends JPanel {

    private JList view = new JList();
    private DefaultListModel model = new DefaultListModel();
  

    public MVCList() {
        
        model.addElement("aye");
        model.addElement("plik");
        view.setModel(model);
        
        view.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                model.addElement("oups");
            }
        });
        
        JPanel panneauLabels = new JPanel(new GridLayout(1, 1, 5, 5));
        panneauLabels.add(view);
        
        add(view);
    }

    public static void main(String[] args) {
        MVCList panel = new MVCList();
        JFrame window = new JFrame("MVCList");

        window.setContentPane(panel);
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
