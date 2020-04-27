package employe;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.omg.CORBA.PRIVATE_MEMBER;

public class TraiterComande extends JFrame{
	private String jetonString;
	private String procedureString;
	private JPanel buttonPanel;
	private JButton traiterButton;
	private Boolean traiterButtonClicked;
	
	public TraiterComande(String jetonString, String procedureString) throws HeadlessException {
		super();
		this.traiterButtonClicked = false;
		this.jetonString = jetonString;
		this.procedureString = procedureString;
		this.traiterButton = new JButton("Traiter");
		this.traiterButton.setBackground(Color.white);
		this.buttonPanel = new JPanel();
		buttonPanel.setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		p1.setSize(10,10);
	    this.buttonPanel.add(p1, BorderLayout.WEST);
	    this.buttonPanel.add(traiterButton, BorderLayout.CENTER);
		
	}
	public String getJetonString() {
		return jetonString;
	}
	public void setJetonString(String jetonString) {
		this.jetonString = jetonString;
	}
	public String getProcedureString() {
		return procedureString;
	}
	public JPanel getButtonPanel() {
		return buttonPanel;
	}
	public void setButtonPanel(JPanel buttonPanel) {
		this.buttonPanel = buttonPanel;
	}
	public void setProcedureString(String procedureString) {
		this.procedureString = procedureString;
	}
	public JButton getTraiterButton() {
		return traiterButton;
	}
	public void setTraiterButton(JButton traiterButton) {
		this.traiterButton = traiterButton;
	}
	public Boolean getTraiterButtonClicked() {
		return traiterButtonClicked;
	}
	public void setTraiterButtonClicked(Boolean traiterButtonClicked) {
		this.traiterButtonClicked = traiterButtonClicked;
	}
	

}
