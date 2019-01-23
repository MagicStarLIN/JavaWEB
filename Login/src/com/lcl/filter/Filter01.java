package com.lcl.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lcl.admin.Admin;

/**
 * Servlet Filter implementation class Filter01
 */
@WebFilter(filterName="/Filter01" ,urlPatterns="/*")
public class Filter01 implements Filter {

    /**
     * Default constructor. 
     */
    public Filter01() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("销毁过滤器");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("start filter");
		HttpServletRequest httpRequest = (HttpServletRequest)request;
		HttpServletResponse httpResponse = (HttpServletResponse)response;
		
		HttpSession session = httpRequest.getSession();
		Admin a = (Admin)session.getAttribute("currentAdmin");
		// place your code here
		if(a.getFlag()==1){
		// pass the request along the filter chain
		chain.doFilter(request, response);
		return;
	}else{
		}
	}	

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		    System.out.println("过滤器初始化");

	}

}
