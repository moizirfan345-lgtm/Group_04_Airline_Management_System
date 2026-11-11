/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.datastructures;

import airport.models.Flight;

public class FlightLinkedList {

    // Node Class
    private class Node {
        Flight data;
        Node next;

        Node(Flight data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int size;

    // Constructor
    public FlightLinkedList() {
        head = null;
        size = 0;
    }

    // Add Flight
    public boolean addFlight(Flight flight) {

        if (searchFlight(flight.getFlightNumber()) != null) {
            return false;
        }

        Node newNode = new Node(flight);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
        return true;
    }

    // Search Flight
    public Flight searchFlight(String flightNumber) {

        Node current = head;

        while (current != null) {

            if (current.data.getFlightNumber()
                    .equalsIgnoreCase(flightNumber)) {
                return current.data;
            }

            current = current.next;
        }

        return null;
    }

    // Delete Flight
    public boolean deleteFlight(String flightNumber) {

        if (head == null) {
            return false;
        }

        if (head.data.getFlightNumber()
                .equalsIgnoreCase(flightNumber)) {

            head = head.next;
            size--;
            return true;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.data.getFlightNumber()
                    .equalsIgnoreCase(flightNumber)) {

                current.next = current.next.next;
                size--;
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Update Flight
    public boolean updateFlight(String flightNumber,
                                String destination,
                                String departureTime,
                                String gate,
                                String status) {

        Flight flight = searchFlight(flightNumber);

        if (flight == null) {
            return false;
        }

        flight.setDestination(destination);
        flight.setDepartureTime(departureTime);
        flight.setGate(gate);
        flight.setStatus(status);

        return true;
    }

    // Display All Flights
    public void displayFlights() {

        if (head == null) {
            System.out.println("No flights available.");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            System.out.println("----------------------");

            current = current.next;
        }
    }

    // Get Total Flights
    public int getSize() {
        return size;
    }

    // Check Empty List
    public boolean isEmpty() {
        return head == null;
    }

    // Convert to Array for GUI Table
    public Flight[] getAllFlights() {

        Flight[] flights = new Flight[size];

        Node current = head;
        int index = 0;

        while (current != null) {
            flights[index] = current.data;
            index++;
            current = current.next;
        }

        return flights;
    }
}
