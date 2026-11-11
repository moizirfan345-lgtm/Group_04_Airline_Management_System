/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package airport.main;

import airport.graphs.AirportGraph;

public class TestAirportGraph {

    public static void main(String[] args) {

        AirportGraph airport = new AirportGraph();

        // Add Airport Routes
        airport.addRoute("Terminal", "Security");
        airport.addRoute("Security", "Immigration");
        airport.addRoute("Immigration", "Departure Lounge");
        airport.addRoute("Departure Lounge", "Boarding Gate");
        airport.addRoute("Terminal", "Baggage Claim");

        // Display Graph
        System.out.println("AIRPORT GRAPH:");
        airport.displayGraph();

        // Check Route
        System.out.println("\nCHECK ROUTE:");

        System.out.println(
                airport.hasRoute("Terminal", "Security")
        );

        // Total Locations
        System.out.println("\nTOTAL LOCATIONS:");

        System.out.println(airport.getTotalLocations());

        // BFS
        System.out.println("\nBFS TRAVERSAL:");

        airport.BFS("Terminal");

        // DFS
        System.out.println("\nDFS TRAVERSAL:");

        airport.DFS("Terminal");

        // Dijkstra
        System.out.println("\nDIJKSTRA SHORTEST PATH:");

        airport.dijkstra("Terminal", "Boarding Gate");

        // Remove Route
        System.out.println("\nREMOVE ROUTE:");

        airport.removeRoute("Terminal", "Security");

        System.out.println(
                airport.hasRoute("Terminal", "Security")
        );

    }
}
