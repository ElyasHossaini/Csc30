package SkillBuilding;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class SemesterAvg {

	private JFrame frame;
	private JTextField Grade1;
	private JTextField Grade2;
	private JTextField Grade3;
	private JTextField out;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
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
	public SemesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Label1 = new JLabel("Enter The First Grade");
		Label1.setBounds(10, 35, 145, 14);
		frame.getContentPane().add(Label1);
		
		JLabel lblEnterTheSecond = new JLabel("Enter The Second Grade");
		lblEnterTheSecond.setBounds(10, 103, 145, 14);
		frame.getContentPane().add(lblEnterTheSecond);
		
		JLabel lblEnterTheThird = new JLabel("Enter The Third Grade");
		lblEnterTheThird.setBounds(10, 175, 145, 14);
		frame.getContentPane().add(lblEnterTheThird);
		
		Grade1 = new JTextField();
		Grade1.setBounds(175, 23, 120, 39);
		frame.getContentPane().add(Grade1);
		Grade1.setColumns(10);
		
		Grade2 = new JTextField();
		Grade2.setColumns(10);
		Grade2.setBounds(175, 91, 120, 39);
		frame.getContentPane().add(Grade2);
		
		Grade3 = new JTextField();
		Grade3.setColumns(10);
		Grade3.setBounds(175, 160, 120, 39);
		frame.getContentPane().add(Grade3);
		
		out = new JTextField();
		out.setFont(new Font("Tahoma", Font.PLAIN, 9));
		out.setBounds(175, 220, 120, 30);
		frame.getContentPane().add(out);
		out.setColumns(10);
		
		JButton Average = new JButton("Calculate Average");
		Average.setFont(new Font("Tahoma", Font.PLAIN, 9));
		Average.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DecimalFormat dc = new DecimalFormat("0.00");
				
				String x = Grade1.getText();
				String y = Grade2.getText();
				String z = Grade3.getText();
				int a = Integer.parseInt(x);
				int b = Integer.parseInt(y);
				int c = Integer.parseInt(z);
				int sum = (a + b + c);
				
				double Avg  = (double) sum/3;
				
				
				out.setText
				(
						"Your average is " + dc.format(Avg) + "%"
				);
				
			}
		});
		Average.setBounds(10, 210, 120, 40);
		frame.getContentPane().add(Average);
		
		
	}
}
