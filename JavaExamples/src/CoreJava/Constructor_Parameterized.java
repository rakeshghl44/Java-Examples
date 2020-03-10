package CoreJava;

public class Constructor_Parameterized {
	int x;
	
	public Constructor_Parameterized(int y) {
		x=y;
	}	

	public static void main(String[] args) {
		
		Constructor_Parameterized c= new Constructor_Parameterized(6);
		System.out.println(c.x);
	}

}
