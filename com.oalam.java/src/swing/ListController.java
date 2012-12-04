/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;

/**
 *
 * @author tom
 */
public class ListController implements javax.swing.event.ListSelectionListener{

    @Override
    public void valueChanged(ListSelectionEvent e) {
	
	
	System.out.println("e = " + e);
	((DefaultListModel)((JList)e.getSource()).getModel()).addElement("slick");
	
    }
    
}
