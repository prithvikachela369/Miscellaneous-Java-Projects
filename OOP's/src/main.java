
public class main {

	public static void main(String[] args) {
	pen p = new pen();
	
	System.out.println(p.color);
	System.out.println(p.type);
	System.out.println(p.point);
	
	System.out.println(p.clicked);
	
	p.click();
	
	System.out.println(p.clicked);
	
	Headphones h = new Headphones();
	
	//System.out.println(h.volume);
	
	h.volumeUP();
	h.volumeUP();
	h.volumeUP();
	h.volumeUP();
	h.volumeUP();
	h.volumeUP();
	
	System.out.println(h.volume);
	
	h.volumeDOWN();
	h.volumeDOWN();
	h.volumeDOWN();
	
	System.out.println(h.volume);
	
	}

}
