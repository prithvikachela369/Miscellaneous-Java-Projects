import java.util.ArrayList;

public class EnumsWithInheritance {

	public static void main(String[] args) {
		ArrayList<HTTPMethodConvertible> inherit = new ArrayList();
        inherit.add(libraryEnum.THIRD);
        inherit.add(clientEnum.apple);
        ArrayList<HTTPMethodConvertible2> inherit2 = new ArrayList();
        inherit2.add(priceEnum.PRICE3);
        for(HTTPMethodConvertible element: inherit) {
        	System.out.println(element.getHTTPMethodType());
        }
        for(HTTPMethodConvertible2 element2: inherit2) {
        	System.out.println(element2.getHTTPMethodType2());
        }
        
	}
	

}
interface HTTPMethodConvertible {
	public String getHTTPMethodType();
	
}
interface HTTPMethodConvertible2{
	public int getHTTPMethodType2();
}
enum libraryEnum implements HTTPMethodConvertible  {
	FIRST("Google Pixel"),SECOND("Huawei"),THIRD("Apple Iphone 11 pro");
	String HTTPMethodType;
	libraryEnum(String phone) {
		HTTPMethodType = phone;
		}
	public String getHTTPMethodType() {
		return HTTPMethodType;
	}
}
  enum clientEnum implements HTTPMethodConvertible{
	huawei("HonMing OS"),apple("ios"),google("android one");
	String HTTPMethodType;
	clientEnum(String s) {
		 HTTPMethodType = s;
	}
	public String getHTTPMethodType() {
		return HTTPMethodType;
	}
  }
	enum priceEnum implements HTTPMethodConvertible2{
		PRICE1(40000),PRICE2(20000),PRICE3(90000);
		int HTTPMethodType2;
		priceEnum(int s1) {
			 HTTPMethodType2 = s1;
		}
		public int getHTTPMethodType2() {
			return HTTPMethodType2;
		}
		
}