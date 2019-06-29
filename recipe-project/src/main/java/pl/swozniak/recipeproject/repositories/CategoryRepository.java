package pl.swozniak.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.swozniak.recipeproject.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);

}
