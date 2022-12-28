package New_Projet;

public class GroupeParole {
	
	private Malade listeMalade;

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
	
	
//	public GroupeParole(String lieu, String jourRencontre, Psychologue[] listePsychologue, Benevole[] listeBenevole,
//			Aidant[] listeAidant) {
//		super();
//		this.lieu = lieu;
//		this.jourRencontre = jourRencontre;
//		this.listePsychologue = listePsychologue;
//		this.listeBenevole =listeBenevole;
//		this.listeAidant = listeAidant;
//	}
	
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

	private String decompose(Personne personne) {
		String texte=" Nom : "+personne.getNom()+
				"\n Prénom : "+personne.getPrenom()+
				"\n Téléphone : "+personne.getNumTel()+
				"\n Mail : "+personne.getMail()+"\n";
		return texte;
	}
	
	private String decomposeAidant(Aidant aidant) {
		String texte = " Nom : "+aidant.getNom()+
				"\n Prénom : "+aidant.getPrenom()+
				"\n Téléphone : "+aidant.getNumTel()+
				"\n Mail : "+aidant.getMail()+
				"\n Situation : "+ aidant.getSituation()+
				"\n\n"
				+ Malade.decomposeMalade(aidant.getListeMalade())+"\n\n";
		return texte;
	}
	
	private void afficherListePsy(Psychologue[] listePsychologue) {
		String texte = "Psychologue :\n"; 				
		for (int i = 0; i < nbPsy; i++) {
			Psychologue psy = listePsychologue[i];
			texte+= decompose(psy);;
		}
		System.out.print(texte);
				
	}
	
	private void afficherListeBenevole(Benevole[] listeBenevoles) {
		String texte = "\nBénévole :\n";
		
		for (int i = 0; i < nbBenevole; i++) {
			Benevole benevole = listeBenevoles[i];
			texte+= decompose(benevole);
		}
		System.out.println(texte);
	}
	
	private void afficherIntervenants() {
		System.out.println("Intervenants (équipe binôme) :");
		afficherListePsy(getListePsychologue());
		afficherListeBenevole(getListeBenevole());		
	}
	
	private void afficherListeAidant(Aidant[] listeAidant) {
		String texte = "Liste des Aidants :\n";
		
		for (int i = 0; i < nbAidant; i++) {
			Aidant aidant = listeAidant[i];
			texte+= decomposeAidant(aidant) ;
		}
		System.out.print(texte);
//		System.out.println("\n--------------------------------\n");
				
	}
	
	public void ajouterPsy(Psychologue psy) {
		listePsychologue[nbPsy] = psy;
		nbPsy++;
	}
	
	public void ajouterBenevole(Benevole benevole) {
		listeBenevole[nbBenevole] = benevole;
		nbBenevole++;
	}

	public void ajouterAidant(Aidant aidant) {
		listeAidant[nbAidant] = aidant;
		nbAidant++;
	}
	

	
	public void afficherGroupe() {
		System.out.println("\n--------------------------------\n");
		System.out.println("Groupe de Parole de/du "+ lieu );
		System.out.println("Date de rencontre : "+ jourRencontre+"\n" );
		
		afficherIntervenants();
		afficherListeAidant(listeAidant);
		
		
	}

	public static void main(String[] args) {

	}
	
}
