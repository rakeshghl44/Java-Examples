package CoreJava;

public class Constructor_Initialize {
	int x;
	
	public Constructor_Initialize() {
		x=5;
	}

	public static void main(String[] args) {
		
		Constructor_Initialize c = new Constructor_Initialize();
		System.out.println(c.x);
	}
}
