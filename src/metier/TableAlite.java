package metier;

public class TableAlite extends Mobilier{
	
	/**
	 * Attribut de la classe TableAlite
	 */
	private String couleur;

	/**
	 * Constructeur de la classe TableAlite
	 * @param reference
	 * @param marque
	 * @param modele
	 * @param prix
	 * @param nbStock
	 * @param poidsMax
	 * @param longueur
	 * @param largeur
	 * @param hauteur
	 * @param couleur
	 */
	public TableAlite(int reference, String marque, String modele, double prix, int nbStock, int poidsMax,
			double longueur, double largeur, double hauteur, String couleur) {
		super(reference, marque, modele, prix, nbStock, poidsMax, longueur, largeur, hauteur);
		this.couleur = couleur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	@Override
	public String toString() {
		String resultat = "";
		resultat += "- Référence : " + this.getReference() + System.lineSeparator();
		resultat += "- Marque : " + this.getMarque() + System.lineSeparator();
		resultat += "- Modèle : " + this.getModele() + System.lineSeparator();
		resultat += "- Prix : " + this.getPrix() + System.lineSeparator();
		resultat += "- Couleur : " + this.getCouleur() + System.lineSeparator() + System.lineSeparator();
		return resultat;
	}
	

}
