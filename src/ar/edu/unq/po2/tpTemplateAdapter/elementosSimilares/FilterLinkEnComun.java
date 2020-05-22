package ar.edu.unq.po2.tpTemplateAdapter.elementosSimilares;

import java.util.List;;

public class FilterLinkEnComun extends Filter {

	@Override
	public WikipediaPage isSimilar(WikipediaPage originalPage, WikipediaPage pageToCompare) {
		if (this.tienenLinkEnComun(originalPage, pageToCompare)) {
			return pageToCompare;
		}else {
			return null;
		}
	}
	
	private boolean tienenLinkEnComun(WikipediaPage originalPage, WikipediaPage pageToCompare) {
		boolean result = false;
		List<WikipediaPage> linksOriginalPage = originalPage.getLinks();
		List<WikipediaPage> linksPageToCompare = pageToCompare.getLinks();
		for (WikipediaPage pageOriginal:linksOriginalPage) {
			for (WikipediaPage comparingPage: linksPageToCompare) {
				if (pageOriginal.getTitle() == comparingPage.getTitle()) {
					result = true;
				}
			}
		}
		return result;
	}

}
