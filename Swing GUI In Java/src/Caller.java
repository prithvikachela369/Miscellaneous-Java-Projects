import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.Timer;

public class Caller {
	
	/*
	 Here we have declared the object of progress bar which ticks 20 times and each tick takes 1 second to complete which is defined 
	 in timer object and in button we are starting the timer and in actionperformed method we have said if i == 20 then only call the another
	 frame and as the code executes its value increments and finally when progress bar finishes means reaches 20 tickes it calls the 
	 Another JFrame
	 */

	public static void main(String[] args) {
		pqr p = new pqr();
	}

}
class pqr extends JFrame implements ActionListener{
	int i ;
	JProgressBar jp;
	public pqr() {
		
		JButton jb = new JButton("Add Form");
		 jp = new JProgressBar(0,20);
		
		Timer t = new Timer(1000,this);
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				t.start();
			}
			
		});
		
		add(jb);
		add (jp);
		 setLayout(new FlowLayout());
		 setVisible(true);
	     setSize(500,500);
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(i == 20) {
			new Add();
			dispose();//it will dispose the add form JFrame
		}
		i++;
		jp.setValue(i);
	}
}
