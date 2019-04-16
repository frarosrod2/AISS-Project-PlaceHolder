package aiss.resources;

import java.util.logging.Logger;

import aiss.trello.Board;

public class TrelloResource {

	private static final Logger log = Logger.getLogger(TrelloResource.class.getName());
	
	private final String usuario;
	private final String clave;
	private final String base_url = "https://developers.trello.com/";

	public TrelloResource(String usuario, String clave) {
		this.usuario = usuario;
		this.clave = clave;
	}

	public boolean addBoard(String name, Board datos) {
		String
	}

}
