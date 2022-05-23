
public class GettersAndSetters {
String name;
int age;


	public static void main(String[] args) {
		GettersAndSetters obj = new GettersAndSetters();
       /* obj.age = 10;
        obj.name = "Blah!!!";
        */
		obj.setName("PK");
		obj.setAge(30);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
        // System.out.println(obj.age);
        //System.out.println(obj.name);
       obj. print();
	}
	//Instead of above practice
			//The practice below is effevtive
	
	public  void print() {
		//System.out.println(name+" ,"+age);
		System.out.println(getName()+" ,"+getAge());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
