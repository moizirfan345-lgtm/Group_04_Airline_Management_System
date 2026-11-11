/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.datastructures;

public class AirportLinkedList {

    // Node Class
    class Node {

        String flightID;
        String destination;
        Node next;

        Node(String flightID, String destination) {
            this.flightID = flightID;
            this.destination = destination;
            this.next = null;
        }
    }

    private Node head;

    // Add Flight
    public void addFlight(String flightID, String destination) {

        Node newNode = new Node(flightID, destination);

        if (head == null) {
            head = newNode;
        } else {

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        System.out.println("Flight Added Successfully!");
    }

    // Display Flights
    public void displayFlights() {

        if (head == null) {
            System.out.println("No Flights Available!");
            return;
        }

        Node current = head;

        while (current != null) {

            System.out.println(
                current.flightID + " - " + current.destination
            );

            current = current.next;
        }
    }

    // Search Flight
    public boolean searchFlight(String flightID) {

        Node current = head;

        while (current != null) {

            if (current.flightID.equalsIgnoreCase(flightID)) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Delete Flight
    public void deleteFlight(String flightID) {

        if (head == null) {
            System.out.println("No Flights Available!");
            return;
        }

        if (head.flightID.equalsIgnoreCase(flightID)) {
            head = head.next;
            System.out.println("Flight Deleted Successfully!");
            return;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.flightID.equalsIgnoreCase(flightID)) {

                current.next = current.next.next;

                System.out.println("Flight Deleted Successfully!");
                return;
            }

            current = current.next;
        }

        System.out.println("Flight Not Found!");
    }
}
