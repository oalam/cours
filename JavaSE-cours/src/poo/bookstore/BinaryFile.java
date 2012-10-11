package poo.bookstore;

/**
 * @author adminl
 * @version 1.0
 * @created 02-oct.-2012 09:59:33
 */
public class BinaryFile extends File {

	public BinaryFile(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}