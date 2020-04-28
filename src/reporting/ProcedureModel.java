package reporting;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.table.AbstractTableModel;


public class ProcedureModel extends AbstractTableModel {
	
    private ArrayList<Procedure> mesProcedures;

    public ProcedureModel(ArrayList<Procedure> mesProcedures) {
        super();
        this.mesProcedures = mesProcedures;
        this.mesProcedures.add(new Procedure("",3,3,3));
    }

    @Override
    public int getRowCount() {
        // TODO Auto-generated method stub
        return mesProcedures.size();
    }

    @Override
    public int getColumnCount() {
        // TODO Auto-generated method stub
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        // TODO Auto-generated method stub
    	Procedure a = mesProcedures.get(rowIndex);
    	if(rowIndex == this.mesProcedures.size() - 1)
    	{
    		switch(columnIndex) {
            case 3 : return "";
            case 4 : return getPP();
            default : return "";
    	}
    	}
    	else {
        switch(columnIndex) {
        	case 0 : return a.getprocedure();
            case 1 : return a.getDt();
            case 2 : return a.getAccepte();
            case 3 : return a.getRefuse();
            case 4 : return a.getTa();
            case 5 : return a.getMd();
            default : return null;
        }
    }
    }

    @Override
    public String getColumnName(int columnIndex ) {
    
        switch(columnIndex) {
            case 0 : return "Procedure";
            case 1 : return "N D.T";
          	case 2 : return "Accepte";
            case 3 : return "Refuse";
          	case 4 : return "T.A (%)";
          	case 5 : return "M.D";
            default : return null;
        }
    	
    }
    @Override
    public Class getColumnClass(int columnIndex ) {
        switch(columnIndex) {
            case 0 : return String.class;
            case 1 : return Integer.class;
            case 2 : return Integer.class;
            case 3 : return Integer.class;
            case 4 : return Integer.class;
            case 5 : return Integer.class;
            default : return Object.class;
        }
    }
    public Double getPP() {
		int sDt = 0;
		int sAccepte = 0;
		for(int i = 0; i < this.mesProcedures.size(); i++)
		{
			sDt+=this.mesProcedures.get(i).getDt();
			sAccepte = this.mesProcedures.get(i).getAccepte();
		}
	return ((float)sDt * 100.0 / (float)sAccepte);
	}
}

