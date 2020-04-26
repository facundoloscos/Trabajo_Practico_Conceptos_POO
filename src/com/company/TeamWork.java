package com.company;

import java.util.ArrayList;
import java.util.Random;

public class TeamWork {  //Clase auxiliar para generar listas de empleados con las restricciones impuestas
    static Random aux = new Random(System.nanoTime());

    public static ArrayList<Employee> workingTeam (){

        ArrayList<Employee> emploeeList = new ArrayList<Employee>();
        Architect arch1 = new Architect ("Arch1", 11111111, 4111111, EmploeeSalary.ARCHITECT, 1);
        Architect arch2 = new Architect ("Arch2", 22222222, 4222222, EmploeeSalary.ARCHITECT, 2);
        Architect arch3 = new Architect ("Arch3", 33333333, 4222222, EmploeeSalary.ARCHITECT, 3);
        Architect arch4 = new Architect ("Arch4", 44444444, 4444444, EmploeeSalary.ARCHITECT, 4);

        ConstructionMaster conMas1 = new ConstructionMaster ("ConMas1", 11111111, 5111111, EmploeeSalary.CONSTRUCTIONMASTER, 41);
        ConstructionMaster conMas2 = new ConstructionMaster ("ConMas2", 22222222, 5222222, EmploeeSalary.CONSTRUCTIONMASTER, 42);
        ConstructionMaster conMas3 = new ConstructionMaster ("ConMas3", 33333333, 5333333, EmploeeSalary.CONSTRUCTIONMASTER, 43);
        ConstructionMaster conMas4 = new ConstructionMaster ("ConMas4", 44444444, 5444444, EmploeeSalary.CONSTRUCTIONMASTER, 44);

        Worker wor1 = new Worker ("Wor1", 11111111, 611111, EmploeeSalary.WORKER, 21);
        Worker wor2 = new Worker ("Wor2", 22222222, 622222, EmploeeSalary.WORKER, 22);
        Worker wor3 = new Worker ("Wor3", 33333333, 633333, EmploeeSalary.WORKER, 23);
        Worker wor4 = new Worker ("Wor4", 44444444, 644444, EmploeeSalary.WORKER, 24);

        ArrayList<Architect> archList = new ArrayList<Architect>();
        ArrayList<ConstructionMaster> conMasList = new ArrayList<ConstructionMaster>();
        ArrayList<Worker> workerList = new ArrayList<Worker>();
        archList.add(arch1);
        archList.add(arch2);
        archList.add(arch3);
        archList.add(arch4);
        conMasList.add(conMas1);
        conMasList.add(conMas2);
        conMasList.add(conMas3);
        conMasList.add(conMas4);
        workerList.add(wor1);
        workerList.add(wor2);
        workerList.add(wor3);
        workerList.add(wor4);

        int numArch = aux.nextInt(4);     //Agrego de manera aleatoria a la lista de empleados un arquitecto
        emploeeList.add(archList.get(numArch));

        int numConMas = 1 + aux.nextInt(3);  //Numero de Maestro mayor de obras para agregar a la lista
        for (int i=0; i<numConMas; i++){            //Uso un ciclo for para agregarlos de forma aleatoria y sin repetir
            int randConMas = aux.nextInt(conMasList.size());
            emploeeList.add(conMasList.get(randConMas));
            conMasList.remove(randConMas);
        }

        int numWork = 2 + aux.nextInt(3);  //Numero de obreros para agregar a la lista, puse de 2 hasta 4 porque cree cuatro
        for (int i=0; i<numWork; i++){            //Uso un ciclo para agregarlos de forma aleatoria y sin repetir
            int randWork = aux.nextInt(workerList.size());
            emploeeList.add(workerList.get(randWork));
            workerList.remove(randWork);
        }
        return emploeeList;
    }
}
