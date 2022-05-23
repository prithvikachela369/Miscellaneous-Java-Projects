import javax.swing.JOptionPane;


public class StringformatMethod {

	public static void main(String[] args) {
		String in = "124%$@qwe";
		
		String in2 = JOptionPane.showInputDialog("Please Enter Your Password");
		
		 if(in2.equals(in)) {
			System.out.println("You Can Enter :)");
			System.exit(0);
		}else if(in2 != in) {
			System.err.println("Invalid Password!!");
			}else {
		 System.out.println("You should make a new password");
		}
		String out;
		
		Object err = "Error";
		out = String.format("%s ", err);
		
		JOptionPane.showMessageDialog(null, "Invalid Password", out, 2);
		
		
		//System.exit(0);
		
		   
		 
		   
		try {
			String password = JOptionPane.showInputDialog("Please Enter Your New Password");
			int input2  = JOptionPane.showConfirmDialog(null, "Do You Want To Confirm The Password", "Confirm",JOptionPane.YES_NO_OPTION);
			if(password.length() > 0) {
				System.out.println("Thank You :) For using our service");
				
				System.out.println(password);
				
				
				
			}else {
				System.err.println("Please input a valid Code!!! :(");
			}
			
		}catch(Exception e) {
			System.err.println("An Exception Happened In The Database !!, the user did'nt type anything");
		}
			
			
	}

}
