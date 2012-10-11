package poo.bookstore;

/**
 * @author adminl
 * @version 1.0
 * @created 02-oct.-2012 09:59:33
 */
public class XMLFile extends File {

	private int size;

	public XMLFile(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public int getSize(){
		return size;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSize(int newVal){
		size = newVal;
	}

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}