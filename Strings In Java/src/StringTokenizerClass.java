import java.util.StringTokenizer;

public class StringTokenizerClass {

	public static void main(String[] args) {
		String s = "Hello this is a String";
		StringTokenizer st = new StringTokenizer(s);//It converts String into tokens(words)
		
		while(st.hasMoreTokens()) {
			String tokens = st.nextToken();
			System.out.println(tokens);
		}
	}

}
