package com.company;

import java.util.ArrayList;

public class Company {  //Empresa
    private String companyName;
    private ArrayList<Employee> employeeList;
    private ArrayList<BuildingConstruction> buildList;

    public Company(String companyName, ArrayList<Employee> employeeList, ArrayList<BuildingConstruction> buildList) {
        this.companyName = companyName;
        this.employeeList = employeeList;
        this.buildList = buildList;
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public ArrayList<BuildingConstruction> getBuildList() {
        return buildList;
    }
}
