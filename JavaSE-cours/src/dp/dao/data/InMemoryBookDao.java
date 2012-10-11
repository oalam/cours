/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.dao.data;

import dp.dao.business.Book;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adminl
 */
public class InMemoryBookDao implements BookDao {

    List<Book> database = new ArrayList<>();

    @Override
    public void create(Book b) {

        // TODO verifiy b isn't already inside
        database.add(b);
    }

    @Override
    public void read(Book b) {
        for (Book book : database) {
            if (book.getISBN().equals(b.getISBN())) {
                b.setAuthor(book.getAuthor());
                b.setTitle(book.getTitle());
            }
        }
    }

    @Override
    public void update(Book b) {
        for (Book book : database) {
            if (book.getISBN().equals(b.getISBN())) {
                book.setAuthor(b.getAuthor());
                book.setTitle(b.getTitle());
            }
        }

        // throw something if not found ?
    }

    @Override
    public void delete(Book b) {
        for (Book book : database) {
            if (book.getISBN().equals(b.getISBN())) {
                database.remove(book);
                return;
            }
        }

        // throw something if not found ?
    }

    @Override
    public List<Book> findByAuthor(String authorName) {
        List<Book> result = new ArrayList<>();

        for (Book book : database) {
            if(book.getAuthor().getName().contains(authorName)){
                result.add(book);
            }
        }
        return result;
    }
}
