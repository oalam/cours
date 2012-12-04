/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.*;

/**
 *
 * @author HumanBooster
 */
public class ListSample {

    static class Book implements Comparable<Book> {

	String title;

	@Override
	public int compareTo(Book o) {
	    return this.title.compareTo(o.title);
	}
    }

    public static void main(String[] args) {

	// books est un tableau dynamique contenant des object Book
	List<Book> books = new ArrayList<>();

	// ajout de books à ma collection
	Book b = new Book();
	Book b2 = new Book();

	books.add(b);
	books.add(b2);

	// accès au 2eme élément de la collection
	System.out.println("b2 = " + books.get(1));


	// tri par titre
	Collections.sort(books);

	// dictionnaire de  livre
	Map<String, Book> dico = new HashMap<>();
	dico.put(b.title, b);
	Book b3 = dico.get(b.title);



	for (Book book : books) {

	    System.out.println("book = " + book.toString());
	}



    }
}
