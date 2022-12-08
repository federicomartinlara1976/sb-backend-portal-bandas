package net.bounceme.chronos.sb.repository.test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import net.bounceme.chronos.sb.FirebaseRealtimeDatabaseRepositoryTest;
import net.bounceme.chronos.sb.repository.BookRepository;
import net.bounceme.chronos.sb.repository.RemoveAllRepository;

@RunWith(SpringRunner.class)
@FirebaseRealtimeDatabaseRepositoryTest
@Import(BookRepositoryTest.RepositoryTestConfiguration.class)
public class BookRepositoryTest {

    @TestConfiguration
    public static class RepositoryTestConfiguration {

        @Bean
        public RestTemplate restTemplate() {
            return new RestTemplate();
        }

        @Bean
        public BookRepository bookRepository() {
            return new BookRepository();
        }

        @Bean
        public RemoveAllRepository removeAllRepository() {
            return new RemoveAllRepository();
        }

    }

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private RemoveAllRepository removeAllRepository;

    @Before
    public void setUp() {
        removeAllRepository.removeAll();
    }

    @Test
    public void itShouldSaveBooksWithSuccessAsAList() {
        Book book = new Book();
        book.setId(1);
        book.setTitle("book # 1");
        book = bookRepository.set(book);
        assertNotNull(book);

        book = new Book();
        book.setId(2);
        book.setTitle("book # 2");
        book = bookRepository.set(book);
        assertNotNull(book);

        book = bookRepository.get(1);
        assertNotNull(book);
        assertThat(book.getTitle(), is("book # 1"));

        book = new Book();
        book.setId(3000);
        book.setTitle("book # 3");
        book = bookRepository.set(book);
        assertNotNull(book);

        List<Book> books = bookRepository.findAll();
        assertThat(books.size(), is(3));
    }

    @Test
    public void itShouldSaveBooksWithSuccessAsAnArray() {
        Book book = new Book();
        book.setId(1);
        book.setTitle("book # 1");
        book = bookRepository.set(book);
        assertNotNull(book);

        book = new Book();
        book.setId(2);
        book.setTitle("book # 2");
        book = bookRepository.set(book);
        assertNotNull(book);

        book = bookRepository.get(1);
        assertNotNull(book);
        assertThat(book.getTitle(), is("book # 1"));

        book = new Book();
        book.setId(3);
        book.setTitle("book # 3");
        book = bookRepository.set(book);
        assertNotNull(book);

        List<Book> books = bookRepository.findAll();
        assertThat(books.size(), is(4));
    }

}
