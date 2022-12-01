package New_Projet;

import java.util.Arrays;

public class GroupeParole {
	private String lieu;
	private String jourRencontre;
	private Psychologue[] listePsychologue;
	private Benevole[] listeBenevole  =null;
	private Aidant[] listeAidant =null;
	private int nbBen = 0;
	private int nbAidant = 0;
	
	
	public GroupeParole(String lieu, String jourRencontre, Psychologue[] listePsychologue, Benevole[] listeBenevole,
			Aidant[] listeAidant) {
		super();
		this.lieu = lieu;
		this.jourRencontre = jourRencontre;
		this.listePsychologue = listePsychologue;
		this.listeBenevole =listeBenevole;
		this.listeAidant = listeAidant;
	}

	
	public String getLieu() {
		return lieu;
	}

	public String getJourRencontre() {
		return jourRencontre;
	}

	public void afficherGroupe() {
		Personne.afficher("Groupe de Parole de "+ lieu +"\n");
		Personne.afficher("Date de rencontre : "+ jourRencontre+"\n\n" );
		Psychologue.afficherListePsy();
		Benevole.afficherListeBenevole();
		Aidant.afficherListeAidant();
		
		
	}




	public static void main(String[] args) {

	}
	
}
