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
    public void setup(){

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
        //testInstructionB = new RecipeInstruction("Instruction B");

        //Lists of Recipe instructions
        testRecipeList = new ArrayList<>();
        testRecipeList.add(testInstructionA);
        testRecipeList.add(testInstructionB);

        // Recipe category
        testCategoryA = new RecipeCategory( "Starters", testRecipeCollection);
        testCategoryB = new RecipeCategory( "Main course", testRecipeCollection);


        // Collection of recipe categories
        testRecipeCategoryCollection = new ArrayList<>();
        testRecipeCategoryCollection.add(testCategoryA);
        testRecipeCategoryCollection.add(testCategoryB);

        // Recipe(
           // String recipeName,
        // List<RecipeIngredient> ingredientCollection,
        // RecipeInstruction recipeInstruction,
        // List<RecipeCategory> recipeCategoryCollection
        // )
        testRecipeA = new Recipe( "Recipe 1",testIngredientCollection, testInstructionA,testRecipeCategoryCollection);

        //testRecipeB = new Recipe(2, "Recipe 2", testIngredientCollection, testInstructionB, testRecipeCategoryCollection);

        // Collection of recipes
        testRecipeCollection = new ArrayList<>();
        testRecipeCollection.add(testRecipeA);
        testRecipeCollection.add(testRecipeB);

        //testObjectRecipeRepository.saveAll(testRecipeCollection);


        result=testObjectRecipeRepository.save(testRecipeA);
        System.out.println("result = " + result.getId());
        //testObjectRecipeRepository.save(testRecipeA);
    }

    @Test
    @DisplayName("Test find By id")
    public void test1(){

        testObjectRecipeRepository.findById(result.getId());
       // Assertions.assertEquals(1, testObjectRecipeRepository.findById(1).get().getId());

    }
   @Test
    @DisplayName("Test find by name contains")
    public void test2(){
       //List <Recipe> result = testObjectRecipeRepository.findRecipeByRecipeName("Recipe 1");
       //result.forEach(System.out::println);

       //Assertions.assertEquals("Recipe 1", result);

   }
}
