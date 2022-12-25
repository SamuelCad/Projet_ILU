package Test1;
import New_Projet.*;


public class Test {
	

	public static void main(String[] args) {

		GroupeParole gondeau = new GroupeParole("Gondeau", "1er samedi du mois");
		GroupeParole trinite = new GroupeParole("Trinité", "2ème samedi du mois");
		GroupeParole francois = new GroupeParole("François", "3ème samedi du mois");
		GroupeParole lorrain = new GroupeParole("Lorrain", "4ème samedi du mois");
		
//		Psychologue psy = new Psychologue(Personne.ajouterNom(),  Personne.ajouterPrenom(), Personne.ajouterNumTel(), Personne.ajouterMail());
		Psychologue  psy1 = new Psychologue("Cadasse", "Nicole", "0696445544", "nicole.cadasse@gmail.com");
		Psychologue  psy2 = new Psychologue("Cadasse", "Sandrine", "069644", "nicole.cadasse");
		Psychologue  psy3 = new Psychologue("Cadasse", "Sabrina", "5544", "adasse@gmail.com");
		
//		Benevole  benevole = new Benevole(Personne.ajouterNom(),  Personne.ajouterPrenom(), Personne.ajouterNumTel(), Personne.ajouterMail());
		Benevole  benevole1 = new Benevole("Cadasse", "Ralph", "0695541313", "sandrine.cadasse@gmail.com");
		Benevole  benevole2 = new Benevole("Cadasse", "Samuel", "06962523525", "sabrina.cadasse@gmail.com");
		
//		Aidant aidant = new Aidant(Personne.ajouterNom(), Personne.ajouterPrenom(), Personne.ajouterNumTel(), Personne.ajouterMail(), Malade.creationMalade());
		Aidant aidant1 = new Aidant("Paze", "Coco", "0696345678", "rzgzruig.rgr@gmail.com", ListeValTest.simulationMalade());
		
		
//		gondeau.ajouterPsy(psy);
		gondeau.ajouterPsy(psy1);
		trinite.ajouterPsy(psy2);
		francois.ajouterPsy(psy3);
		
		gondeau.ajouterBenevole(benevole1);
		trinite.ajouterBenevole(benevole2);
//		
		gondeau.ajouterAidant(aidant1);

//		ListeValTest.simulationAidant(gondeau);
//		ListeValTest.simulationAidant(trinite);
//		ListeValTest.simulationAidant(francois);
		
		gondeau.afficherGroupe();
		trinite.afficherGroupe();
		francois.afficherGroupe();
		lorrain.afficherGroupe();
				
	}

}
