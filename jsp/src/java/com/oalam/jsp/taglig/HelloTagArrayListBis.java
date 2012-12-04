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
public class HelloTagArrayListBis extends TagSupport {

	private static final long serialVersionUID = -3517229215859539539L;

	private Object bean;

	public void setBean(Object my_bean) {
		this.bean = my_bean;
	}

	public int doStartTag() throws JspException {
		try {
			if (bean instanceof ArrayList) {
				if (bean != null) {
					ArrayList my_array_list = (ArrayList) bean;
					for (int i = 0; i < my_array_list.size(); i++) {
						pageContext.getOut().println(my_array_list.get(i));
					}
				} else {
					pageContext.getOut().println("Y a rien");
				}
			}
		} catch (IOException e) {

		}
		return TagSupport.EVAL_BODY_INCLUDE;
	}
}
