package Controller;

import java.awt.print.Paper;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.porderDao;
import Model.porder;
@WebServlet("/addOrderController")
public class addOrderController extends HttpServlet {
        public addOrderController()
        {
        	super();
        }
        protected void service(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException
        {
        	HttpSession session=req.getSession();
        	porder p=(porder)session.getAttribute("P");
        	new porderDao().add(p);
        	resp.sendRedirect("finish.jsp");
        }
}
