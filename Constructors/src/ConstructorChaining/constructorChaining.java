package ConstructorChaining;

public class constructorChaining {
	
	int id;
	String name;
	static String country;
	static int work;
	
	constructorChaining(int id, String name,String country,int work){
		this.id = id;
		this.name = name;
		this.country = country;
		this.work = work;
	}
	
	constructorChaining(int id, String name,int work){
	
		this(id,name,country,work);//it will call its parent constructor
		
		
	}
	constructorChaining(int id, String name){
		this(id, name,work);//It will call the parent constructor
		  
		
		
	}
	public void display() {
		System.out.println("ID: "+id+ " ,Name: "+name+ " ,Country: " +country+ " Working Hours: " +work);
	}

	public static void main(String[] args) {
		constructorChaining obj = new constructorChaining(3, "*****", "*****",8);
		obj.display();
		constructorChaining obj2 = new constructorChaining(6, "*****", "*****",7);
		
		obj2.display();
		
		
	}

}
