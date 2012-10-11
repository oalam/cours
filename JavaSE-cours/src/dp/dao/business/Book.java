/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.dao.business;

/**
 *
 * @author adminl
 */
public class Book {

    private String title;
    private String ISBN;
    private Author author;

    public Book(String ISBN, String title, String author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = new Author(author);
    }

    public Book(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public Author getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
