package Test1;
import New_Projet.*;

public class Test {

	public static void main(String[] args) {
		Psychologue  psy1 = new Psychologue("Cadasse", "Nicole", "0696445544", "nicole.cadasse@gmail.com");
		Benevole  benevole1 = new Benevole("Cadasse", "Sandrine", "0695541313", "sandrine.cadasse@gmail.com");
		Benevole  benevole2 = new Benevole("Cadasse", "Sabrina", "06962523525", "sabrina.cadasse@gmail.com");
//		Aidant aidant1 = new Aidant(Personne.ajouterNom(), Personne.ajouterPrenom(), Personne.ajouterNumTel(), Personne.ajouterMail(), Malade.creationMalade());
		GroupeParole smyrne = new GroupeParole("Smyrne", "3ème mercredi du mois", Psychologue.getListePsy(), Benevole.getListeBenevole(), Aidant.getListeAidant());
		
		Psychologue.ajouterPsy(psy1);
//		Psychologue.afficherNbrPsychologue();
//		Psychologue.afficherListePsy();
//		
		Benevole.ajouterBenevole(benevole1);
		Benevole.ajouterBenevole(benevole2);
//		Benevole.afficherNbrBenevole();
//		Benevole.afficherListeBenevole();
//		
//		Aidant.ajouterAidant(aidant1);
//		Aidant.afficherNbrAidant();
//		Aidant.afficherListeAidant();
		
		smyrne.afficherGroupe();
	}

}
