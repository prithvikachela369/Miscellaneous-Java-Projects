
public class TwoDimensionalArrays {

	public static void main(String[] args) {
		int[][] worldPopulation = {
				{1234,567,345,890,456},  //0th index(country 1)
				{1984,987,567,976,123},  //1st index(country 2)
				{124,897,734,765,900}  //2nd index(country 3)
		};
		 System.out.println("The world population is "+ worldPopulation+" and its length is "+ worldPopulation.length);
         System.out.println("The world population[0] is "+ worldPopulation[0]+" and its length is "+ worldPopulation[0].length);
         System.out.println("The world population[1] is "+ worldPopulation[1]+" and its length is "+ worldPopulation[1].length);
         System.out.println("The world population[2] is "+ worldPopulation[2]+" and its length is "+ worldPopulation[2].length);
         
         System.out.println("The world population [0][0] :"+worldPopulation[0][0]);
         System.out.println("The world population [1][2] :"+worldPopulation[1][1]);
         
         //Write/update data
         worldPopulation[1][2] = 7778;
         System.out.println("The world population [1][2] :"+worldPopulation[1][2]);
         
         for(int i = 0; i<worldPopulation.length; i++) {
        	 for(int j = 0; j<worldPopulation[i].length; j++) {
        		 System.out.println(worldPopulation[i][j]);
        	 }
         }
     
	}

}
