package se.lexicon.jpa_assignment.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecipeCategoryTest {

    Recipe a;
    Recipe b;
    RecipeCategory testObject;
    List<Recipe> recipeCollectionTest;


    @BeforeEach
    void setUp() {

        testObject = new RecipeCategory();
        testObject.setId(1);
        testObject.setCategoryName("A");


        recipeCollectionTest = new ArrayList<>();

        a = new Recipe();
        b = new Recipe();

        recipeCollectionTest.add(a);
        recipeCollectionTest.add(b);

        testObject.setRecipeCollection(recipeCollectionTest);
    }
    @Test
    @DisplayName("Test create object")
    public void test1(){
        assertEquals(1, testObject.getId());
       assertEquals("A", testObject.getCategoryName());
       assertEquals(2, testObject.getRecipeCollection().size());


    }
}