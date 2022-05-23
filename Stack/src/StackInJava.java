import java.util.Stack;

public class StackInJava {

	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		
		st.add("GTA IV");
		st.add("GTA V");
		st.add("Call of Duty Ghosts");
		
		//System.out.println(st.pop());//the pop method takes out(cut) the String from the top of the stack
		//System.out.println(st.peek());//it copies the String from the top of the stack
		//System.out.println(st.contains("GTA V"));
		//System.out.println(st.empty());
		//System.out.println(st.get(2));
		//System.out.println(st);
		
		Stack st1 = new Stack();
		
		st1.add("A");
		st1.add("B");
		st1.add("C");
		st1.add("D");
		st1.add("E");
		
		System.out.println(st1.peek());//For it the peek is the last indexs
		System.out.println(st1.get(2));
		System.out.println(st1.size());
	}

}
