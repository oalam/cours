/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.dao.data;

import dp.dao.business.Book;
import java.util.List;

/**
 * CRUD on books
 * 
 * @author adminl
 */
public interface BookDao {

    void create(Book b);

    void read(Book b);

    void update(Book b);

    void delete(Book b);
    
    List<Book> findByAuthor(String authorName);
}
