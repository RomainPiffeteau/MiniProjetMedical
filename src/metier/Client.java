package metier;

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
	
	public ArrayList<Location> getLesLocationsCourantes(){
		Date dateAjd = new java.util.Date();
		ArrayList<Location> desLocations = new ArrayList<Location>();
		
		for(Location l : this.lesLocations){
			if(l.getDateFin().after(dateAjd)){
				desLocations.add(l);
			}
		}
		return desLocations;
	}

}
