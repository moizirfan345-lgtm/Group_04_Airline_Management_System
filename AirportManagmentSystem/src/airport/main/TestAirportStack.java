/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.main;

import airport.datastructures.AirportStack;

public class TestAirportStack {

    public static void main(String[] args) {

        AirportStack stack = new AirportStack();

        // Push Operations
        System.out.println("ADDING OPERATIONS:");

        stack.push("Flight PK301 Added");
        stack.push("Flight PK302 Updated");
        stack.push("Flight PK303 Cancelled");
        stack.push("Flight PK304 Added");

        // Display Stack
        System.out.println("\nALL OPERATIONS:");

        stack.displayStack();

        // Peek
        System.out.println("\nTOP OPERATION:");

        System.out.println(stack.peek());

        // Stack Size
        System.out.println("\nTOTAL OPERATIONS:");

        System.out.println(stack.getSize());

        // Pop
        System.out.println("\nREMOVE OPERATION:");

        stack.pop();

        // Updated Stack
        System.out.println("\nUPDATED STACK:");

        stack.displayStack();

        // Check Empty
        System.out.println("\nCHECK EMPTY:");

        System.out.println(stack.isEmpty());
    }
}
