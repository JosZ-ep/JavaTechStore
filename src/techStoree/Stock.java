package techStoree;
import java.util.ArrayList;


public class Stock {
	
	private ArrayList<Element> Elements;
	
	
	public Stock() {
		this.Elements = new ArrayList<Element>();
	}
	
	public Stock(ArrayList<Element> E) {
		this.Elements=E;
	}
	
	
	/*
	public Stock(ArrayList<String> S, ArrayList<double>PR, ArrayList<long> QUA) {
		
	}
	*/
	public ArrayList<Element> getArticleList() {
		return this.Elements;
		
	}
	
	public int getArticleNb(){
		int Res=0;
		for(int i=0; i<Elements.size();i++) {
			Res+=Elements.get(i).quantite;
			
		}
		
		return Res;
		
		
	}
	
	
	public void setArticleList(ArrayList<Element> E) {
		for (int i=0; i<Elements.size();i++) {
			
		}
		
	}
	
	public void ajouterArticle(Article art, long QUA) {
		
		this.Elements.add(new Element(art,QUA));
		
	}
	
	public void ajouterArticle(String Name, double prix, long QUA) {
		this.Elements.add(new Element(Name,prix,QUA));
		
	}
	
	public Element trouverArticle (String REF) {
		System.out.println("finding object");
		
		for(int i=0; i<Elements.size();i++) {
			
			if (Elements.get(i).article.reference.equals(REF)){
				return Elements.get(i);
				
			}
			
			
		}
		return null;
		
		
	}
	
	public void modifierArticle(String Name, String REF, double prix, long QUA) {
		Element E= trouverArticle(REF);
		
		E.article.setNom(Name);
		E.article.setPrix(prix);
		E.setQuantite(QUA);
	}
	
	public void supprimerArticle(String REF) {
		
		Elements.remove(trouverArticle(REF));
	}
	
	public void incrementerQuantiteArticle(String REF, long QUA) {
		Element E = trouverArticle(REF);
		E.incrementerQuantite(QUA);
		
		
	}
	
	public void decrementerQuantiteArticle(String REF, long QUA) {
		Element E = trouverArticle(REF);
		E.decrementerQuantite(QUA);
	}
	
	public String msg() {
		String Message="";
		for(int i=0;i<Elements.size();i++) {
			Message=Message + Elements.get(i).toString() + "\n";
			
		}
		return Message;
	}
	
	public String toString() {
		String MSG = msg(); 
		return(MSG);
		
	}
	
}
