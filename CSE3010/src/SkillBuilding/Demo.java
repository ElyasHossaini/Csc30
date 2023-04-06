package SkillBuilding;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

 public class Demo {

	private JFrame frame;
	private JTextField Name1;
	private JTextField Name2;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo window = new Demo();
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
	public Demo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon chhs = new ImageIcon("../CSE3010/src/images/crescnet.png");
		ImageIcon pearson = new ImageIcon("../CSE3010/src/images/Lester_B._Pearson_High_School_5.jpg");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 682, 434);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 352, 637, 32);
		frame.getContentPane().add(panel);
		
		Name1 = new JTextField();
		Name1.setBounds(68, 51, 100, 40);
		Name1.setColumns(10);
		frame.getContentPane().add(Name1);
		
		Name2 = new JTextField();
		Name2.setColumns(10);
		Name2.setBounds(251, 51, 100, 40);
		frame.getContentPane().add(Name2);
		
		JLabel First = new JLabel("First Name");
		First.setBounds(12, 64, 62, 14);
		frame.getContentPane().add(First);
		
		JLabel Last = new JLabel("Last Name");
		Last.setBounds(195, 64, 62, 14);
		frame.getContentPane().add(Last);
		
		JComboBox FNL = new JComboBox();
		FNL.setFont(new Font("Tahoma", Font.PLAIN, 15));
		FNL.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		FNL.setBounds(68, 127, 100, 22);
		frame.getContentPane().add(FNL);
		
		JLabel lblNewLabel_2 = new JLabel("Grade");
		lblNewLabel_2.setBounds(12, 131, 62, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox LN = new JComboBox();
		LN.setFont(new Font("Tahoma", Font.PLAIN, 15));
		LN.setModel(new DefaultComboBoxModel(new String[] {"Crescent", "Pearson", "Nelson"}));
		LN.setBounds(251, 127, 100, 22);
		frame.getContentPane().add(LN);
		
		JLabel lblNewLabel_2_1 = new JLabel("School");
		lblNewLabel_2_1.setBounds(195, 131, 62, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JTextArea text = new JTextArea();
		text.setForeground(Color.PINK);
		text.setBounds(12, 179, 412, 90);
		frame.getContentPane().add(text);
		
		JLabel Icon = new JLabel("");
		Icon.setIcon(null);
		Icon.setBounds(434, 21, 213, 182);
		frame.getContentPane().add(Icon);
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String grade = "";
				String school = "";
				String F = Name1.getText();
				String L = Name2.getText();
				
				if(FNL.getSelectedItem().equals("10"))
					{
					     grade = "10";
					}
				else if(FNL.getSelectedItem().equals("11"))
				{
					 grade = "11";
				}
				else if(FNL.getSelectedItem().equals("12"))
				{
					grade = "12";
				}
				
				
				if(LN.getSelectedItem().equals("Crescent"))
				{
					school = "Crescent";
					Icon.setIcon(chhs);
				}
				else if(LN.getSelectedItem().equals("Pearson"))
				{
					school = "Pearson";
					Icon.setIcon(pearson);
				}
				
				text.setText
				(F + " " + L	+ " is in grade: " + grade + " and goes to " + school + " high school");
				
				
			}
		});
		submit.setBounds(278, 294, 89, 23);
		frame.getContentPane().add(submit);
	}
}
