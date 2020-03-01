import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import java.io.*;
import java.util.StringTokenizer;

public class GUI extends JFrame implements ActionListener {
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	
	Controller cont = Controller.inst();
	JButton loadModelButton = new JButton("loadModel");
	JButton saveModelButton = new JButton("saveModel");
	JButton testButton = new JButton("test");
	JLabel cdoLabel = new JLabel("CDO: ");
	JTextArea cdoTextArea = new JTextArea();
	JLabel sectorLabel = new JLabel("sector: ");
	JTextArea sectorTextArea = new JTextArea();
	JLabel borrowerLabel = new JLabel("borrower: ");
	JTextArea borrowerTextArea = new JTextArea();
	JButton testBorrowerInSectorButton = new JButton("testRiskContribution");

	public GUI() {
		super("Select use case to execute");
//		setContentPane(panel);
		this.add(panel,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);
		this.add(panel3,BorderLayout.SOUTH);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		panel.add(loadModelButton);
		loadModelButton.addActionListener(this);
		panel.add(saveModelButton);
		saveModelButton.addActionListener(this);
		panel.add(testButton);
		testButton.addActionListener(this);
		

		cdoTextArea.setPreferredSize(new Dimension(20,20));
		sectorLabel.setPreferredSize(new Dimension(20,20));
		borrowerLabel.setPreferredSize(new Dimension(20,20));
//		panel2.setBackground(new Color(200,0,0));
		panel2.setLayout(new GridLayout(3, 3,10,10));
		
		panel2.add(new JPanel());
		
		panel2.add(panel4);
		
		panel4.setLayout(new GridLayout(3, 2,10,10));
		
		
		panel4.add(cdoLabel);
		panel4.add(cdoTextArea);
		panel4.add(sectorLabel);
		panel4.add(sectorTextArea);
		panel4.add(borrowerLabel);
		panel4.add(borrowerTextArea);
		
		panel3.add(testBorrowerInSectorButton);
		testBorrowerInSectorButton.addActionListener(this);
		

	}

	public void actionPerformed(ActionEvent e) {
		if (e == null) {
			return;
		}
		String cmd = e.getActionCommand();
		if ("loadModel".equals(cmd)) {
			Controller.loadModel("in.txt");
			cont.checkCompleteness();
			System.err.println("Model loaded");
			return;
		}
		if ("saveModel".equals(cmd)) {
			cont.saveModel("out.txt");
			cont.saveXSI("xsi.txt");
			return;
		}
		if ("test".equals(cmd)) {
			cont.test();
			return;
		}
		if ("testRiskContribution".equals(cmd)) {
			if(cdoTextArea.getText().equals("") || sectorTextArea.getText().equals("") || borrowerTextArea.getText().equals("")){
				System.out.println("Please input target cdo, sector and sequence of borrower");
				return;
			}
			
			int cdo = 0;
			int sector = 0;
			int borrower = 0;
			
			try{
				cdo = Integer.parseInt(cdoTextArea.getText());
				sector = Integer.parseInt(sectorTextArea.getText());
				borrower = Integer.parseInt(borrowerTextArea.getText());
			}catch(Exception parseIntException){
				parseIntException.printStackTrace();
				System.out.println("Please input valid target cdo, sector and sequence of borrower");
				return;
			}
			
			cont.testBorrowerInSector(cdo, sector, borrower);
			return;
		}
	}

	public static void main(String[] args) {
		GUI gui = new GUI();
		gui.setSize(400, 400);
		gui.setVisible(true);
	}
}
