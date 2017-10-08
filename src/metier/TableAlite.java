package metier;

public class TableAlite extends Mobilier{
	
	//Attribut de la classe TableAlite
	private String couleur;

	//Constructeur de la classe TableAlite
	public TableAlite(int reference, String marque, String modele, double prix, int nbStock, int poidsMax,
			double longueur, double largeur, double hauteur, String couleur) {
		super(reference, marque, modele, prix, nbStock, poidsMax, longueur, largeur, hauteur);
		this.couleur = couleur;
	}

	//Accesseurs de la classe TableAlite
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	

}