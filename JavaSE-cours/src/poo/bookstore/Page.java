package poo.bookstore;

/**
 * @author adminl
 * @version 1.0
 * @created 02-oct.-2012 09:59:33
 */
public class Page {

	private String content;

	public Page(){

	}

	public void finalize() throws Throwable {

	}

	public String getContent(){
		return content;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setContent(String newVal){
		content = newVal;
	}

}