package com.company;

public class Architect extends Employee {   //Arquitecto
    private int registrationNumber;

    public Architect (String name, int dni, int telephoneNumber, EmploeeSalary dailyS, int registrationNumber){
        super(name, dni, telephoneNumber, dailyS);
        this.registrationNumber = registrationNumber;
    }

    public Architect (){

    }

    public String createConstructionPlans (){
        return "Creating my next blueprint";
    }

    @Override
    public String toString() {
        return super.toString()+"Architect{" +
                "registrationNumber=" + registrationNumber +
                '}';
    }
}
