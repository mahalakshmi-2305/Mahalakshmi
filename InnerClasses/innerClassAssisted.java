
public class innerClassAssisted {
	
	private String msg="Welcome to java";
	class Inner{
		void hello() {
			System.out.println(msg+".. Let us start learning inner classes");
		}
	}

	public static void main(String[] args) {
		innerClassAssisted obj=new innerClassAssisted();
		innerClassAssisted.Inner in=obj.new Inner();
		in.hello();
		

	}

}
