package pl.swozniak.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.swozniak.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
