package com.kitchen.kitchenworkers;

import com.kitchen.Knife;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cook extends KitchenWorker {
    private List<Knife> knives = new ArrayList<>();

    public Cook(){
        setName();
        setBirthdate();
        setSalary(2);
        setTax();
        knives.addAll(Arrays.asList(Knife.values()));
    }


   public void cooking(int hours){
       System.out.println("Yes, Chef? Yes, we are cooking as fast as we can");
   }

}
