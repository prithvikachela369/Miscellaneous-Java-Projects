enum Mobile{
	Iphone(90000), SamsungS20(85000), HuaweiPorsche(150000);

	int price;
	Mobile(int p) {
		this.price = p;
	}
	int showprice() {
		return price;
		
	}
}
public class EnumMethods2 {
public static void main(String[] args) {
	System.out.println("Cell Phone List:");
	for(Mobile m: Mobile.values()) {
		System.out.println(m+ " costs " +m.showprice()+ " Indian Rupees ");
	}
	Mobile ret;
	ret = Mobile.valueOf("SamsungS20");
	System.out.println("Selected: "+ret);
}
}
