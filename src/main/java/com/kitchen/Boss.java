package com.kitchen;

import com.kitchen.kitchenworkers.Chef;

public class Boss {

    public static void main(String[] args) {
        openKitchenAndHireWorkers();
    }



    private static void openKitchenAndHireWorkers(){
        int shiftLength = 5;

        Kitchen kitchen = new Kitchen();
        Chef chef = new Chef();

        kitchen.hireChef(chef);
        kitchen.hireKitchenHelpers();
        kitchen.hireCooks();

        kitchen.shiftStart(shiftLength);
    }



}
