package techStoree;

public class Element {
	Article article;
	long quantite;
	
	public Element(Article ART, long QUA) {
		this.article = ART;
		this.quantite = QUA;
	}
	
	public Element(String Nom, double prix, long QUA) {
		this.article.nom = Nom;
		this.article.prix= prix;
		this.quantite=QUA;
	}
	
	public Article getArticle( ) {
		return this.article;
	}
	public long getQuantite() {
		return this.quantite;
	}
	
	public String getReferenceArticle() {
		return this.article.getReference();
	}
	
	public String getNomArticle() {
		return this.article.getNom();
	}
	
	public double getPrixArticle() {
		return this.article.getPrix();
	}
	
	public void setArticle(Article ART) {
		this.article=ART;
	}
	
	public void setQuantite(long QUA) {
		this.quantite=QUA;
	}
	
	public void incrementerQuantite(long QUA) {
		this.quantite = QUA + 1;
	}
	
	 public void decrementerQuantite(long QUA) {
		this.quantite = QUA -1;
	}
	 
	public void modifier(String TXT, double PR, long QUA) {
		Article Object = new Article(1,TXT,getReferenceArticle(),PR);
		this.article=Object;
		this.quantite=QUA;
	}
	
	/*not done*/
	public boolean equals(String TXT) {
		if (this.article.reference.equals(TXT)){
			return true;
		}
		else {
			return false;
		}
		
	}
	
	/*not done*/
	public boolean equals(Article ART) {
		if(this.article.equals(ART)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public String toString() {
		return ("Element [" +"--" + this.article + "--"+ this.quantite + "]"); 
	}
}
