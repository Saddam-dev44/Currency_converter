package Converter;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GFG {
	//FUNCTION TO CONVERT RUPEE TO DOLLER AND ALSO
	//DOLLER TO RUPPEE USING JAVA SWING
	public static void converter() {
		
//		CREATE A FRAME FOR CURRENCY CONVERTER
		JFrame frame = new JFrame("CURRENCY CONVERTER");
//		create two label for Indian RUPEE AO=ND DOLLER
		JLabel l1,l2;
//		create textfield for Indian rupee and dollar value initially both 0
		JTextField t1,t2;
//		three buttons one for indian rupee,dollor and for close
		JButton b1,b2,b3;
//		naming the labels l1 and setting the bounds
		
		 l1 = new JLabel("INDIAN RUPEE");
		l1.setBounds(20, 40, 150, 30);
		
		System.out.println("label one done");
		frame.add(l1);
		
//		naming the labels l1 and setting the bounds
		l2= new JLabel("DOLLER");
		l2.setBounds(170, 40, 150, 30);
	
		System.out.println("label two also done");
		frame.add(l2);
		
//		initializing the textfield by default zero and setting
//		the bounds for that textfields.
		
		t1= new JTextField("0");
		t1.setBounds(40,70,50,20);
		frame.add(t1);
		
		 t2 = new JTextField("0");
		t2.setBounds(170, 70, 50, 20);
		frame.add(t2);
		
//		t2= new JTextField("0");
//		t2.setBounds(150,70,50,20);
		
//		initializing buttons for indian ,amrican and also close the project
		b1=new JButton("INR");
		b1.setBounds(30, 100, 60, 15);
		frame.add(b1);
		
		b2= new JButton("DOLLER");
		b2.setBounds(150, 100, 100, 15);
		frame.add(b2);
		
		b3= new JButton("CLOSE");
		b3.setBounds(80, 140, 80, 20);
		frame.add(b3);
//		
//		frame.add(t2);
//		frame.add(t1);
//		frame.add(l2);
//		frame.add(l);
//		frame.add(b3);
//		frame.add(b2);
//		frame.add(b1);
	
		
	
		frame.setSize(400, 300);
		frame.setVisible(true);
	
		frame.setLayout(null);
//		frame.repaint();
		
	}


}

