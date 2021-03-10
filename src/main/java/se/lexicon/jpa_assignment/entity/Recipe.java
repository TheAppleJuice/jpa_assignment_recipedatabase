package se.lexicon.jpa_assignment.entity;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Recipe {
    private int Id;
    private String recipeName;
    private List<RecipeIngredient> ingredientCollection; //todo: automagical removal?
    private RecipeInstruction recipeInstruction;
    private List<RecipeCategory> recipeCategoryCollection;

    public Recipe() {
    }

    public Recipe(int id, String recipeName, List<RecipeIngredient> ingredientCollection, RecipeInstruction recipeInstruction, List<RecipeCategory> recipeCategoryCollection) {
        Id = id;
        this.recipeName = recipeName;
        this.ingredientCollection = ingredientCollection;
        this.recipeInstruction = recipeInstruction;
        this.recipeCategoryCollection = recipeCategoryCollection;
    }

    public Recipe(String recipeName, List<RecipeIngredient> ingredientCollection, RecipeInstruction recipeInstruction, List<RecipeCategory> recipeCategoryCollection) {
        this.recipeName = recipeName;
        this.ingredientCollection = ingredientCollection;
        this.recipeInstruction = recipeInstruction;
        this.recipeCategoryCollection = recipeCategoryCollection;
    }

    public Recipe(int id, String recipeName, List<RecipeIngredient> ingredientCollection, RecipeInstruction recipeInstruction) {
        Id = id;
        this.recipeName = recipeName;
        this.ingredientCollection = ingredientCollection;
        this.recipeInstruction = recipeInstruction;
    }

    public Recipe(String recipeName, List<RecipeIngredient> ingredientCollection, RecipeInstruction recipeInstruction) {
        this.recipeName = recipeName;
        this.ingredientCollection = ingredientCollection;
        this.recipeInstruction = recipeInstruction;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public List<RecipeIngredient> getIngredientCollection() {
        return ingredientCollection;
    }

    public void setIngredientCollection(List<RecipeIngredient> ingredientCollection) {
        this.ingredientCollection = ingredientCollection;
    }

    public RecipeInstruction getRecipeInstruction() {
        return recipeInstruction;
    }

    public void setRecipeInstruction(RecipeInstruction recipeInstruction) {
        this.recipeInstruction = recipeInstruction;
    }

    public List<RecipeCategory> getRecipeCategoryCollection() {
        return recipeCategoryCollection;
    }

    public void setRecipeCategoryCollection(List<RecipeCategory> recipeCategoryCollection) {
        this.recipeCategoryCollection = recipeCategoryCollection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Id == recipe.Id && Objects.equals(recipeName, recipe.recipeName) && Objects.equals(ingredientCollection, recipe.ingredientCollection) && Objects.equals(recipeInstruction, recipe.recipeInstruction) && Objects.equals(recipeCategoryCollection, recipe.recipeCategoryCollection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, recipeName, ingredientCollection, recipeInstruction, recipeCategoryCollection);
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "Id=" + Id +
                ", recipeName='" + recipeName + '\'' +
                ", ingredientCollection=" + ingredientCollection +
                ", recipeInstruction=" + recipeInstruction +
                ", recipeCategoryCollection=" + recipeCategoryCollection +
                '}';
    }
}