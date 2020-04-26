package com.company;

import java.util.ArrayList;

public class Hotel extends CommercialBuild {  //Hotel
    private int floorCount;

    public Hotel (String address, float squareMeters, int estimatedTimeToFinish, float squareMeterCost, ArrayList<Employee> employeesList, String buildName, int floorCount){
        super(address, squareMeters, estimatedTimeToFinish, squareMeterCost, employeesList, buildName);
        this.floorCount = floorCount;
    }

    @Override
    public String toString() {
        return super.toString()+"Hotel{" +
                "floorCount=" + floorCount +
                '}';
    }
}
