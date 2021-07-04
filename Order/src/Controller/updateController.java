package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.porderDao;
import Model.porder;


@WebServlet("/updateController")
public class updateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public updateController() {
        super();
    }


	protected void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException {
		       String Id=req.getParameter("id");
		       String Desk=req.getParameter("desk");
               String A=req.getParameter("A");
               String B=req.getParameter("B");
               String C=req.getParameter("C");
		      if(Id!="" && A!="" && B!="" && C!="")
		      {
		   	    int a=Integer.parseInt(A);
      			int b=Integer.parseInt(B);
      			int c=Integer.parseInt(C);
      			int id=Integer.parseInt(Id);
      			porder p=new porder(Desk,a,b,c);
      			new porderDao().update(id,p);
		      }
		      resp.sendRedirect("update.jsp");
	}


}
