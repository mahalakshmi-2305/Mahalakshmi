
class defAccessSpecifier{
	void display() {
		System.out.println("you are using default access specifier");
	}
}
class priAccessSpecifier{
	void display1() {
		System.out.println("You are using private access specifier");
	}
}
public class accessSpecifier {

	public static void main(String[] args) {
		//Default 
		System.out.println("Default access specifier");
		defAccessSpecifier obj=new defAccessSpecifier();
		
		//private
		System.out.println("Private access specifier");
		priAccessSpecifier obj1=new priAccessSpecifier();
		obj.display();
		obj1.display1();
		
		
		
		

	}

}
