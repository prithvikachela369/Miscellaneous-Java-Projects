
public class Assert2 {

	public static void main(String[] args) {
		int toSum[] = {10,20,20,30};
		System.out.println(SumArray(toSum));
		assert toSum.length > 0 && toSum[0] < 2 : "Array toSum[0] index is greater than 2";
	}
	
public static int SumArray(int[] arr) {
		
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}
		return total ;
		
	}
	
	/*
	 An assertion is a statement in Java which ensures the correctness of any assumptions which have been done in the program.
	 */

}
