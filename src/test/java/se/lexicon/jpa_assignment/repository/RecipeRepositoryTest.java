package se.lexicon.jpa_assignment.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.jpa_assignment.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@DataJpaTest
public class RecipeRepositoryTest {

    @Autowired
    RecipeRepository testObjectRecipeRepository;

    Recipe testRecipeA;
    Recipe testRecipeB;
    List<Recipe> testRecipeCollection;

    Ingredient testIngredientA;
    Ingredient testIngredientB;

    RecipeIngredient testRecipeIngredientA;
    RecipeIngredient testRecipeIngredientB;

    List<RecipeIngredient> testIngredientCollection;

    RecipeInstruction testInstructionA;
    RecipeInstruction testInstructionB;
    List<RecipeInstruction> testRecipeList;

    RecipeCategory testCategoryA;
    RecipeCategory testCategoryB;
    List<RecipeCategory> testRecipeCategoryCollection;

    Recipe result;

    @BeforeEach
    public void setup() {

        // Ingredient
        testIngredientA = new Ingredient("Ingredient A");
        testIngredientB = new Ingredient("Ingredient B");

        // Recipe Ingredient
        testRecipeIngredientA =new RecipeIngredient( testIngredientA, 3.0,Measurement.DL, testRecipeA);
        testRecipeIngredientB =new RecipeIngredient( testIngredientB, 5.0, Measurement.GRAM, testRecipeA);

        // Collection of recipe ingredients
        testIngredientCollection = new ArrayList<>();
        testIngredientCollection.add(testRecipeIngredientA);
        testIngredientCollection.add(testRecipeIngredientB);

        // Recipe instruction
        testInstructionA = new RecipeInstruction("Instruction A");
        testInstructionB = new RecipeInstruction("Instruction B");

/*        //Lists of Recipe instructions
        testRecipeList = new ArrayList<>();
        testRecipeList.add(testInstructionA);
        testRecipeList.add(testInstructionB);

 */

        // Recipe category
        testCategoryA = new RecipeCategory( "Starters", testRecipeCollection);
       // testCategoryB = new RecipeCategory( "Main course", testRecipeCollection);


        // Collection of recipe categories
        testRecipeCategoryCollection = new ArrayList<>();
        testRecipeCategoryCollection.add(testCategoryA);
        testRecipeCategoryCollection.add(testCategoryB);

        // Recipe
        testRecipeA = new Recipe( "Recipe1", testIngredientCollection, testInstructionA, testRecipeCategoryCollection);
       // testRecipeB = new Recipe( "Pizza", testIngredientCollection, testInstructionB, testRecipeCategoryCollection);

        // Collection of recipes
        testRecipeCollection = new ArrayList<>();
        testRecipeCollection.add(testRecipeA);
        testRecipeCollection.add(testRecipeB);

        // Save to repository
        testObjectRecipeRepository.save(testRecipeA);
        testObjectRecipeRepository.save(testRecipeB);
    }

    @Test
    @DisplayName("Test find By id")
    public void test1(){

       // testObjectRecipeRepository.findById(result.getId());
       Assertions.assertEquals(1, testObjectRecipeRepository.findById(1).get().getId());

    }
   @Test
    public void findRecipesByRecipeNameContains(){
        List<Recipe> listResipe = testObjectRecipeRepository.findRecipesByRecipeNameContains("cip");

   }

   @Test
    public void findRecipes_IngredientCollection_Ingredient_Ingredient (){
        Assertions.assertEquals("Pizza",testObjectRecipeRepository.findRecipesByIngredientCollection_Ingredient_Ingredient("Ingredient A").get(0).getRecipeName());
   }

   @Test
    public void findRecipesByRecipeCategoryCollection(){
        Assertions.assertEquals("Recipe1", testObjectRecipeRepository.findRecipesByRecipeCategoryCollectionCategoryName("Starters").get(0).getRecipeName());
   }

   @Test
    public void findRecipesByRecipeCategoryCollectionContainsRecipeName(){
      //Assertions.assertEquals("Recipe1",testObjectRecipeRepository.findRecipesByRecipeCategoryCollection_RecipeCollection_RecipeName("Starters"));
      // List<Recipe> result =
      testObjectRecipeRepository.findRecipesByRecipeCategoryCollection_RecipeCollection_RecipeName("Starters");
       //Assertions.assertEquals(2, result.size());

   }

}
