import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseListenerMouseEvent {

	public static void main(String[] args) {
		ABC abc = new ABC();
	}

}
class ABC extends JFrame{
	ABC(){
		
		addMouseListener(new MouseAdapter(){
			 public void mousePressed(MouseEvent e) {
				 int x = e.getX();
				 int y = e.getY();
				 System.out.println(x+ " , "+y);
			 }
		});//Instead of implementing MouseListener we use MouseAdapter(Overriden Methods)
		
		
		
		setLayout(new FlowLayout());
		 setVisible(true);
	     setSize(500,500);// Units in pixel
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}