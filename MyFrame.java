import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

	private JButton button1;
	private JTextField text1;
	private JCheckBox check1;
	
	public MyFrame(String name){
		
		super(name);
		setSize(640, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		button1 = new JButton("Boton");
		text1 = new JTextField();
		check1 = new JCheckBox("checkbox");
		
		Container c = getContentPane();
		GridLayout gl = new GridLayout(2,2);
		c.setLayout(gl);
		
		c.add(button1);
		c.add(text1);
		c.add(check1);
		
		button1.addActionListener(this);
		text1.addActionListener(this);
		check1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String command = e.getActionCommand();
		
		if(command.equals(button1.getText())){
			
			
			if(check1.isSelected()){
				System.out.println("Presiono el boton 1, check selected");
				System.out.println(text1.getText());
			} else {
				
				System.out.println("Presiono el boton 1, check not selected");
			}
		} else if(command.equals(check1.getText())){
			
			System.out.println("Presiono checkbox 1");
		}
		
	}
}
