enum TrafficSignals{
	RED("STOP"),GREEN("GO"),YELLOW("WAIT");
    private String action;
    public String getAction() {
    	return this.action;
    }
	TrafficSignals(String action) {
		this.action = action;
	}
}
public class EnumsWithCustomizedValues {

	public static void main(String[] args) {
		TrafficSignals[] signals = TrafficSignals.values();
		for(TrafficSignals signal : signals) {
			System.out.println("name : "+signal.name()+" action "+signal.getAction());
		}
	}

}
