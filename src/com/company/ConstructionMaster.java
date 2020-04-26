package com.company;

public class ConstructionMaster extends Employee implements Build{  //Maestro mayor de obra
    private int age;

    public ConstructionMaster (String name, int dni, int telephoneNumber, EmploeeSalary dailyS, int age){
        super(name, dni, telephoneNumber, dailyS);
        this.age = age;
    }

    public ConstructionMaster (){

    }

    @Override
    public String build() {
        return "I am a Construction Master and I lead the constructions";
    }

    @Override
    public String toString() {
        return super.toString()+"ConstructionMaster{" +
                "age=" + age +
                '}';
    }
}
