package metier;

public class Mobilier extends Article{
	
	/**
	 * Attributs de la classe Mobilier
	 */
	private int poidsMax;
	private double longueur;
	private double largeur;
	private double hauteur;
	
	/**
	 * Constructeur de la classe Mobilier
	 * @param reference
	 * @param marque
	 * @param modele
	 * @param prix
	 * @param nbStock
	 * @param poidsMax
	 * @param longueur
	 * @param largeur
	 * @param hauteur
	 */
	public Mobilier(int reference, String marque, String modele, double prix, int nbStock, int poidsMax,
			double longueur, double largeur, double hauteur) {
		super(reference, marque, modele, prix, nbStock);
		this.poidsMax = poidsMax;
		this.longueur = longueur;
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	public int getPoidsMax() {
		return poidsMax;
	}

	public void setPoidsMax(int poidsMax) {
		this.poidsMax = poidsMax;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	
	
	
	

}
