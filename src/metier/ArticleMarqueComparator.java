package metier;

import java.util.Comparator;

public class ArticleMarqueComparator implements Comparator<Article> {

	/**
	 * Méthode permettant le tri d'articles par marque
	 */
	@Override
	public int compare(Article o1, Article o2) {
		return o1.getMarque().compareTo(o2.getMarque());
	}
	
}
