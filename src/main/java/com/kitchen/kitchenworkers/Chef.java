package com.kitchen.kitchenworkers;

import com.kitchen.Ingredient;
import com.kitchen.Knife;
import com.kitchen.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chef extends KitchenWorker{
    private Util random = Util.getInstance();
    private List<Knife> knives = new ArrayList<>();

    public Chef(){
        setName();
        setBirthdate();
        setSalary(3);
        setTax();
        knives.addAll(Arrays.asList(Knife.values()));
    }


    private void askForIngredientFrom(List<KitchenWorker> helpers){
        int randIndg = random.generateRandomNum(3);
        Ingredient randIngredient;

        for (KitchenWorker helper: helpers) {
            randIngredient = Ingredient.values()[randIndg];
            KitchenHelper kitchenHelper = (KitchenHelper)helper;
            boolean isMoreIngredientAvailable = kitchenHelper.areMoreIngredientsAvailableofType(randIngredient);

            while(isMoreIngredientAvailable) {
                kitchenHelper.decreaseIngerient(randIngredient);
                isMoreIngredientAvailable = kitchenHelper.areMoreIngredientsAvailableofType(randIngredient);
            }
        }

    }



    public void cooking(int hours, List<KitchenWorker> helpers){
        askForIngredientFrom(helpers);
    }
}
