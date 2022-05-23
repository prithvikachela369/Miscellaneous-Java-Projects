import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonAndCheckBox {

	public static void main(String[] args) {
		demo d = new demo();
	}

}
class demo extends JFrame{
	JTextField jt;
	JLabel jl;
	JButton jb;
	JRadioButton jr,jr2;
	JCheckBox jc,jc2;
	
	public demo() {
		jt = new JTextField(15);
		jb = new JButton("OK");
		jr = new JRadioButton("Male");
		jr2 = new JRadioButton("Female");
		jc = new JCheckBox("Coding");
		jc2 = new JCheckBox("Gaming");
		jl = new JLabel("Greeting");
		
		jb.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = jt.getText();
				
				if(jr.isSelected()) {
					name = "Mr. "+name; 
				}else {
					name = "Ms. "+name;
				}
				if(jc.isSelected()) {
					name =name+ " Coder";
				}  if(jc2.isSelected()) {
					name = name+ " Gamer";
				}
				jl.setText(name);
			}
			
		});
		
		jc.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Coder");
			}
			
		});
		
		jc2.addItemListener(new ItemListener(){

			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("Gamer");
			}
			
		});
		
	
		add(jt);
		add(jb);
		add(jr);
		add(jr2);
		add(jc);
		add(jc2);
		add(jl);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jr);
		bg.add(jr2);
	
		
		 setLayout(new FlowLayout());
		 setVisible(true);
	     setSize(500,500);// Units in pixel
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}