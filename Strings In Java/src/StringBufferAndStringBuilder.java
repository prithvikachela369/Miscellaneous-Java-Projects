
public class StringBufferAndStringBuilder {
	
	// These Are Mutable
	
	/*
	 The StringBuffer and StringBuilder classes are used when there is a necessity to make a lot of modifications to Strings of
	 characters. ... It is recommended to use StringBuilder whenever possible because it is faster than StringBuffer. However, 
	 if the thread safety is necessary, the best option is StringBuffer objects.
	 */

	public static void main(String[] args) {
		
		StringBuffer sb2 = new StringBuffer("Hello");
		
		sb2.append(22314);
		
		System.out.println(sb2);
		
		sb2.replace(5, 10, "Aliens");
		
		System.out.println(sb2);
		
		sb2.delete(2, 5);
		
		System.out.println(sb2);
		
		//Non-Synchronized(Not Thread-safe)
		//Faster Then StringBuffer
		StringBuilder sb = new StringBuilder();
		
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 10000; i++) {
			sb.append("Hello");
		}
		
		long endTime = System.currentTimeMillis();
		
		long duration = endTime - startTime;
		
		System.out.println(duration);
		
		//Synchronized(Thread-safe)
		//Slower Then StringBuilder
		StringBuffer sbu = new StringBuffer();
		
long startTime2 = System.currentTimeMillis();
		
		for(int j = 0; j < 10000; j++) {
			sbu.append("Hello");
		}
		
		long endTime2 = System.currentTimeMillis();
		
		long duration2 = endTime - startTime;
		
		System.out.println(duration2);
	}

}
