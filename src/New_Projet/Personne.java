package New_Projet;

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

	public static void afficher(String text) {
		System.out.print(text);
	}
	
	public static String ajouterNom() {
		String nom;
		afficher("Nom : ");
		nom =input.next();
		return nom;
	}
	
	public static String ajouterPrenom() {
		String prenom;
		afficher("Prenom : ");
		prenom =input.next();
		return prenom;
	}
	
	public static String ajouterNumTel() {
		String num;
		afficher("Numero : ");
		num =input.next();
		return num;
	}
	
	public static String ajouterMail() {
		String mail;
		afficher("Mail : ");
		mail =input.next();
		afficher("\n");
		return mail;
	
	}
}
