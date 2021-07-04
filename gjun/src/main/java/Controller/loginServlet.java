package Controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.memberDao;


public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public loginServlet() {
        super();
       
    }

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		          String Username=req.getParameter("username");
		          String Password=req.getParameter("password");
		          HttpSession session=req.getSession();
		          if(new memberDao().queryUser(Username,Password)!=0)
		          {
		        	  session.setAttribute("U",Username);
		        	  resp.sendRedirect("porder/loginSuccess.jsp");
		          }
		          else
		          {
		        	  resp.sendRedirect("loginError.jsp");
		          }
	}


}
