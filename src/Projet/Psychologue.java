package Projet;

import java.util.Arrays;
import java.util.Scanner;

public class Psychologue {
	private String nom;
	private String prenom;
	private String numTel;
	private String adresseMail;
	private static Scanner input = new Scanner(System.in);

	
	
	public Psychologue(String nom, String prenom, String numTel, String adresseMail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numTel = numTel;
		this.adresseMail = adresseMail;
	}

	public static void afficher(String text) {
		System.out.println(text);
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

	public String getAdresseMail() {
		return adresseMail;
	}

	
	
	protected static String entrerNom() {
		String nom;
		afficher("nom : ");
		nom =input.next();
		return nom;
	}
	
	protected static String entrerPrenom() {
		String prenom;
		afficher("prenom : ");
		prenom =input.next();
		return prenom;
	}
	
	protected static String entrerNum() {
		String num;
		afficher("numero : ");
		num =input.next();
		return num;
	}
	
	protected static String entrerMail() {
		String mail;
		afficher("mail : ");
		mail =input.next();
		return mail;
	}
	
	public static Psychologue creationPsychologue() {
		afficher("Création d'un Psychologue");
//		String[] information =  {entrerNom(),entrerPrenom(), entrerNum(),entrerMail()};
		Psychologue psychologue = new Psychologue(entrerNom(), entrerPrenom(), entrerNum(), entrerMail());

//		return Arrays.toString(information) ;
		return psychologue;
	}

	public static void main(String[] args) {
		Psychologue m =creationPsychologue();
	}

}
