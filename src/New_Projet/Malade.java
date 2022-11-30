package New_Projet;

import java.util.Scanner;

import Projet.Psychologue;

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
		Psychologue.afficher("Entrer le nom du malade : ");
		nom =input.next();
		return nom;
	}
	
	private static String entrerLien() {
		String lien;
		int exist=0;
		String[] exempleLien  = {"parent-enfant", "épouse-époux", "soeur-frère", "autre"};
		
		Psychologue.afficher("Choisir le lien de parenté que vous avez avec le malade dans la liste suivante: parent-enfant, épouse-époux, soeur-frère, autre.");		
		lien=input.next();
		exist=recherche(exempleLien, lien);
		
		while (exist==0) {
			Psychologue.afficher("Erreur, "+lien+" n'est pas dans la liste proposer, veuilez réessayez ");
			lien=input.next();
			exist=recherche(exempleLien, lien);
		}
		if (lien.equals("autre")) {
			Psychologue.afficher("Donner le lien de parenté");
			lien=input.next();
		}
		return lien;
	}
	
	private static String entrerTypeHeber() {
		String typeHeber;
		int exist=0;
		String[] exempleTypeHeber  = {"institution", "famille d'accueil", "domicile"};
		
		Psychologue.afficher("Choisir le type d'hébergement du malade dansle liste suivante: "
				+ "institution, famille d'accueil, domicile");
		typeHeber=input.next();
		exist=recherche(exempleTypeHeber, typeHeber);

		while (exist==0) {
			Psychologue.afficher("Erreur, "+typeHeber+" n'est pas dans la liste proposer, veuilez réessayez ");
			typeHeber=input.next();
			exist=recherche(exempleTypeHeber, typeHeber);
		}
		return typeHeber;
	}
	public static String[] creationMalade() {
		String[] information = {entrerNom(),entrerLien(), entrerTypeHeber()};
//		return Arrays.toString(information) ;
		return information;
//		Malade malade = new Malade(entrerNom(), entrerLien(), entrerTypeHeber());
//		return malade;

}
}

