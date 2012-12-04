package com.oalam.jsp.taglig;

import javax.servlet.jsp.tagext.TagAttributeInfo;
import javax.servlet.jsp.tagext.TagData;
import javax.servlet.jsp.tagext.TagExtraInfo;
import javax.servlet.jsp.tagext.VariableInfo;

/**
 * @author Mickael BARON (baron.mickael@gmail.com)
 * 
 * Date : june 2008
 */
public class VariableScriptInfo extends TagExtraInfo {
    public boolean isValid(TagData arg0) {
        if  (((String)arg0.getAttribute("name")).equals("")) { 
            System.out.println("Probl�me dans le tag name");
            return false;
        }           
        return true;
    }
    
    public VariableInfo[] getVariableInfo(TagData arg0) {
        VariableInfo[] vi = new VariableInfo[1];
        
        TagAttributeInfo[] tab_attribute = this.getTagInfo().getAttributes();
        vi[0] = new VariableInfo((String)arg0.getAttribute(tab_attribute[0].getName()), 
                "java.util.Date", true, VariableInfo.AT_BEGIN);
        return vi;
    }
}
