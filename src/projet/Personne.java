package projet;

import java.util.Scanner;

public class Personne {
	private String nom;
	private String prenom;
	private String numTel;
	private String Mail;
	private static Scanner input = new Scanner(System.in);
	
	
	public Personne(String nom, String prenom, String numTel, String Mail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.Mail = Mail;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}

	public String getNumTel() {
		return numTel;
	}

	public String getMail() {
		return Mail;
	}
	/**
	 * Retourne le prénom saisi par l'utilisateur
	 * 
	 * @return String
	 */
	public static String ajouterPrenom() {
		String prenom;
		System.out.print("Prenom : ");
		prenom =input.next();
		return prenom;
	}
	
	/**
	 * Retourne le téléphone saisi par l'utilisateur
	 * 
	 * @return String
	 */
	public static String ajouterNumTel() {
		String tel;
		System.out.print("Téléphone : ");
		tel =input.next();
		return tel;
	}
	
	/**
	 * Retourne le mail saisi par l'utilisateur
	 * 
	 * @return String
	 */
	public static String ajouterMail() {
		String mail;
		System.out.print("Mail : ");
		mail =input.next();
		System.out.print("\n");
		return mail;
	
	}
}
