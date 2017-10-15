package metier;

public class Article {
	
	/**
	 * Attributs de la classe Article
	 */
	private int reference;
	private String marque;
	private String modele;
	private double prix;
	private int nbStock;
	
  	/**
	 * Constructeur de la classe Article
	 * @param reference
	 * @param marque
	 * @param modele
	 * @param prix
	 * @param nbStock
	 */
	public Article(int reference, String marque, String modele, double prix, int nbStock) {
		this.reference = reference;
		this.marque = marque;
		this.modele = modele;
		this.prix = prix;
		this.nbStock = nbStock;
	}

	public int getReference() {
		return reference;
	}

	public void setReference(int reference) {
		this.reference = reference;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getNbStock() {
		return nbStock;
	}

	public void setNbStock(int nbStock) {
		this.nbStock = nbStock;
	}

}
