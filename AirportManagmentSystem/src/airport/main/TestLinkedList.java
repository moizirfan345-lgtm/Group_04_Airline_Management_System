/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.main;

import airport.models.Flight;
import airport.datastructures.FlightLinkedList;

public class TestLinkedList {

    public static void main(String[] args) {

        FlightLinkedList list = new FlightLinkedList();

        Flight f1 = new Flight(
                "PK-301", "Karachi", "10:30 AM", "G-01", "On Time"
        );

        Flight f2 = new Flight(
                "PK-369", "Lahore", "11:45 AM", "G-02", "Boarding"
        );

        Flight f3 = new Flight(
                "PK-450", "Dubai", "01:00 PM", "G-03", "Delayed"
        );

        list.addFlight(f1);
        list.addFlight(f2);
        list.addFlight(f3);

        System.out.println("ALL FLIGHTS:");
        list.displayFlights();

        System.out.println("TOTAL FLIGHTS: " + list.getSize());

        System.out.println("\nSEARCH FLIGHT PK-369:");
        System.out.println(list.searchFlight("PK-369"));

        System.out.println("\nDELETE FLIGHT PK-450:");
        System.out.println(list.deleteFlight("PK-450"));

        System.out.println("\nUPDATED FLIGHT LIST:");
        list.displayFlights();

        System.out.println("TOTAL FLIGHTS: " + list.getSize());
    }
}
