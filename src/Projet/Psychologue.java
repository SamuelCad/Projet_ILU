package projet;

import java.util.Scanner;

public class Psychologue extends Personne {

	private static Scanner input = new Scanner(System.in);

	public Psychologue(String nom, String prenom, String numTel, String Mail) {
		super(nom, prenom, numTel, Mail);
	}
	
	public static String ajouterNom() {
		String nom;
		System.out.print("Création d'un(e) Psychologue :\n" + 
					"Nom : ");
		nom =input.next();
		return nom;
	}
}