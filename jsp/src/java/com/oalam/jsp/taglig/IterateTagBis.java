package com.oalam.jsp.taglig;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : june 2008
 */
public class IterateTagBis extends BodyTagSupport {

	private static final long serialVersionUID = -5311227187037905185L;

	private int count = 0;

	private int current;

	public void setCount(int i) {
		count = i;
	}

	public int doStartTag() throws JspException {
		System.out.println("avant");
		current = 0;
		if (current < count) {
			return BodyTagSupport.EVAL_BODY_BUFFERED;
		} else {
			return BodyTagSupport.SKIP_BODY;
		}
	}
	
	public void doInitBody() throws JspException {
		System.out.println("apr�s");
		System.out.println("Initialisation");
	}
	
	public int doAfterBody() throws JspException {
		try {
			current++;
			if (current < count) {
				return BodyTagSupport.EVAL_BODY_AGAIN;
			} else {
				this.getBodyContent().getEnclosingWriter().println(
						this.getBodyContent().getString() + current);
				return BodyTagSupport.SKIP_BODY;
			}
		} catch (IOException e) {

		}
		return BodyTagSupport.SKIP_BODY;
	}
}
