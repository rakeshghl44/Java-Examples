package Polymorphism;

public class TestOne {

	void testMain() {
		System.out.println("Main class is calling");
	}
	
	public static void main(String[] args) {

		polyClassOne pone = new polyClassOne();
		polyClassOne ptwo = new polyClassTwo();
		polyClassOne pthreee = new polyclasThree();
		polyClassTwo p2 = new polyClassTwo();
		polyclasThree p3 = new polyclasThree();
		
		TestOne t1 = new TestOne();
		
		pone.testPolyOne();
		pone.one();
		
		ptwo.testPolyOne();
		p2.two();
		pthreee.testPolyOne();
		p3.three();
		
		t1.testMain();

	}

}
