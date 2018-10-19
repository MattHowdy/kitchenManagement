package com.kitchen.kitchenworkers;

import com.kitchen.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public abstract class KitchenWorker {
    private String name;
    private String birthdate;
    private int salary;
    private double tax;

    private static List<String> employeeNames = new ArrayList<String>(Arrays.asList("Zsolt", "Kicsi", "Kovacs", "Erik", "Zoli", "Muki", "Kerek", "Zeki", "Zsiro", "Benga", "Barba", "Imi", "Kerek", "Laci", "Penge"));
    private Util rand = Util.getInstance();
    private String randBirthDate = rand.generateBirthdate();
    private int randSalary = rand.generateSalary(1000,1500);



    public void setName() {
        name = employeeNames.get(rand.generateRandomNum(employeeNames.size())) + " " + employeeNames.get(rand.generateRandomNum(employeeNames.size()));
    }

    public String getName() {
        return name;
    }

    public void setBirthdate() {
        birthdate = randBirthDate;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setSalary(int multiple) {
        salary = randSalary * multiple;
    }

    public int getSalary() {
        return salary;
    }


    void setTax(){
        tax = salary * 0.99;
    }

    double getTax(){
        return tax;
    }


    @Override
    public String toString() {
        return  "Position: " + getClass().getSimpleName() + " ,Name: " +getName() + " ,Birth date: " + getBirthdate() + " ,Salary: " +getSalary();
    }


}
