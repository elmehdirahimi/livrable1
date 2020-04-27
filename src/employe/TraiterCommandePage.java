package employe;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.table.TableCellRenderer;

import com.sun.prism.paint.Color;



import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class TraiterCommandePage extends JFrame {
	private ArrayList<TraiterComande> mesComande;
	
	//private JLabel formulaireJLabel;
	private JScrollPane scrollPane;
	private JTable table;
	
	public TraiterCommandePage(ArrayList<TraiterComande> mesComande)  {
		super();
		this.mesComande = new ArrayList<TraiterComande>();
		this.mesComande = mesComande;
		
		TableCellRenderer tableRenderer;
		
	      table = new JTable(new TraitrerComandeModel(mesComande));
	      tableRenderer = table.getDefaultRenderer(JPanel.class);
	      
	      table.setDefaultRenderer(JPanel.class, new JTableButtonRenderer(tableRenderer));
	      table.getColumnModel().getColumn(2).setHeaderRenderer(new SimpleHeaderRenderer());
	      table.setGridColor(new java.awt.Color(238,238,238));
	      DefaultTableCellRenderer renderer = (DefaultTableCellRenderer)table.getDefaultRenderer(Object.class);
	       renderer.setHorizontalAlignment( SwingConstants.CENTER );
	      scrollPane = new JScrollPane(table);
	      scrollPane.setBorder(BorderFactory.createEmptyBorder());
	      setLayout(new BorderLayout(50,5));      
	      JPanel panel3 = new JPanel();
	      panel3.setBorder(BorderFactory.createTitledBorder("Formulaire"));
	      panel3.add(scrollPane, BorderLayout.CENTER);
	      add(panel3,BorderLayout.CENTER);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      setLocationRelativeTo(null);
	      setSize(600, 500);
	      setVisible(true);
	   }
	
	}