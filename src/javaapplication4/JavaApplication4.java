/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Elevator elevator = new Elevator();
        elevator.setId("Elevator #1");
        RequestElevator request = new RequestElevator();
        Elevator elevator1 = new Elevator();
        elevator1.setId("Elevator #2");
        RequestElevator request1 = new RequestElevator();
        
        //Simulation running the elevator        
        ProcessJobWorker processJobWorker = new ProcessJobWorker(elevator, request);
        Thread t1 = new Thread(processJobWorker);
        t1.start();
        
        ProcessJobWorker processJobWorker2 = new ProcessJobWorker(elevator1, request1);
        Thread t2 = new Thread(processJobWorker2);
        t2.start();
        

    }

}
