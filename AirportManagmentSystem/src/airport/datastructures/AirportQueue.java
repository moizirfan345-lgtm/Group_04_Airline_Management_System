/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.datastructures;

public class AirportQueue {

    private String[] passengers;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public AirportQueue() {

        capacity = 10;
        passengers = new String[capacity];

        front = 0;
        rear = -1;
        size = 0;
    }

    // Enqueue
    public void enqueue(String passenger) {

        if (size == capacity) {
            System.out.println("Queue is Full!");
            return;
        }

        rear = (rear + 1) % capacity;

        passengers[rear] = passenger;

        size++;

        System.out.println("Passenger Added: " + passenger);
    }

    // Dequeue
    public void dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }

        System.out.println(
                "Passenger Removed: " + passengers[front]
        );

        passengers[front] = null;

        front = (front + 1) % capacity;

        size--;
    }

    // View Front
    public String peekFront() {

        if (isEmpty()) {
            return "Queue is Empty!";
        }

        return passengers[front];
    }

    // Display Queue
    public void displayQueue() {

        if (isEmpty()) {
            System.out.println("No Passengers Available!");
            return;
        }

        for (int i = 0; i < size; i++) {

            int index = (front + i) % capacity;

            System.out.println(passengers[index]);
        }
    }

    // Check Empty
    public boolean isEmpty() {

        return size == 0;
    }

    // Get Queue Size
    public int getSize() {

        return size;
    }
}
