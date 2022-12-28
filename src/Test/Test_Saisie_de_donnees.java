package Test;

import projet.*;

public class Test_Saisie_de_donnees {

	

	public static void main(String[] args) {
		GroupeParole gondeau = new GroupeParole("Gondeau", "1er samedi du mois");
		GroupeParole trinite = new GroupeParole("Trinité", "2ème samedi du mois");
		GroupeParole francois = new GroupeParole("François", "3ème samedi du mois");
		GroupeParole lorrain = new GroupeParole("Lorrain", "4ème samedi du mois");
		
		Psychologue psy = new Psychologue(Psychologue.ajouterNom(),  Personne.ajouterPrenom(), Personne.ajouterNumTel(), Personne.ajouterMail());
		Benevole  benevole = new Benevole(Benevole.ajouterNom(),  Personne.ajouterPrenom(), Personne.ajouterNumTel(), Personne.ajouterMail());
		Aidant aidant = new Aidant(Aidant.ajouterNom(), Personne.ajouterPrenom(), Personne.ajouterNumTel(), Personne.ajouterMail(), Aidant.entrerSituation(), Malade.creationMalade());

		gondeau.ajouterPsy(psy);
		gondeau.ajouterBenevole(benevole);
		gondeau.ajouterAidant(aidant);

		gondeau.afficherGroupe();
		trinite.afficherGroupe();
		francois.afficherGroupe();
		lorrain.afficherGroupe();
		
		
	}

}
