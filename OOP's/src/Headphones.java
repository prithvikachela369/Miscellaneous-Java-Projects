
public class Headphones {
 String charge = "Micro USB";
 String[] controls = {"power","volume","skip","play/pause"};
 static boolean power = false;
 static int volume = 0;
 
 public static void powerON() {
	 power = true;
 }
 public static void powerOFF() {
	 power = false;
 }
 public static void volumeUP() {
	 volume++;
 }
 public static void volumeDOWN() {
	 volume--;
 }
}
