package New_Projet;

import java.util.Arrays;

public class GroupeParole {
	private String lieu;
	private String jourRencontre;
	private static Psychologue[] listePsy = new Psychologue[5];
	private Benevole[] listeBen =null;
	private Aidant[] listeAidant =null;
	private static int nbPsy=0;
	private int nbBen = 0;
	private int nbAidant = 0;
	
	
	public GroupeParole(String lieu, String jourRencontre, int nbPsy, int nbBen, int nbAidant) {
		super();
		this.lieu = lieu;
		this.jourRencontre = jourRencontre;
		this.nbPsy = nbPsy;
		this.nbBen = nbBen;
		this.nbAidant = nbAidant;
	}

	public static void ajouterPsy() {
		Psychologue.afficher("Ajout d'un(e) Psychologue");
		
		String nom=Psychologue.ajouterNom();
		String prenom=Psychologue.ajouterPrenom();
		String numTel=Psychologue.ajouterNumTel();
		String mail=Psychologue.ajouterMail();
		Psychologue psy = new Psychologue(nom, prenom, numTel, mail);
		listePsy[nbPsy] = psy;
		nbPsy++;
	}
	
	public void ajouterBenvol() {
		Psychologue.afficher("Ajout d'un(e) Bénévole");
		
		String nom=Psychologue.ajouterNom();
		String prenom=Psychologue.ajouterPrenom();
		String numTel=Psychologue.ajouterNumTel();
		String mail=Psychologue.ajouterMail();
		
		listeBen[nbBen] = new Benevole(nom, prenom, numTel, mail);
		nbBen++;
	}
	
	public void ajouterAidant() {
		Psychologue.afficher("Ajout d'un(e) Aidant");
		
		String nom=Psychologue.ajouterNom();
		String prenom=Psychologue.ajouterPrenom();
		String numTel=Psychologue.ajouterNumTel();
		String mail=Psychologue.ajouterMail();
		
		listeAidant[nbAidant] = new Aidant(nom, prenom, numTel, mail, Malade.creationMalade());
		nbAidant++;

	}
	public static void main(String[] args) {
		ajouterPsy();
//		Psychologue psy = new Psychologue(Psychologue.ajouterNom(), Psychologue.ajouterPrenom(), Psychologue.ajouterNumTel(), Psychologue.ajouterMail());
//		System.out.println(psy.getNom());
//		System.out.println(listePsy);
		Arrays.toString(listePsy);
	}
	
}
