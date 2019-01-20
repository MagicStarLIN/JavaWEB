package com.lcl.serlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.lcl.Mapper.MapperMessage;
import com.lcl.MyUtil.DBUtil;

/**
 * Servlet implementation class Serlet00
 */
@WebServlet("/Serlet00")
public class Serlet00 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serlet00() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SqlSession sqlSession = DBUtil.getSqlSession(true);
		MapperMessage mm = sqlSession.getMapper(MapperMessage.class);
		int reResult = mm.DeletewitMid(Integer.parseInt(request.getParameter("number")));
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/delete.jsp");
		rd.forward(request, response);
		
	
	}

}
