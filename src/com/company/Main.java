package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 2
        //Inciso A
        System.out.println("Inciso A");
        Architect firstArchitect = new Architect("Homero", 2222222, 4822222, EmploeeSalary.ARCHITECT, 22);
        ConstructionMaster firstConstructionMaster = new ConstructionMaster("Bart", 44444444, 4844444, EmploeeSalary.CONSTRUCTIONMASTER, 42);
        Worker firstWorker = new Worker("Milhouse", 888888888, 4888888, EmploeeSalary.WORKER, 24);

        System.out.println(firstArchitect.createConstructionPlans());
        System.out.println(firstConstructionMaster.build());
        System.out.println(firstWorker.build());
        System.out.println("----------------------------------------------------------------------------------------------------");

        //Inciso B
        ArrayList<BuildingConstruction> utnBuildingConstructionList = new ArrayList<BuildingConstruction>();
        ArrayList<Employee> utnEmployeesList = new ArrayList<Employee>();
        Company utnCompany = new Company("UTN Company", utnEmployeesList, utnBuildingConstructionList);

        //Inciso C
        BuildingConstruction firstCommerce = new Commerce("Luro 1111", 600, 30, 1200, TeamWork.workingTeam(), "Super Mini Store", "kiosk");
        BuildingConstruction firstResidentialBuild = new ResidentialBuild("Saavedra 2222", 400, 20, 1500, TeamWork.workingTeam(), 6);
        BuildingConstruction firstHotel = new Hotel("Gascon 1515", 1800, 180, 900, TeamWork.workingTeam(), "Cosy Hotel", 4);

        System.out.println("Inciso C");
        System.out.println("Estimated cost of Super Mini Store: "+firstCommerce.estimatedTotalCost());
        System.out.println("Estimated cost of the residential house is: "+firstResidentialBuild.estimatedTotalCost());
        System.out.println("Estimated cost of Cosy Hotel: "+firstHotel.estimatedTotalCost());
        System.out.println("----------------------------------------------------------------------------------------------------");

        //Inciso D
        utnBuildingConstructionList.add(firstCommerce);
        utnBuildingConstructionList.add(firstResidentialBuild);
        utnBuildingConstructionList.add(firstHotel);

        //Inciso E
        System.out.println("Inciso E");
        BuildingConstruction.printEmployee(firstCommerce);  //Uso una obra ya creada para mostrar que el metodo funciona
        System.out.println("----------------------------------------------------------------------------------------------------");

        //Inciso F
        System.out.println("Inciso F");
        for (int i=0; i<utnBuildingConstructionList.size(); i++){
            System.out.println(utnBuildingConstructionList.get(i).toString());
            System.out.println("Estimated cost: "+utnBuildingConstructionList.get(i).estimatedTotalCost());
        }



    }
}
