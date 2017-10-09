package metier;

import java.util.ArrayList;
import java.util.Date;

public class Location {
	
	//Attributs de la classe Location
	private Date dateDeb;
	private Date dateFin;
	private ArrayList<Article> lesArticles;
	private Client leClient;
	

	//Constructeur de la classe Location
	public Location(Date dateDeb, Date dateFin, ArrayList<Article> lesArticles, Client leClient) {
		super();
		this.dateDeb = dateDeb;
		this.dateFin = dateFin;
		this.lesArticles = lesArticles;
		this.leClient = leClient;
	}

	//Accesseurs de la classe Location
	public Date getDateDeb() {
		return dateDeb;
	}

	public void setDateDeb(Date dateDeb) {
		this.dateDeb = dateDeb;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public double getMontant() {
		double montant = 0;
		for(Article a : this.lesArticles){
			montant += a.getPrix();
		}
		return montant;
	}

	public ArrayList<Article> getLesArticles() {
		return lesArticles;
	}

	public void setLesArticles(ArrayList<Article> lesArticles) {
		this.lesArticles = lesArticles;
	}
	
	public Client getLeClient() {
		return leClient;
	}

	public void setLeClient(Client leClient) {
		this.leClient = leClient;
	}

	@Override
	public String toString() {
		String resultat = "+ Location : " + System.lineSeparator();
		resultat += "Date de début : " + dateDeb.toString() + System.lineSeparator();
		resultat += "Date de fin : " + dateFin.toString() + System.lineSeparator() + System.lineSeparator();
		resultat += "Article(s) :" + System.lineSeparator() + System.lineSeparator();
		int i = 1;
		for(Article a : lesArticles){
			resultat += "Article " + i + " :"+ System.lineSeparator();
			resultat += "- Référence : " + a.getReference() + System.lineSeparator();
			resultat += "- Marque : " + a.getMarque() + System.lineSeparator();
			resultat += "- Modèle : " + a.getModele() + System.lineSeparator();
			resultat += "- Prix : " + a.getPrix() + System.lineSeparator()+ System.lineSeparator();
			i++;
		}
		resultat += "Le client : " + leClient.getNom() + " " + leClient.getPrenom() + ", " + leClient.getAdresse() + System.lineSeparator();
		resultat += "Montant : " + this.getMontant();
		resultat += System.lineSeparator() + System.lineSeparator()+ System.lineSeparator();
				
		return resultat;
	}
}
