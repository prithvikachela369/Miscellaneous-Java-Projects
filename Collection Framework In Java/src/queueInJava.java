import java.util.PriorityQueue;

public class queueInJava {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i = 10; i > 0; i--) {
			queue.add(i);
			}
		
		//Queue (Front) 10 9 8 7 6 5 4 3 2 1 (Rear)
		//Priority Queue sorts the data for us
		//Queue (Front) 1 2 3 4 5 6 7 8 9 10 (Rear)
		
		//Peeking --> Obtaining the head of queue
		//Polling --> Removing the  head of queue
		
		System.out.println("Size of queue before polling "+queue.size());
		System.out.println("The head is "+queue.peek()); //Head of queue: 1
		queue.poll();
		System.out.println("Size of queue after polling "+queue.size());
		System.out.println("The head is "+queue.peek()); //Head of queue: 2
	}
	

}
