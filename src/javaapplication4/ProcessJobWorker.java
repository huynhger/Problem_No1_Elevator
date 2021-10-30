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
public class ProcessJobWorker implements Runnable {

    Scanner input = new Scanner(System.in);
    private Elevator elevator;
    private RequestElevator request;

    public ProcessJobWorker(Elevator elevator, RequestElevator request) {
        this.elevator = elevator;
        this.request = request;
    }

    @Override
    public void run() {        
        while (true) {
            System.out.println(elevator.getId()+" is at floor " + elevator.getCurrentFloor());
            System.out.print("Enter your Destination Floor for "+elevator.getId()+":\n");
            int destinationFloor = Integer.parseInt(input.nextLine());
            request.setDestinationFloor(destinationFloor);
            if (destinationFloor < elevator.getCurrentFloor()) {
                request.setDirectionToGo(Direction.DOWN);
            } else if (destinationFloor > elevator.getCurrentFloor()) {
                request.setDirectionToGo(Direction.UP);
            }
            
            
            System.out.println(elevator.getId()+" Request go " + request.getDirectionToGo() + " to floor " + request.getDestinationFloor());
            elevator.processRequest(request);
        }

    }
}
