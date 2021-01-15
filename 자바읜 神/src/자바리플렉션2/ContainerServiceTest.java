package 자바리플렉션2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerServiceTest {

    @Test
    public void getObject() {
        BookRepository bookRepository = ContainerService.getObject(BookRepository.class);
    }

}