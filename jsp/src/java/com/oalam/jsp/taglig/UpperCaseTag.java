package com.oalam.jsp.taglig;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : june 2008
 */
public class UpperCaseTag extends BodyTagSupport {

	private static final long serialVersionUID = -1382539865744482238L;

	public int doAfterBody() throws JspException {
        try {
            if (this.getBodyContent()!= null) {
                String body_string = this.getBodyContent().getString();
                body_string = body_string.toUpperCase();
                this.getBodyContent().getEnclosingWriter().println(body_string);
            }
        } catch(IOException e) {
            throw new JspException(e);
        }
        return EVAL_PAGE;
    }

    public int doStartTag() throws JspException {
        return BodyTagSupport.EVAL_BODY_BUFFERED;
    }
}
