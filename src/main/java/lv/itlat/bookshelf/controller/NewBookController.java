package lv.itlat.bookshelf.controller;

import lv.itlat.bookshelf.persistence.domain.Book;
import lv.itlat.bookshelf.persistence.repository.BookRepository;
import org.apache.log4j.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@RequestScoped
public class NewBookController implements Serializable {

   Logger logger = Logger.getLogger(NewBookController.class);

    private Book book = new Book();

    @Inject
    private BookRepository bookRepository;


    public String create(){
        logger.info("Title:" + book.getTitle());
        logger.info("Author:" + book.getAuthor());
        bookRepository.create(book);
        book = new Book();
        return "book-created.xhtml";
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
