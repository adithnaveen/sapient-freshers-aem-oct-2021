package com.naveen.tlds;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class DateTag extends TagSupport {
 
	private static final long serialVersionUID = 1L;

	private String pattern = null; 
	
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
	@Override
	public int doStartTag() throws JspException {
		
		JspWriter out = pageContext.getOut();
		try {
			
			if(pattern == null) {
				out.println(new Date().toString());
			}else {
				SimpleDateFormat sdf = new SimpleDateFormat(pattern);
				out.println(sdf.format(new Date()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return super.doStartTag();
	}

	
	
}
