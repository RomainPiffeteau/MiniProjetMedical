package metier;
public class LitsMedicalise extends Mobilier{
	
	/**
	 * Attribut de la classe LitsMedicalise
	 */
	private boolean roulant;

	/**
	 * Constructeur de la classe LitsMedicalise
	 * @param reference
	 * @param marque
	 * @param modele
	 * @param prix
	 * @param nbStock
	 * @param poidsMax
	 * @param longueur
	 * @param largeur
	 * @param hauteur
	 * @param roulant
	 */
	public LitsMedicalise(int reference, String marque, String modele, double prix, int nbStock, int poidsMax,
			double longueur, double largeur, double hauteur, boolean roulant) {
		super(reference, marque, modele, prix, nbStock, poidsMax, longueur, largeur, hauteur);
		this.roulant = roulant;
	}

	public boolean isRoulant() {
		return roulant;
	}

	public void setRoulant(boolean roulant) {
		this.roulant = roulant;
	}

	@Override
	public String toString() {
		String resultat = "";
		resultat += "- R�f�rence : " + this.getReference() + System.lineSeparator();
		resultat += "- Marque : " + this.getMarque() + System.lineSeparator();
		resultat += "- Mod�le : " + this.getModele() + System.lineSeparator();
		resultat += "- Prix : " + this.getPrix() + System.lineSeparator();
		if(this.isRoulant()==true){
			resultat += "- Roulant : oui" + System.lineSeparator() + System.lineSeparator();
		}
		else{
			resultat += "- Roulant : non" + System.lineSeparator() + System.lineSeparator();
		}
		return resultat;
	}
	
	
	
	
	
	
}
