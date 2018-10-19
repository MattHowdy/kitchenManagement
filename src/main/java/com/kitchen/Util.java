package com.kitchen;

import java.util.GregorianCalendar;


public class Util {
    private static Util instance = null;
    private Util(){};

    public static Util getInstance() {
        if(instance == null){
            instance = new Util();
        }
        return instance;
    }


    public int generateRandomNum(int upperLimit){
        int num =  (int) ((Math.random() * upperLimit));
        return num;
    }


    public String generateBirthdate(){
        GregorianCalendar gc = new GregorianCalendar();

        int year = randBetween(1950,2000);
        gc.set(gc.YEAR, year);

        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, dayOfYear);

        return gc.get(gc.YEAR) + "-" + (gc.get(gc.MONTH) + 1) + "-" + gc.get(gc.DAY_OF_MONTH);
    }


    private int randBetween(int start, int end){
        return start + (int) Math.round(Math.random()*(end-start));
    }



    public int generateSalary(int min, int max){
        return randBetween(min, max);
    }
}
