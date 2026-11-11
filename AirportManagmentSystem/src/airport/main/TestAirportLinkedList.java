/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.main;

import airport.datastructures.AirportLinkedList;

public class TestAirportLinkedList {

    public static void main(String[] args) {

        AirportLinkedList flights = new AirportLinkedList();

        // Add Flights
        System.out.println("ADDING FLIGHTS:");

        flights.addFlight("PK301", "Karachi");
        flights.addFlight("PK302", "Lahore");
        flights.addFlight("PK303", "Islamabad");
        flights.addFlight("PK304", "Dubai");

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

        // Display Updated Flights
        System.out.println("\nUPDATED FLIGHTS:");

        flights.displayFlights();

        // Search Deleted Flight
        System.out.println("\nSEARCH DELETED FLIGHT:");

        System.out.println(
                flights.searchFlight("PK302")
        );
    }
}
