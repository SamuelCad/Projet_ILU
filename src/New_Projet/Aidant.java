package New_Projet;

import java.util.Scanner;

public class Aidant extends Personne {
	
	private String situation;
	private Malade listeMalade;
	private static Aidant[] listeAidant = new Aidant[100];
	private static int nbAidant=0;
	private static Scanner input = new Scanner(System.in);

	
	
	public Aidant(String nom, String prenom, String numTel, String Mail, String situation, Malade listeMalade) {
		super(nom, prenom, numTel, Mail);
		this.listeMalade = listeMalade;
		this.situation = situation;
	}
	
	
//	public static void ajouterAidant(Aidant aidant) {
//		listeAidant[nbAidant] = aidant;
//		nbAidant++;
//	}
	
	public Malade getListeMalade() {
		return listeMalade;
	}

	public String getSituation() {
		return situation;
	}
	
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
	
	private static int recherche(String[] liste, String lien) {
		int exist=0;
		for (int i=0; i < liste.length; i++)
	    {
	      if(liste[i].equals(lien)){
	        exist++;
	      }
	    }
	    return exist;
	}
	
	
	


	//	public void afficherListeAidant(Aidant[] aidants) {
//		String texte = "Liste des Aidants :\n\n";
//		
//		for (int i = 0; i < nbAidant; i++) {
//			Aidant aidant = listeAidant[i];
//			texte+= decompose(aidant)+ Malade.afficherMalade(listeMalade)+"\n";
//		}
//		Personne.afficher(texte);
//		Personne.afficher("\n--------------------------------\n\n");
//				
//	}
	public static void afficherNbrAidant() {
		System.out.println("Nombre d'Aidants : "+nbAidant+ " \n");
	}
	
}
