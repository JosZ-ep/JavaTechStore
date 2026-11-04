package techStoree;

public class Personne {
	public String cin;
	public String nom;
	public String prenom;
	public Adresse adresse;
	
	public Personne(String c, String n, String pn, Adresse ADR) {
		this.cin = c;
		this.nom = n;
		this.prenom = pn;
		this.adresse = ADR;
	}
	public Personne(String c, String n, String pn, String gouv, int codeP) {
		this.cin = c;
		this.nom = n;
		this.prenom = pn;
		this.adresse = new Adresse(gouv,codeP);
	}
	
	
	public void setCin(String cin) {
		this.cin = cin;
	}
	
	public String getCin() {
		return this.cin;
	}
	
	public String getNom() {return this.nom;}
	
	public String getPrenom() {return this.prenom;}
	
	public Adresse getAdresse() {return this.adresse;}
	
	public void setNom(String Name) {
		this.nom = Name;}
	
	public void setPrenom(String Prename) {
		this.prenom=Prename;
	}
	
	public void setAdresse(Adresse ADR) {
		this.adresse=ADR;
	}
	
	public String toString() {
		return ("cin:"+this.cin +"| nom:" + this.nom + "| Prenom:" + this.prenom +"|" +  this.adresse.toString());
	}
	

}
