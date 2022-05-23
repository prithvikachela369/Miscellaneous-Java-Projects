
public class GarbageCollection {
   public void finalize() {
	   System.out.println("Garbage collected");
   }
	public static void main(String[] args) {
		 GarbageCollection obj = new  GarbageCollection();
		 GarbageCollection obj2 = new  GarbageCollection();
		 obj = null;
		 obj2 = null;
		 System.gc();
	}

}
