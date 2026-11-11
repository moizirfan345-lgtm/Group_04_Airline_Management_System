/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.main;

import airport.datastructures.AirportPriorityQueue;

public class TestAirportPriorityQueue {

    public static void main(String[] args) {

        AirportPriorityQueue queue =
                new AirportPriorityQueue();

        // Add Flights
        System.out.println("ADDING FLIGHTS:");

        queue.enqueue("PK301", "Karachi", 3);
        queue.enqueue("PK302", "Lahore", 2);
        queue.enqueue("PK303", "Islamabad", 1);
        queue.enqueue("PK304", "Dubai", 3);

        // Display Flights
        System.out.println("\nALL FLIGHTS:");

        queue.displayFlights();

        // View Highest Priority
        System.out.println("\nHIGHEST PRIORITY FLIGHT:");

        System.out.println(queue.peek());

        // Process Flight
        System.out.println("\nPROCESS FLIGHT:");

        queue.dequeue();

        // Updated Flights
        System.out.println("\nUPDATED FLIGHTS:");

        queue.displayFlights();

        // Total Flights
        System.out.println("\nTOTAL FLIGHTS:");

        System.out.println(queue.getSize());

        // Check Empty
        System.out.println("\nCHECK EMPTY:");

        System.out.println(queue.isEmpty());
    }
}
