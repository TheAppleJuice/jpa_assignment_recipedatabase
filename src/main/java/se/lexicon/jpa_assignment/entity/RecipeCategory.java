package se.lexicon.jpa_assignment.entity;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class RecipeCategory {

    private int Id;
    private String recipeName;
    Collection<Recipe> recipeCollection;

    public RecipeCategory() {
    }

    public RecipeCategory(String recipeName, Collection<Recipe> recipeCollection) {
        this.recipeName = recipeName;
        this.recipeCollection = recipeCollection;
    }

    public RecipeCategory(int id, String recipeName, Collection<Recipe> recipeCollection) {
        Id = id;
        this.recipeName = recipeName;
        this.recipeCollection = recipeCollection;
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

    public Collection<Recipe> getRecipeCollection() {
        return recipeCollection;
    }

    public void setRecipeCollection(Collection<Recipe> recipeCollection) {
        this.recipeCollection = recipeCollection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeCategory that = (RecipeCategory) o;
        return Id == that.Id && Objects.equals(recipeName, that.recipeName) && Objects.equals(recipeCollection, that.recipeCollection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, recipeName, recipeCollection);
    }

    @Override
    public String toString() {
        return "RecipeCategory{" +
                "Id=" + Id +
                ", recipeName='" + recipeName + '\'' +
                ", recipeCollection=" + recipeCollection +
                '}';
    }
}
