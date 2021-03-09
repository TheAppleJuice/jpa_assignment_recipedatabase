package se.lexicon.jpa_assignment.entity;

import static org.junit.Assert.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ingredientTest {

    Ingredient testObject;

    @BeforeEach
    public void setup(){
        testObject = new Ingredient(1, "Havre");
    }

    @Test
    public void test_create(){
        assertEquals(1,testObject.getId());
        assertEquals("Havre",testObject.getIngredient());
    }


    @Test
    public void test_equal(){
        Ingredient ingredient = new Ingredient(1, "Havre");
        assertTrue(testObject.equals(ingredient));
    }

    @Test
    public void test_hashCode(){
        Ingredient ingredient = new Ingredient(1, "Havre");
        assertEquals(ingredient.hashCode(), testObject.hashCode());
    }


}
