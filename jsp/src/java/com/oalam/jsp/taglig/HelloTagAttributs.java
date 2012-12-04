package com.oalam.jsp.taglig;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : june 2008
 */
public class HelloTagAttributs extends TagSupport {

	private static final long serialVersionUID = 234693902142296468L;

	private String moment;

	public void setMoment(String p_moment) {
		this.moment = p_moment;
	}

	public int doStartTag() throws JspException {
		try {
			pageContext.getOut().println("Hello World ! " + moment);
		} catch (IOException e) {
			throw new JspException("I/O Error", e);
		}
		return SKIP_BODY;
	}
}
