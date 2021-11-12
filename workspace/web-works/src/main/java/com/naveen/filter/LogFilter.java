package com.naveen.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

// urlPatterns - is the servlet pattern, if you have the servlet pattern here 
// then the the filter will refer to the servlet which is given 
@WebFilter(
		initParams = {
				@WebInitParam ( name="test", value="Bengaluru"  )
		}, 
		urlPatterns = {"/hello", "/multiply"} 
		)
public class LogFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println(">>> LogFilter.init() invoked... ");
		String initParameter = filterConfig.getInitParameter("test");
		System.out.println("Init Parameter " + initParameter);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
				FilterChain chain)
			throws IOException, ServletException {
		System.out.println("LogFilter()>>> Before ");
		chain.doFilter(request, response);
		System.out.println("LogFilter()>>> After ");
	}

	@Override
	public void destroy() {
		System.out.println("LogFilter Destory()... ");
	}

}
