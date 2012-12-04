package com.oalam.jsp.taglig;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : june 2008
 */
public class ExplainWorkingTag extends TagSupport {
	
	private static final long serialVersionUID = 3673830919375178244L;

	private String test;
	
	private String apoca;

	public void setTest(String param) {
		test = param;
	}

	public void setApoca(String param) {
		apoca = param;
	}

	public int doStartTag() throws JspException {
		if (test.equals("body")) {
			return EVAL_BODY_INCLUDE;
		} else {
			return SKIP_BODY;
		}
	}

	public int doEndTag() throws JspException {
		if (apoca.equals("fin")) {
			return EVAL_PAGE;
		} else {
			return SKIP_PAGE;
		}
	}
}
