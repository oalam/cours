package com.oalam.jsp.taglig;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : june 2008
 */
public class HelloTag extends TagSupport {

	private static final long serialVersionUID = -1006813467167023150L;

	public int doStartTag() throws JspException {
		try {
			pageContext.getOut().println("Hello World !");
		} catch (IOException e) {
			throw new JspException("I/O Error", e);
		}
		return SKIP_BODY;
	}
}
