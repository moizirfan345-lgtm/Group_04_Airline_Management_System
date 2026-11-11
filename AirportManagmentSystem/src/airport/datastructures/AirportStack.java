/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.datastructures;

public class AirportStack {

    private String[] operations;
    private int top;
    private int capacity;

    public AirportStack() {

        capacity = 10;
        operations = new String[capacity];
        top = -1;
    }

    // Push Operation
    public void push(String operation) {

        if (top == capacity - 1) {
            System.out.println("Stack is Full!");
            return;
        }

        top++;

        operations[top] = operation;

        System.out.println("Operation Added: " + operation);
    }

    // Pop Operation
    public void pop() {

        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }

        System.out.println(
                "Removed Operation: " + operations[top]
        );

        operations[top] = null;

        top--;
    }

    // Peek Operation
    public String peek() {

        if (isEmpty()) {
            return "Stack is Empty!";
        }

        return operations[top];
    }

    // Display Stack
    public void displayStack() {

        if (isEmpty()) {
            System.out.println("No Operations Available!");
            return;
        }

        for (int i = top; i >= 0; i--) {

            System.out.println(operations[i]);
        }
    }

    // Check Empty
    public boolean isEmpty() {

        return top == -1;
    }

    // Get Stack Size
    public int getSize() {

        return top + 1;
    }
}
