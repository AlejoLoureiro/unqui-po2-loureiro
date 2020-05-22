package ar.edu.unq.po2.tpTemplateAdapter.elementosSimilares;

import java.util.ArrayList;
import java.util.List;

public abstract class Filter {

	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> list) {
		ArrayList<WikipediaPage> result = new ArrayList<WikipediaPage>();
		for (WikipediaPage pageAComparar: list) {
			result.add(isSimilar(page, pageAComparar));
		}
		return result;
	}
	
	public abstract WikipediaPage  isSimilar(WikipediaPage originalPage, WikipediaPage pageToCompare);
}
