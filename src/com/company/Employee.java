package com.company;


public class Employee {  //Empleado
    private String name;
    private int dni;
    private int telephoneNumber;
    private EmploeeSalary dailyS;

    public Employee (String name, int dni, int telephoneNumber, EmploeeSalary dailyS){
        this.name = name;
        this.dni = dni;
        this.telephoneNumber = telephoneNumber;
        this.dailyS = dailyS;
    }

    public Employee (){

    }

    public EmploeeSalary getDailyS() {
        return dailyS;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dni=" + dni +
                ", telephoneNumber=" + telephoneNumber +
                ", dailyS=" + dailyS.getSalary() +
                '}';
    }
}
