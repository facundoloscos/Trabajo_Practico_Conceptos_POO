package com.company;

public class Worker extends Employee implements Build{  //Obrero
    private int age;

    public Worker (String name, int dni, int telephoneNumber, EmploeeSalary dailyS, int age){
        super(name, dni, telephoneNumber, dailyS);
        this.age = age;
    }

    public Worker (){

    }

    @Override
    public String build() {
        return "I am a worker and I build";
    }

    @Override
    public String toString() {
        return super.toString()+"Worker{" +
                "age=" + age +
                '}';
    }
}
