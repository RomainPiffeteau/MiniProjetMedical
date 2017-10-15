package metier;

public class FauteuilRoulant extends Article {
	
	/**
	 * Attributs de la classe FauteuilRoulant
	 */
	private double largeurAssise;
	private double poids;
	
	/**
	 * Constructeur de la classe FauteuilRoulant
	 * @param reference
	 * @param marque
	 * @param modele
	 * @param prix
	 * @param nbStock
	 * @param largeurAssise
	 * @param poids
	 */
	public FauteuilRoulant(int reference, String marque, String modele, double prix, int nbStock, double largeurAssise,
			double poids) {
		super(reference, marque, modele, prix, nbStock);
		this.largeurAssise = largeurAssise;
		this.poids = poids;
	}
	
	public double getLargeurAssise() {
		return largeurAssise;
	}

	public void setLargeurAssise(double largeurAssise) {
		this.largeurAssise = largeurAssise;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}
	
}
