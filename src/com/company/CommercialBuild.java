package com.company;

import java.util.ArrayList;

public class CommercialBuild extends BuildingConstruction{    //Obra comercial
    private String buildName;

    public CommercialBuild (String address, float squareMeters, int estimatedTimeToFinish, float squareMeterCost, ArrayList<Employee> employeesList, String buildName){
        super(address, squareMeters, estimatedTimeToFinish, squareMeterCost, employeesList);
        this.buildName = buildName;
    }

    @Override
    public String toString() {
        return super.toString()+"CommercialBuild{" +
                "buildName='" + buildName + '\'' +
                '}';
    }
}
