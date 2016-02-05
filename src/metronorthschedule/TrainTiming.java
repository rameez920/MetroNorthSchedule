/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metronorthschedule;

/**
 *
 * @author Rameez
 */
public class TrainTiming {
    private String arrivalTime;
    private String departureTime;
    
    public TrainTiming(String arrivalTime, String departureTime) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }
    
    @Override
    public String toString() {
        return "Departure Time: " + departureTime + ", " + "Arrival Time: " + arrivalTime;
    
    
    }
    
}
