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
 * Servlet implementation class ServletUpdateStudent
 */
@WebServlet("/ServletUpdateStudent")
public class ServletUpdateStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUpdateStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SqlSession sqlSession = DBUtil.getSqlSession(true);
		MapperStudent ms = sqlSession.getMapper(MapperStudent.class);
		String newname = request.getParameter("name");
		String newsex = request.getParameter("sex");
		String newage = request.getParameter("age");
		Student stu = new Student();
		int stu_id = Integer.parseInt(request.getParameter("stu_id"));
		System.out.println(stu_id);
		stu.setStu_id(stu_id);
		System.out.println(stu.getStu_id());
		stu.setStu_age(newage);
		System.out.println(stu.getStu_age());
		stu.setStu_name(newname);
		System.out.println(stu.getStu_name());
		stu.setStu_sex(newsex);
		System.out.println(stu.getStu_sex());
		int i = ms.UpdateStudent(stu);
		System.out.println(i);
		System.out.println(stu);
		//		RequestDispatcher rd = request.getRequestDispatcher("/ServletFindALL");
//		rd.forward(request, response);
	}

}
