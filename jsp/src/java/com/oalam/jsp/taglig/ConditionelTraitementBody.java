package com.oalam.jsp.taglig;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : june 2008
 */
public class ConditionelTraitementBody extends TagSupport {

	private static final long serialVersionUID = 2788853850605352378L;

	private String name = null;

	public void setName(String p_name) {
		this.name = p_name;
	}

	public int doStartTag() throws JspException {
		String value = pageContext.getRequest().getParameter(this.name);
		if (value != null) {
			return EVAL_BODY_INCLUDE;
		} else {
			return SKIP_BODY;
		}
	}
}
