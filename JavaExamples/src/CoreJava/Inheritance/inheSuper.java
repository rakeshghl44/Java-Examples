package CoreJava.Inheritance;

public class inheSuper {
	
	public int i;
	protected String model = "Camry";
	
	public inheSuper(int y) {
		i = y;
	}
	
	public void camry(String toyota) {
		
		model = toyota;
		System.out.println("Model " + model);
		
	}
}
