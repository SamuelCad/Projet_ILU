package Test;

import java.util.Random;

import projet.*;

public class Test_Simulation_Personnages {
	
	private static String[] listeNom = {"Bonomelli", "Bonometti", "Bonomo", "Borghese", "Boschetti", "Bosco", "Bosseda", "Bosselli", "Bossello", "Bossi", "Bosso", "Bottari", "Brama", "Brigante", "Briganti"};
	private static String[] listePrenom = {"Nicolas","Lea","Theo", "Thomas", "Manon", "Marie", "Kevin", "Alexandre", "Camille", "Melissa", "Maxime", "Laura", "Lucas", "Alexis"};
	private static String[] listeSituation = {"en_activité", "sans_emploi", "retraité","retraitée"};
	private static String[] listeTypeHebergement = {"institution", "famille_d'accueil", "domicile"};
	private static String[] listeTypeLien = {"parent-enfant", "épouse-époux", "soeur-frère"};

	/**
	 * Retourne un nom tiré au hasard dans la liste de nom
	 * @return String
	 */
	public static String randomNom() {
		Random random = new Random();
		String nom=listeNom[random.nextInt(listeNom.length)];
		return nom;
	}	
	
	/**
	 * Retourne un prénom tiré au hasard dans la liste de prénom
	 * @return String
	 */
	public static String randomPrenom() {
		Random random = new Random();
		String prenom=listePrenom[random.nextInt(listePrenom.length)];
		return prenom;
	}	
	
	/**
	 * Retourne un numéro de téléphone tiré au hasard dans la liste de numéro de téléphone
	 * @return String
	 */
	public static String randomNumero() {
		Random random = new Random();
		String numero= "0696";
		numero+= Integer.toString(random.nextInt(100000, 999999)); 
		return numero;
	}	
	
	/**
	 * Retourne une situation tirée au hasard dans la liste de situation
	 * @return String
	 */
	public static String randomSituation() {
		Random random = new Random();
		String situation = 	listeSituation[random.nextInt(listeSituation.length)];
		return situation;
	}
	
	/**
	 * Retourne un objet du type Malade créé avec un nom, un lien de parenté 
	 * et un type d'hébergement tiré au hasard dans une liste prédéfinie
	 
	 * @return String
	 */
	public static Malade simulationMalade() {
		Random random = new Random();
		String nom=listeNom[random.nextInt(listeNom.length)];
		String lien=listeTypeLien[random.nextInt(listeTypeLien.length)];
		String hebergement=listeTypeHebergement[random.nextInt(listeTypeHebergement.length)];
		Malade malade = new Malade(nom, lien, hebergement);
		
		return malade;
	}
	
	/**
	 * Créé et ajoute un nombre de Psychologue défini dans un groupe
	 * 
	 * @param groupe
	 * @param nbrPsy
	 */
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
	
	/**
	 * Créé et ajoute un nombre de Bénévole défini dans un groupe
	 * 
	 * @param groupe
	 * @param nbrBenevole
	 */
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
	
	/**
	 * Créé et ajoute un nombre d'Aidant défini dans un groupe
	 * 
	 * @param groupe
	 * @param nbrAidant
	 */
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
		
		/*
		 * Création des objets : Groupes de paroles
		 */
		GroupeParole gondeau = new GroupeParole("Gondeau", "1er samedi du mois");
		GroupeParole trinite = new GroupeParole("Trinité", "2ème samedi du mois");
		GroupeParole francois = new GroupeParole("François", "3ème samedi du mois");
		GroupeParole lorrain = new GroupeParole("Lorrain", "4ème samedi du mois");
		
		/*
		 * Création de Psychologue, de Bénévole et d'Aidant
		 */
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
		
		/*
		 * Affichage des groupes de parole
		 */
		gondeau.afficherGroupe();
		trinite.afficherGroupe();
		francois.afficherGroupe();
		lorrain.afficherGroupe();
		
		/*
		 * Affichage du nombre de malade qui ont le même type d'hébergement
		 */
		gondeau.rechercheNbrHebergement("institution");
		trinite.rechercheNbrHebergement("famille_d'accueil");
		francois.rechercheNbrHebergement("domicile");
		lorrain.rechercheNbrHebergement("institution");
		
		/*
		 * Affichage du nombre de personne qui ont le même lien de parenté avec leurs malades
		 */
		gondeau.rechercheNbrTypeLien("parent-enfant");
		trinite.rechercheNbrTypeLien("épouse-époux");
		francois.rechercheNbrTypeLien("soeur-frère");
		lorrain.rechercheNbrTypeLien("parent-enfant");
	}

}
