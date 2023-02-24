package Mastery;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.Box;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MetricConversion {

	private JFrame frame;
	private JLabel formula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
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
		
		JLabel lblNewLabel = new JLabel("Select a Conversion type:");
		lblNewLabel.setBounds(28, 33, 155, 28);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox Box = new JComboBox();
		Box.setModel(new DefaultComboBoxModel(new String[] {"inches to centimeters", "feet to meters", "gallon to liters", "pound to kilogram"}));
		Box.setBounds(28, 60, 155, 22);
		frame.getContentPane().add(Box);
		
		formula = new JLabel("1 inch = 2.54 centimeters");
		formula.setBounds(28, 116, 180, 52);
		frame.getContentPane().add(formula);
		Box.addActionListener(new ActionListener() {
		
	public void actionPerformed(ActionEvent event) {
        JComboBox Box = (JComboBox)event.getSource();
		String B = (String)Box.getSelectedItem();
	    String Con = "";
		
		if (B.equals("inches to centimeters"))
		{
			Con = "1 inch = 2.54 centimeters";
		}
		else if (B.equals("feet to meters"))
		{
			Con = "1 foot = 0.3048 meters";
		}
		else if (B.equals("gallon to liters"))
		{
			Con = "1 gallon = 4.5461 liters";
		}
		else if (B.equals("pound to kilogram"))
		{
			Con = "1 pound = 0.4536 kilograms";
		}
	
	
	  formula.setText(Con);
	
	
        }
	});
	
}
}