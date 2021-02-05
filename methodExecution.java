
public class methodExecution {
	public int multipynumbers(int a,int b) {
		int z=a*b;
		return z;
	}
	
	int val=150;
	int operation(int val) {
		val=val*10/100;
		return(val);
	}
	
	public void area(int b,int h) {
		System.out.println("Area of triangle: "+(0.5*b*h));
	}
	public void area(int r) {
		System.out.println("Area of circle: "+(3.14*r*r));
	}

	public static void main(String[] args) {
		methodExecution b=new methodExecution();
		int ans=b.multipynumbers(10,4);
		System.out.println("Multiplication is: "+ans);
		System.out.println("Before operation value of data is: "+b.val);
		b.operation(100);
		System.out.println("After operation value of data is: "+b.val);
		b.area(10,12);
		b.area(5);

	}

}
