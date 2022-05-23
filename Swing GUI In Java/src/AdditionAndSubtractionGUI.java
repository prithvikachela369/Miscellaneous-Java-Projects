import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AdditionAndSubtractionGUI {
	public static void main(String[] args) {
		AddSub a1 = new AddSub();
	}

} 
class AddSub extends JFrame{
	
	 JTextField t2,t3;
	 JButton b1,b2;
	 JLabel l1;
	
	 public AddSub() {
		 t2 = new JTextField(10);
		 t3 = new JTextField(10);
		 b1 = new JButton("Add");
		 b2 = new JButton("Sub");
		 l1 = new JLabel("Result");
		 
		
		 add(t2);
		 add(t3);
		 add(b1);
		 add(b2);
		 add(l1);
		 
		 ActionListener al2 = new ActionListener() {
			
			 public void actionPerformed(ActionEvent e) {
					int num1 = Integer.parseInt(t2.getText());
					int num2 = Integer.parseInt(t3.getText());
					int value = 0;
					
					if(e.getSource() == b1) {
						value = num1 + num2;
					}else {
						value = num1 - num2;
					}
					
					l1.setText(value+"");
				}
		 };
		 
		// ActionListener al3 = new ActionListener() {
			
			// public void actionPerformed(ActionEvent e) {
					//int num1 = Integer.parseInt(t2.getText());
					//int num2 = Integer.parseInt(t3.getText());
					
					//int diff1 = num1 - num2;
					
					//l1.setText(diff1+"");
				//}
		 //};
         b1.addActionListener(al2);//ActionListner is an Interface	
         b2.addActionListener(al2);
		 
		 setLayout(new FlowLayout());
		 setVisible(true);
	     setSize(500,500);// Units in pixel
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }

}
