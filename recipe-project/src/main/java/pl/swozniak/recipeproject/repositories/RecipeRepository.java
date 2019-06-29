package pl.swozniak.recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import pl.swozniak.recipeproject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
