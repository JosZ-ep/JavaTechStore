package techStoree;

public class Test {
	public void main(String[] args) {
		Adresse a1 = new Adresse("Monastir",5000);
		Adresse a2 = new Adresse("Ben Arous", 1333);
		Adresse a3 = new Adresse("Ben Arous", 1145);
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		
		Personne p1 = new Personne("01111","kbayer","Jasser",a1);
		Personne p2 = new Personne("02222", "Smida", "Ghayth", "Monastir",5000);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		p1.setNom("MESSI");
		
		p2.setPrenom("CRISTIANO");
		
		a1.setCodePostal(5100);
		a1.setGouvernorat("Sousse");
		
		
		System.out.println("AGAIN!");
		System.out.println(p1);
		System.out.println(p2);
		
		
		
	}
	
	
	
	
	

}
