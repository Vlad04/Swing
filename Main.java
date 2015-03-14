import java.awt.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args){
		
		POOStudent jesus = new POOStudent("Jesus", 25, 150);
		jesus.procastinate();
		jesus.wakeUp();
		
		// GUI - Graphical User Interface
		// (Gooey)
		JButton button = new JButton("excellent button");
		JTextField text = new JTextField();
		
		JFrame frame = new JFrame("hey");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane = frame.getContentPane();
		
		pane.add(button, BorderLayout.SOUTH);
		pane.add(text, BorderLayout.NORTH);
		
		frame.pack();
		frame.setVisible(true);
	}
}
