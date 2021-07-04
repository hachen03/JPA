package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.porderDao;

@WebServlet("/deleteController")
public class deleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public deleteController() {
        super();
    }

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int Id=Integer.parseInt(req.getParameter("id"));
		new porderDao().delete(Id);
		resp.sendRedirect("delete.jsp");
	}



}
