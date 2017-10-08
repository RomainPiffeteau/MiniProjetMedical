package metier;

public class SouleveMalade extends Article {
	
	//Attributs de la classe SouleveMalade
	private int capaciteLevage;
	private double degrePivotage;
	
	//Constructeur de la classe SouleveMalade
	public SouleveMalade(int reference, String marque, String modele, double prix, int nbStock, int capaciteLevage,
			double degrePivotage) {
		super(reference, marque, modele, prix, nbStock);
		this.capaciteLevage = capaciteLevage;
		this.degrePivotage = degrePivotage;
	}

	//Accesseurs de la classe SouleveMalade
	public int getCapaciteLevage() {
		return capaciteLevage;
	}

	public void setCapaciteLevage(int capaciteLevage) {
		this.capaciteLevage = capaciteLevage;
	}

	public double getDegrePivotage() {
		return degrePivotage;
	}

	public void setDegrePivotage(double degrePivotage) {
		this.degrePivotage = degrePivotage;
	}
	
	
	
	
}
