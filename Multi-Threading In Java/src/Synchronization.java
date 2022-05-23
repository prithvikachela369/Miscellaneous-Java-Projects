class counter{
	int count;
	
	public synchronized void increment() {
		//This above synchronized keyword only lets one Thread to work with increment method 
		//means if t is working with increment t1 has to wait and vice versa
		//synchronized keyword makes the increment method Thread-safe means multiple threads cannot work with the same method 
		
		count++;
	}
}


public class Synchronization{

	public static void main(String[] args) throws InterruptedException {
		counter c = new counter();
		
		
		
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					c.increment();
				}
				
			}

		});
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					c.increment();
				}
				
			}

		});
			
		
		t.start();
		t1.start();
		t.join();//The join method joins the incremented values after the threads t and t1 are joined or their process is completed
		t1.join();
		System.out.println(c.count);//this is giving us random values as both(t and t1) are fetching the count
		
	}

}


































