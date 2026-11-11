/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.datastructures;

import airport.models.Flight;

public class FlightPriorityQueue {

    // Heap Node
    private static class Entry {
        Flight flight;
        int priority;

        Entry(Flight flight, int priority) {
            this.flight = flight;
            this.priority = priority;
        }
    }

    private Entry[] heap;
    private int size;

    // Constructor
    public FlightPriorityQueue() {
        heap = new Entry[10];
        size = 0;
    }

    // Get Priority
    private int getPriority(String status) {

        switch (status.toLowerCase()) {

            case "emergency":
                return 1;

            case "delayed":
                return 2;

            case "boarding":
                return 3;

            case "on time":
                return 4;

            case "scheduled":
                return 5;

            default:
                return 6;
        }
    }

    // Swap Two Nodes
    private void swap(int i, int j) {
        Entry temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Insert Flight
    public void addFlight(Flight flight) {

        if (flight == null) {
            return;
        }

        if (size == heap.length) {
            Entry[] newHeap = new Entry[heap.length * 2];

            for (int i = 0; i < size; i++) {
                newHeap[i] = heap[i];
            }

            heap = newHeap;
        }

        Entry newEntry = new Entry(
                flight,
                getPriority(flight.getStatus())
        );

        heap[size] = newEntry;

        int current = size;
        size++;

        // Heapify Up
        while (current > 0) {

            int parent = (current - 1) / 2;

            if (heap[current].priority < heap[parent].priority) {
                swap(current, parent);
                current = parent;
            } else {
                break;
            }
        }
    }

    // Remove Highest Priority Flight
    public Flight removeHighestPriority() {

        if (size == 0) {
            return null;
        }

        Flight result = heap[0].flight;

        heap[0] = heap[size - 1];
        heap[size - 1] = null;
        size--;

        // Heapify Down
        int current = 0;

        while (true) {

            int left = 2 * current + 1;
            int right = 2 * current + 2;
            int smallest = current;

            if (left < size &&
                heap[left].priority < heap[smallest].priority) {
                smallest = left;
            }

            if (right < size &&
                heap[right].priority < heap[smallest].priority) {
                smallest = right;
            }

            if (smallest != current) {
                swap(current, smallest);
                current = smallest;
            } else {
                break;
            }
        }

        return result;
    }

    // Peek Highest Priority Flight
    public Flight peek() {

        if (size == 0) {
            return null;
        }

        return heap[0].flight;
    }

    // Display Heap
    public void display() {

        if (size == 0) {
            System.out.println("Priority Queue is empty.");
            return;
        }

        for (int i = 0; i < size; i++) {

            System.out.println(
                    heap[i].flight.getFlightNumber()
                    + " | "
                    + heap[i].flight.getStatus()
                    + " | Priority: "
                    + heap[i].priority
            );
        }
    }

    // Get Size
    public int getSize() {
        return size;
    }

    // Check Empty
    public boolean isEmpty() {
        return size == 0;
    }
}
