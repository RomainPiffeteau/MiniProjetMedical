package metier;

import java.util.ArrayList;
import java.util.Date;

public class Location {
	
	/**
	 * Attributs de la classe Location
	 */
	private Date dateDeb;
	private Date dateFin;
	private ArrayList<Article> lesArticles;
	private Client leClient;
	

	/**
	 * Constructeur de la classe Location
	 * @param dateDeb
	 * @param dateFin
	 * @param lesArticles
	 * @param leClient
	 */
	public Location(Date dateDeb, Date dateFin, ArrayList<Article> lesArticles, Client leClient) {
		super();
		this.dateDeb = dateDeb;
		this.dateFin = dateFin;
		this.lesArticles = lesArticles;
		this.leClient = leClient;
	}

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

	/**
	 * Méthode permettant d'obtenir le montant de la location
	 * @return Un double contenant le montant total de la location
	 */
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

	/**
	 * Méthode permettant d'obtenir les informations concernant la location au format String
	 */
	@Override
	public String toString() {
		String resultat = "+ Location : " + System.lineSeparator();
		resultat += "Date de début : " + dateDeb.toString() + System.lineSeparator();
		resultat += "Date de fin : " + dateFin.toString() + System.lineSeparator() + System.lineSeparator();
		resultat += "Article(s) :" + System.lineSeparator() + System.lineSeparator();
		int i = 1;
		for(Article a : lesArticles){
			resultat += "Article " + i + " :"+ System.lineSeparator();
			resultat += a.toString();
			i++;
		}
		resultat += "Le client : " + leClient.getNom() + " " + leClient.getPrenom() + ", " + leClient.getAdresse() + System.lineSeparator();
		resultat += "Montant : " + this.getMontant();
		resultat += System.lineSeparator();
				
		return resultat;
	}
}
