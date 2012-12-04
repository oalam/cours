package com.oalam.jsp.taglig;

import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : june 2008
 */
public class VariableScript extends TagSupport {
	
	private static final long serialVersionUID = -8214692061007236539L;
	
	private String name = null;

	public void setName(String p_string) {
		this.name = p_string;
	}

	public int doStartTag() throws JspException {
		pageContext.setAttribute(name, new Date());
		return EVAL_BODY_INCLUDE;
	}

	public int doEndTag() throws JspException {
		return EVAL_PAGE;
	}
}
