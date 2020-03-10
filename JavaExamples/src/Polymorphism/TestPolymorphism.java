package Polymorphism;

public class TestPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		exportCountry e = new exportCountry();
		exportCountry i = new India();
		exportCountry j = new Japan();
		India ii = new India();
		Japan jj = new Japan();
		
		
		e.FMCG();
		i.FMCG();
		j.FMCG();
		
		jj.Electronics();
		ii.Pharma();
	
	}

}
