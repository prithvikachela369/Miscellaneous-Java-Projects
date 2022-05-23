
public class CallByValueAndCallByRefrence {
	static int num = 5;//when we call it static it is common for all
	
	public static void main(String[] args) {
	System.out.println("num = " +num);
    callByValue(num);
    System.out.println("The value of num after calling by value is "+num);
    /*
     Here if we call the method callByValue and pass the parameter as num the num will send its copy to the other method and its copy
     would be edited and its original value will be the same whether we make changes in the variable n the value of original num
     would'nt change. And since int is a primitive data type it will only send the copy of the original variable.
     */
    CallByValueAndCallByRefrence obj = new CallByValueAndCallByRefrence();
    callByRefrence(obj);
    System.out.println("The value of num after calling by refrence is "+num);
    
	}
	public static void callByValue(int n) {
		n = 25;
	}
	public static void callByRefrence(CallByValueAndCallByRefrence ob) {
		ob.num = 25;
	}
	/*
	 Here we have made a object obj and a method callByRefrence and we have called that method and the ob receives that obj which 
	 edits the value of num as 25 of the original one and sends it back and we get the output as the edited value of num which is
	 25(HERE). Ans since it is a non-primitive data type changes takes place in the variable  
	 */

}
