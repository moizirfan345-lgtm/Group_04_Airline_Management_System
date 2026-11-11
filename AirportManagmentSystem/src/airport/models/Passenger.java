/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airport.models;

/**
 *
 * @author hp
 */



public class Passenger {

    private String passengerID;
    private String name;
    private String ticketNumber;
    private String flightNumber;

    // Constructor
    public Passenger(String passengerID, String name,
                     String ticketNumber, String flightNumber) {

        this.passengerID = passengerID;
        this.name = name;
        this.ticketNumber = ticketNumber;
        this.flightNumber = flightNumber;
    }

    // Getters
    public String getPassengerID() {
        return passengerID;
    }

    public String getName() {
        return name;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    // Display
    @Override
    public String toString() {
        return "Passenger ID: " + passengerID
                + "\nName: " + name
                + "\nTicket Number: " + ticketNumber
                + "\nFlight Number: " + flightNumber;
    }
}


