package com.lcl.serlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
 * Servlet implementation class Servlet02
 */
@WebServlet("/Servlet02")
public class Servlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet02() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SqlSession sqlSession = DBUtil.getSqlSession(true);
		MapperMessage mm = sqlSession.getMapper(MapperMessage.class);
		RequestDispatcher rd = request.getRequestDispatcher("/jsp/insert.jsp");
		Integer id = Integer.parseInt(request.getParameter("id"));
		String aut = request.getParameter("author");
		String tit = request.getParameter("title");
		String con = request.getParameter("content");
		String ema = request.getParameter("email");
		 Date date = new Date();
	        //设置要获取到什么样的时间
	        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	        //获取String类型的时间
	        String createdate = sdf.format(date);
		Message msg = new Message(id, aut, tit, con, aut, createdate);
		mm.InsertMessage(msg);
		sqlSession.close();
		rd.forward(request, response);
	}

}
