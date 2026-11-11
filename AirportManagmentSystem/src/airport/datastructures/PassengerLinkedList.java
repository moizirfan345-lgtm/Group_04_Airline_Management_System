/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.datastructures;

import airport.models.Passenger;
import java.util.ArrayList;

public class PassengerLinkedList {

    // Node Class
    private class Node {
        Passenger passenger;
        Node next;

        Node(Passenger passenger) {
            this.passenger = passenger;
            this.next = null;
        }
    }

    private Node head;

    // Add Passenger
    public boolean addPassenger(Passenger passenger) {

        // Check duplicate Passenger ID
        if (searchPassenger(passenger.getPassengerID()) != null) {
            return false;
        }

        Node newNode = new Node(passenger);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        return true;
    }

    // Search Passenger
    public Passenger searchPassenger(String passengerID) {

        Node current = head;

        while (current != null) {

            if (current.passenger.getPassengerID()
                    .equalsIgnoreCase(passengerID)) {
                return current.passenger;
            }

            current = current.next;
        }

        return null;
    }

    // Delete Passenger
    public boolean deletePassenger(String passengerID) {

        if (head == null) {
            return false;
        }

        if (head.passenger.getPassengerID()
                .equalsIgnoreCase(passengerID)) {
            head = head.next;
            return true;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.passenger.getPassengerID()
                    .equalsIgnoreCase(passengerID)) {

                current.next = current.next.next;
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Display All Passengers
    public void displayPassengers() {

        Node current = head;

        if (head == null) {
            System.out.println("No Passengers Available!");
            return;
        }

        while (current != null) {

            System.out.println(current.passenger);
            System.out.println("----------------------");

            current = current.next;
        }
    }

    // Get All Passengers for JTable
    public ArrayList<Passenger> getAllPassengers() {

        ArrayList<Passenger> passengers = new ArrayList<>();

        Node current = head;

        while (current != null) {
            passengers.add(current.passenger);
            current = current.next;
        }

        return passengers;
    }
}
