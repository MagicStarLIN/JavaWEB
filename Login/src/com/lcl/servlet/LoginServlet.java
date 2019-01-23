package com.lcl.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lcl.admin.Admin;
import com.lcl.admindao.AdminDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String adminname = request.getParameter("adminname");
		String adminpassword = request.getParameter("adminpassword");
		AdminDao ad = new AdminDao();
		Admin currentAdmin = ad.isAdmin(adminname, adminpassword);
		String next = "/WEB-INF/jsp/ok1.jsp";
		if(currentAdmin == null){
			next = "/index.jsp";
			request.setAttribute("msg", "пео╒спнС");
		}
		if(currentAdmin != null){
			HttpSession session = request.getSession();
			session.setAttribute("currentAdmin", currentAdmin);
		}
		RequestDispatcher rd = request.getRequestDispatcher(next);
		rd.forward(request, response);
			
	}

}
