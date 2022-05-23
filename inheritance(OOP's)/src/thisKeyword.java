
public class thisKeyword {
	
	String food;
	char size;
	
	public void setData(String food, char size) {
		this.food = food;
		this.size = size;
	}

	public static void main(String[] args) {
		
		thisKeyword t = new thisKeyword();
		
		
		t.setData("pizza", 'M');
		
		
		
        System.out.println(t.food);
        System.out.println(t.size);
	}

}
