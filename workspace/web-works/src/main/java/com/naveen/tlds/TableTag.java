package com.naveen.tlds;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

public class TableTag extends BodyTagSupport {
	private static final long serialVersionUID = 1L;

	private String delim = ",";
	private int border=0; 
	private String cssClass =""; 
	
	public void setCssClass(String cssClass) {
		this.cssClass = cssClass;
	}
	public void setBorder(int border) {
		this.border = border;
	}
	
	public void setDelim(String delim) {
		this.delim = delim;
	}
	
	@Override
	public int doAfterBody() throws JspException {

		JspWriter out = getPreviousOut();
		
		String content = getBodyContent().getString().trim();
	
		String[] rows = content.split("\n"); 
		 
		try {
			out.println(String.format("<table class='%s' %s", cssClass, border==0?"":"border='" + border +"' >" ));
			out.println("<thead>");
			out.println("<tr>"); 
			
			
			String[] values = rows[0].split(delim);
			for(String value : values) {
				out.println("<th>" + value.toUpperCase() +"</th>");
			}
			
			out.println("</tr>");
			out.println("</thead>"); 
			
			
			out.println("<tbody>");
			for(int i=1; i<rows.length; i++) {
				out.println("<tr>");
				values = rows[i].split(delim);
				for(String value : values) {
					out.println("<td>" + value.toUpperCase() +"</td>");
				}
				out.println("</tr>"); 
			}
			out.println("</tbody>"); 
			
			
			out.println("</table>");
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
		return super.doAfterBody();
	}
	
}
