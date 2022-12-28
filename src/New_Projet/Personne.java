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
	
	public static String ajouterNom() {
		
		String nom, Class;
//		Class = .getClass().getSimpleName();
//		System.out.println("Création "+Class);
		System.out.print("Nom : ");
		nom =input.next();
		return nom;
	}
	
	public static String ajouterPrenom() {
		String prenom;
		System.out.print("Prenom : ");
		prenom =input.next();
		return prenom;
	}
	
	public static String ajouterNumTel() {
		String num;
		System.out.print("Numero : ");
		num =input.next();
		return num;
	}
	
	public static String ajouterMail() {
		String mail;
		System.out.print("Mail : ");
		mail =input.next();
		System.out.print("\n");
		return mail;
	
	}
	
//	private String decompose() {
//		String texte="- "+this.getNom()+", "+this.getPrenom()+", "+this.getNumTel()+", "+this.getMail()+"\n";
//		return texte;
//	}
}
