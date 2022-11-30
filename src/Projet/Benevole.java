package Projet;

import java.util.Arrays;

public class Benevole extends Psychologue {
	
	
	public Benevole(String nom, String prenom, String numTel, String adresseMail) {
		super(nom, prenom, numTel, adresseMail);
	}
	
	public static Benevole creationBenevole() {
		afficher("Création d'un Bénévole");
//		String[] information =  {entrerNom(),entrerPrenom(), entrerNum(),entrerMail()};
		Benevole benevole = new Benevole(entrerNom(), entrerPrenom(), entrerNum(), entrerMail());

//		return Arrays.toString(information) ;
		return benevole;
	}
	public static void main(String[] args) {
		Benevole a= creationBenevole();
		afficher(a.getNom());
		afficher(a.getPrenom());
		afficher(a.getNumTel());
		afficher(a.getAdresseMail());
	}

}
