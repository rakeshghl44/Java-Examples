package CoreJava;

public class Constructor {
	
	 int modelYear;
	 String modelName;

	public Constructor(int year,String name) {
		modelName=name;
		modelYear=year;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructor c = new Constructor(1999, "Camry");
		System.out.println(c.modelName+ '\n' + c.modelYear);
	}



}
