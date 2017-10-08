package metier;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Client {
	
	//Attributs de la classe Client
	private String nom;
	private String prenom;
	private String adresse;
	private String telephone;
	private String mail;
	private ArrayList<Location> lesLocations;
	
	//Constructeur de la classe Client
	public Client(String nom, String prenom, String adresse, String telephone, String mail,
			ArrayList<Location> lesLocations) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.telephone = telephone;
		this.mail = mail;
		this.lesLocations = lesLocations;
	}

	//Accesseurs de la classe Client
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public ArrayList<Location> getLesLocations() {
		return lesLocations;
	}

	public void setLesLocations(ArrayList<Location> lesLocations) {
		this.lesLocations = lesLocations;
	}	
	
	public ArrayList<Location> getLesLocationsCourantes() throws ParseException{
		ArrayList<Location> desLocations = new ArrayList<Location>();
		
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		Date today = new Date();

		Date dateAjd = formatter.parse(formatter.format(today));
		
		for(Location l : this.lesLocations){
			System.out.println("--------" + dateAjd);
			if(l.getDateFin().after(dateAjd) && l.getDateDeb().before(dateAjd) || l.getDateDeb().equals(dateAjd) || l.getDateFin().equals(dateAjd)){
				desLocations.add(l);
			}
		}
		return desLocations;
	}

}
