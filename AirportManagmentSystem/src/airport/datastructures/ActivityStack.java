/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.datastructures;

public class ActivityStack {

    private class Node {
        String activity;
        Node next;

        Node(String activity) {
            this.activity = activity;
            this.next = null;
        }
    }

    private Node top;
    private int size;

    public ActivityStack() {
        top = null;
        size = 0;
    }

    // Add activity
    public void push(String activity) {
        Node newNode = new Node(activity);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Remove latest activity
    public String pop() {
        if (isEmpty()) {
            return "No activity available";
        }

        String activity = top.activity;
        top = top.next;
        size--;

        return activity;
    }

    // View latest activity
    public String peek() {
        if (isEmpty()) {
            return "No activity available";
        }

        return top.activity;
    }

    // Display all activities
    public void displayActivities() {
        if (isEmpty()) {
            System.out.println("No activities found.");
            return;
        }

        Node current = top;

        System.out.println("\nAirport Activity History:");

        while (current != null) {
            System.out.println(current.activity);
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        return size;
    }
}
