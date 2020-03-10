package CoreJava.Inheritance;

public class InhSub extends inheSuper{

	public InhSub(int y) {
		super(y);
		
	}
	public void subClass() {
		
		System.out.println("Sub class is calling");
	}
	public static void main(String[] args) {

		inheSuper ins = new inheSuper(6);
		InhSub sb = new InhSub(8);
		sb.subClass();
		
		System.out.println("Super class value " + ins.i );

	}

}
