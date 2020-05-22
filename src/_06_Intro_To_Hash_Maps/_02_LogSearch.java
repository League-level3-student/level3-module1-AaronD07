package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton button;
	JButton button2;
	JButton button3;
	HashMap<Integer, String> keys = new HashMap<Integer, String>();

	public void setup() {
		frame= new JFrame();
		frame.setVisible(true);
		button = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		panel= new JPanel();
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		frame.add(panel);
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}
	
	public void one() {
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (button==e.getSource()) {
			String x = JOptionPane.showInputDialog("Enter an ID number!");
			String y = JOptionPane.showInputDialog("Enter a name!");
			int z = Integer.parseInt(x); {
			keys.put(z, y);
		}
			if (button2==e.getSource()) {
				String hi = JOptionPane.showInputDialog("Enter an ID number!");
				for(int i=0; i<keys.size();i++) {
					if (hi==keys.get(i)) {
						JOptionPane.showMessageDialog(null, keys.get(i));
					}
					else {
						JOptionPane.showMessageDialog(null, "That entry doesn't exist");
					}
				}
			}
		}}}
	

	 /*
	  * * Crate a HashMap of Integers for the keys and 
	 * Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	

