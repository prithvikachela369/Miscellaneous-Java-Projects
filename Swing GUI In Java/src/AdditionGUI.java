import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdditionGUI {

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
		 
         b.addActionListener(this);//ActionListner is an Interface	
        //the actionListener method will ask us for the object of ActionListener so we have to implement the Interface
        //We have used this keyword here because it is an anonymous object
		 
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

