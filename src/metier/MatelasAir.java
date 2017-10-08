package metier;

public class MatelasAir extends Article{
	
	//Attributs de la classe MatelasAir
	private double largeur;
	private double longueur;
	private double hauteur;
	private double poidsMax;
	private int tempsGonflage;
	
	
	//Constructeur de la classe MatelasAir
	public MatelasAir(int reference, String marque, String modele, double prix, int nbStock, double largeur,
			double longueur, double hauteur, double poidsMax, int tempsGonflage) {
		super(reference, marque, modele, prix, nbStock);
		this.largeur = largeur;
		this.longueur = longueur;
		this.hauteur = hauteur;
		this.poidsMax = poidsMax;
		this.tempsGonflage = tempsGonflage;
	}

	//Accesseurs de la classe MatelasAir
	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	public double getPoidsMax() {
		return poidsMax;
	}

	public void setPoidsMax(double poidsMax) {
		this.poidsMax = poidsMax;
	}

	public int getTempsGonflage() {
		return tempsGonflage;
	}

	public void setTempsGonflage(int tempsGonflage) {
		this.tempsGonflage = tempsGonflage;
	}
	
}
