
public class StaticVariablesAndMethods {
	
		int bsRevenue;
		String bsName;
		static String type = "Tech";

		 static void change() {
			type = "Agro";
		}
		StaticVariablesAndMethods(int bs1, String bs2){
			this.bsRevenue = bs1;
			this.bsName = bs2;
		}
		void display() {
			System.out.println("Business Revenue: "+bsRevenue+ " Business Name: "+bsName+ " BussinnesType: "+type);
			
		}
			public static void main(String[] args) {
				StaticVariablesAndMethods.change();//Calling The change method which will change type of tech to agro
				StaticVariablesAndMethods s1 = new StaticVariablesAndMethods(1000000000,"Pk");
				StaticVariablesAndMethods s2 = new StaticVariablesAndMethods(2000000000,"Pk2");
				s1.display();
				s2.display();
				
			}

		}


