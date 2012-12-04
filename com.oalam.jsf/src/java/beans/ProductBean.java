/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Category;
import entity.Product;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import session.CategoryFacade;
import session.ProductFacade;

/**
 *
 * @author tom
 */
@ManagedBean(name = "productController")
@SessionScoped
public class ProductBean {

    @EJB
    private CategoryFacade categoryFacade;
    @EJB
    private ProductFacade productFacade;
    private List<Product> selectedProducts = new ArrayList<Product>();
    private Product currentProduct = new Product();

    public String doCreateProduct() {

	FacesContext.getCurrentInstance().getExternalContext().
	currentProduct.setLastUpdate(new Date());
	productFacade.create(currentProduct);
	return doListProducts();
    }

    public String doListProducts() {
	selectedProducts = productFacade.findAll();

	return "listProducts.xhtml";
    }

    public ProductBean() {
    }

    public List<Category> getItemsAvailableSelectOne() {
	return categoryFacade.findAll();
    }

    public Product getCurrentProduct() {
	System.out.println("currentProduct = " + currentProduct);
	return currentProduct;
    }

    public void setCurrentProduct(Product currentProduct) {
	this.currentProduct = currentProduct;
    }

    public List<Product> getSelectedProducts() {
	return selectedProducts;
    }

    public void setSelectedProducts(List<Product> selectedProducts) {
	this.selectedProducts = selectedProducts;
    }

    // the tricky part
    @FacesConverter(forClass = Category.class)
    public static class CategoryValueConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
	    ProductBean controller = (ProductBean) context.getApplication().getELResolver().
		    getValue(context.getELContext(), null, "productController");
	    return controller.categoryFacade.find(Short.parseShort(value));
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
	    return ((Category) value).getId() + "";
	}
    }
}
