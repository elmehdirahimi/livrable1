package chef;
import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import static javax.swing.JOptionPane.showMessageDialog;
import employe.*;
public class ChefPage extends JFrame{
	
	private ArrayList<NouvelleDemande> mesDemandes;
	private ArrayList<ConsulterDemande> consulterListe;///
	private JScrollPane scrollPane;
	private JTable table;
	private JScrollPane scrollPane2;
	private JTable table2;
	
	public ChefPage(ArrayList<NouvelleDemande> mesDemandes, ArrayList<ConsulterDemande> consulterListe) {
		super();
		this.mesDemandes = mesDemandes;
		this.consulterListe = consulterListe;
		
		JPanel newComandePanel  = new JPanel();
		JPanel ConsulterComandePanel  = new JPanel();
		JTabbedPane tp=new JTabbedPane();  
	    tp.setBounds(50,50,200,200);  
	    tp.add("main",newComandePanel);  
	    tp.add("visit",ConsulterComandePanel);  
	 
		TableCellRenderer tableRenderer;
	      table = new JTable(new NouvelleDemandeModel(mesDemandes));
	      tableRenderer = table.getDefaultRenderer(JPanel.class);
	      table.setDefaultRenderer(JPanel.class, new JTableButtonRenderer(tableRenderer));
	      table.getColumnModel().getColumn(2).setHeaderRenderer(new SimpleHeaderRenderer());
	      table.setGridColor(new java.awt.Color(238,238,238));
	      DefaultTableCellRenderer renderer = (DefaultTableCellRenderer)table.getDefaultRenderer(Object.class);
	       renderer.setHorizontalAlignment( SwingConstants.CENTER );
	      scrollPane = new JScrollPane(table);
	      scrollPane.setBorder(BorderFactory.createEmptyBorder());
	      newComandePanel.setLayout(new BorderLayout(50,5));      
	      JPanel panel3 = new JPanel();
	      panel3.add(scrollPane, BorderLayout.CENTER);
	      newComandePanel.add(panel3,BorderLayout.CENTER);
	      
	      
	      
	      
	  	TableCellRenderer tableRenderer2;
	      table2 = new JTable(new ConsulterDemandeModel(consulterListe));
	      tableRenderer2 = table2.getDefaultRenderer(JPanel.class);
	      table2.setDefaultRenderer(JPanel.class, new JTableButtonRenderer(tableRenderer2));
	      table2.getColumnModel().getColumn(3).setHeaderRenderer(new SimpleHeaderRenderer());
	      table2.getColumnModel().getColumn(4).setHeaderRenderer(new SimpleHeaderRenderer());
	      table2.setGridColor(new java.awt.Color(238,238,238));
	      DefaultTableCellRenderer renderer2 = (DefaultTableCellRenderer)table2.getDefaultRenderer(Object.class);
	       renderer2.setHorizontalAlignment( SwingConstants.CENTER );
	      scrollPane2 = new JScrollPane(table2);
	      scrollPane2.setBorder(BorderFactory.createEmptyBorder());
	      ConsulterComandePanel.setLayout(new BorderLayout(50,5));      
	      JPanel panel4 = new JPanel();
	      panel4.add(scrollPane2, BorderLayout.CENTER);
	      ConsulterComandePanel.add(panel4,BorderLayout.CENTER);
	      
	     
	     add(tp);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setLocationRelativeTo(null);
	      setSize(600, 500);
	      setVisible(true);
	      
	     table.addMouseListener(new java.awt.event.MouseAdapter()
          {
	    	 public void mouseClicked(java.awt.event.MouseEvent e){
	    		 int row=table.rowAtPoint(e.getPoint());
	    		 int col= table.columnAtPoint(e.getPoint());
	    		 if(col == 2)
	    			 mesDemandes.get(row).showPopup();
	    		 }});
	      
	      table2.addMouseListener(new java.awt.event.MouseAdapter()

          {
	    	 public void mouseClicked(java.awt.event.MouseEvent e){
	    		 int row=table2.rowAtPoint(e.getPoint());
	    		 int col= table2.columnAtPoint(e.getPoint());
	    		 if(col == 4)
	    			 consulterListe.get(row).showPopup();
	    		 }});
	}
	
}
