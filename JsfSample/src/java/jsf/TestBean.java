/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jsf;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.facelets.FaceletContext;
import javax.servlet.ServletContext;
import session.ProductFacade;

/**
 *
 * @author formation
 */
@ManagedBean
@SessionScoped
public class TestBean {
    @EJB
    private ProductFacade productFacade;

    
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    /** Creates a new instance of TestBean */
    public TestBean() {
    }
    
    public String goNext(){
        
        ExternalContext ctx =  FacesContext.getCurrentInstance().getExternalContext();
        System.out.println(ctx.getRequest().toString());
       
        return "test_next";
    }
    
    public String goPrev(){
        return "test";
    }
}
