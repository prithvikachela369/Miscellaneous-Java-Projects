import java.util.LinkedList;

class producer extends Thread{
	LinkedList co;
	producer(LinkedList co){
		this.co = co;
	}
	public  void run() {
		for(int i = 1; i < 6; i++) {
			synchronized(co) {
				while(!co.isEmpty()) {
					try {
						System.out.println("In the wait mode in producer as the sharedResource is not Empty");
						co.wait();
					}catch(InterruptedException a) {
						System.out.println("Caught Exception in Producer");
					}
				}
				System.out.println("In Producer Adding "+i+" and "+(i+1));
				co.add(i);
			    co.add(i+1);
				co.notifyAll();
			}
			
		}
		}
	}

class consumer extends Thread{
	LinkedList co;
	consumer(LinkedList co, String name){
		super(name);
		this.co = co;
	}
	public  void run() {
		for(int i = 1; i < 6; i++) {
			synchronized(co) {
				while(co.isEmpty()) {
					try {
						System.out.println("In the wait mode in consumer as the sharedResource is Empty");
						co.wait();
					}catch(InterruptedException a) {
						System.out.println("Caught Exception in Consumer");
					}
				}
				co.remove();
				
				System.out.println("Consumer is buying The product "+i+" from "+Thread.currentThread().getName());
				try {
					Thread.currentThread().sleep(500);
				}catch(Exception w) {
					System.out.println("Caught Exception in Consumer");
				}
				co.notify();
			}
			
		}
			
		}
	}


public class InterThreadCommunication{
	public static void main(String[] args) {
		LinkedList co = new LinkedList();
		producer p = new producer(co);
		consumer c = new consumer(co,"c");
		consumer c1 = new consumer(co,"c1");
		p.start();
		c1.start();
		c.start();
		
	}
}