package com.lcl.servlet;

import java.io.IOException;

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
 * Servlet implementation class ServletFindwithID
 */
@WebServlet("/ServletFindwithID")
public class ServletFindwithID extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletFindwithID() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SqlSession sqlSession = DBUtil.getSqlSession(true);
		MapperStudent ms = sqlSession.getMapper(MapperStudent.class);
		Student s = ms.FindStudent(Integer.parseInt(request.getParameter("stu_id")));
		request.setAttribute("currentStudent", s);
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/update.jsp");
		rd.forward(request, response);
	}

}
