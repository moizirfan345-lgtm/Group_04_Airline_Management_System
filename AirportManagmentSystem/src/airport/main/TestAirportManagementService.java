/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airport.main;

import airport.services.AirportManagementService;

public class TestAirportManagementService {

    public static void main(String[] args) {

        AirportManagementService service =
                new AirportManagementService();

        System.out.println("AIRPORT MANAGEMENT SERVICE TEST");

        // Graph Test
        service.getGraph().addRoute("Terminal", "Security");
        service.getGraph().displayGraph();

        // Linked List Test
        service.getLinkedList().addFlight("PK301", "Karachi");
        service.getLinkedList().displayFlights();

        // Hash Table Test
        service.getHashTable().insertFlight("PK302", "Lahore");
        System.out.println(
                service.getHashTable().searchFlight("PK302")
        );

        // Queue Test
        service.getQueue().enqueue("Passenger 1");
        System.out.println(service.getQueue().peekFront());

        // Priority Queue Test
        service.getPriorityQueue().enqueue(
                "PK303", "Islamabad", 1
        );
        System.out.println(service.getPriorityQueue().peek());

        // Stack Test
        service.getStack().push("Flight PK301 Added");
        System.out.println(service.getStack().peek());

        System.out.println("SERVICE TEST COMPLETED");
    }
}