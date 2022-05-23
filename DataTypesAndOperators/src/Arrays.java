
public class Arrays {

	public static void main(String[] args) {
	
		//Single Value Containers
		int state1PopulationCount = 346;
		int state2PopulationCount = 198;
		int state3PopulationCount = 509;
		int state4PopulationCount = 234;
		int state5PopulationCount = 564;
		
        //Multiple Value Containers
		//int[] Countrypopulation = new int[5];//it had default value of 0
		
		//int[] Countrypopulation = {678,978,453,980,654};//These array has some default initial values
		//The above example is Implicit way
		//OR We can do
		int[] Countrypopulation = new int[]{678,978,453,980,654};//This is an explicit way
		System.out.println("StatePopulation is"+Countrypopulation);
		
		//System.out.println("The Country's Population [0] is "+Countrypopulation[0]);
		
		for(int i = 0; i < Countrypopulation.length; i++) {
			System.out.println("The Country's Population["+i+"] is"+Countrypopulation[i]);
		}
		//Write/Update Operation
		Countrypopulation[0] = 1678;
		Countrypopulation[1] = 2978;
		Countrypopulation[2] = 2453;
		Countrypopulation[3] = 5980;
		Countrypopulation[4] = 1654;
		
		System.out.println("---Re-Reading After Wright Operation---");
		
		/*for(int i = 0; i < Countrypopulation.length; i++) {
			System.out.println("The Country's Population["+i+"] is"+Countrypopulation[i]);
		}*/
		
		//Enhanced for loop || For Each Loop
		int count = 0;
		for(int elm : Countrypopulation) {
			count = count + elm;
			System.out.println(elm);
		}
		System.out.println("The Country total population is"+count);
		
	}

}
