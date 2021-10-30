/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author User
 */
public class RequestElevator {

    private Direction directionToGo;
    private int destinationFloor;

    public RequestElevator(Direction directionToGo, int sourceFloor) {
        this.directionToGo = directionToGo;
        this.destinationFloor = sourceFloor;
    }

    public RequestElevator() {
    }

    public Direction getDirectionToGo() {
        return directionToGo;
    }

    public void setDirectionToGo(Direction directionToGo) {
        this.directionToGo = directionToGo;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }
    
    
}
