package New_Projet;

public class Psychologue extends Personne {
	private static Psychologue[] listePsy = new Psychologue[100];
	private static int nbPsy=0;

	public Psychologue(String nom, String prenom, String numTel, String Mail) {
		super(nom, prenom, numTel, Mail);
	}
	
	public static Psychologue[] getListePsy() {
		return listePsy;
	}

	public static void ajouterPsy(Psychologue psy) {
		listePsy[nbPsy] = psy;
		nbPsy++;
	}
	
	public static void afficherListePsy() {
		String texte; 				
		if (nbPsy<=1) {
			texte = "Liste de Psychologue :\n\n";
		} else {
			texte = "Liste des Psychologues :\n\n";
		}
		for (int i = 0; i < nbPsy; i++) {
			Psychologue psy = listePsy[i];
			texte+= "- "+psy.getNom()+", "+psy.getPrenom()+", "+psy.getNumTel()+", "+psy.getMail()+"\n";
		}
		Personne.afficher(texte);
		Personne.afficher("\n--------------------------------\n\n");
				
	}
	public static void afficherNbrPsychologue() {
		if (nbPsy<=1) {
			System.out.println("Nombre de Psychologue : "+nbPsy+ " \n");
		} else {
			System.out.println("Nombre de Psychologue(s) : "+nbPsy+ " \n");
		} 
		
	}
}
