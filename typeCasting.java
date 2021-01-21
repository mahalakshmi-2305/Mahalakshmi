
public class typeCasting {

	public static void main(String[] args) {
		//implicit conversion
		System.out.println("Implicit type conversion");
		char a='A';
		System.out.println("Value of char a="+a);
		int b=a;
		System.out.println("Value of int b="+b);
		float c=a;
		System.out.println("Value of float c="+c);
		long d=a;
		System.out.println("Value of long d="+d);
		double e=a;
		System.out.println("Value of double e="+e);
		System.out.println("\n");
		//Explicit conversion
		System.out.println("Explicit type conversion");
		double x=45.5;
		int y=(int)x;
		System.out.println("value of double x="+x);
		System.out.println("Value of int x="+y);
		
		

	}

}
