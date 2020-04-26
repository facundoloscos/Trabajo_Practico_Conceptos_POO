package com.company;

public enum EmploeeSalary {  //Salario de los empleados
    ARCHITECT (2000), CONSTRUCTIONMASTER (1800), WORKER (1500);

    private final float salary;

    private EmploeeSalary (float salary){
        this.salary = salary;
    }

    public float getSalary (){
        return salary;
    }
}
