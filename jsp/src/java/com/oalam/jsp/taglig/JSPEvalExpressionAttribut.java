package com.oalam.jsp.taglig;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : june 2008
 */
public class JSPEvalExpressionAttribut extends TagSupport {

	private static final long serialVersionUID = 3722846949738906928L;

	private Object value;

	public void setValue(Object p_value) {
		value = p_value;
	}

	public int doStartTag() throws JspException {
		try {
			if (value instanceof Date) {
				pageContext.getOut().println((Date) value);
			} else {
				pageContext.getOut().println("Pas Objet Date");
			}
		} catch (IOException e) {
		}
		return TagSupport.SKIP_BODY;
	}
}
