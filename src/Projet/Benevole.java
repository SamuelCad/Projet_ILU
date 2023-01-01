package projet;

import java.util.Scanner;

public class Benevole extends Personne {
	
	private static Scanner input = new Scanner(System.in);
	
	public Benevole(String nom, String prenom, String numTel, String Mail) {
		super(nom, prenom, numTel, Mail);
	}
	
	/**
	 * Retourne le nom saisi par l'utilisateur
	 * 
	 * @return String
	 */
	public static String ajouterNom() {
		String nom;
		System.out.print("Création d'un(e) Bénévole :\n" +
					"Nom : ");
		nom =input.next();
		return nom;
	}
}