/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.main;

import airport.models.Flight;
import airport.datastructures.FlightPriorityQueue;

public class TestFlightPriorityQueue {

    public static void main(String[] args) {

        FlightPriorityQueue queue = new FlightPriorityQueue();

        Flight f1 = new Flight(
                "PK-301", "Karachi", "10:30 AM", "G-01", "On Time"
        );

        Flight f2 = new Flight(
                "PK-369", "Lahore", "11:45 AM", "G-02", "Emergency"
        );

        Flight f3 = new Flight(
                "PK-450", "Dubai", "01:00 PM", "G-03", "Delayed"
        );

        Flight f4 = new Flight(
                "PK-520", "Islamabad", "02:30 PM", "G-04", "Boarding"
        );

        // Insert Flights
        queue.addFlight(f1);
        queue.addFlight(f2);
        queue.addFlight(f3);
        queue.addFlight(f4);

        System.out.println("FLIGHT PRIORITY QUEUE:");

        queue.display();

        // Highest Priority
        System.out.println("\nHIGHEST PRIORITY FLIGHT:");

        System.out.println(queue.peek());

        // Remove Highest Priority
        System.out.println("\nPROCESSED FLIGHT:");

        System.out.println(queue.removeHighestPriority());

        // Updated Queue
        System.out.println("\nUPDATED PRIORITY QUEUE:");

        queue.display();

        System.out.println("\nTOTAL FLIGHTS: "
                + queue.getSize());
    }
}
