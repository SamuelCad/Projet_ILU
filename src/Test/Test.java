package Test;
import projet.*;


public class Test {
	

	public static void main(String[] args) {

		GroupeParole gondeau = new GroupeParole("Gondeau", "1er samedi du mois");
		GroupeParole trinite = new GroupeParole("Trinité", "2ème samedi du mois");
		GroupeParole francois = new GroupeParole("François", "3ème samedi du mois");
		GroupeParole lorrain = new GroupeParole("Lorrain", "4ème samedi du mois");
		
//		Psychologue psy = new Psychologue(Psychologue.ajouterNom(),  Personne.ajouterPrenom(), Personne.ajouterNumTel(), Personne.ajouterMail());
//		Psychologue  psy1 = new Psychologue("Cadasse", "Nicole", "0696445544", "nicole.cadasse@gmail.com");
//		Psychologue  psy2 = new Psychologue("Cadasse", "Sandrine", "069644", "nicole.cadasse");
//		Psychologue  psy3 = new Psychologue("Cadasse", "Sabrina", "5544", "cadasse@gmail.com");
//		Psychologue  psy4 = new Psychologue("Cadasse", "Sandra", "0696235544", "cadasse@gmail.com");
		
//		Benevole  benevole = new Benevole(Benevole.ajouterNom(),  Personne.ajouterPrenom(), Personne.ajouterNumTel(), Personne.ajouterMail());
//		Benevole  benevole1 = new Benevole("Cadasse", "Ralph", "0696374433", "ralph.cadasse@gmail.com");
//		Benevole  benevole2 = new Benevole("Cadasse", "Samuel", "06962523525", "sabrina.cadasse@gmail.com");
//		Benevole  benevole3 = new Benevole("Cadasse", "Sam", "0696111111", "sam.cadasse@gmail.com");
//		Benevole  benevole4 = new Benevole("Cadasse", "Samou", "06962523525", "samou.cadasse@gmail.com");
		
//		Aidant aidant = new Aidant(Aidant.ajouterNom(), Personne.ajouterPrenom(), Personne.ajouterNumTel(), Personne.ajouterMail(), Aidant.entrerSituation(), Malade.creationMalade());
//		Aidant aidant1 = new Aidant("Paze", "Coco", "0696345678", "rzgzruig.rgr@gmail.com", Aidant.entrerSituation(), ListeValTest.simulationMalade());
		
//		gondeau.ajouterPsy(psy);
//		gondeau.ajouterPsy(psy1);
//		trinite.ajouterPsy(psy2);
//		francois.ajouterPsy(psy3);
//		lorrain.ajouterPsy(psy4);
		
//		gondeau.ajouterBenevole(benevole);
//		gondeau.ajouterBenevole(benevole1);
//		trinite.ajouterBenevole(benevole2);
//		francois.ajouterBenevole(benevole3);
//		lorrain.ajouterBenevole(benevole4);
//		
//		gondeau.ajouterAidant(aidant1);
		
		Test_Simulation_Personnages.simulationPsy(gondeau, 1);
		Test_Simulation_Personnages.simulationPsy(trinite, 1);
		Test_Simulation_Personnages.simulationPsy(francois, 1);
		Test_Simulation_Personnages.simulationPsy(lorrain, 1);
		
		Test_Simulation_Personnages.simulationBenevole(gondeau, 1);
		Test_Simulation_Personnages.simulationBenevole(trinite, 1);
		Test_Simulation_Personnages.simulationBenevole(francois, 1);
		Test_Simulation_Personnages.simulationBenevole(lorrain, 1);

		Test_Simulation_Personnages.simulationAidant(gondeau,5);
		Test_Simulation_Personnages.simulationAidant(trinite,5);
		Test_Simulation_Personnages.simulationAidant(francois,5);
		Test_Simulation_Personnages.simulationAidant(lorrain,5);
		
		gondeau.afficherGroupe();
		trinite.afficherGroupe();
		francois.afficherGroupe();
		lorrain.afficherGroupe();
//		System.out.println(psy1.getClass().getSimpleName());
				
	}

}
