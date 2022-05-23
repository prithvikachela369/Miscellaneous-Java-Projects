
public class main2 {

	public static void main(String[] args) {
		SubClassAndSuperClass s = new SubClassAndSuperClass ("NIKE", 10);
		System.out.println(s.brand);
       
		walking w = new walking (true,"NIKE", 10);
		System.out.println(w.goretex);
		
		running r = new running (40,"NIKE", 10);
		System.out.println(r.weight);


	}

}
