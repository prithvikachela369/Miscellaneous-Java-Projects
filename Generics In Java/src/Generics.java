class test<Q,W>{
	 Q a1;//a1 of type Q
	 W a2;//a2 of type W
	
	test(Q a1,W a2){
		this.a1 = a1;
		this.a2 = a2;
	}
	public void dis() {
		System.out.println(a1);
		System.out.println(a2);
	}
}
public class Generics {

	public static void main(String[] args) {
		test<Integer, Integer> t = new test<Integer, Integer>(100,1000);
		t.dis();
	}

}
