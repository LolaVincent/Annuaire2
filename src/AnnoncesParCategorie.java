

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DefaultNamespace.AnnuaireProxy;
import beans.Annonce;

/**
 * Servlet implementation class AnnoncesParCategorie
 */
@WebServlet("/AnnoncesParCategorie")
public class AnnoncesParCategorie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnnoncesParCategorie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/annoncesparcategorie.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try { 
			String categorie = request.getParameter("input_categorie");
			AnnuaireProxy annuaire =  new AnnuaireProxy();
			Annonce[] annonces = annuaire.affichageAnnonceCategorie(categorie);
			request.setAttribute("annonces", annonces);
			doGet(request, response);
		} catch (Exception e) {
			String erreur = "Categorie inconnue";
			request.setAttribute("erreur", erreur);
			this.getServletContext().getRequestDispatcher("/WEB-INF/erreur.jsp").forward(request, response);
		}
	}

}
