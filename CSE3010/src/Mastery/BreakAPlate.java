package Mastery;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon PlaceHolder = new ImageIcon("../CSE3010/src/images/placeholder.jpg");
		ImageIcon AllBroken = new ImageIcon("../CSE3010/src/images/plates_all_broken.jpg");
		ImageIcon TwoBroken = new ImageIcon("../CSE3010/src/images/plates_two_broken.jpg");
		ImageIcon FixPlates = new ImageIcon("../CSE3010/src/images/plates.jpg");
		ImageIcon Stickers = new ImageIcon("../CSE3010/src/images/sticker.jpg");
		ImageIcon Tiger = new ImageIcon("../CSE3010/src/images/tiger_plush.jpg");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Plate = new JLabel("");
		Plate.setIcon(new ImageIcon(BreakAPlate.class.getResource("/images/plates.jpg")));
		Plate.setBounds(82, 31, 276, 83);
		frame.getContentPane().add(Plate);
		
		JLabel Win = new JLabel("");
		Win.setBounds(165, 159, 120, 14);
		frame.getContentPane().add(Win);
		
		JLabel WinImage = new JLabel("");
		WinImage.setIcon(new ImageIcon(BreakAPlate.class.getResource("/images/placeholder.jpg")));
		WinImage.setBounds(175, 184, 103, 66);
		frame.getContentPane().add(WinImage);
		
		JButton Play = new JButton("Play");
		Play.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double number1 = Math.random() * 2;
				
				
				if(Math.round(number1) % 2.0 == 0)
				{
					Plate.setIcon(AllBroken);
					WinImage.setIcon(Tiger);
					Win.setText("You Win a Tiger!");
					Play.setText("Play Again?");
				}
				else
				{
					Plate.setIcon(TwoBroken);
					WinImage.setIcon(Stickers);
					Win.setText("You Win a Sticker!");
					Play.setText("Play Again?");
				}
				
				
			
	
			
			}
		});
		Play.setBounds(165, 124, 120, 35);
		frame.getContentPane().add(Play);
		
		
	}
}
