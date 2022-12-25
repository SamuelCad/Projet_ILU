package New_Projet;

public class Benevole extends Personne {
	
	private static Benevole[] listeBenevole = new Benevole[100];
	private static int nbBenevole=0;
	
	public Benevole(String nom, String prenom, String numTel, String Mail) {
		super(nom, prenom, numTel, Mail);
	}
	
//	public static void ajouterBenevole(Benevole benevole) {
//		listeBenevole[nbBenevole] = benevole;
//		nbBenevole++;
//	}
	
//	public static void afficherListeBenevole() {
//		String texte = "Liste des Benevoles :\n";
//		
//		for (int i = 0; i < nbBenevole; i++) {
//			Benevole benevole = listeBenevole[i];
//			texte+= "- "+benevole.getNom()+", "+benevole.getPrenom()+", "+benevole.getNumTel()+", "+benevole.getMail()+"\n";
//		}
//		Personne.afficher(texte);
//		Personne.afficher("\n--------------------------------\n\n");
//	}
	
	public static void afficherNbrBenevole() {
		System.out.println("Nombre de Benevoles : "+nbBenevole+ " \n");
		
	}
}
