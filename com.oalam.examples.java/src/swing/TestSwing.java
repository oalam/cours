/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author tom
 */
public class TestSwing {
    public static void main(String[] args) {
	
	JFrame f = new JFrame( "oup");
	Container cont = f.getContentPane();
	
	cont.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
	
	cont.add(new JLabel("Pseudo :"));
	cont.add(new JTextField(10));
	cont.add(new JLabel("Password :"));
	cont.add(new JPasswordField(10));
	
	f.pack();
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
	
    }
}
