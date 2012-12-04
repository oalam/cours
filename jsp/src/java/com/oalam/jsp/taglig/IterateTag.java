package com.oalam.jsp.taglig;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : june 2008
 */
public class IterateTag extends BodyTagSupport {

	private static final long serialVersionUID = 9160078196981663150L;

	private int count = 0;

	private int current;

	public void setCount(int i) {
		count = i;
	}
	
	public int doStartTag() throws JspException {
		current = 0;
		if (current < count) {
			return BodyTagSupport.EVAL_BODY_INCLUDE;
		} else {
			return BodyTagSupport.SKIP_BODY;
		}
	}
	
	public int doAfterBody() throws JspException {
		current++;

		if (current < count) {
			return BodyTagSupport.EVAL_BODY_AGAIN;
		} else {
			return BodyTagSupport.SKIP_BODY;
		}
	}
}