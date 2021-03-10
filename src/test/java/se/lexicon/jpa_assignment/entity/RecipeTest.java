package se.lexicon.jpa_assignment.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    Recipe testObjectA;
    Recipe testObjectB;
    List<Recipe> testObjectCollection;

    Ingredient testIngredientA;
    Ingredient testIngredientB;

    RecipeIngredient testRecepeIngredientA;
    RecipeIngredient testRecepeIngredientB;

    List<RecipeIngredient> testIngredientCollection;

    RecipeInstruction testInstructionA;
    RecipeInstruction testInstructionB;
    List<RecipeInstruction> testRecipeList;

    RecipeCategory testCategoryA;
    RecipeCategory testCategoryB;
    List<RecipeCategory> testRecipeCategoryCollection;

    UUID testUUID;


    @BeforeEach
    void setUp() {

        // Ingredient
        testIngredientA = new Ingredient(1,"Ingredient A");
        testIngredientB = new Ingredient(2,"Ingredient B");

        // Recipe Ingredient
        testRecepeIngredientA =new RecipeIngredient(testUUID, testIngredientA, 3.0,Measurement.DL,testObjectA);
        testRecepeIngredientB =new RecipeIngredient(testUUID, testIngredientB, 5.0, Measurement.GRAM, testObjectB);

        // Collection of recipe ingredients
        testIngredientCollection = new ArrayList<>();
        testIngredientCollection.add(testRecepeIngredientA);
        testIngredientCollection.add(testRecepeIngredientB);

        // Recipe instruction
        testInstructionA = new RecipeInstruction(); //null
        testInstructionB = new RecipeInstruction();

        //Lists of Recipe instructions
        testRecipeList = new ArrayList<>();
        testRecipeList.add(testInstructionA);
        testRecipeList.add(testInstructionB);

        // Recipe category
        testCategoryA = new RecipeCategory(1, "categoryNameA",testObjectCollection);
        testCategoryB = new RecipeCategory(2, "categoryNameB", testObjectCollection);

        // Collection of recipe categories
        testRecipeCategoryCollection = new ArrayList<>();
        testRecipeCategoryCollection.add(testCategoryA);
        testRecipeCategoryCollection.add(testCategoryB);

        // Recipe
        testObjectA = new Recipe(1, "Recipe 1",testIngredientCollection, testInstructionA,testRecipeCategoryCollection);
        testObjectB = new Recipe(2, "Recipe 2", testIngredientCollection, testInstructionB, testRecipeCategoryCollection);

        // Collection of recipes
        testObjectCollection = new ArrayList<>();
        testObjectCollection.add(testObjectA);
        testObjectCollection.add(testObjectB);

    }

    @Test
    @DisplayName("Test create object")
    public void test1() {
        Assertions.assertEquals(1,testObjectA.getId());
        assertEquals("Recipe 2", testObjectB.getRecipeName());
    }

    @Test
    @DisplayName("Test equal")
    public void test2 (){
        RecipeCategory expected = new RecipeCategory(1, "categoryNameA",testObjectCollection);
        assertTrue(testObjectA.getRecipeCategoryCollection().contains(expected));


    }
}