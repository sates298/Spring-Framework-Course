package pl.swozniak.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.swozniak.petclinic.model.Pet;


public interface PetRepository extends CrudRepository<Pet, Long> {
}
