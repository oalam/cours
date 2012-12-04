package com.oalam.jsp.taglig;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class CaseTag extends TagSupport {
    public String value;
    
    public void setValue(String p_value) {
        this.value = p_value;
    }
    
    public int doStartTag() throws JspException {
        if (this.getParent() instanceof SwitchTag) {
            SwitchTag parent = (SwitchTag)getParent();
            if (parent.isValid(this.value)) { 
                return EVAL_BODY_INCLUDE;
            } else {
                return SKIP_BODY;
            }
        } throw new JspException("Le Tag case doit �tre � l'int�rieur du tag Switch");
    }
}
