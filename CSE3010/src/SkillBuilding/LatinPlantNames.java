package SkillBuilding;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class LatinPlantNames extends JFrame implements ActionListener {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LatinPlantNames();
            }
        });
    }

    private JComboBox<String> colourSelector;
    private String colours[] = {"Basil", "Sage", "Lavender", "Pepperment", "Saffron","Parsley"};
    private JPanel panel;
    private JLabel latinName;

    LatinPlantNames() {

        super("My First Frame");

        //Create a JPanel and content frame
        Container contentPane = getContentPane();
        panel = new JPanel();

        //Create a JCombo Box
        colourSelector = new JComboBox(colours);
        colourSelector.addActionListener(this);
        
        latinName = new JLabel("");
        
        JLabel lblNewLabel = new JLabel("Enter plant name:");
        GroupLayout groupLayout = new GroupLayout(getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(434, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(444, Short.MAX_VALUE))
        );
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
        				.addComponent(latinName, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
        				.addGroup(gl_panel.createSequentialGroup()
        					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(colourSelector, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(80, Short.MAX_VALUE))
        );
        gl_panel.setVerticalGroup(
        	gl_panel.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_panel.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel)
        				.addComponent(colourSelector, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(latinName, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        			.addContainerGap())
        );
        panel.setLayout(gl_panel);
        getContentPane().setLayout(groupLayout);

        //Set window parameters
        setTitle("Lab4");
        setSize(332, 232);
        setVisible(true);

    }//End Constructor

    //Action Listener - An action listener that changes the colour of our JPanel to the
    //colour selected by the user.
    public void actionPerformed(ActionEvent e) {

//        private String colours[] = {"Red", "Yellow", "Green", "Blue", "Orange"};

        String selectedItem = (String)colourSelector.getSelectedItem();
        switch (selectedItem) {
            case "Basil": 
            	latinName.setText("Ocimum");

                break;
            case "Sage": 
            	 latinName.setText("Salvia");
                break;
            case "Pepperment": 
            	latinName.setText("Mentha piperita");
                break;
            case "Saffron": 
            	 latinName.setText("Crocus");
                break;
            case "Lavender": 
            	 latinName.setText("Lavandula spica");
                break;
            case "Parsley": 
           	 latinName.setText("Apium");
               break;
       
        }
    }
}//End Class

 
