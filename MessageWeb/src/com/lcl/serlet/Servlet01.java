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
import com.lcl.message.Message;

/**
 * Servlet implementation class Servlet01
 */
@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet01() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SqlSession sqlSession = DBUtil.getSqlSession(true);
		MapperMessage mm = sqlSession.getMapper(MapperMessage.class);
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/update.jsp");
		Message msg = mm.findMessagewithMid(Integer.parseInt(request.getParameter("num")));
		System.out.println(request.getParameter("content"));
		msg.setContent(request.getParameter("content"));
		mm.UpdatewithMid(msg);
		sqlSession.close();
		rd.forward(request, response);
		
	}

}
