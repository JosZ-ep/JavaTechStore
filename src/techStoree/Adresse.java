package techStoree;

public class Adresse {
	private String gouvernorat;
	private int codePostal;
	
	public Adresse(String gouve, int CodeP) {
		this.gouvernorat = gouve;
		this.codePostal = CodeP;
	}
	
	public String getGouvernorat () {
		return gouvernorat;
	}
	
	public void setGouvernorat(String gouv) {
		this.gouvernorat = gouv;
	}
	
	public int getCodePostal() {
		return codePostal;
	}
	
	public void setCodePostal(int CP) {
		this.codePostal = CP;
	}
	
	public String toString() {
		return("Adresse [gouvernorat="+ this.gouvernorat +", CodePostal=" + this.codePostal+"]");
	}
	
}
