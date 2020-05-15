package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		Stack<String> words = new Stack<String>();
		frame.add(label);
		frame.setVisible(true);
		int lives=3;
	
	String x= JOptionPane.showInputDialog("enter a number");
	int y = Integer.parseInt(x); {
	
	for(int i=0; i<y; i++) {
		words.push(Utilities.readRandomLineFromFile("dictionary.txt"));
		
	}
	String x1 =words.get(words.size()-1);

	words.pop();
	
	label.setText("______________________________");
	String hi = JOptionPane.showInputDialog("Enter a letter");
	for(int i=3; lives>0;i++ )
	if (hi.equals(x1.charAt(0))) {
		System.out.println("Correct");
		char q = x1.charAt(0);
	
		label.setText(x1.charAt(0) + "" + "_____________________________");
	}
	else {
		System.out.println("INCORREcT");
		lives=lives-1;
	}
	
	}
	
}
}
