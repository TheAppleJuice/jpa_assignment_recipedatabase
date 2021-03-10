package se.lexicon.jpa_assignment.entity;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class RecipeCategory {

    private int Id;
    private String categoryName;
    List<Recipe> recipeCollection;

    public RecipeCategory() {
    }

    public RecipeCategory(String categoryName, List<Recipe> recipeCollection) {
        this.categoryName = categoryName;
        this.recipeCollection = recipeCollection;
    }

    public RecipeCategory(int id, String categoryName, List<Recipe> recipeCollection) {
        Id = id;
        this.categoryName = categoryName;
        this.recipeCollection = recipeCollection;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Recipe> getRecipeCollection() {
        return recipeCollection;
    }

    public void setRecipeCollection(List<Recipe> recipeCollection) {
        this.recipeCollection = recipeCollection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeCategory that = (RecipeCategory) o;
        return Id == that.Id && Objects.equals(categoryName, that.categoryName) && Objects.equals(recipeCollection, that.recipeCollection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, categoryName, recipeCollection);
    }

    @Override
    public String toString() {
        return "RecipeCategory{" +
                "Id=" + Id +
                ", recipeName='" + categoryName + '\'' +
                ", recipeCollection=" + recipeCollection +
                '}';
    }
}