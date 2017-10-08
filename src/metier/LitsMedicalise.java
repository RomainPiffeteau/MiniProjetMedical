package metier;
public class LitsMedicalise extends Mobilier{
	
	//Attribut de la classe LitsMedicalise
	private boolean roulant;

	//Constructeur de la classe LitsMedicalise
	public LitsMedicalise(int reference, String marque, String modele, double prix, int nbStock, int poidsMax,
			double longueur, double largeur, double hauteur, boolean roulant) {
		super(reference, marque, modele, prix, nbStock, poidsMax, longueur, largeur, hauteur);
		this.roulant = roulant;
	}

	//Accesseurs de la classe LitsMedicalise
	public boolean isRoulant() {
		return roulant;
	}

	public void setRoulant(boolean roulant) {
		this.roulant = roulant;
	}
	
	
	
	
	
	
}
