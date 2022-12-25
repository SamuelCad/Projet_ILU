package Test1;
import java.util.Iterator;
import java.util.Random;

import New_Projet.Aidant;
import New_Projet.GroupeParole;
import New_Projet.Malade;

public class ListeValTest {
	private static String[] listeNom = {"Nicolas","Lea","Theo", "Thomas", "Manon", "Marie", "Kevin", "Alexandre", "Camille", "Melissa", "Maxime", "Laura", "Lucas", "Alexis"};
	private static String[] listePrenom = {"Bonomelli", "Bonometti", "Bonomo", "Borghese", "Boschetti", "Bosco", "Bosseda", "Bosselli", "Bossello", "Bossi", "Bosso", "Bottari", "Brama", "Brigante", "Briganti"};
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
	
	public static Malade simulationMalade() {
		Random random = new Random();
		String nom=listeNom[random.nextInt(listeNom.length)];
		String hebergement=listeTypeHebergement[random.nextInt(listeTypeHebergement.length)];
		String lien=listeTypeLien[random.nextInt(listeTypeLien.length)];
		Malade malade = new Malade(nom, lien, hebergement);
		
		return malade;
	}
	
	
	public static void simulationAidant(GroupeParole groupe) {
		String nom, prenom, mail, numero; 
		Malade malade;
		for (int i=0; i<10;i++) {
			nom=randomNom();
			prenom=randomPrenom();
			mail= nom.toLowerCase()+"."+prenom.toLowerCase()+"@gmail.com";
			numero=randomNumero();
			malade=simulationMalade();
			Aidant aidant = new Aidant(nom, prenom, mail, numero, malade);
			groupe.ajouterAidant(aidant);
		}
	}

	
	
	public static void main(String[] args) {
		System.out.print(ListeValTest.randomNom()+"\n");
		System.out.print(ListeValTest.randomPrenom()+"\n");
		System.out.print(ListeValTest.randomNumero()+"\n");

	}

}
