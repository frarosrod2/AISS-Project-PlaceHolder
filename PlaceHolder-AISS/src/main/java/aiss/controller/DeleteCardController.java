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
import aiss.model.trello.Card;


public class DeleteCardController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Logger log = Logger.getLogger(DeleteCardController.class.getName());

	public DeleteCardController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = null;

		log.log(Level.INFO, "Procesando DeleteCardController.");

		// Obtenemos el usuario y la clave decodificados
		String usuario = new String(Base64.decodeBase64(request.getParameter("usuario").getBytes()));
		String clave = new String(Base64.decodeBase64(request.getParameter("clave").getBytes()));

		// Obtenemos los parámetros necesarios
		String query = request.getParameter("searchQuery");
		String id = request.getParameter("idCard");

		// Creamos el recurso de tarea con el usuario y la clave
		TrelloResource autentificacionTrello = new TrelloResource(usuario, clave);

		// Eliminamos la tarea y en caso de error capturamos la excepción
		try {
			log.log(Level.INFO, "Eliminando tablero.");
			boolean deleted = autentificacionTrello.deleteCard(id, usuario);
			Collection<Card> trelloResults = autentificacionTrello.getCardSearch(query);
			request.setAttribute("informacion", trelloResults);
			if(deleted == true) {
				request.setAttribute("deleted", trelloResults);
				log.log(Level.FINE, "Tarea eliminado correctamente.");
			}
			else {
				request.setAttribute("noDeleted", trelloResults);
				log.log(Level.SEVERE, "No se ha podido eliminar la tarea correctamente.");
			}
			rd = request.getRequestDispatcher("/listaTareas.jsp");
		} catch (Exception e) {
			log.log(Level.WARNING, "Error al añadir la tarea.");
		}
		
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		doGet(request, response);
	}
}