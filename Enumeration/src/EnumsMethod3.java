enum fruits{
	Apple,Mango,Strawberry;
}
public class EnumsMethod3 {

	public static void main(String[] args) {
		fruits[] arr = fruits.values();
        for(fruits fr:arr) {
        	System.out.println(fr+ " : " +fr.ordinal());
        }
        fruits f1,f2,f3;
        f1 = fruits.Apple;
        f2 = fruits.Mango;
        f3 = fruits.Strawberry;
        
        if(f2.compareTo(f1) > 0) {
        	System.out.println(f1 + " Comes Before " +f2);
        }
	}

}
