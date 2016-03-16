package System;

import java.awt.EventQueue;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JFrame;

import ch05.queues.ArrayUnbndQueue;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private Parent hold = new Parent();
	private Parent show1 = new Parent();
	private Parent show2 = new Parent();
	private JTextField P1Name;
	private JTextField P1Time;
	private JTextField Title;
	private JTextField P3Time;
	private JTextField P3Name;
	private JTextField P2Time;
	private JTextField P2Name;
	private JTextField P4Time;
	private JTextField P4Name;
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
		
	int cont,MP1=0,MP2=0,MP3=0,MP4=0,c=0;
	double AWT;
	String holder,MPP1="",MPP2="",MPP3="",MPP4="";
	String TitleH="";
	
	ArrayUnbndQueue<Parent> queue = new ArrayUnbndQueue<Parent>();
	private JTextField TitleBox;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel TitleLab = new JLabel("Title:");
		TitleLab.setHorizontalAlignment(SwingConstants.RIGHT);
		TitleLab.setBounds(0, 0, 100, 40);
		frame.getContentPane().add(TitleLab);
		
		JLabel P1title = new JLabel("Process 1");
		P1title.setHorizontalAlignment(SwingConstants.CENTER);
		P1title.setBounds(0, 40, 265, 40);
		frame.getContentPane().add(P1title);
		
		JLabel P1lab = new JLabel("Name:");
		P1lab.setHorizontalAlignment(SwingConstants.RIGHT);
		P1lab.setBounds(0, 80, 100, 40);
		frame.getContentPane().add(P1lab);
		
		JLabel P1TLab = new JLabel("Time:");
		P1TLab.setHorizontalAlignment(SwingConstants.RIGHT);
		P1TLab.setBounds(0, 120, 100, 40);
		frame.getContentPane().add(P1TLab);
		
		JLabel DateLab = new JLabel(date.toString());
		DateLab.setHorizontalAlignment(SwingConstants.CENTER);
		DateLab.setBounds(0, 292, 540, 28);
		frame.getContentPane().add(DateLab);
		
		JLabel label = new JLabel("Time:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(0, 241, 100, 40);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Name:");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(0, 201, 100, 40);
		frame.getContentPane().add(label_1);
		
		JLabel lblProcess_1 = new JLabel("Process 3");
		lblProcess_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblProcess_1.setBounds(0, 161, 265, 40);
		frame.getContentPane().add(lblProcess_1);
		
		JLabel label_3 = new JLabel("Time:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(275, 120, 100, 40);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("Name:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(275, 80, 100, 40);
		frame.getContentPane().add(label_4);
		
		JLabel lblProcess = new JLabel("Process 2");
		lblProcess.setHorizontalAlignment(SwingConstants.CENTER);
		lblProcess.setBounds(275, 40, 265, 40);
		frame.getContentPane().add(lblProcess);
		
		JLabel label_6 = new JLabel("Time:");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(275, 241, 100, 40);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Name:");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setBounds(275, 201, 100, 40);
		frame.getContentPane().add(label_7);
		
		JLabel lblProcess_2 = new JLabel("Process 4");
		lblProcess_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblProcess_2.setBounds(275, 161, 265, 40);
		frame.getContentPane().add(lblProcess_2);
		
		JLabel lblProcessesAre = new JLabel("Processes are:");
		lblProcessesAre.setBounds(646, 53, 76, 14);
		frame.getContentPane().add(lblProcessesAre);
		
		JLabel PSavedLab = new JLabel("Not Saved");
		PSavedLab.setForeground(Color.RED);
		PSavedLab.setBounds(722, 53, 76, 14);
		frame.getContentPane().add(PSavedLab);
		
		Title= new JTextField();
		Title.setColumns(10);
		Title.setBounds(115, 5, 150, 30);
		frame.getContentPane();
		
		P1Name = new JTextField();
		P1Name.setColumns(10);
		P1Name.setBounds(115, 85, 150, 30);
		frame.getContentPane().add(P1Name);
		
		P1Time = new JTextField();
		P1Time.setColumns(10);
		P1Time.setBounds(115, 125, 150, 30);
		frame.getContentPane().add(P1Time);
		
		P2Name = new JTextField();
		P2Name.setColumns(10);
		P2Name.setBounds(390, 85, 150, 30);
		frame.getContentPane().add(P2Name);
		
		P2Time = new JTextField();
		P2Time.setColumns(10);
		P2Time.setBounds(390, 125, 150, 30);
		frame.getContentPane().add(P2Time);
		
		P3Name = new JTextField();
		P3Name.setColumns(10);
		P3Name.setBounds(115, 206, 150, 30);
		frame.getContentPane().add(P3Name);
		
		P3Time = new JTextField();
		P3Time.setColumns(10);
		P3Time.setBounds(115, 246, 150, 30);
		frame.getContentPane().add(P3Time);
		
		P4Name = new JTextField();
		P4Name.setColumns(10);
		P4Name.setBounds(390, 206, 150, 30);
		frame.getContentPane().add(P4Name);
		
		P4Time = new JTextField();
		P4Time.setColumns(10);
		P4Time.setBounds(390, 246, 150, 30);
		frame.getContentPane().add(P4Time);
		
		JButton btnSaveProcessesAnd = new JButton("Save Processes and Date");
		btnSaveProcessesAnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MPP1=P1Name.getText();
				MP1=Integer.parseInt(P1Time.getText());
				MPP2=P2Name.getText();
				MP2=Integer.parseInt(P2Time.getText());
				MPP3=P3Name.getText();
				MP3=Integer.parseInt(P3Time.getText());
				MPP4=P4Name.getText();
				MP4=Integer.parseInt(P4Time.getText());
				TitleH=TitleBox.getText();
				c++;
				PSavedLab.setText("Saved "+c);
				PSavedLab.setForeground(Color.GREEN);
			}
		});
		btnSaveProcessesAnd.setBounds(180, 320, 180, 40);
		frame.getContentPane().add(btnSaveProcessesAnd);
		
		TitleBox = new JTextField();
		TitleBox.setColumns(10);
		TitleBox.setBounds(110, 5, 150, 30);
		frame.getContentPane().add(TitleBox);
	}
}
