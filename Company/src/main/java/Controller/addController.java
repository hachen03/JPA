package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.memberDao;
import Model.member;


public class addController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public addController() {
        super();
    }



	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                 String name=req.getParameter("name");
                 String username=req.getParameter("username");
                 String password=req.getParameter("password");
                 String phone=req.getParameter("phone");
                 String address=req.getParameter("address");
                 member m=new member(name,username,password,phone,address);
                 new memberDao().add(m);
                 resp.sendRedirect("finish.jsp");
	}

}
