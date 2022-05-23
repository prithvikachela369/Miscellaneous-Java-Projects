
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AdditionGUIbyAnonymous {
	public static void main(String[] args) {
		Add a1 = new Add();
	}

} 
class Add extends JFrame{
	
	 JTextField t2,t3;
	 JButton b1;
	 JLabel l1;
	
	 public Add() {
		 t2 = new JTextField(10);
		 t3 = new JTextField(10);
		 b1 = new JButton("OK");
		 l1 = new JLabel("Result");
		 
		
		 add(t2);
		 add(t3);
		 add(b1);
		 add(l1);
		 
		 ActionListener al2 = new ActionListener() {
			
			 public void actionPerformed(ActionEvent e) {
					int num1 = Integer.parseInt(t2.getText());
					int num2 = Integer.parseInt(t3.getText());
					
					int sum1 = num1 + num2;
					
					l1.setText(sum1+"");
				}
		 };
		 
         b1.addActionListener(al2);//ActionListner is an Interface	
         
		 
		 setLayout(new FlowLayout());
		 setVisible(true);
	     setSize(500,500);// Units in pixel
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }

	

}
