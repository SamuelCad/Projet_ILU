package Projet;

import java.util.Scanner;

public class GroupeParole {
	private String lieu;
	private String jourRencontre;
	private int nbPsychologue=0;
	private int nbBenevole=0;
	private int nbAidant=0;
	private static Scanner input = new Scanner(System.in);

		
	public GroupeParole(String lieu, String jourRencontre, int nbPschologue, int nbBenevole, int nbAidants) {
		super();
		this.lieu = lieu;
		this.jourRencontre = jourRencontre;
		this.nbPsychologue = nbPsychologue;
		this.nbBenevole = nbBenevole;
		this.nbAidant = nbAidant;
				
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getJourRencontre() {
		return jourRencontre;
	}

	public int getNbPsychologue() {
		return nbPsychologue;
	}

	public int getNbBenevole() {
		return nbBenevole;
	}

	public int getNbAidant() {
		return nbAidant;
	}
	
	private static String entrerLieu() {
		String lieu1;
		Psychologue.afficher("Entrer le nom du malade : ");
		lieu1 =input.next();
		return lieu1;
	}
	
	public void creationGroupe() {
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
