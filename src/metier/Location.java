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
		
		return "Location [dateDeb=" + dateDeb + ", dateFin=" + dateFin + ", lesArticles=" + lesArticles + ", leClient="
				+ leClient + "]";
	}
	
}
