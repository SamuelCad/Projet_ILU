package Projet;

import java.util.Arrays;

public class Aidant extends Psychologue {
	private String[] malade;
	
	public Aidant(String nom, String prenom, String numTel, String adresseMail, String[] malade) {
		super(nom, prenom, numTel, adresseMail);
		this.malade=malade;
	}
	
	public String[] getMalade() {
		return malade;
	}
	
	private static Aidant creationAidant() {
		afficher("Création d'un Aidant");
		return new Aidant(entrerNom(), entrerPrenom(), entrerNum(), entrerMail(), Malade.creationMalade());
		
//		String[] information =  {entrerNom(),entrerPrenom(), entrerNum(),entrerMail(),Malade.creationMalade()};
//		Aidant aidant = new Aidant(entrerNom(), entrerPrenom(), entrerNum(), entrerMail(), Malade.creationMalade());
//		return Arrays.toString(information) ;
//		return aidant;
	}
	
	public static void main(String[] args) {
		Aidant a = creationAidant();
		String liste = String.join(",", a.getMalade());
//		String liste = Arrays.asList(a.getMalade()).toString();
//		afficher(liste);
		afficher(liste);
	}

}
