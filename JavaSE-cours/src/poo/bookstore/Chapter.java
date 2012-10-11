package poo.bookstore;

/**
 * @author adminl
 * @version 1.0
 * @created 02-oct.-2012 09:59:33
 */
public class Chapter {

	private String title;
	public Page m_Page;

	public Chapter(){

	}

	public void finalize() throws Throwable {

	}

	public String getTitle(){
		return title;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setTitle(String newVal){
		title = newVal;
	}

}