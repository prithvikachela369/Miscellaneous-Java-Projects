import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CallingJFramefromAnotherJFrame {

	public static void main(String[] args) {
		Add a = new Add();
	}

}
class Add extends JFrame implements ActionListener{
	
	 JTextField t,t1;
	 JButton b;
	 JLabel l;
	
	 public Add() {
		 t = new JTextField(10);
		 t1 = new JTextField(10);
		 b = new JButton("OK");
		 l = new JLabel("Result");
		 
		
		 add(t);
		 add(t1);
		 add(b);
		 add(l);
		 
         b.addActionListener(this);
		 setLayout(new FlowLayout());
		 setVisible(true);
	     setSize(500,500);// Units in pixel
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		int num1 = Integer.parseInt(t.getText());
		int num2 = Integer.parseInt(t1.getText());
		
		int sum = num1 + num2;
		
		l.setText(sum+"");
	}

}
