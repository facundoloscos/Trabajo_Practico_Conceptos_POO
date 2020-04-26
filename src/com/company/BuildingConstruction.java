package com.company;

import java.util.ArrayList;

public class BuildingConstruction {  //Obra
    private String address;
    private float squareMeters;
    private int estimatedTimeToFinish;
    private float squareMeterCost;
    private ArrayList<Employee> employeesList;

    public BuildingConstruction (String address, float squareMeters, int estimatedTimeToFinish, float squareMeterCost, ArrayList<Employee> employeesList){
        this.address = address;
        this.squareMeters = squareMeters;
        this.estimatedTimeToFinish = estimatedTimeToFinish;
        this.squareMeterCost = squareMeterCost;
        this.employeesList = employeesList;
    }

    public BuildingConstruction (){

    }

    public float estimatedTotalCost (){  //Metodo para sacar el valor estimado de una obra
        float totalSalary = 0;
        for (int i=0; i<employeesList.size(); i++){
            totalSalary += employeesList.get(i).getDailyS().getSalary();
        }
        float total = (squareMeterCost * squareMeters) + (totalSalary * estimatedTimeToFinish);
        return total;
    }

    @Override
    public String toString() {
        return "BuildingConstruction{" +
                "address='" + address + '\'' +
                ", squareMeters=" + squareMeters +
                ", estimatedTimeToFinish=" + estimatedTimeToFinish +
                ", squareMeterCost=" + squareMeterCost +
                ", employeesList=" + employeesList +
                '}';
    }

    public static void printEmployee (BuildingConstruction build){  //Metodo estatico para mostrar los empleados de una determinada obra
        for (int i=0; i<build.employeesList.size(); i++){
            System.out.println(build.employeesList.get(i).toString());
        }
    }
}
