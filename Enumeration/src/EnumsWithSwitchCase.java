
enum Day{
	MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
}
public class EnumsWithSwitchCase {
	
public static void main(String[] args) {
		
		Day day = Day.MONDAY;
		switch(day) {
		case MONDAY:
			System.out.println("Hi It's Monday today");
			break;
		case TUESDAY:
			System.out.println("Hi It's Tuesday today");
			break;
		case WEDNESDAY:
			System.out.println("Hi It's Wednesday today");
			break;
		case THURSDAY:
			System.out.println("Hi It's Thursday today");
			break;
		case FRIDAY:
			System.out.println("Hi It's Friday today");
			break;
		case SATURDAY:
			System.out.println("Hi It's Saturday today");
			break;
		case SUNDAY:
			System.out.println("Hi It's Sunday today");
			break;
		default:
			System.out.println("Please, Enter An Valid Day!!!");
			break;
		}
	}
	

}
