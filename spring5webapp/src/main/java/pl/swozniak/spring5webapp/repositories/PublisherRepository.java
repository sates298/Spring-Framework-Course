package pl.swozniak.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.swozniak.spring5webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
