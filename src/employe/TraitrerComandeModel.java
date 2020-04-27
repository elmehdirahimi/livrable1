package employe;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.AbstractTableModel;

public class TraitrerComandeModel extends AbstractTableModel {
	
    private ArrayList<TraiterComande> mesComandes;

    public TraitrerComandeModel(ArrayList<TraiterComande> mesComandes) {
        super();
        this.mesComandes = mesComandes;
    }

    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return mesComandes.size();
    }

    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
    	TraiterComande a = mesComandes.get(rowIndex);
        switch(columnIndex) {
            case 0 : return a.getJetonString();
            case 1 : return a.getProcedureString();
            case 2 : return a.getButtonPanel();
            default : return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex ) {
        switch(columnIndex) {
            case 0 : return "Traiter comande(jeton)";
            case 1 : return "Procedure";
           case 2 : return "";
            default : return null;
        }
    }
    @Override
    public Class getColumnClass(int columnIndex ) {
        switch(columnIndex) {
            case 0 : return String.class;
            case 1 : return String.class;
            case 2 : return JPanel.class;
            default : return Object.class;
        }
    }
	
}

