package pl.swozniak.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.swozniak.petclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
