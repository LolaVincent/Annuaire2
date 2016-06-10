

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DefaultNamespace.AnnuaireProxy;
import beans.Annonce;

/**
 * Servlet implementation class AnnoncesParAdresse
 */
@WebServlet("/AnnoncesParAdresse")
public class AnnoncesParAdresse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnnoncesParAdresse() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/annoncesparadresse.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adresse = request.getParameter("input_adresse");
		AnnuaireProxy annuaire =  new AnnuaireProxy();
		Annonce[] annonces = annuaire.affichageAnnonceAdresse(adresse);
		if(annonces != null ) {
			request.setAttribute("annonces", annonces);
			doGet(request, response);
		} else {
			String erreur = "Adresse inconnue";
			request.setAttribute("erreur", erreur);
			this.getServletContext().getRequestDispatcher("/WEB-INF/erreur.jsp").forward(request, response);
		}
	}

}
