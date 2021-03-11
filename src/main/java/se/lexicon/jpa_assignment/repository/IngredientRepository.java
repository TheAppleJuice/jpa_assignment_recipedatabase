package se.lexicon.jpa_assignment.repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.jpa_assignment.entity.Ingredient;

import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {

/*
    Search for a specific ingredient name by specified String.
    Search for ingredient that name particularly corresponded with search string.
*/

    Optional<Ingredient> findIngredientByIngredient (String ingredient);



}
