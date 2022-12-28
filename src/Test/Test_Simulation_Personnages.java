package Test;

import java.util.Random;

import projet.*;

public class Test_Simulation_Personnages {
	
	private static String[] listeNom = {"Bonomelli", "Bonometti", "Bonomo", "Borghese", "Boschetti", "Bosco", "Bosseda", "Bosselli", "Bossello", "Bossi", "Bosso", "Bottari", "Brama", "Brigante", "Briganti"};
	private static String[] listePrenom = {"Nicolas","Lea","Theo", "Thomas", "Manon", "Marie", "Kevin", "Alexandre", "Camille", "Melissa", "Maxime", "Laura", "Lucas", "Alexis"};
	private static String[] listeSituation = {"en_activité", "sans_emploi", "retraité","retraitée"};
	private static String[] listeTypeHebergement = {"institution", "famille_d'accueil", "domicile"};
	private static String[] listeTypeLien = {"parent-enfant", "épouse-époux", "soeur-frère"};

	
	public static String randomNom() {
		Random random = new Random();
		String nom=listeNom[random.nextInt(listeNom.length)];
		return nom;
	}	
	
	public static String randomPrenom() {
		Random random = new Random();
		String prenom=listePrenom[random.nextInt(listePrenom.length)];
		return prenom;
	}	
	
	public static String randomNumero() {
		Random random = new Random();
		String numero= "0696";
		numero+= Integer.toString(random.nextInt(100000, 999999)); 
		return numero;
	}	
	
	public static String randomSituation() {
		Random random = new Random();
		String situation = 	listeSituation[random.nextInt(listeSituation.length)];
		return situation;
	}
	
	public static Malade simulationMalade() {
		Random random = new Random();
		String nom=listeNom[random.nextInt(listeNom.length)];
		String hebergement=listeTypeHebergement[random.nextInt(listeTypeHebergement.length)];
		String lien=listeTypeLien[random.nextInt(listeTypeLien.length)];
		Malade malade = new Malade(nom, lien, hebergement);
		
		return malade;
	}
	
	public static void simulationPsy(GroupeParole groupe, int nbrPsy) {
		String nom, prenom, mail, numero; 
		
		for (int i=0; i<nbrPsy; i++) {
			nom=randomNom();
			prenom=randomPrenom();
			mail= nom.toLowerCase()+"."+prenom.toLowerCase()+"@gmail.com";
			numero=randomNumero();
			
			Psychologue psychologue = new Psychologue(nom, prenom, mail, numero);
			groupe.ajouterPsy(psychologue);
		}
	}
	public static void simulationBenevole(GroupeParole groupe, int nbrBenevole) {
		String nom, prenom, mail, numero; 
		
		for (int i=0; i<nbrBenevole; i++) {
			nom=randomNom();
			prenom=randomPrenom();
			mail= nom.toLowerCase()+"."+prenom.toLowerCase()+"@gmail.com";
			numero=randomNumero();
			Benevole benevole = new Benevole(nom, prenom, mail, numero);
			groupe.ajouterBenevole(benevole);
		}
	}
	
	public static void simulationAidant(GroupeParole groupe, int nbrAidant) {
		String nom, prenom, mail, numero, situation; 
		Malade malade;
		
		for (int i=0; i<nbrAidant; i++) {
			nom=randomNom();
			prenom=randomPrenom();
			mail= nom.toLowerCase()+"."+prenom.toLowerCase()+"@gmail.com";
			numero=randomNumero();
			situation= randomSituation();
			malade=simulationMalade();
			
			Aidant aidant = new Aidant(nom, prenom, mail, numero, situation, malade);
			groupe.ajouterAidant(aidant);
		}
	}


	public static void main(String[] args) {
		GroupeParole gondeau = new GroupeParole("Gondeau", "1er samedi du mois");
		GroupeParole trinite = new GroupeParole("Trinité", "2ème samedi du mois");
		GroupeParole francois = new GroupeParole("François", "3ème samedi du mois");
		GroupeParole lorrain = new GroupeParole("Lorrain", "4ème samedi du mois");
		
		simulationPsy(gondeau, 1);
		simulationPsy(trinite, 1);
		simulationPsy(francois, 1);
		simulationPsy(lorrain, 1);
		
		simulationBenevole(gondeau, 1);
		simulationBenevole(trinite, 1);
		simulationBenevole(francois, 1);
		simulationBenevole(lorrain, 1);

		simulationAidant(gondeau,5);
		simulationAidant(trinite,5);
		simulationAidant(francois,5);
		simulationAidant(lorrain,5);
		
		gondeau.afficherGroupe();
		trinite.afficherGroupe();
		francois.afficherGroupe();
		lorrain.afficherGroupe();
	}

}
