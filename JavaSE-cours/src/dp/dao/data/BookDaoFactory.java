/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.dao.data;

import dp.dao.business.Book;

/**
 *
 * @author adminl
 */
public class BookDaoFactory {

    public enum BOOK_DAO_TYPE {

        IN_MEMORY_FANTE,
        IN_MEMORY_EMPTY,
        SQL_EMPTY
    }

    public static BookDao getDao() {

        return getDao(BOOK_DAO_TYPE.IN_MEMORY_EMPTY);
    }

    public static BookDao getDao(BOOK_DAO_TYPE type) {
        BookDao dao = null;
        switch (type) {
            case IN_MEMORY_FANTE:
                dao = new InMemoryBookDao();
                Book b1 = new Book("99921-58-10-78", "Mon chien stupide", "John Fante");
                Book b2 = new Book("921-558-150-7", "Demande à la poussière", "John Fante");
                Book b3 = new Book("1-8-1550-745", "Bandini", "John Fante");
                Book b4 = new Book("781-88-10-785", "Le potager des malfaiteurs ayant échappé à la pendaison", "Arto Paasilinna");
                Book b5 = new Book("7-858-150-7878", "La mort est mon métier", "robert Merle");
                dao.create(b1);
                dao.create(b2);
                dao.create(b3);
                dao.create(b4);
                dao.create(b5);
                break;
            case IN_MEMORY_EMPTY:
                dao = new InMemoryBookDao();
                break;
            case SQL_EMPTY:
                break;
            default:
                throw new AssertionError(type.name());

        }
        return dao;
    }
}
