package Package1;

//Types of Access modifiers:- public, protected, default, private
//public - The variables and methods can be accessed across package of the class
//default - The variables and methods can only be accessed in the particular package
//private - The variables and methods can only be accessed in the particular class in which it is declared
/*protected - The variables and methods can only be accessed across package of the class and if we want access it outside the package if both
              the class outside and inside the package have some relationship(Ex:- extending the class(inheritance))
*/

public class Access1 {
//int hours = 12;//default access
//int minutes = 9;//default access
	
//public int hours = 12;//public access
//public int minutes = 9;//public access
	
//private int hours = 12;//private access
//private int minutes = 9;//private access
	
protected int hours = 12;//protected access
protected int minutes = 9;//protected access
}

//The same Methodology is for methods in Java