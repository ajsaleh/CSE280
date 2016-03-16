package System;

import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JMenuBar;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

import ch05.queues.ArrayUnbndQueue;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.CardLayout;
import javax.swing.JTable;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPasswordField;

public class GUI280 extends JApplet {

	private JTextField P1Name;
	private JTextField P1Time;
	private JTextField P2Name;
	private JTextField P2Time;
	private JTextField P3Name;
	private JTextField P3Time;
	private JTextField P4Name;
	private JTextField P4Time;
	private JTextField TitleBox;
	private JTextArea texthold;
	private JTextField HStep;
	private JTextField P1Pros;
	private JTextField P2Pros;
	private JTextField P3Pros;
	private JTextField P4Pros;
	private JTextField HName;
	private JTextField HWT;
	
	final String password = "pass";
	
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Date date = new Date();
	Date date2;

	final int tabelL=10;
	int TP1=0,TP2=0,TP3=0,TP4=0,c=0,PP1=0,PP2=0,PP3=0,PP4=0,H,H3,H4;
	double AWT,WH=0;
	String holder,NP1="P1",NP2="P2",NP3="P3",NP4="P4";
	String TitleH="";

	Parent hold = new Parent();
	Parent show1 = new Parent();
	Parent show2 = new Parent();

	ArrayUnbndQueue<Parent> queue = new ArrayUnbndQueue<Parent>();
	private JPasswordField pw;

	public void RT(Parent add)
	{	
		holder=texthold.getText();
		holder+="Name:"+add.getName()+" Wait Time:"+add.getWaitTime()+"\n";
		texthold.setText(holder);
	}
	
	public void RefreshT()
	{
		holder=texthold.getText();
		String[] parts= holder.split("\n",2);
		texthold.setText(parts[1]);
	}
	
	/**
	 * Create the applet.
	 */
	public GUI280() {
		this.setSize(800,800);
		getContentPane().setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 800, 800);
		getContentPane().add(tabbedPane);

		JPanel Add = new JPanel();
		tabbedPane.addTab("Add", null, Add, null);
		Add.setLayout(null);

		JLabel lblNewLabel = new JLabel("Your Name:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 5, 187, 30);
		Add.add(lblNewLabel);

		HStep = new JTextField();
		HStep.setBounds(0, 106, 187, 30);
		Add.add(HStep);
		HStep.setColumns(10);

		HName = new JTextField();
		HName.setColumns(10);
		HName.setBounds(0, 35, 187, 30);
		Add.add(HName);

		JLabel lblTotalNumberOf = new JLabel("Total Number of Steps:");
		lblTotalNumberOf.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalNumberOf.setBounds(0, 76, 187, 30);
		Add.add(lblTotalNumberOf);

		JLabel N1T = new JLabel("Time to Change");
		N1T.setHorizontalAlignment(SwingConstants.LEFT);
		N1T.setBounds(555, 35, 210, 30);
		Add.add(N1T);

		JLabel lblEstmatedTime = new JLabel("Estmated time:");
		lblEstmatedTime.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstmatedTime.setBounds(350, 35, 200, 30);
		Add.add(lblEstmatedTime);

		JLabel lblNumberOfSteps_1 = new JLabel("Number Of Steps:");
		lblNumberOfSteps_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumberOfSteps_1.setBounds(350, 65, 200, 30);
		Add.add(lblNumberOfSteps_1);

		JLabel N1S = new JLabel("Steps Change");
		N1S.setHorizontalAlignment(SwingConstants.LEFT);
		N1S.setBounds(555, 65, 210, 30);
		Add.add(N1S);

		JLabel N1LB = new JLabel("Estmated time:");
		N1LB.setHorizontalAlignment(SwingConstants.CENTER);
		N1LB.setBounds(350, 5, 415, 30);
		Add.add(N1LB);

		JLabel label_27 = new JLabel("Number Of Steps:");
		label_27.setHorizontalAlignment(SwingConstants.RIGHT);
		label_27.setBounds(350, 166, 200, 30);
		Add.add(label_27);

		JLabel N2S = new JLabel("Steps Change");
		N2S.setHorizontalAlignment(SwingConstants.LEFT);
		N2S.setBounds(555, 166, 210, 30);
		Add.add(N2S);

		JLabel N2T = new JLabel("Time to Change");
		N2T.setHorizontalAlignment(SwingConstants.LEFT);
		N2T.setBounds(555, 136, 210, 30);
		Add.add(N2T);

		JLabel label_30 = new JLabel("Estmated time:");
		label_30.setHorizontalAlignment(SwingConstants.RIGHT);
		label_30.setBounds(350, 136, 200, 30);
		Add.add(label_30);

		JLabel N2LB = new JLabel("Estmated time:");
		N2LB.setHorizontalAlignment(SwingConstants.CENTER);
		N2LB.setBounds(350, 106, 415, 30);
		Add.add(N2LB);

		JLabel label_32 = new JLabel("Number Of Steps:");
		label_32.setHorizontalAlignment(SwingConstants.RIGHT);
		label_32.setBounds(350, 267, 200, 30);
		Add.add(label_32);

		JLabel N3S = new JLabel("Steps Change");
		N3S.setHorizontalAlignment(SwingConstants.LEFT);
		N3S.setBounds(555, 267, 210, 30);
		Add.add(N3S);

		JLabel N3T = new JLabel("Time to Change");
		N3T.setHorizontalAlignment(SwingConstants.LEFT);
		N3T.setBounds(555, 237, 210, 30);
		Add.add(N3T);

		JLabel label_35 = new JLabel("Estmated time:");
		label_35.setHorizontalAlignment(SwingConstants.RIGHT);
		label_35.setBounds(350, 237, 200, 30);
		Add.add(label_35);

		JLabel N3LB = new JLabel("Estmated time:");
		N3LB.setHorizontalAlignment(SwingConstants.CENTER);
		N3LB.setBounds(350, 207, 415, 30);
		Add.add(N3LB);

		JLabel lblNumberOfSteps_2 = new JLabel("Number Of Steps:");
		lblNumberOfSteps_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumberOfSteps_2.setBounds(350, 368, 200, 30);
		Add.add(lblNumberOfSteps_2);

		JLabel N4S = new JLabel("Steps Change");
		N4S.setHorizontalAlignment(SwingConstants.LEFT);
		N4S.setBounds(555, 368, 210, 30);
		Add.add(N4S);

		JLabel N4T = new JLabel("Time to Change");
		N4T.setHorizontalAlignment(SwingConstants.LEFT);
		N4T.setBounds(555, 338, 210, 30);
		Add.add(N4T);

		JLabel label_40 = new JLabel("Estmated time:");
		label_40.setHorizontalAlignment(SwingConstants.RIGHT);
		label_40.setBounds(350, 338, 200, 30);
		Add.add(label_40);

		JLabel N4LB = new JLabel("Estmated time:");
		N4LB.setHorizontalAlignment(SwingConstants.CENTER);
		N4LB.setBounds(350, 308, 415, 30);
		Add.add(N4LB);

		JLabel lblEstmatedWaitTime = new JLabel("Estmated Wait Time:");
		lblEstmatedWaitTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstmatedWaitTime.setBounds(0, 158, 187, 30);
		Add.add(lblEstmatedWaitTime);

		HWT = new JTextField();
		HWT.setColumns(10);
		HWT.setBounds(0, 188, 187, 30);
		Add.add(HWT);

		JLabel Thanks = new JLabel();
		Thanks.setFont(new Font("Tahoma", Font.BOLD, 40));
		Thanks.setHorizontalAlignment(SwingConstants.CENTER);
		Thanks.setBounds(0, 446, 795, 85);
		Add.add(Thanks);

		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				H=Integer.parseInt(HWT.getText());

				WH+=H;
				hold.setDate(date);
				hold.setMaxProcess(Integer.parseInt(HStep.getText()));
				hold.setName(HName.getText());
				hold.setProcess(0);
				hold.setTechnicianName("TBA");
				hold.setWaitTime(WH);
				queue.enqueue(hold);

				Thanks.setText("Thank You "+HName.getText()+"!");
				RT(hold);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton.setBounds(0, 240, 210, 69);
		Add.add(btnNewButton);

		JPanel Set = new JPanel();
		tabbedPane.addTab("Set Process", null, Set, null);
		Set.setLayout(null);

		JLabel label = new JLabel("Title:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(0, 0, 100, 40);
		Set.add(label);

		JLabel label_1 = new JLabel("Process 1");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(0, 40, 265, 40);
		Set.add(label_1);

		JLabel label_2 = new JLabel("Name:");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(0, 80, 100, 40);
		Set.add(label_2);

		JLabel label_3 = new JLabel("Time:");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(0, 120, 100, 40);
		Set.add(label_3);

		JLabel DATELB = new JLabel("Mon Mar 07 15:33:06 EST 2016");
		DATELB.setHorizontalAlignment(SwingConstants.CENTER);
		DATELB.setBounds(0, 370, 540, 30);
		Set.add(DATELB);

		JLabel label_5 = new JLabel("Time:");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(0, 280, 100, 40);
		Set.add(label_5);

		JLabel label_6 = new JLabel("Name:");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(0, 240, 100, 40);
		Set.add(label_6);

		JLabel label_7 = new JLabel("Process 3");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(0, 200, 265, 40);
		Set.add(label_7);

		JLabel label_8 = new JLabel("Time:");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setBounds(275, 120, 100, 40);
		Set.add(label_8);

		JLabel label_9 = new JLabel("Name:");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setBounds(275, 80, 100, 40);
		Set.add(label_9);

		JLabel label_10 = new JLabel("Process 2");
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setBounds(275, 40, 265, 40);
		Set.add(label_10);

		JLabel label_11 = new JLabel("Time:");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setBounds(275, 280, 100, 40);
		Set.add(label_11);

		JLabel label_12 = new JLabel("Name:");
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setBounds(275, 240, 100, 40);
		Set.add(label_12);

		JLabel label_13 = new JLabel("Process 4");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setBounds(275, 200, 265, 40);
		Set.add(label_13);

		JLabel label_14 = new JLabel("Processes are:");
		label_14.setBounds(646, 53, 76, 14);
		Set.add(label_14);

		JLabel PSavedLab = new JLabel("Not Saved");
		PSavedLab.setForeground(Color.RED);
		PSavedLab.setBounds(722, 53, 76, 14);
		Set.add(PSavedLab);

		P1Name = new JTextField();
		P1Name.setColumns(10);
		P1Name.setBounds(115, 85, 150, 30);
		Set.add(P1Name);

		P1Time = new JTextField();
		P1Time.setColumns(10);
		P1Time.setBounds(115, 125, 150, 30);
		Set.add(P1Time);

		P2Name = new JTextField();
		P2Name.setColumns(10);
		P2Name.setBounds(390, 85, 150, 30);
		Set.add(P2Name);

		P2Time = new JTextField();
		P2Time.setColumns(10);
		P2Time.setBounds(390, 125, 150, 30);
		Set.add(P2Time);

		P3Name = new JTextField();
		P3Name.setColumns(10);
		P3Name.setBounds(115, 245, 150, 30);
		Set.add(P3Name);

		P3Time = new JTextField();
		P3Time.setColumns(10);
		P3Time.setBounds(115, 285, 150, 30);
		Set.add(P3Time);

		P4Name = new JTextField();
		P4Name.setColumns(10);
		P4Name.setBounds(390, 245, 150, 30);
		Set.add(P4Name);

		P4Time = new JTextField();
		P4Time.setColumns(10);
		P4Time.setBounds(390, 285, 150, 30);
		Set.add(P4Time);

		JButton btnSaveAndUpdate = new JButton("Save and Update");
		btnSaveAndUpdate.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnSaveAndUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//names
				NP1=P1Name.getText();
				NP2=P2Name.getText();
				NP3=P3Name.getText();
				NP4=P4Name.getText();

				//Times
				TP1=Integer.parseInt(P1Time.getText());
				TP2=Integer.parseInt(P2Time.getText());
				TP3=Integer.parseInt(P3Time.getText());
				TP4=Integer.parseInt(P4Time.getText());

				//Number of process
				PP1=Integer.parseInt(P1Pros.getText());
				PP2=Integer.parseInt(P2Pros.getText());
				PP3=Integer.parseInt(P3Pros.getText());
				PP4=Integer.parseInt(P4Pros.getText());


				TitleH=TitleBox.getText();

				c++;
				PSavedLab.setText("Saved "+c);
				PSavedLab.setForeground(Color.GREEN);

				//update add tab

				//names
				N1LB.setText(NP1);
				N2LB.setText(NP2);
				N3LB.setText(NP3);
				N4LB.setText(NP4);

				//TIMES
				N1T.setText(String.valueOf(TP1));
				N2T.setText(String.valueOf(TP2));
				N3T.setText(String.valueOf(TP3));
				N4T.setText(String.valueOf(TP4));

				//Steps
				N1S.setText(String.valueOf(PP1));
				N2S.setText(String.valueOf(PP2));
				N3S.setText(String.valueOf(PP3));
				N4S.setText(String.valueOf(PP4));
			}
		});

		TitleBox = new JTextField();
		TitleBox.setColumns(10);
		TitleBox.setBounds(110, 5, 150, 30);
		Set.add(TitleBox);
		btnSaveAndUpdate.setBounds(0, 400, 550, 150);
		Set.add(btnSaveAndUpdate);

		P1Pros = new JTextField();
		P1Pros.setColumns(10);
		P1Pros.setBounds(115, 165, 150, 30);
		Set.add(P1Pros);

		P2Pros = new JTextField();
		P2Pros.setColumns(10);
		P2Pros.setBounds(390, 165, 150, 30);
		Set.add(P2Pros);

		P3Pros = new JTextField();
		P3Pros.setColumns(10);
		P3Pros.setBounds(115, 325, 150, 30);
		Set.add(P3Pros);

		P4Pros = new JTextField();
		P4Pros.setColumns(10);
		P4Pros.setBounds(390, 325, 150, 30);
		Set.add(P4Pros);

		JLabel lblNumberOfSteps = new JLabel("Number Of Steps:");
		lblNumberOfSteps.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumberOfSteps.setBounds(0, 160, 100, 40);
		Set.add(lblNumberOfSteps);

		JLabel label_4 = new JLabel("Number Of Steps:");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(275, 160, 100, 40);
		Set.add(label_4);

		JLabel label_15 = new JLabel("Number Of Steps:");
		label_15.setHorizontalAlignment(SwingConstants.RIGHT);
		label_15.setBounds(0, 320, 100, 40);
		Set.add(label_15);

		JLabel label_16 = new JLabel("Number Of Steps:");
		label_16.setHorizontalAlignment(SwingConstants.RIGHT);
		label_16.setBounds(285, 320, 100, 40);
		Set.add(label_16);

		JPanel panel = new JPanel();
		tabbedPane.addTab("LINE", null, panel, null);
		tabbedPane.setEnabledAt(2, true);
		panel.setLayout(null);

		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_3.setBounds(10, 11, 775, 86);
		panel.add(lblNewLabel_3);
		
		texthold = new JTextArea();
		texthold.setBounds(10, 100, 775, 417);
		panel.add(texthold);

		JPanel Show1 = new JPanel();
		tabbedPane.addTab("Show1", null, Show1, null);
		Show1.setLayout(null);

		JLabel S1Name = new JLabel(show1.getName());
		S1Name.setHorizontalAlignment(SwingConstants.CENTER);
		S1Name.setFont(new Font("Tahoma", Font.BOLD, 37));
		S1Name.setBounds(0, 40, 790, 100);
		Show1.add(S1Name);

		JLabel lblNewLabel_2 = new JLabel("Wait time:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(20, 175, 245, 100);
		Show1.add(lblNewLabel_2);

		JLabel lblCurrentStep = new JLabel("Current Step:");
		lblCurrentStep.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCurrentStep.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblCurrentStep.setBounds(468, 175, 164, 100);
		Show1.add(lblCurrentStep);

		JLabel lblOfSteps = new JLabel("# of steps:");
		lblOfSteps.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOfSteps.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblOfSteps.setBounds(488, 275, 144, 100);
		Show1.add(lblOfSteps);

		JLabel lblStartOfWait = new JLabel("Start of wait Time:");
		lblStartOfWait.setHorizontalAlignment(SwingConstants.RIGHT);
		lblStartOfWait.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblStartOfWait.setBounds(20, 275, 245, 100);
		Show1.add(lblStartOfWait);

		JLabel S1WT = new JLabel(Double.toString(show1.getWaitTime()));
		S1WT.setHorizontalAlignment(SwingConstants.CENTER);
		S1WT.setFont(new Font("Tahoma", Font.PLAIN, 24));
		S1WT.setBounds(275, 175, 183, 100);
		Show1.add(S1WT);

		date2=show1.getDate();

		JLabel S1ST = new JLabel(date2.toString());
		S1ST.setHorizontalAlignment(SwingConstants.CENTER);
		S1ST.setFont(new Font("Tahoma", Font.PLAIN, 12));
		S1ST.setBounds(275, 275, 183, 100);
		Show1.add(S1ST);

		JLabel S1CS = new JLabel(String.valueOf(show1.getProcess()));
		S1CS.setHorizontalAlignment(SwingConstants.CENTER);
		S1CS.setFont(new Font("Tahoma", Font.PLAIN, 24));
		S1CS.setBounds(642, 175, 148, 100);
		Show1.add(S1CS);

		JLabel S1MS = new JLabel(String.valueOf(show1.getMaxProcess()));
		S1MS.setHorizontalAlignment(SwingConstants.CENTER);
		S1MS.setFont(new Font("Tahoma", Font.PLAIN, 24));
		S1MS.setBounds(642, 275, 148, 100);
		Show1.add(S1MS);

		JPanel Show2 = new JPanel();
		tabbedPane.addTab("Show2", null, Show2, null);
		Show2.setLayout(null);

		JLabel S2Name = new JLabel(show2.getName());
		S2Name.setHorizontalAlignment(SwingConstants.CENTER);
		S2Name.setFont(new Font("Tahoma", Font.BOLD, 37));
		S2Name.setBounds(0, 55, 790, 100);
		Show2.add(S2Name);

		JLabel label_18 = new JLabel("Wait time:");
		label_18.setHorizontalAlignment(SwingConstants.RIGHT);
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_18.setBounds(20, 190, 245, 100);
		Show2.add(label_18);

		JLabel label_19 = new JLabel("Current Step:");
		label_19.setHorizontalAlignment(SwingConstants.RIGHT);
		label_19.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_19.setBounds(468, 190, 164, 100);
		Show2.add(label_19);

		JLabel label_20 = new JLabel("# of steps:");
		label_20.setHorizontalAlignment(SwingConstants.RIGHT);
		label_20.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_20.setBounds(488, 290, 144, 100);
		Show2.add(label_20);

		JLabel label_21 = new JLabel("Start of wait Time:");
		label_21.setHorizontalAlignment(SwingConstants.RIGHT);
		label_21.setFont(new Font("Tahoma", Font.PLAIN, 24));
		label_21.setBounds(20, 290, 245, 100);
		Show2.add(label_21);

		JLabel S2WT = new JLabel(String.valueOf(show2.getWaitTime()));
		S2WT.setHorizontalAlignment(SwingConstants.CENTER);
		S2WT.setFont(new Font("Tahoma", Font.PLAIN, 24));
		S2WT.setBounds(275, 190, 183, 100);
		Show2.add(S2WT);

		date2=show2.getDate();

		JLabel S2ST = new JLabel(date2.toString());
		S2ST.setHorizontalAlignment(SwingConstants.CENTER);
		S2ST.setFont(new Font("Tahoma", Font.PLAIN, 12));
		S2ST.setBounds(275, 290, 183, 100);
		Show2.add(S2ST);

		JLabel S2CS = new JLabel(String.valueOf(show2.getProcess()));
		S2CS.setHorizontalAlignment(SwingConstants.CENTER);
		S2CS.setFont(new Font("Tahoma", Font.PLAIN, 24));
		S2CS.setBounds(642, 190, 148, 100);
		Show2.add(S2CS);

		JLabel S2MS = new JLabel(String.valueOf(show2.getMaxProcess()));
		S2MS.setHorizontalAlignment(SwingConstants.CENTER);
		S2MS.setFont(new Font("Tahoma", Font.PLAIN, 24));
		S2MS.setBounds(642, 290, 148, 100);
		Show2.add(S2MS);

		JPanel Controler = new JPanel();
		tabbedPane.addTab("Controler", null, Controler, null);
		Controler.setLayout(null);

		JButton btnNewButton_1 = new JButton("Show1 Next Custmer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pww = new String(pw.getPassword());
				if(pww.equals(password))
				{
				WH-=(WH-show1.getWaitTime());

				show1=queue.dequeue();
				date2=show1.getDate();
				S1Name.setText(show1.getName());
				S1CS.setText(String.valueOf(show1.getProcess()));
				S1WT.setText(Double.toString(show1.getWaitTime()));
				S1MS.setText(String.valueOf(show1.getMaxProcess()));
				S1ST.setText(date2.toString());
				RefreshT();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton_1.setBounds(10, 11, 350, 250);
		Controler.add(btnNewButton_1);

		JButton btnShowNextCustmer = new JButton("Show2 Next Custmer");
		btnShowNextCustmer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pww = new String(pw.getPassword());
				if(pww.equals(password))
				{
				
				WH-=(WH-show2.getWaitTime());

				show2=queue.dequeue();
				date2=show1.getDate();
				S2Name.setText(show2.getName());
				S2CS.setText(String.valueOf(show1.getProcess()));
				S2WT.setText(Double.toString(show1.getWaitTime()));
				S2MS.setText(String.valueOf(show1.getMaxProcess()));
				S2ST.setText(date2.toString());
				RefreshT();
				}
			}
		});
		btnShowNextCustmer.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnShowNextCustmer.setBounds(370, 11, 350, 250);
		Controler.add(btnShowNextCustmer);

		JButton btnShowNextProcess = new JButton("Show1 Next Process");
		btnShowNextProcess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pww = new String(pw.getPassword());
				if(pww.equals(password))
				{
				show1.nextProcess();
				S1CS.setText(String.valueOf(show1.getProcess()));
				}
			}
		});
		btnShowNextProcess.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnShowNextProcess.setBounds(10, 272, 350, 250);
		Controler.add(btnShowNextProcess);

		JButton btnShowNextProcess_1 = new JButton("Show2 Next Process");
		btnShowNextProcess_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pww = new String(pw.getPassword());
				if(pww.equals(password))
				{
				show2.nextProcess();
				S2CS.setText(String.valueOf(show1.getProcess()));
				}
			}
		});
		btnShowNextProcess_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnShowNextProcess_1.setBounds(370, 272, 350, 250);
		Controler.add(btnShowNextProcess_1);

		JButton btnNewButton_2 = new JButton("Update processes on add page");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pww = new String(pw.getPassword());
				if(pww.equals(password))
				{

				//set up add fields

				//names
				N1LB.setText(NP1);
				N2LB.setText(NP2);
				N3LB.setText(NP3);
				N4LB.setText(NP4);

				//TIMES
				N1T.setText(String.valueOf(TP1));
				N2T.setText(String.valueOf(TP2));
				N3T.setText(String.valueOf(TP3));
				N4T.setText(String.valueOf(TP4));

				//Steps
				N1S.setText(String.valueOf(PP1));
				N2S.setText(String.valueOf(PP2));
				N3S.setText(String.valueOf(PP3));
				N4S.setText(String.valueOf(PP4));
				}

			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_2.setBounds(10, 533, 710, 155);
		Controler.add(btnNewButton_2);

		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(10, 699, 350, 62);
		Controler.add(lblNewLabel_1);
		
		pw = new JPasswordField();
		pw.setBounds(370, 699, 350, 62);
		Controler.add(pw);

	}
}

