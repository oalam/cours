/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

/**
 *
 * @author tom
 */
public class Book {
    
    private int pagesCount;
    private String title;
    private String author;

    public String getAuthor() {
	return author;
    }

    public void setAuthor(String author) {
	this.author = author;
    }

    public int getPagesCount() {
	return pagesCount;
    }

    public void setPagesCount(int pagesCount) {
	this.pagesCount = pagesCount;
    }

    public String getTitle() {
	return title;
    }

    public void setTitle(String title) {
	this.title = title;
    }

    public Book() {
    }
    
    
    
}
