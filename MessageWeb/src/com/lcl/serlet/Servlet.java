package com.lcl.serlet;

import java.io.IOException;
import java.util.List;

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
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SqlSession sqlSession = DBUtil.getSqlSession(true);
		MapperMessage mm = sqlSession.getMapper(MapperMessage.class);
		List<Message> list = mm.findAll();
		
		for(Message l : list){
			System.out.println(l.toString());
		}
		sqlSession.close();
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/select.jsp");
		request.setAttribute("All", list);
		rd.forward(request, response);
		
	}

}
