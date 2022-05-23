enum programmingLanguages{
	Java("Object Oriented"), C("Based On Functions"), SQL("DataBase Language");
    private String programming;
	programmingLanguages(String programming ) {
		this.programming = programming;
	}
	public String getName() {
		return this.programming;
	}
}
public class enumsWithConstructor {

	public static void main(String[] args) {
		programmingLanguages[] programs = programmingLanguages.values();
		for(programmingLanguages s: programs) {
			System.out.println("Language Name: "+s.name()+ " Type: "+s.getName());
		}
	}

}
