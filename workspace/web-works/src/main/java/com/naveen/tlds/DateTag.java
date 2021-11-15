package com.naveen.tlds;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DateTag extends TagSupport {
 
	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() throws JspException {
		
		JspWriter out = pageContext.getOut();
		try {
			out.println(new Date().toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return super.doStartTag();
	}

	
	
}
