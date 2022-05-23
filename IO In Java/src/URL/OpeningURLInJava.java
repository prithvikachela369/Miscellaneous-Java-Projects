package URL;

import java.awt.*;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class OpeningURLInJava {

	public static void main(String[] args) throws IOException, URISyntaxException {
		Desktop d = Desktop.getDesktop();
		Scanner s = new Scanner(System.in);
		String s2;
		System.out.println("Which Website Do yu Want to Visit?");
		//System.out.print("http://");
		d.browse(new URI(s2 = s.next()));
	}

}
