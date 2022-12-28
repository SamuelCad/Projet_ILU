package projet;

import java.util.Scanner;

public class Malade {
	private String nom;
	private String lienParente;
	private String typeHebergement;
	private static Scanner input = new Scanner(System.in);

	
	public Malade(String nom, String lienParente, String typeHebergement) {
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
	
	private static String entrerNom() {
		String nom;
		System.out.print("Entrer le nom du malade : ");
		nom =input.next();
		return nom;
	}
	
	private static String entrerLien() {
		String lien;
		int exist= 0;
		String[] exempleLien  = {"parent-enfant", "enfant-parent", "épouse-époux", "époux-épouse", "soeur-frère", "frère-soeur", "autre"};
		System.out.println("Choisir le lien de parenté de l'aidant avec le malade dans la liste suivante: parent-enfant, épouse-époux, soeur-frère, autre.");		
		lien=input.next();
		exist=Aidant.recherche(exempleLien, lien);
		
		while (exist==0) {
			System.out.println("Erreur, "+lien+" n'est pas dans la liste proposée, veuillez réessayer ");
			lien=input.next();
			exist=Aidant.recherche(exempleLien, lien);
		}
		if (lien.equals("autre")) {
			System.out.println("Donner le lien de parenté");
			lien=input.next();
		}
		
		return lien;
	}
	
	private static String entrerTypeHeber() {
		String typeHeber;
		int exist=0;
		String[] exempleTypeHeber  = {"institution", "famille_d'accueil", "domicile"};
		
		System.out.println("Choisir le type d'hébergement du malade dansle liste suivante: "
				+ "institution, famille_d'accueil, domicile");
		typeHeber=input.next();
		exist=Aidant.recherche(exempleTypeHeber, typeHeber);

		while (exist==0) {
			System.out.println("Erreur, "+typeHeber+" n'est pas dans la liste proposer, veuilez réessayez ");
			typeHeber=input.next();
			exist=Aidant.recherche(exempleTypeHeber, typeHeber);
		}
		return typeHeber;
	}

	public static String decomposeMalade(Malade malade) {
		String texte= " Nom du malade : "+malade.getNom()
		+"\n Lien de parenté avec l'aidant : "+malade.getLienParente()
		+"\n Type d'hébergement : "+malade.getTypeHebergement();
					
		return texte;
	}
		
	public static Malade creationMalade() {
		Malade malade = new Malade(entrerNom(), entrerLien(), entrerTypeHeber());
		return malade;		
	}
	
}

