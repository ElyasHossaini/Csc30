package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class PhotoAlbum {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhotoAlbum window = new PhotoAlbum();
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
	public PhotoAlbum() {
		initialize();
		
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon Brook = new ImageIcon("..\\CSE3010\\src\\images\\brook.png");
		ImageIcon Nami = new ImageIcon("..\\CSE3010\\src\\images\\nami.jpg");
		ImageIcon Luffy = new ImageIcon("..\\CSE3010\\src\\images\\luffy.png");
		ImageIcon Jimbei = new ImageIcon("..\\CSE3010\\src\\images\\jinbei.png");
		ImageIcon Usopp = new ImageIcon("..\\CSE3010\\src\\images\\usopp.jpg");
		ImageIcon Robin = new ImageIcon("..\\CSE3010\\src\\images\\robin.jpg");
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Straw Hat Pirates Wanted Poster Photo Album");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 11, 350, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel Photo = new JLabel("");
		Photo.setIcon(new ImageIcon(PhotoAlbum.class.getResource("/images/luffy.png")));
		Photo.setBounds(67, 65, 160, 165);
		frame.getContentPane().add(Photo);
		JButton Next = new JButton("Next");
		Next.setBackground(Color.WHITE);
		
		JLabel NameL = new JLabel("Captain: Straw Hat Luffy");
		NameL.setBounds(237, 65, 187, 37);
		frame.getContentPane().add(NameL);
		
		Next.addActionListener(new ActionListener() {
			int Next = 0;
			public void actionPerformed(ActionEvent e) {
				
				
				Next++;
				if(Next == 1)
				{
					Photo.setIcon(Robin);
					NameL.setText("Archeologist: Nico Robin");
				}
				else if(Next == 2)
				{
					Photo.setIcon(Usopp);
					NameL.setText("Sniper: God Usopp");
				}
				else if(Next == 3)
				{
					Photo.setIcon(Jimbei);
					NameL.setText("Helmsman: Jinbei");
				}
				else if(Next == 4)
				{
					Photo.setIcon(Brook);
					NameL.setText("Musician: Brook");
				}
				else if(Next == 5)
				{
					Photo.setIcon(Nami);
					NameL.setText("Navigator: Nami");
				}
				else if(Next > 5)
				{
					Photo.setIcon(Luffy);
					NameL.setText("Captain: Straw Hat Luffy");
					Next = 0;
				}
			
				
			}
		});
		Next.setBounds(310, 134, 89, 23);
		frame.getContentPane().add(Next);
		
		
		
	}
}
