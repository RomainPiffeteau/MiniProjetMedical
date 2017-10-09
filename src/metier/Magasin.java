package metier;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;
public class Magasin {
	
	//Attributs de la classe Magasin
	private ArrayList<Client> lesClients;
	private ArrayList<Article> lesArticles;
	
	//Constructeur de la classe Magasin
	public Magasin(ArrayList<Client> lesClients, ArrayList<Article> lesArticles) {
		super();
		this.lesClients = lesClients;
		this.lesArticles = lesArticles;
	}
	
	//Accesseurs de la classe Magasin
	public ArrayList<Client> getLesClients() {
		return lesClients;
	}

	public void setLesClients(ArrayList<Client> lesClients) {
		this.lesClients = lesClients;
	}

	public ArrayList<Article> getLesArticles() {
		return lesArticles;
	}

	public void setLesArticles(ArrayList<Article> lesArticles) {
		this.lesArticles = lesArticles;
	}
	
	//Méthode permettant de trier les articles par référérence, marque, modèle ou par prix par jour de location 
	//puis les affiche en utilisant la méthode affiche()
	public void tri(String article){
        switch(article){
        case "reference":
        	Collections.sort(this.lesArticles, new ArticleReferenceComparator());
            affiche();
            break;
        case "marque":
        	Collections.sort(this.lesArticles, new ArticleMarqueComparator());
        	affiche();   
        	break;
        case "modele":
        	Collections.sort(this.lesArticles, new ArticleModeleComparator());
        	affiche();
        	break;
        case "prix":
        	Collections.sort(this.lesArticles, new ArticlePrixComparator());
        	affiche();  
        	break;
        }
        
	}
	
	//M�thode 
	public void archiveLocation(String nomDeFichier, ArrayList<Location> liste)  throws IOException {
        DataOutputStream fluxEcriture = new DataOutputStream(new FileOutputStream(nomDeFichier));
        try{
            for(Location loc : liste){
                fluxEcriture.writeUTF(loc.toString());
            }
        }
        finally{
            fluxEcriture.close();
        }
    }
    
    
	//Méthode permettant d'afficher la liste des articles
    public void affiche(){
    	for(int i = 0;i<this.lesArticles.size();i++){
    		System.out.println("Référence : "+this.lesArticles.get(i).getReference()+
            		" Marque : "+this.lesArticles.get(i).getMarque()+
            		" Modèle : "+this.lesArticles.get(i).getModele()+
            		" Prix : "+this.lesArticles.get(i).getPrix());
        }
    }
    
    //Méthode permettant de calcul le total des recettes sur une période donnée
    public double calculRecette(Date dateDeb, Date dateFin){
    	double recette = 0;
    	for(Client c : lesClients){
    		for(Location l : c.getLesLocations()){
    			Date dateDebCalcul = dateDeb;
    	    	Date dateFinCalcul = dateFin;
    			if(l.getDateDeb().before(dateFin) && l.getDateFin().after(dateDeb)){
    				if(l.getDateDeb().after(dateDeb)){
    					dateDebCalcul = l.getDateDeb();
    					
    				}
    				if(l.getDateFin().before(dateFin)){
    					System.out.println("tto");
    					dateFinCalcul = l.getDateFin();
    				}
    				System.out.println("Date Deb "+ dateDebCalcul);
    				System.out.println("Date fin "+ dateFinCalcul);
        			long diff = dateFinCalcul.getTime()-dateDebCalcul.getTime();
        			System.out.println(diff);
        			float days = ((float)diff/(float)(1000.0*60.0*60.0*24.0))+1;
        			System.out.println(days);
        			recette += l.getMontant()*days;
    			}
    		}
    	}
    	return recette;    	
    }
    
    public static String getNomFichier() throws ParseException{
    	String numero = "";
    	DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date today = new Date();
		Date dateAjd = formatter.parse(formatter.format(today));
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateAjd);	
		int month = cal.get(Calendar.MONTH);
		month++;
		int year = cal.get(Calendar.YEAR);
		numero += String.valueOf(year);
		numero += String.valueOf(month);
		numero += ".loc.txt";
		return numero;
    }
    
    
    public static void main(String args[]) throws ParseException, IOException{
    	//Test de la méthode tri()
    	ArrayList<Article> lesArticles = new ArrayList<Article>();
        ArrayList<Client> lesClients = new ArrayList<Client>();
          
    	ArrayList<Location> desLocations1 = new ArrayList<Location>();
        ArrayList<Location> desLocations2 = new ArrayList<Location>();
         
        Client client1 = new Client("Piveteau","Jean","17 rue du Puit","0240521548","pjean@gmail.com",desLocations1);
        Client client2 = new Client("Bonnet","Xavier","134 boulevard de Dalby","0632596203","bxavier@gmail.com",desLocations2);

        Article article1 = new Article(1,"Dupont","AXW",100,7);
        Article article2 = new Article(2,"Martin","CBF",200,8);
        Article article3 = new Article(3,"Dubois","ERT",300,9);
        Article article4 = new Article(4,"Rousseau","POI",400,10);
        Article article5 = new Article(5,"Roger","VQZ",500,11);
          
        ArrayList<Article> lesArticlesLocation1 = new ArrayList<Article>();
        lesArticlesLocation1.add(article1);
        lesArticlesLocation1.add(article2);
        lesArticlesLocation1.add(article3);
        
        ArrayList<Article> lesArticlesLocation2 = new ArrayList<Article>();
        lesArticlesLocation2.add(article4);
        lesArticlesLocation2.add(article5);
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = sdf.parse("07/10/2017");
        Date d2 = sdf.parse("09/10/2017");
        Date d3 = sdf.parse("08/10/2017");
        Date d4 = sdf.parse("08/10/2017");
        
	      System.out.println(d1);
	      System.out.println(d2);
	      System.out.println(d3);
        //Date test1 = sdf.parse("12/10/2017");
        //Date test2 = sdf.parse("17/10/2017");
        
        System.out.println(d4);
        Location location1 = new Location(d1,d2,lesArticlesLocation1,client1);
        desLocations1 = client1.getLesLocations();
        desLocations1.add(location1);
        client1.setLesLocations(desLocations1);
        
        Location location2 = new Location(d3,d4,lesArticlesLocation2,client1);
        desLocations1 = client1.getLesLocations();
        desLocations1.add(location2);
        client1.setLesLocations(desLocations1);

        lesClients.add(client1);lesClients.add(client2);
        lesArticles.add(article3);lesArticles.add(article2);lesArticles.add(article1);lesArticles.add(article4);lesArticles.add(article5);
    	Magasin unMagasin = new Magasin(lesClients, lesArticles);
    	
    	ArrayList<Location> locsEnCours = new ArrayList<Location>();
    	locsEnCours = client1.getLesLocationsCourantes();
    	for(Location l : locsEnCours){
    		System.out.println(l.toString());
    	}
    	
        GenerateurFic aff = new GenerateurFic();
        
        ArrayList<Location> test = new ArrayList<Location>();
        for(Client c : lesClients){
        	test.addAll(c.getLocationDuMois());
        }
        
        aff.ecrireTruc(getNomFichier(), test);
    	
    	/*
    	System.out.println(location1.getMontant());
    	System.out.println(unMagasin.calculRecette(test1,test2));
        
    	unMagasin.tri("marque");*/
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner scan = new Scanner(System.in);
        String line = "";

        while (line.equalsIgnoreCase("quit") == false) {
        	System.out.println("BONJOUR !");
        	System.out.println("1 - Afficher l'ensemble des articles");
        	System.out.println("2 - Enregistrer une location de mat�riel");
        	System.out.println("3 - Afficher l'ensemble des locations pour un client");
        	System.out.println("4 - Archiver les locations du mois");
        	System.out.println("5 - Montant total des recettes entre deux dates");
            line = scan.next();
            
            //do something
        }

        in.close();
    }

}






