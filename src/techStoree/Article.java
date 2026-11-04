package techStoree;

public class Article {
	int id;
	String nom;
	String reference;
	double prix;
	
	public Article(int id, String nom, String refrence, double prix) {
		this.id = id;
		this.nom=nom;
		this.reference=refrence;
		this.prix=prix;
	}
	
	public int getId() {return id;}
	
	public String getReference() { return reference;}
	
	public String getNom() { return nom;}
	
	public double getPrix() {return prix;}
	
	public void setRefrence(String ref) {
		this.reference=ref;
	}
	
	public void setNom(String Name) {
		this.nom = Name;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public static String genererReference(String Nom,int Idintern){

		String ref = "";
		for (int i=0;i<Nom.length();i+=5){
		    char c = Nom.charAt(i);
		    if (c!=' '){
		        ref=ref+c;
		    }
		}
		ref = ref + Idintern;
		return ref;


		}
	
	public void modifier(String TXT) {
		this.nom=TXT;
		
	}
	
	public void modifier(String TXT, double PRICE) {
		this.nom=TXT;
		this.prix=PRICE;
		this.reference=genererReference(TXT,this.id);
	}
	
	public String toString() {
		return ("Article:" + this.nom + "|| PRICE:" + this.prix +"|| REF: "+ this.reference);
		
	}
}
