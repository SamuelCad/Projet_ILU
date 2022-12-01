package New_Projet;

public class Aidant extends Personne {
	private static Malade listeMalade;
	private static Aidant[] listeAidant = new Aidant[100];
	private static int nbAidant=0;
	
	
	public Aidant(String nom, String prenom, String numTel, String Mail, Malade listeMalade) {
		super(nom, prenom, numTel, Mail);
		this.listeMalade = listeMalade;
	}
	
	public static Aidant[] getListeAidant() {
		return listeAidant;
	}


	public Malade getListeMalade() {
		return listeMalade;
	}

	public static void ajouterAidant(Aidant aidant) {
		listeAidant[nbAidant] = aidant;
		nbAidant++;
	}
	
	public static void afficherListeAidant() {
		String texte;
		if (nbAidant<=1) {
			texte = "Liste d'Aidant :\n\n";
		} else {
			texte = "Liste des Aidants :\n\n";
		}
		
		for (int i = 0; i < nbAidant; i++) {
			Aidant aidant = listeAidant[i];
			texte+= "- "+aidant.getNom()+", "+aidant.getPrenom()+", "+aidant.getNumTel()+", "+aidant.getMail()+ 
					Malade.afficherMalade(listeMalade)+"\n";
		}
		Personne.afficher(texte);
		Personne.afficher("\n--------------------------------\n\n");
				
	}
	public static void afficherNbrAidant() {
		if (nbAidant<=1) {
			System.out.println("Nombre d'Aidant : "+nbAidant+ " \n");
		} else {
			System.out.println("Nombre d'Aidants : "+nbAidant+ " \n");
		}
		
	}
	
}
