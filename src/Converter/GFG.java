package Converter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

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

		
//		naming the labels l1 and setting the bounds
		l2= new JLabel("DOLLER");
		l2.setBounds(170, 40, 150, 30);
	
		System.out.println("label two also done");

		
//		initializing the textfield by default zero and setting
//		the bounds for that textfields.
		
		t1= new JTextField("0");
		t1.setBounds(40,70,50,20);

//		
		 t2 = new JTextField("0");
		t2.setBounds(170, 70, 50, 20);


		
//		initializing buttons for indian ,amrican and also close the project
		b1=new JButton("INR");
		b1.setBounds(30, 100, 60, 15);

		
		b2= new JButton("DOLLER");
		b2.setBounds(150, 100, 100, 15);

		
		b3= new JButton("CLOSE");
		b3.setBounds(80, 140, 80, 20);

		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			double d = Double.parseDouble(t1.getText());
			
			double d2 = d/65.25;
			
			String str1= String.valueOf(d2);
			t2.setText(str1);
			System.out.println("button one working fine");
				
			}
		}); 
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			double d3 =Double.parseDouble(t2.getText());
			
			double d4= d3*65.25;
			
			String str2 = String.valueOf(d4);
			t1.setText(str2);
			System.out.println("button two working fine");
				
			}
		});	
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("button three working fine");
			frame.dispose();
				
			}
		});
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.out.println("window shotdone");
				System.exit(0);
			}
		});
		frame.add(l1);
		frame.add(l2);
		frame.add(t1);
		frame.add(t2);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
	
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.repaint();
		
	}


}

