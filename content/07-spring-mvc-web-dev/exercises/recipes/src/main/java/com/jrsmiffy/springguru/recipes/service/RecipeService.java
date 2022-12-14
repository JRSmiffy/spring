package com.jrsmiffy.springguru.recipes.service;

import com.jrsmiffy.springguru.recipes.model.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

}
