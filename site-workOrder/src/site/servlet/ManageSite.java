package site.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.google.gson.Gson;

import site.dao.SiteDao;
import site.entity.Site;

/**
 * Servlet implementation class ManageSite
 */
@WebServlet("/ManageSite")
public class ManageSite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageSite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		 		 
		SiteDao  site = new SiteDao();
		List<Site> listSites = site.getSites();	
		DataTbleJson jsonElement = new DataTbleJson();
		jsonElement.setData(listSites);
		response.setContentType("application/json");
        Gson gson = new Gson();
       // out.print("{"+"\"data\""+":" +  gson.toJson(listSites) +"}");
        out.print(  gson.toJson(jsonElement) );

		
	}

}
