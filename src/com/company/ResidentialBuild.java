package com.company;

import java.util.ArrayList;

public class ResidentialBuild extends BuildingConstruction {  //Obra domestica
    private int roomCount;

    public ResidentialBuild (String address, float squareMeters, int estimatedTimeToFinish, float squareMeterCost, ArrayList<Employee> employeesList, int roomCount){
        super(address, squareMeters, estimatedTimeToFinish, squareMeterCost, employeesList);
        this.roomCount = roomCount;
    }

    public ResidentialBuild (){

    }

    @Override
    public String toString() {
        return super.toString()+"ResidentialBuild{" +
                "roomCount=" + roomCount +
                '}';
    }
}
