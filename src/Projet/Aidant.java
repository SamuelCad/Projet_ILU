package projet;

import java.util.Scanner;

public class Aidant extends Personne {
	
	private String situation;
	private Malade listeMalade;
	private static Scanner input = new Scanner(System.in);

	
	public Aidant(String nom, String prenom, String numTel, String Mail, String situation, Malade listeMalade) {
		super(nom, prenom, numTel, Mail);
		this.listeMalade = listeMalade;
		this.situation = situation;
	}
	
	public Malade getListeMalade() {
		return listeMalade;
	}

	public String getSituation() {
		return situation;
	}
	
	/**
	 * Retourne le nom saisi par l'utilisateur
	 * 
	 * @return String
	 */
	public static String ajouterNom() {
		String nom;
		System.out.print("Création d'un(e) Aidant(e) :\n" +
					"Nom : ");
		nom =input.next();
		return nom;
	}
	
	/**
	 * Retourne la situation choisie par l'utilisateur parmi une liste proposée
	 *  
	 * @return String
	 */
	public static String entrerSituation() {
		String sitution;
		int exist=0;
		String[] exempleSituation  = {"en_activité", "sans_emploi", "retraité","retraitée"};
		
		System.out.println("Choisir la situation de l'aidant dans la liste suivante: en_activité, sans_emploi, retraité(e), autre.");		
		sitution=input.next();
		exist=recherche(exempleSituation, sitution);
		
		while (exist==0) {
			System.out.println("Erreur, "+sitution+" n'est pas dans la liste proposée, veuillez réessayer ");
			sitution=input.next();
			exist=recherche(exempleSituation, sitution);
		}
		if (sitution.equals("autre")) {
			System.out.println("Donner la situation");
			sitution=input.next();
		}
		
		return sitution;
	}
	
	/**
	 * Retourne 0 si mots n'est pas présent dans la liste 
	 * Retourne 1 si mots est présent dans la liste 
	 *  
	 * @param liste
	 * @param mot
	 * @return int
	 */
	public static int recherche(String[] liste, String mots) {
		int exist=0;
		for (int i=0; i < liste.length; i++)
	    {
	      if(liste[i].equals(mots)){
	        exist++;
	      }
	    }
	    return exist;
	}
}
