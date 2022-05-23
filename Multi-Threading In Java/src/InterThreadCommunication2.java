import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

class seller extends Thread{
	LinkedList RaspberryPi;
	
	seller(LinkedList RaspberryPi){
		this.RaspberryPi = RaspberryPi;
	}
	public void run() {
	synchronized(RaspberryPi) {
		while(!RaspberryPi.isEmpty()) {
			try {
			
			RaspberryPi.wait();
		}catch(InterruptedException ie) {
			System.out.println("An Exception In Producer");
		}
			
			RaspberryPi.add(RaspberryPi);
			
			RaspberryPi.notify();
		}
	
	}
	}
}
class buyer extends Thread{
	LinkedList RaspberryPi;
	String name;
	buyer(LinkedList RaspberryPi){
		
		this.RaspberryPi = RaspberryPi;
	}
	public void run() {
		
	synchronized(RaspberryPi) {
		while(RaspberryPi.isEmpty()) {
			try {
				System.out.println("RaspberryPi 4 GB Ram, Mini HDMI port, Charger(Type C), RaspberryPi Screen, SD card ");
				System.err.println("OOP's out of Stock :(");
				System.out.println("You will be notified when product is in Stock again :)");
				
				Thread.currentThread().sleep(10000);
				
				String out;
				
				Object err = "Notification";
				out = String.format("%s ", err);
				
				JOptionPane.showMessageDialog(null, "RaspberryPi-3 is now Available in Stock",out,1);
				
				 System.out.println("Click on Buy now to Buy the product");
				
				//System.exit(0);
				
				
				
				
				
				RaspberryPi.wait();
				
				 }catch(InterruptedException ie2) {
				System.out.println("An Exception In Consumer");
			}
			
		}
		
	
		
		RaspberryPi.remove(RaspberryPi);
		
	
		
		RaspberryPi.notify();
		
	}
	}

}

public class InterThreadCommunication2 {

	public static void main(String[] args) {
		LinkedList RaspberryPi = new LinkedList();
		
	    seller s = new seller(RaspberryPi);
        buyer b = new buyer(RaspberryPi);
        b.setName("RaspberryPi-3");
        s.start();
        b.start();
       
        Scanner s1 = new Scanner(System.in);
		String b1 = s1.next();
		if(b1.equals("BuyNow")) {
			System.out.println("Payment Done :)");
			System.out.println("Thank You For Using Our Service");
			int price = 3500;
			System.out.println("Order Summary:- ");
			System.out.println("\t"+b.getName());
			System.out.println("\tTotal Price(Including GST)-: "+price);
		}
	
}
}
