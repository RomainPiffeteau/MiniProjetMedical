package metier;

import java.util.Comparator;

public class ArticleReferenceComparator implements Comparator<Article>{

	@Override
	public int compare(Article o1, Article o2) {
		if (o1.getReference() > o2.getReference()) {
	           return 1;
	       } else if (o1.getReference() < o2.getReference()){
	           return -1;
	       } else {
	           return 0;
	       }
	}

}
