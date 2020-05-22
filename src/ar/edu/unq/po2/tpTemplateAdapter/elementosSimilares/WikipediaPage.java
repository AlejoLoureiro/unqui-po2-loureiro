package ar.edu.unq.po2.tpTemplateAdapter.elementosSimilares;

import java.util.List;
import java.util.Map;

public interface WikipediaPage {

	String getTitle(); /*retorna el titulo de la pagina*/
	List<WikipediaPage> getLinks();/*retorna una Lista de las paginas de
	Wikipedia con las que se conecta*/
	Map<String, WikipediaPage> getInfobox(); /*retorna un Map con un valor
	en texto y la pagina que describe ese valor que aparecen en los infobox
	de la pagina de Wikipedia*/
	
}
