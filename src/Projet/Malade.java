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
	
	/**
	 * Retourne le nom du malade saisi par l'utilisateur
	 * 
	 * @return String
	 */
	private static String entrerNom() {
		String nom;
		System.out.print("Entrer le nom du malade : ");
		nom =input.next();
		return nom;
	}
	
	/**
	 * Retourne le lien de parenté entre l'aidant et le malade choisi
	 * par l'utilisateur parmi une liste proposée
	 *  
	 * @return String
	 */
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
	
	/**
	 * Retourne le type d'hébergement du malade choisi par l'utilisateur 
	 * parmi une liste proposée
	 *  
	 * @return String
	 */
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

	/**
	 * Retourne les attributs de la classe Malade sous forme de string.
	 *
	 * Exemple :
	 * Nom du malade  : .....
	 * Lien de parenté avec l'aidant : .....
	 * Type d'hébergement : .....
	 *
	 * @param malade
	 * @return String
	 */
	public static String decomposeMalade(Malade malade) {
		String texte= " Nom du malade : "+malade.getNom()
		+"\n Lien de parenté avec l'aidant : "+malade.getLienParente()
		+"\n Type d'hébergement : "+malade.getTypeHebergement();
					
		return texte;
	}
		
	/**
	 * Création de l'objet malade et retour de celui-ci
	 * @return Malade
	 */
	public static Malade creationMalade() {
		Malade malade = new Malade(entrerNom(), entrerLien(), entrerTypeHeber());
		return malade;		
	}
	
}

