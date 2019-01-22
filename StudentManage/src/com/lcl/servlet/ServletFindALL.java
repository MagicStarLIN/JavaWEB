package com.lcl.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.lcl.MyUtil.DBUtil;
import com.lcl.mapper.MapperStudent;
import com.lcl.student.Student;

/**
 * Servlet implementation class ServletFindALL
 */
@WebServlet("/ServletFindALL")
public class ServletFindALL extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletFindALL() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SqlSession sqlSession = DBUtil.getSqlSession(true);
		MapperStudent ms = sqlSession.getMapper(MapperStudent.class);
		List<Student> l = ms.GetALL();
		request.setAttribute("theList", l);
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/getall.jsp");
		rd.forward(request, response);
		
	}

}
