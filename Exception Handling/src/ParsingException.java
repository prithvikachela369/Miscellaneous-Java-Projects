import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ParsingException {
	
	static void ConvertDateFormat(String inputDate) {
		try {
			SimpleDateFormat sd = new SimpleDateFormat("dd/mm/yyyy");
			Date d = sd.parse(inputDate);
			SimpleDateFormat outsd = new SimpleDateFormat("yyyy-mm-dd");
			String out = outsd.format(d);
			System.out.println("After Changing Date Format To yyyy-mm-dd "+out);
		}catch(java.text.ParseException p) {
			System.err.println("Some Error Occured While Formatting The Date!!!");
		}
	}

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Date In dd/mm/yyyy Format :");
	String inputDate = s.next();
	ConvertDateFormat(inputDate);
	}
	
	/*
	 Parsing is used to convert the value of one data type to a value of another data type.
	 */

}
