package se.lexicon.jpa_assignment.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import se.lexicon.jpa_assignment.entity.Recipe;
import se.lexicon.jpa_assignment.entity.RecipeCategory;
import se.lexicon.jpa_assignment.entity.RecipeIngredient;

import java.util.List;
import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
/*
OK. Search for recipes where recipe name contains specified String.
OK. Search for all recipes that contains a specified ingredient name. e.g. potato, tomato, salt, etc.
Search for all recipes that belong to a specific recipe category. e.g. Chicken, Vegan, Celebration, Weekend etc.
Search for all recipes that match one or more categories. e.g. {”Spicy”,”Mexican”,”Weekend”}
 */

    List<Recipe> findRecipesByRecipeNameContains (String recipeName);

    List<Recipe> findRecipesByIngredientCollection_Ingredient_Ingredient (String ingredient);

    List<Recipe> findRecipesByRecipeCategoryCollection (String recipeName);






}
