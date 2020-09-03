package guru.springframework.repositories.reactive;

import guru.springframework.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/*
 * Created by jhcue on 03/09/2020
 */
public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe, String> {
}
