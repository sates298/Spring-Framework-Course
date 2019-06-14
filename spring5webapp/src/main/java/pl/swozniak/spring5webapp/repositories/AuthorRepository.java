package pl.swozniak.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.swozniak.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
