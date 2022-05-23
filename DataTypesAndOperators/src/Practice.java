
public class Practice {

	public static void main(String[] args) {
		int[][] a =  {
				{10,23,44,23},
				{1,2,3,4},
				{9,8,7,6},
				{4,1,7,33}
		};
		int[][] b = {
				{90,23,1,3},
				{263,78,25,90},
				{19,13,45,21},
				{45,9,11,0}
		};
		System.out.println("===Matrix 1===");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		System.out.println("===Matrix 2===");
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.println(b[i][j]);
			}
		}
		int[][] c = new int[3][3];
		System.out.println("===Matrix 3===");
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				System.out.println(c[i][j]);
			}
		}
	}

}
