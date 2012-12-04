package com.oalam.jsp.taglig;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : june 2008
 */
public class HelloTagArrayList extends TagSupport {
	
	private static final long serialVersionUID = -1404222920282615804L;

	private String mon_bean;

	public void setName(String p_bean) {
		this.mon_bean = p_bean;
	}

	public int doStartTag() throws JspException {
		try {
			Object my_object = pageContext.findAttribute(mon_bean);
			if (my_object != null) {
				ArrayList my_array_list = (ArrayList) my_object;
				for (int i = 0; i < my_array_list.size(); i++) {
					pageContext.getOut().println(my_array_list.get(i));
				}
			} else {
				pageContext.getOut().println("Y a rien");
			}
		} catch (IOException e) {
			throw new JspException("I/O Error", e);
		}
		return SKIP_BODY;
	}
}
