/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.main;

import airport.models.Passenger;
import airport.datastructures.PassengerQueue;

public class TestPassengerQueue {

    public static void main(String[] args) {

        PassengerQueue queue = new PassengerQueue();

        Passenger p1 = new Passenger(
                "P-101", "Ali", "T-501", "PK-301"
        );

        Passenger p2 = new Passenger(
                "P-102", "Ahmed", "T-502", "PK-369"
        );

        Passenger p3 = new Passenger(
                "P-103", "Bilal", "T-503", "PK-450"
        );

        // Add Passengers
        queue.enqueue(p1);
        queue.enqueue(p2);
        queue.enqueue(p3);

        System.out.println("PASSENGER QUEUE:");
        queue.displayQueue();

        // Check First Passenger
        System.out.println("\nFIRST PASSENGER:");
        System.out.println(queue.peek());

        // Remove First Passenger
        System.out.println("\nCHECK-IN PASSENGER:");
        System.out.println(queue.dequeue());

        // Updated Queue
        System.out.println("\nUPDATED QUEUE:");
        queue.displayQueue();

        System.out.println("TOTAL PASSENGERS: "
                + queue.getSize());
    }
}
