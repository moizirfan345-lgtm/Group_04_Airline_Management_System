/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.main;

import airport.datastructures.ActivityStack;

public class TestActivityStack {

    public static void main(String[] args) {

        ActivityStack stack = new ActivityStack();

        stack.push("Flight PK301 added");
        stack.push("Passenger P101 checked in");
        stack.push("Flight PK302 status updated");

        stack.displayActivities();

        System.out.println("\nLatest Activity: " + stack.peek());

        System.out.println("Removed Activity: " + stack.pop());

        System.out.println("\nUpdated History:");
        stack.displayActivities();

        System.out.println("Total Activities: " + stack.getSize());
    }
}
