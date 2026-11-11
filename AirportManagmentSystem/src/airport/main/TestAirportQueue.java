/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.main;

import airport.datastructures.AirportQueue;

public class TestAirportQueue {

    public static void main(String[] args) {

        AirportQueue queue = new AirportQueue();

        // Add Passengers
        System.out.println("ADDING PASSENGERS:");

        queue.enqueue("Bilal");
        queue.enqueue("Ahmed");
        queue.enqueue("Ali");
        queue.enqueue("Usman");

        // Display Queue
        System.out.println("\nALL PASSENGERS:");

        queue.displayQueue();

        // View Front
        System.out.println("\nFRONT PASSENGER:");

        System.out.println(queue.peekFront());

        // Queue Size
        System.out.println("\nTOTAL PASSENGERS:");

        System.out.println(queue.getSize());

        // Remove Passenger
        System.out.println("\nREMOVE PASSENGER:");

        queue.dequeue();

        // Updated Queue
        System.out.println("\nUPDATED QUEUE:");

        queue.displayQueue();

        // Check Empty
        System.out.println("\nCHECK EMPTY:");

        System.out.println(queue.isEmpty());
    }
}
