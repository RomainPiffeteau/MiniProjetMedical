package metier;

import java.util.Comparator;

public class ArticlePrixComparator implements Comparator<Article>{

	/**
	 * M�thode permettant le tri d'articles par prix
	 */
	@Override
	public int compare(Article o1, Article o2) {
		if (o1.getPrix() > o2.getPrix()) {
	           return 1;
	       } else if (o1.getPrix() < o2.getPrix()){
	           return -1;
	       } else {
	           return 0;
	       }
	}

}
