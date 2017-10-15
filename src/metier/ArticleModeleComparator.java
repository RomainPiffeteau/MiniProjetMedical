package metier;

import java.util.Comparator;

public class ArticleModeleComparator implements Comparator<Article> {

	/**
	 * Méthode permettant le tri d'articles par modèle
	 */
	@Override
	public int compare(Article o1, Article o2) {
		return o1.getModele().compareTo(o2.getModele());
	}

}
