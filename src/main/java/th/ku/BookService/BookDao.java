package th.ku.BookService;

import java.util.List;
import th.ku.BookService.Book;

public interface BookDao {
    void save(Book book);
    void update(int id, Book book);
    void deleteById(int id);
    Book findById(int id);
    List<Book> findAll();

}
