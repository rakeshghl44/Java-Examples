package CoreJava.Inheritance;

public class CarSubChild extends VehicleSuperParent{
	private String modelName = "Mustang";
	
	public static void main(String[] args) {
		
			CarSubChild c = new CarSubChild();
			c.honk();
			System.out.println(c.brand + '\n' + c.modelName);

	}

}
