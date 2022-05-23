import java.text.SimpleDateFormat;
import java.util.Date;
public class formattedDateDemo {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat dnow = new SimpleDateFormat("E yyyy/MM/dd 'at' hh:mm:ss a G zzz");
		System.out.println(dnow.format(d));
		
		String str = String.format("Current Date/Time : %tc", d);//c stands for providing date and time
		System.out.println(str);
		
		//Displaying using $ sign
		System.out.printf("%1$s %2$tB %2$td %3$s %2$tY", "Due Date :", d, ",");
		
		//Displaying using < sign
		System.out.println();
		System.out.printf("%s %tB %<te %<tY", "Due Date:", d);//%<te represents date where 0 is not include in date
	}

}
