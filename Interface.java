import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Interface extends JFrame implements ActionListener{

	private JButton button1;
	private JTextField text;
	private int number_clicks;			
	public Interface(){
		button1 = new JButton("Hi, click me");
		button1.addActionListener(this);
		text = new JTextField();
		this.getContentPane().add(button1,BorderLayout.NORTH);
		this.getContentPane().add(text,BorderLayout.SOUTH);
	}

	

	public static void main(String[]arg) throws Exception{
	InputStreamReader isr = new  InputStreamReader (System.in);
    	BufferedReader br = new BufferedReader(isr);
	System.out.println("Hello, write your name");
	String name=br.readLine();
	Interface window = new Interface();
	window.setBounds(200,400,200,200);
	window.pack();
	window.setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		number_clicks++;
		text.setText(number_clicks+"");	
	}


}

