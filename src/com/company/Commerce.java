package com.company;

import java.util.ArrayList;

public class Commerce extends CommercialBuild {  //Comercio
    private String businessSector;

    public Commerce (String address, float squareMeters, int estimatedTimeToFinish, float squareMeterCost, ArrayList<Employee> employeesList, String buildName, String businessSector){
        super(address, squareMeters, estimatedTimeToFinish, squareMeterCost, employeesList, buildName);
        this.businessSector = businessSector;
    }

    @Override
    public String toString() {
        return super.toString()+"Commerce{" +
                "businessSector='" + businessSector + '\'' +
                '}';
    }
}
