/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.contact;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author adminl
 */
public class ContactTableModel extends AbstractTableModel {

    public final String[] columns = {"Titre", "Nom", "Prénom", "Addresse"};
    List<Contact> contacts = new ArrayList<>();

    @Override
    public int getRowCount() {
        return contacts.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return contacts.get(rowIndex).getTitle();
            case 1:
                return contacts.get(rowIndex).getName();
            case 2:
                return contacts.get(rowIndex).getSurname();
            case 3:
                return contacts.get(rowIndex).getAddress();
            default:
                return null;
        }
    }

    public void addRow(Contact c) {
        contacts.add(c);

        // notify all observers that the row has changed
        fireTableStructureChanged();
    }
}
