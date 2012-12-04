package com.oalam.jsp.taglig;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : june 2008
 */
public class SwitchTag extends TagSupport {

	private static final long serialVersionUID = 3752830055610590228L;

	private String test;
    
	public int doStartTag() throws JspException {
        return EVAL_BODY_INCLUDE;
    }
    
    public void setTest(String p_value) {
        test = p_value;
    }
    
    public boolean isValid(String caseValue) {
        if (test == null) return false;
        return(test.equals(caseValue));
    }
}
