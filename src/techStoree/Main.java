package techStoree;
import java.util.Scanner;

public class Main {
	 	public static Stock Stocker;
		public static void GerantClient() {

		    Scanner scanner = new Scanner ( System.in);
		    System.out.println("— 0 : Gérant\n— 1 : Client");
		    int a = scanner.nextInt();
		    

		    if (a==1){
		        System.out.println("Bonjour cher/chere client");
		    }
		    else{
		    if (a==0){
		        System.out.println("— 0 : Ajouter un article \n— 1 : Modifier un article\n— 2 : Consulter les articles\n— 3 : Supprimer un article");
		    }
		        
		    else{
		        System.out.println("Cetter Action n'est pas autorise");
		        
		    }

		    
		}
		}

/*USING THIS*/
		public static void GerantMenu() {
			Scanner scanner = new Scanner (System.in);
			String NameProduit = "";
			double PrixProduit = 0.0;
			long QuantiteProduit = 0;
			int choix;
			int IDProduit;
			String RefProduit = "";
			do {
				System.out.println("===========GESTION DU STOCK TECHSTORE===========\r\n"
						+ "1. Ajouter un article\r\n"
						+ "2. Modifier un article\r\n"
						+ "3. Consulter les articles\r\n"
						+ "4. Supprimer un article\r\n"
						+ "0. Quitter\r\n"
						+ "Votre choix :");
				choix = scanner.nextInt();

				switch(choix) {
				case 1:
					
					System.out.println("ITEM NAME");
					scanner.nextLine();
					NameProduit = scanner.nextLine();
					System.out.println("ITEM PRICE?");
					PrixProduit = scanner.nextDouble();
					/*ajouterArticle(NomProduitAj, PrixProduitAj);*/
					System.out.println("ID?");
					IDProduit = scanner.nextInt();
					RefProduit = Article.genererReference(NameProduit,IDProduit);
					Article Art = new Article(IDProduit,NameProduit,RefProduit,PrixProduit);
					Stocker.ajouterArticle(Art, QuantiteProduit);
					System.out.println("Your" + NameProduit + "REFRENCE:---- = " + RefProduit );
					System.out.println("GOING BACK TO MAIN PAGE..");
					GerantClient();
					
					break;
				case 2:
					/*modify*/
					System.out.println("EDITING PRODUITE..");
					NameProduit=scanner.nextLine();
					System.out.println("PUT PRICE:");
					PrixProduit=scanner.nextDouble();
					System.out.println("QUANTITY?");
					QuantiteProduit = scanner.nextLong();
					System.out.println("ID:?");
					IDProduit =scanner.nextInt();
					RefProduit = Article.genererReference(NameProduit, IDProduit);
					Stocker.modifierArticle(NameProduit,RefProduit,PrixProduit, QuantiteProduit);
					System.out.println("GOING BACK TO MAIN PAGE..");
					GerantClient();
					break;
				case 3:
					ConsulterMenu();
					break;
				case 4:
					System.out.println("PUT A REFRENCE..:");
					String REFCHOISEN = scanner.next();
					//supprimerArticle(REFCHOISEN);
					break;
				
				case 0:
					System.out.println("QUITTER");
					break;
				default:
					System.out.println("Choix invalide");
				}
			} while (choix != 0);
		}
/*USING THIS*/
		public static void ConsulterMenu() {
			Scanner scanner = new Scanner (System.in);
			int choix;
			do {
				System.out.println("----- Consultation du stock -----\r\n"
						+ "1. Affichage par prix croissant\r\n"
						+ "2. Affichage par prix décroissant\r\n"
						+ "3. LIST\r\n"
						+ "0. Retour au menu principal\r\n"
						+ "Votre choix :");
				choix = scanner.nextInt();

				switch(choix) {
				case 1:
					//affichageCroissant();
					System.out.println("Affichage Croissant..");
					System.out.println("GOING BACK TO MAIN PAGE..");
					GerantClient();
					break;
				case 2:
					System.out.println("AFFICHAGE DECROISSANT..");
					System.out.println("GOING BACK TO MAIN PAGE..");
					GerantClient();
					//AffichageDECroissantTri();*/
					break;
				case 3:
					System.out.println("ALL LIST:");
					System.out.println("GOING BACK TO MAIN PAGE..");
					GerantClient();
					//Stock.toString(); /*NEED TO FIX THIS*/
					break;
				case 0:
					System.out.println("RETOUR");
					System.out.println("GOING BACK TO MAIN PAGE..");
					GerantClient();
					break;
				default:
					System.out.println("Choix invalide");
					System.out.println("GOING BACK TO MAIN PAGE..");
					GerantClient();
				}
			} while (choix != 0);
		}
/*GONNA USE TO FILL THE TABLE*/
		public static void init() {
			Stocker = new Stock();
			
			Article A1 = new Article( 1, "PC Portable Dell Vostro 3500",Article.genererReference("PC Portable Dell Vostro 3500",1) , 1999.0);
			Article A2 = new Article( 2, "EeB21 Ecouteur JBL T125BT",Article.genererReference("PC Portable Dell Vostro 3500",1) , 129.0);
			Article A3 = new Article( 3, "SpNo2 Smartphone INFINIX Hot 10",Article.genererReference("PC Portable Dell Vostro 3500",1) , 439.0);
			Article A4 = new Article( 4, "Mu8a3 Micro Casque 588 Filaire",Article.genererReference("PC Portable Dell Vostro 3500",1) , 9.9);
			Article A5 = new Article( 5, "SpA4 SmartPhone NOKIA C1",Article.genererReference("PC Portable Dell Vostro 3500",1) , 185.0);
			
			
			Stocker.ajouterArticle(A1,0);
			Stocker.ajouterArticle(A2,0);
			Stocker.ajouterArticle(A3,0);
			Stocker.ajouterArticle(A4,0);
			Stocker.ajouterArticle(A5,0);
		
		}
/*KEEPING THIS*/
		public static void main (String args[]) {
			System.out.println("PROGRAMME STARTINGS...");
			init();
			GerantMenu();
			
		}
	}
	

