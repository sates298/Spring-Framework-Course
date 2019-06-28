package pl.swozniak.petclinic.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.swozniak.petclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
