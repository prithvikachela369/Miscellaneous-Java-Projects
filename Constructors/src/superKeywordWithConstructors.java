class person{
	String name;
	
	
	person(){
		System.out.println("Inside Super Class Constructor");
	}
	person(String name){
		this.name = name;
	}
}
public class superKeywordWithConstructors extends person {
	
	String talent;
	
	 superKeywordWithConstructors(){//It will call the default constructor of its parent class
		 super();
	 }
	 superKeywordWithConstructors(String name,String talent){//It will call the parameterized constructor of its parent class
		 super(name);
		 this.talent = talent;
	 }
	public void disp() {
		System.out.println("Name: "+name+ " Talent: " +talent);
	}

	public static void main(String[] args) {
		 superKeywordWithConstructors obj = new  superKeywordWithConstructors ();
		 superKeywordWithConstructors obj1 = new  superKeywordWithConstructors("*****","****");
		 obj1.disp();
		}

}
