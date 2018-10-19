package com.kitchen;

import com.kitchen.kitchenworkers.Chef;
import com.kitchen.kitchenworkers.Cook;
import com.kitchen.kitchenworkers.KitchenWorker;
import com.kitchen.kitchenworkers.KitchenHelper;

import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    private static Util rand = Util.getInstance();
    private static List<KitchenWorker> kitchenWorkers = new ArrayList<>();
    List<KitchenWorker> kitchenHelpers = new ArrayList<>();
    List<KitchenWorker> cooks = new ArrayList<>();
    private Chef chef;


    void hireChef(KitchenWorker chef){
        kitchenWorkers.add(chef);
        this.chef = (Chef)chef;
    }


    void hireCooks(){
        int numOfEmployees = rand.generateRandomNum(10);
        for (int i = 0; i < numOfEmployees; i++) {
            Cook cook = new Cook();
            kitchenWorkers.add(cook);
            cooks.add(cook);
        }
    }


    void hireKitchenHelpers(){
        int numOfEmployees = rand.generateRandomNum(15);

        for(int i = 0; i< numOfEmployees; i++){
            KitchenHelper helper = new KitchenHelper();
            helper.collectIngredients();
            kitchenWorkers.add(helper);
            kitchenHelpers.add(helper);
        }
    }

    void shiftStart(int hours){
        chef.cooking(hours, gatherKitchenHelpers());

        for (KitchenWorker kitchenWorker : cooks) {
            Cook cook =  (Cook) kitchenWorker;
            cook.cooking(hours);

        }
    }


    List<KitchenWorker> gatherKitchenHelpers(){
        return kitchenHelpers;
    }
}
