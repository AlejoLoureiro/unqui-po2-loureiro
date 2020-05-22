package ar.edu.unq.po2.tpTemplateAdapter.elementosSimilares;

import java.util.Set;

public class FilterPropiedadEnComun extends Filter {

	@Override
	public WikipediaPage isSimilar(WikipediaPage originalPage, WikipediaPage pageToCompare) {
		if (this.tienenPropiedadEnComun(originalPage, pageToCompare)) {
			return pageToCompare;
		}
		return null;
	}
	
	private boolean tienenPropiedadEnComun(WikipediaPage originalPage, WikipediaPage pageToCompare) {
		boolean result = false;
		Set<String> originalProperties = originalPage.getInfobox().keySet();
		for (String property: originalProperties) {
			if (pageToCompare.getInfobox().containsKey(property)) {
				result = true;
			}
		}
		return result;
	}

}
