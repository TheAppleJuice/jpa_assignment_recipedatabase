package se.lexicon.jpa_assignment.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;
import java.util.UUID;

public class RecipeIngredient {
    @Id
    @GeneratedValue (generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID Id;

    private Ingredient ingredient;
    private double measure;
    private Measurement measurementType;
    private Recipe recipe;

    public RecipeIngredient() {
    }

    public RecipeIngredient(Ingredient ingredient, double measure, Measurement measurementType, Recipe recipe) {
        this.ingredient = ingredient;
        this.measure = measure;
        this.measurementType = measurementType;
        this.recipe = recipe;
    }

    public RecipeIngredient(UUID id, Ingredient ingredient, double measure, Measurement measurementType, Recipe recipe) {
        Id = id;
        this.ingredient = ingredient;
        this.measure = measure;
        this.measurementType = measurementType;
        this.recipe = recipe;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public UUID getId() {
        return Id;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public double getMeasure() {
        return measure;
    }

    public void setMeasure(double measure) {
        this.measure = measure;
    }

    public Measurement getMeasurementType() {
        return measurementType;
    }

    public void setMeasurementType(Measurement measurementType) {
        this.measurementType = measurementType;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeIngredient that = (RecipeIngredient) o;
        return Double.compare(that.measure, measure) == 0 && Objects.equals(Id, that.Id) && Objects.equals(ingredient, that.ingredient) && measurementType == that.measurementType && Objects.equals(recipe, that.recipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, ingredient, measure, measurementType, recipe);
    }

    @Override
    public String toString() {
        return "RecipeIngredient{" +
                "Id=" + Id +
                ", ingredient=" + ingredient +
                ", measure=" + measure +
                ", measurementType=" + measurementType +
                ", recipe=" + recipe +
                '}';
    }
}
