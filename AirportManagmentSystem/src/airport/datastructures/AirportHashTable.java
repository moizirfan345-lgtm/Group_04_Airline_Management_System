/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.datastructures;

public class AirportHashTable {

    private class Node {

        String flightID;
        String destination;
        Node next;

        Node(String flightID, String destination) {
            this.flightID = flightID;
            this.destination = destination;
            this.next = null;
        }
    }

    private Node[] table;
    private int size = 10;

    public AirportHashTable() {
        table = new Node[size];
    }

    // Hash Function
    private int hashFunction(String flightID) {

        return Math.abs(flightID.hashCode()) % size;
    }

    // Insert Flight
    public void insertFlight(String flightID, String destination) {

        int index = hashFunction(flightID);

        Node current = table[index];

        while (current != null) {

            if (current.flightID.equals(flightID)) {
                current.destination = destination;
                System.out.println("Flight Updated Successfully!");
                return;
            }

            current = current.next;
        }

        Node newNode = new Node(flightID, destination);

        newNode.next = table[index];

        table[index] = newNode;

        System.out.println("Flight Added Successfully!");
    }

    // Search Flight
    public boolean searchFlight(String flightID) {

        int index = hashFunction(flightID);

        Node current = table[index];

        while (current != null) {

            if (current.flightID.equals(flightID)) {
                System.out.println("Destination: " + current.destination);
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Delete Flight
    public void deleteFlight(String flightID) {

        int index = hashFunction(flightID);

        Node current = table[index];
        Node previous = null;

        while (current != null) {

            if (current.flightID.equals(flightID)) {

                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }

                System.out.println("Flight Deleted Successfully!");
                return;
            }

            previous = current;
            current = current.next;
        }

        System.out.println("Flight Not Found!");
    }

    // Display All Flights
    public void displayFlights() {

        for (int i = 0; i < size; i++) {

            Node current = table[i];

            while (current != null) {

                System.out.println(
                    "Index " + i + ": "
                    + current.flightID + " - "
                    + current.destination
                );

                current = current.next;
            }
        }
    }
}
