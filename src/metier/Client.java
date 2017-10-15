package metier;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Client {
	
	/**
	 * Attributs de la classe Client
	 */
	private String nom;
	private String prenom;
	private String adresse;
	private String telephone;
	private String mail;
	private ArrayList<Location> lesLocations;
	
	/**
	 * Constructeur de la classe Client
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param telephone
	 * @param mail
	 * @param lesLocations
	 */
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
	
	/**
	 * Méthode permettant d'obtenir toutes les locations du client du mois courant 
	 * @return Une ArrayList de locations
	 * @throws ParseException
	 */
	public ArrayList<Location> getLocationDuMois() throws ParseException{
		ArrayList<Location> uneListe = new ArrayList<Location>();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date today = new Date();
		Date dateAjd = formatter.parse(formatter.format(today));
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateAjd);	
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);
		for(Location l : lesLocations){
			cal.setTime(l.getDateFin());
			int monthL = cal.get(Calendar.MONTH);
			int yearL = cal.get(Calendar.YEAR);	
			if(monthL == month && yearL == year){
				uneListe.add(l);
			}
		}
		return uneListe;
	}
	/**
	 * Méthode permettant d'obtenir les locations courantes du client
	 * @return Une ArrayList de locations
	 * @throws ParseException
	 */
	public ArrayList<Location> getLesLocationsCourantes() throws ParseException{
		ArrayList<Location> desLocations = new ArrayList<Location>();
		
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		Date today = new Date();

		Date dateAjd = formatter.parse(formatter.format(today));
		
		for(Location l : this.lesLocations){
			if(l.getDateFin().after(dateAjd) && l.getDateDeb().before(dateAjd) || l.getDateDeb().equals(dateAjd) ||  l.getDateFin().equals(dateAjd)){
				desLocations.add(l);
			}
		}
		return desLocations;
	}

	/**
	 * Méthode permettant d'obtenir les informations concernant le client au format String
	 */
	@Override
	public String toString() {
		return "Client [Nom = " + nom + ", Prénom = " + prenom + ", Adresse = " + adresse + ", Téléphone = " + telephone
				+ ", Mail = " + mail + "]";
	}

}
