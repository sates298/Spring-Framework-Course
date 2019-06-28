package pl.swozniak.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.swozniak.petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
