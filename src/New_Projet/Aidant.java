package New_Projet;

public class Aidant extends Personne {
	
	private Malade listeMalade;
	private static Aidant[] listeAidant = new Aidant[100];
	private static int nbAidant=0;
	
	
	public Aidant(String nom, String prenom, String numTel, String Mail, Malade listeMalade) {
		super(nom, prenom, numTel, Mail);
		this.listeMalade = listeMalade;
	}
	
	
//	public static void ajouterAidant(Aidant aidant) {
//		listeAidant[nbAidant] = aidant;
//		nbAidant++;
//	}
	
	public Malade getListeMalade() {
		return listeMalade;
	}


	//	public void afficherListeAidant(Aidant[] aidants) {
//		String texte = "Liste des Aidants :\n\n";
//		
//		for (int i = 0; i < nbAidant; i++) {
//			Aidant aidant = listeAidant[i];
//			texte+= decompose(aidant)+ Malade.afficherMalade(listeMalade)+"\n";
//		}
//		Personne.afficher(texte);
//		Personne.afficher("\n--------------------------------\n\n");
//				
//	}
	public static void afficherNbrAidant() {
		System.out.println("Nombre d'Aidants : "+nbAidant+ " \n");
	}
	
}
