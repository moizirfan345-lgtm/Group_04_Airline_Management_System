/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.main;

import airport.datastructures.AirportHashTable;

public class TestAirportHashTable {

    public static void main(String[] args) {

        AirportHashTable flights = new AirportHashTable();

        // Insert Flights
        System.out.println("ADDING FLIGHTS:");

        flights.insertFlight("PK301", "Karachi");
        flights.insertFlight("PK302", "Lahore");
        flights.insertFlight("PK303", "Islamabad");
        flights.insertFlight("PK304", "Dubai");

        // Display Flights
        System.out.println("\nALL FLIGHTS:");

        flights.displayFlights();

        // Search Flight
        System.out.println("\nSEARCH FLIGHT:");

        System.out.println(
                flights.searchFlight("PK302")
        );

        // Delete Flight
        System.out.println("\nDELETE FLIGHT:");

        flights.deleteFlight("PK302");

        // Search Deleted Flight
        System.out.println("\nSEARCH DELETED FLIGHT:");

        System.out.println(
                flights.searchFlight("PK302")
        );

        // Updated Display
        System.out.println("\nUPDATED FLIGHTS:");

        flights.displayFlights();
    }
}
