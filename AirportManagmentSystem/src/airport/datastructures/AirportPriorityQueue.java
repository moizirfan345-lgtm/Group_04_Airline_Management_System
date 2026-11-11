/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.datastructures;

public class AirportPriorityQueue {

    class Flight {

        String flightID;
        String destination;
        int priority;

        Flight(String flightID, String destination, int priority) {
            this.flightID = flightID;
            this.destination = destination;
            this.priority = priority;
        }
    }

    private Flight[] flights;
    private int size;
    private int capacity;

    public AirportPriorityQueue() {

        capacity = 10;
        flights = new Flight[capacity];
        size = 0;
    }

    // Add Flight
    public void enqueue(String flightID, String destination,
            int priority) {

        if (size == capacity) {
            System.out.println("Priority Queue is Full!");
            return;
        }

        if (priority < 1 || priority > 3) {
            System.out.println("Invalid Priority!");
            return;
        }

        flights[size] = new Flight(
                flightID, destination, priority
        );

        size++;

        System.out.println("Flight Added Successfully!");
    }

    // Remove Highest Priority Flight
    public void dequeue() {

        if (size == 0) {
            System.out.println("Queue is Empty!");
            return;
        }

        int highest = 0;

        for (int i = 1; i < size; i++) {

            if (flights[i].priority < flights[highest].priority) {
                highest = i;
            }
        }

        System.out.println(
                "Flight Processed: " + flights[highest].flightID
        );

        for (int i = highest; i < size - 1; i++) {
            flights[i] = flights[i + 1];
        }

        flights[size - 1] = null;
        size--;
    }

    // View Highest Priority Flight
    public String peek() {

        if (size == 0) {
            return "Queue is Empty!";
        }

        int highest = 0;

        for (int i = 1; i < size; i++) {

            if (flights[i].priority < flights[highest].priority) {
                highest = i;
            }
        }

        return flights[highest].flightID;
    }

    // Display Flights
    public void displayFlights() {

        if (size == 0) {
            System.out.println("No Flights Available!");
            return;
        }

        for (int i = 0; i < size; i++) {

            System.out.println(
                    flights[i].flightID
                    + " - " + flights[i].destination
                    + " - Priority: " + flights[i].priority
            );
        }
    }

    // Check Empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get Size
    public int getSize() {
        return size;
    }
}
