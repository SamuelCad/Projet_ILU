package projet;

public class GroupeParole {
	
	private String lieu;
	private String jourRencontre;
	private Psychologue[] listePsychologue= new Psychologue[100];
	private Benevole[] listeBenevole = new Benevole[100];
	private Aidant[] listeAidant = new Aidant[100];
	private int nbPsy = 0;
	private int nbBenevole = 0;
	private int nbAidant = 0;
	
	public GroupeParole(String lieu, String jourRencontre) {
		super();
		this.lieu = lieu;
		this.jourRencontre = jourRencontre;
	}
	
	
	public String getLieu() {
		return lieu;
	}
	
	public String getJourRencontre() {
		return jourRencontre;
	}
	
	public Psychologue[] getListePsychologue() {
		return listePsychologue;
	}

	public Benevole[] getListeBenevole() {
		return listeBenevole;
	}

	public Aidant[] getListeAidant() {
		return listeAidant;
	}

	/**
	 * Retourne les attributs de la classe Personne sous forme de string.
	 *
	 * Exemple :
	 * Nom : .....
	 * Prénom : .....
	 * Téléphone : .....
	 * Mail : .....
	 *
	 * @param personne
	 * @return String
	 */
	private String decompose(Personne personne) {
		String texte=" Nom : "+personne.getNom()+
				"\n Prénom : "+personne.getPrenom()+
				"\n Téléphone : "+personne.getNumTel()+
				"\n Mail : "+personne.getMail()+"\n";
		return texte;
	}
	
	/**
	 * Retourne les attributs de la classe Aidant sous forme de string
	 *
	 * Exemple :
	 * Nom : .....
	 * Prénom : .....
	 * Téléphone : .....
	 * Mail : .....
	 * Situation : .....
	 * decomposeMalade(aidant.getListeMalade())
	 *
	 * @param aidant
	 * @return String
	 */
	
	private String decomposeAidant(Aidant aidant) {
		String texte = " Nom : "+aidant.getNom()+
				"\n Prénom : "+aidant.getPrenom()+
				"\n Téléphone : "+aidant.getNumTel()+
				"\n Mail : "+aidant.getMail()+
				"\n Situation : "+ aidant.getSituation()+
				"\n\n"+
				Malade.decomposeMalade(aidant.getListeMalade())+"\n\n";
		
		return texte;
	}
	
	/**
	 * Affiche la liste des Psychologues
	 * 
	 * @param listePsychologue
	 */
	private void afficherListePsy(Psychologue[] listePsychologue) {
		String texte = "Psychologue :\n"; 				
		for (int i = 0; i < nbPsy; i++) {
			Psychologue psy = listePsychologue[i];
			texte+= decompose(psy);;
		}
		System.out.print(texte);
	}
	
	/**
	 * Affiche la liste des Bénévoles
	 * 
	 * @param listeBenevoles
	 */
	private void afficherListeBenevole(Benevole[] listeBenevoles) {
		String texte = "\nBénévole :\n";
		
		for (int i = 0; i < nbBenevole; i++) {
			Benevole benevole = listeBenevoles[i];
			texte+= decompose(benevole);
		}
		System.out.println(texte);
	}
	
	/**
	 * Affiche les Intervenants : Psychologues et Bénévoles
	 */
	private void afficherIntervenants() {
		System.out.println("Intervenants (équipe binôme) :");
		afficherListePsy(getListePsychologue());
		afficherListeBenevole(getListeBenevole());		
	}
	
	/**
	 * Affiche la liste des Aidants
	 * @param listeAidant
	 */
	private void afficherListeAidant(Aidant[] listeAidant) {
		String texte = "Liste des Aidants :\n";
		
		for (int i = 0; i < nbAidant; i++) {
			Aidant aidant = listeAidant[i];
			texte+= decomposeAidant(aidant) + "**********\n";
		}
		System.out.print(texte);		
	}
	
	/**
	 * Ajoute le Psychologue à la liste des Psychologues
	 * @param psy
	 */
	public void ajouterPsy(Psychologue psy) {
		listePsychologue[nbPsy] = psy;
		nbPsy++;
	}
	
	/**
	 * Ajoute le Bénévole à la liste des Bénévoles
	 * 
	 * @param benevole
	 */
	public void ajouterBenevole(Benevole benevole) {
		listeBenevole[nbBenevole] = benevole;
		nbBenevole++;
	}
	
	/**
	 * Ajoute l'Aidant à la liste des Aidants
	 * 
	 * @param aidant
	 */
	public void ajouterAidant(Aidant aidant) {
		listeAidant[nbAidant] = aidant;
		nbAidant++;
	}
	
	public void afficherGroupe() {
		System.out.println("\n--------------------------------\n" 
							+ "Groupe de Parole de/du "+ lieu
							+ "\nDate de rencontre : "+ jourRencontre+"\n" 
							+ "**********\n");
		
		afficherIntervenants();
		System.out.println("**********");
		afficherListeAidant(listeAidant);

	}

	
}
