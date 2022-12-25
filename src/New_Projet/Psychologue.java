package New_Projet;

public class Psychologue extends Personne {
	
	private static Psychologue[] listePsy = new Psychologue[100];
	public static int nbPsy=0;

	public Psychologue(String nom, String prenom, String numTel, String Mail) {
		super(nom, prenom, numTel, Mail);
	}
	
	
//	public static void ajouterPsy(Psychologue psy) {
//		listePsy[nbPsy] = psy;
//		nbPsy++;
//	}
	
//	public static void afficherListePsy() {
//		String texte = "Liste des Psychologues :\n"; 				
//		
//		for (int i = 0; i < nbPsy; i++) {
//			Psychologue psy = listePsy[i];
//			texte+= psy.decompose();
//		}
//		Personne.afficher(texte);
//		Personne.afficher("\n--------------------------------\n\n");
//				
//	}
	public static void afficherNbrPsychologue() {
		System.out.println("Nombre de Psychologue(s) : "+nbPsy+ " \n");
		
		
	}
}
