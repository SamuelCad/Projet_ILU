package Projet;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class MaladeNonSta {

	private String nom;
	private String lienParente;
	private String typeHebergement;
	public Malade[] information = new Malade[3];
	private static Scanner input = new Scanner(System.in);


	

	public MaladeNonSta(String nom, String lienParente, String typeHebergement) {
		super();
		this.nom = nom;
		this.lienParente = lienParente;
		this.typeHebergement = typeHebergement;
	}

	public String getNom() {
		return nom;
	}
	
	public String getLienParente() {
		return lienParente;
	}

	public String getTypeHebergement() {
		return typeHebergement;
	}
	
	
	
	public void afficher(String text) {
		System.out.println(text);
	}
	
	private int recherche(String[] liste, String lien) {
		int exist=0;
		for (int i=0; i < liste.length; i++)
	    {
	      if(liste[i].equals(lien)){
	        exist++;
	      }
	    }
	    return exist;
	}
	
	private String entrerNom() {		
		afficher("Entrer le nom du malade : ");
		String nom =input.next();
		return nom;
	}
	
	private String entrerLien() {
		String lien;
		int exist=0;
		String[] exempleLien  = {"parent-enfant", "épouse-époux", "soeur-frère", "autre"};
		
		afficher("Choisir le lien de parenté que vous avez avec le malade dans la liste suivante: parent-enfant, épouse-époux, soeur-frère, autre.");		
		lien=input.next();
		exist=recherche(exempleLien, lien);
		
		while (exist==0) {
			afficher("Erreur, "+lien+" n'est pas dans la liste proposer, veuilez réessayez ");
			lien=input.next();
			exist=recherche(exempleLien, lien);
		}
		if (lien.equals("autre")) {
			afficher("Donner le lien de parenté");
			lien=input.next();
		}
		return lien;
	}
	
	private String entrerTypeHeber() {
		String typeHeber;
		int exist=0;
		String[] exempleTypeHeber  = {"institution", "famille d'accueil", "domicile"};
		
		afficher("Choisir le type d'hébergement du malade dansle liste suivante: "
				+ "institution, famille d'accueil, domicile");
		typeHeber=input.next();
		exist=recherche(exempleTypeHeber, typeHeber);

		while (exist==0) {
			afficher("Erreur, "+typeHeber+" n'est pas dans la liste proposer, veuilez réessayez ");
			typeHeber=input.next();
			exist=recherche(exempleTypeHeber, typeHeber);
		}
		return typeHeber;
	}	
	
	public MaladeNonSta creationMaladeS() {
		String a=entrerNom();
		String b=entrerLien();
		String c=entrerTypeHeber();
		MaladeNonSta nom = new MaladeNonSta(a, b, c);
		
		
		return nom;
	
	}

	
	
	public static void main(String[] args) {
		Malade sam = new Malade("Sam","parent-enfant" ,"institution");
		afficher(sam.getNom());
		
		
		

	}

}
