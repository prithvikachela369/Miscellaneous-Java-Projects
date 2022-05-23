package st1;

import static java.lang.System.out;
import static st2.StaticImport2.show;

import st2.StaticImport2;
//Above out is a static reference, so we have to do static import

public class StaticImport {

	public static void main(String[] args) {
		out.println("Hello");//A shortcut
		show();
	}

}
