/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.models;

public class Flight {

    private String flightNumber;
    private String destination;
    private String departureTime;
    private String gate;
    private String status;

    // Constructor
    public Flight(String flightNumber, String destination,
                  String departureTime, String gate, String status) {

        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.gate = gate;
        this.status = status;
    }

    // Getters
    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getGate() {
        return gate;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Display Flight Information
    @Override
    public String toString() {
        return "Flight Number: " + flightNumber
                + "\nDestination: " + destination
                + "\nDeparture: " + departureTime
                + "\nGate: " + gate
                + "\nStatus: " + status;
    }
}

