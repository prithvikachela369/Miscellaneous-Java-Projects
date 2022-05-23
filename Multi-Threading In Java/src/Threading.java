class A implements Runnable{
	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.println("Hello world");
			try {
			Thread.sleep(1000);//it will stop execution or sleep the thread for given time in milliseconds(1s = 1000ms)
			}catch(Exception a) {}
		}
	}
}
class B implements Runnable{
	public void run() {
		for(int i = 0; i <= 10; i++) {
			System.out.println("Hello aliens");
			try {
				Thread.sleep(1000);//it will stop execution or sleep the thread for given time in milliseconds(1s = 1000ms)
			}catch(Exception b) {}
		}
	}
}
public class Threading {

	public static void main(String[] args) throws InterruptedException {
		A a = new A();
		//a.show();
		B b = new B();
		//b.show();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		
		//setting and getting priority of Threads
		//t1.setPriority(1);
		//t2.setPriority(7);
		
		//t1.setPriority(Thread.MAX_PRIORITY);//Some InBuilt constant priorities
		//t2.setPriority(Thread.NORM_PRIORITY);
	  //t1.setPriority(Thread.NORM_PRIORITY);
		
		
		//System.out.println(t1.getPriority());
		//System.out.println(t2.getPriority());
		
		//setting and getting Thread name
				t1.setName("World Thread");
				t2.setName("Alien Thread");
				System.out.println(t1.getName());
				System.out.println(t2.getName());
		
		t1.start();//when we say start internally it executes a method run and run is a internal method of Thread
		try {
			Thread.sleep(10);
		}catch(Exception c) {}
		t2.start();
		
		
		
		t1.join();//The join method joins the bye statement after the threads t1 and t2 are joined or their process is completed
		t2.join();
		
		System.out.println(t1.isAlive());//this method checks if the thread is alive(present) or not
		
		System.out.println("Byee!!");
	}

}
