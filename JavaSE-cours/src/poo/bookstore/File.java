package poo.bookstore;

/**
 * @author adminl
 * @version 1.0
 * @created 02-oct.-2012 10:20:12
 */
public abstract class File implements Printable {

	public File(){

	}

	public void finalize() throws Throwable {

	}

	public abstract void print();

}