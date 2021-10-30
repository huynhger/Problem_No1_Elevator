/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.TreeSet;

/**
 *
 * @author User
 */
public class Elevator {

    private String id;
    private int currentFloor = 0;
    private Direction currentDirection = Direction.UP;
    private State currentState = State.IDLE;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public State getCurrentState() {
        return currentState;
    }

    void processRequest(RequestElevator request) {
        currentState = State.MOVING;
        int startFloor = currentFloor;
        if (startFloor < request.getDestinationFloor()) {               
            for (int i = startFloor; i <= request.getDestinationFloor(); i++) {
                
                try {
                    Thread.sleep(1000); //it's cost 1 sec to go from floor n to floor n+1
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                currentFloor = i;
                System.out.println(id + " have reached floor -- " + currentFloor);
            }
        } else if (startFloor > request.getDestinationFloor()) {            
            for (int i = startFloor; i >= request.getDestinationFloor(); i--) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }

                currentFloor = i;
                System.out.println(id+" have reached floor -- " + currentFloor);
            }
        }

        System.out.println(id+" Reached Destination Floor--opening door");
        currentState = State.IDLE;
        startFloor = currentFloor;
    }

}

enum State {
    MOVING, STOPPED, IDLE
}

enum Direction {
    UP, DOWN
}
