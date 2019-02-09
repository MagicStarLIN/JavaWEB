package com.lcl.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateService {

	public static void getServerDate(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Date date = new Date();
		String dateStr = date.toString();
		PrintWriter pw = response.getWriter();
		pw.write(dateStr);
		pw.flush();
	}

}
