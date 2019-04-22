package aiss.controller;

import java.io.IOException;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.binary.Base64;

import aiss.model.resource.TrelloResource;
import aiss.model.trello.List;


public class DeleteListController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Logger log = Logger.getLogger(DeleteListController.class.getName());

	public DeleteListController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;

		log.log(Level.INFO, "Procesando DeleteListController.");

		// Obtenemos el usuario y la clave decodificados
		String usuario = new String(Base64.decodeBase64(request.getParameter("usuario").getBytes()));
		String clave = new String(Base64.decodeBase64(request.getParameter("clave").getBytes()));

		// Obtenemos los parámetros necesarios
		String query = request.getParameter("searchQuery");
		String id = request.getParameter("idList");

		// Creamos el recurso de lista con el usuario y la clave
		TrelloResource autentificacionTrello = new TrelloResource(usuario, clave);

		// Eliminamos la lista y en caso de error capturamos la excepción
		try {
			log.log(Level.INFO, "Eliminando tablero.");
			boolean deleted = autentificacionTrello.closeList(id, usuario);
			Collection<List> trelloResults = autentificacionTrello.getListSearch(query);
			request.setAttribute("informacion", trelloResults);
			if(deleted == true) {
				request.setAttribute("deleted", trelloResults);
				log.log(Level.FINE, "Lista eliminado correctamente.");
			}
			else {
				request.setAttribute("noDeleted", trelloResults);
				log.log(Level.SEVERE, "No se ha podido eliminar la lista correctamente.");
			}
			rd = request.getRequestDispatcher("/listaTareas.jsp");
		} catch (Exception e) {
			log.log(Level.WARNING, "Error al añadir la lista.");
		}
		
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		doGet(request, response);
	}
}
