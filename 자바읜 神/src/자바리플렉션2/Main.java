package 자바리플렉션2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Main {


    @Test
    public void getObject_BookRepository() throws NoSuchMethodException {
        BookRepository bookRepository = ContainerService.getObject(BookRepository.class);
        assertNotNull(bookRepository);
    }

    public void getObject_BookService() throws NoSuchMethodException {
        BookService bookService = ContainerService.getObject(BookService.class);
        assertNotNull(bookService);
        assertNotNull(bookService.bookRepository);

    }




}
