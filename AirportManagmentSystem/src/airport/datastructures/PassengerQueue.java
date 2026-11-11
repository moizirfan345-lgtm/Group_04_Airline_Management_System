/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.datastructures;

import airport.models.Passenger;

public class PassengerQueue {

    // Node Class
    private class Node {

        Passenger data;
        Node next;

        Node(Passenger data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    // Constructor
    public PassengerQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    // Enqueue
    public void enqueue(Passenger passenger) {

        Node newNode = new Node(passenger);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        size++;
    }

    // Dequeue
    public Passenger dequeue() {

        if (front == null) {
            return null;
        }

        Passenger removedPassenger = front.data;

        front = front.next;

        if (front == null) {
            rear = null;
        }

        size--;

        return removedPassenger;
    }

    // Peek
    public Passenger peek() {

        if (front == null) {
            return null;
        }

        return front.data;
    }

    // Display Queue
    public void displayQueue() {

        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node current = front;

        while (current != null) {

            System.out.println(current.data);
            System.out.println("------------------");

            current = current.next;
        }
    }

    // Get Size
    public int getSize() {
        return size;
    }

    // Check Empty
    public boolean isEmpty() {
        return front == null;
    }
}
