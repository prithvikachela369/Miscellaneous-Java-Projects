package Package2;

import Package1.A;//import package 1.A

public class B {

	public static void main(String[] args) {
		A object = new A();
        object.Display();
        
        
        //The below is with fully qualified name
        Package1.A object2 = new Package1.A();
        object.Display();
        object.filledOut();
	}

}
