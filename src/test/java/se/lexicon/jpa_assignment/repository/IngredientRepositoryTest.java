package se.lexicon.jpa_assignment.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.jpa_assignment.entity.Ingredient;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class IngredientRepositoryTest {

    @Autowired
    IngredientRepository testObject;
    Ingredient ingredient;


    @BeforeEach
    public void setup(){
        ingredient = new Ingredient(1,"ingredientA");
        testObject.save(ingredient);


    }

    @Test
    @DisplayName("Testing find Ingredient By Ingredient")
    public void test1(){
       Optional<Ingredient> ingredient = testObject.findIngredientByIngredient("ingredientA");
       assertTrue(ingredient.isPresent());
       assertEquals("ingredientA", ingredient.get().getIngredient());
    }



}
