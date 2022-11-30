package New_Projet;

import java.util.Scanner;

public class Psychologue {
	private String nom;
	private String prenom;
	private String numTel;
	private String Mail;
	private static Scanner input = new Scanner(System.in);
	
	
	public Psychologue(String nom, String prenom, String numTel, String Mail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.Mail = Mail;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static void afficher(String text) {
		System.out.println(text);
	}
	
	public static String ajouterNom() {
		String nom;
		afficher("nom : ");
		nom =input.next();
		return nom;
	}
	
	public static String ajouterPrenom() {
		String prenom;
		afficher("prenom : ");
		prenom =input.next();
		return prenom;
	}
	
	public static String ajouterNumTel() {
		String num;
		afficher("numero : ");
		num =input.next();
		return num;
	}
	
	public static String ajouterMail() {
		String mail;
		afficher("mail : ");
		mail =input.next();
		return mail;
	
	}
}
