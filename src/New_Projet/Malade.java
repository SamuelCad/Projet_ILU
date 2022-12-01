package New_Projet;

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

	private static int recherche(String[] liste, String lien) {
		int exist=0;
		for (int i=0; i < liste.length; i++)
	    {
	      if(liste[i].equals(lien)){
	        exist++;
	      }
	    }
	    return exist;
	}
	
	private static String entrerNom() {
		String nom;
		Personne.afficher("Entrer le nom du malade : ");
		nom =input.next();
		return nom;
	}
	
	private static String entrerLien() {
		String lien;
		int exist=0;
		String[] exempleLien  = {"parent-enfant", "épouse-époux", "soeur-frère", "autre"};
		
		Personne.afficher("Choisir le lien de parenté que vous avez avec le malade dans la liste suivante: parent-enfant, épouse-époux, soeur-frère, autre.\n");		
		lien=input.next();
		exist=recherche(exempleLien, lien);
		
		while (exist==0) {
			Personne.afficher("Erreur, "+lien+" n'est pas dans la liste proposer, veuilez réessayez \n");
			lien=input.next();
			exist=recherche(exempleLien, lien);
		}
		if (lien.equals("autre")) {
			Personne.afficher("Donner le lien de parenté\n");
			lien=input.next();
		}
		return lien;
	}
	
	private static String entrerTypeHeber() {
		String typeHeber;
		int exist=0;
		String[] exempleTypeHeber  = {"institution", "famille d'accueil", "domicile"};
		
		Personne.afficher("Choisir le type d'hébergement du malade dansle liste suivante: "
				+ "institution, famille d'accueil, domicile\n");
		typeHeber=input.next();
		exist=recherche(exempleTypeHeber, typeHeber);

		while (exist==0) {
			Personne.afficher("Erreur, "+typeHeber+" n'est pas dans la liste proposer, veuilez réessayez \n");
			typeHeber=input.next();
			exist=recherche(exempleTypeHeber, typeHeber);
		}
		return typeHeber;
	}

	public static String afficherMalade(Malade malade) {
		String texte= malade.getNom()+", "+malade.getLienParente()+", "+malade.getTypeHebergement();
					
		return texte;
	}
	
	public static Malade creationMalade() {
		Malade malade = new Malade(entrerNom(), entrerLien(), entrerTypeHeber());
		return malade;

		

}
}

