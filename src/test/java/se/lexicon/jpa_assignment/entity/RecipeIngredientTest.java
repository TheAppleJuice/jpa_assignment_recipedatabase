package se.lexicon.jpa_assignment.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class RecipeIngredientTest {

    RecipeIngredient testObject;
    Ingredient testIngredient;
    String testUUID;

    @BeforeEach
    public void setup(){
        testIngredient = new Ingredient(1, "Havre");
        testObject =new RecipeIngredient();
        testObject.setId(testUUID);
        testObject.setIngredient(testIngredient);
        testObject.setMeasure(3.0);
        testObject.setMeasurementType(Measurement.DL);
        testObject.setRecipe(null);
    }

    @Test
    @DisplayName("Test Create")
    public void test1(){
        assertEquals(testUUID, testObject.getId());
        assertEquals(1, testObject.getIngredient().getId());
        assertEquals(3.0, testObject.getMeasure());
        assertEquals(testIngredient, testObject.getIngredient());
        assertEquals(Measurement.DL, testObject.getMeasurementType());
        assertEquals(null, testObject.getRecipe());
    }

    @Test
    @DisplayName("Test Equals")
    public void test2(){
        RecipeIngredient expected = new RecipeIngredient(testUUID,testIngredient,3.0,Measurement.DL,null);
        assertTrue(expected.equals(testObject));

    }

    @Test
    @DisplayName("Test hashCode")
    public void test3 (){
        RecipeIngredient expected = new RecipeIngredient(testUUID,testIngredient,3.0,Measurement.DL,null);
        assertEquals(expected.hashCode(), testObject.hashCode());


    }

}