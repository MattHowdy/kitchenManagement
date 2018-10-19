package com.kitchen.kitchenworkers;

import com.kitchen.Ingredient;
import com.kitchen.Util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class KitchenHelper extends KitchenWorker {
    private static Util random = Util.getInstance();
    private List<Ingredient> basket = new LinkedList<>();


    public KitchenHelper(){
        setName();
        setBirthdate();
        setSalary(1);
        setTax();
        collectIngredients();
    }


    public int getBasketContentOf(Ingredient ingredient) {
        int numOfitem = 0;

        for ( Ingredient ingr: basket) {
            if(ingr == ingredient){
                numOfitem += 1;
            }
            return numOfitem;
        }
        return numOfitem;
    }


    public void decreaseIngerient(Ingredient ingredient){
        List<Ingredient> sortageOfIngredients = new ArrayList<>();

        if(areMoreIngredientsAvailableofType(ingredient)){
            for ( Ingredient ingr : basket) {
                if(ingr == ingredient){
                    sortageOfIngredients.add(ingredient);
                    System.out.println(getName() + " handed " + ingredient + " over to chef.");
                    }
                }
                basket.removeAll(sortageOfIngredients);
            }
        else{
            System.out.println("We run out of " + ingredient + ".");
        }
    }



    public void collectIngredients(){
        int maxIngredientsToHave = 10;
        for (int i = 0; i < maxIngredientsToHave; i++) {
            basket.add(randomIngredient());
        }

    }

    private static Ingredient randomIngredient(){
        int randInt = random.generateRandomNum(Ingredient.values().length);
        return Ingredient.values()[randInt];
    }

    public boolean areMoreIngredientsAvailableofType(Ingredient ingredient){
        return getBasketContentOf(ingredient) > 0;
    }



}
