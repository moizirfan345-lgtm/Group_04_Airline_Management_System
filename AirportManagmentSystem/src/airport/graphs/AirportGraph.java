/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.Map;

public class AirportGraph {

    private HashMap<String, ArrayList<String>> graph;

    public AirportGraph() {
        graph = new HashMap<>();
    }

    // Add Airport Location
    public void addLocation(String location) {

        if (!graph.containsKey(location)) {
            graph.put(location, new ArrayList<>());
        }
    }

    // Add Route
    public void addRoute(String source, String destination) {

        addLocation(source);
        addLocation(destination);

        graph.get(source).add(destination);
        graph.get(destination).add(source);
    }

    // Display Graph
    public void displayGraph() {

        for (String location : graph.keySet()) {

            System.out.print(location + " -> ");

            System.out.println(graph.get(location));
        }
    }

    // Check Route
    public boolean hasRoute(String source, String destination) {

        if (!graph.containsKey(source)) {
            return false;
        }

        return graph.get(source).contains(destination);
    }

    // Remove Route
    public void removeRoute(String source, String destination) {

        if (graph.containsKey(source)
                && graph.containsKey(destination)) {

            graph.get(source).remove(destination);
            graph.get(destination).remove(source);
        }
    }

    // Get Total Locations
    public int getTotalLocations()
{
        return graph.size();
    }
    
// BFS Traversal
public void BFS(String start) {

    if (!graph.containsKey(start)) {
        System.out.println("Location not found!");
        return;
    }

    java.util.Queue<String> queue =
            new java.util.LinkedList<>();

    java.util.HashSet<String> visited =
            new java.util.HashSet<>();

    queue.add(start);
    visited.add(start);

    System.out.print("BFS: ");

    while (!queue.isEmpty()) {

        String current = queue.poll();

        System.out.print(current + " -> ");

        for (String neighbour : graph.get(current)) {

            if (!visited.contains(neighbour)) {

                visited.add(neighbour);
                queue.add(neighbour);
            }
        }
    }

    System.out.println("END");
}


// DFS Traversal
public void DFS(String start) {

    if (!graph.containsKey(start)) {
        System.out.println("Location not found!");
        return;
    }

    java.util.HashSet<String> visited =
            new java.util.HashSet<>();

    System.out.print("DFS: ");

    dfsHelper(start, visited);

    System.out.println("END");
}


// DFS Helper Method
private void dfsHelper(String location,
        java.util.HashSet<String> visited) {

    visited.add(location);

    System.out.print(location + " -> ");

    for (String neighbour : graph.get(location)) {

        if (!visited.contains(neighbour)) {

            dfsHelper(neighbour, visited);
        }
    }
}

public void dijkstra(String start, String destination) {

    HashMap<String, Integer> distance = new HashMap<>();

    HashMap<String, String> previous = new HashMap<>();

    for (String location : graph.keySet()) {
        distance.put(location, Integer.MAX_VALUE);
    }

    if (!graph.containsKey(start) ||
            !graph.containsKey(destination)) {

        System.out.println("Location not found!");
        return;
    }

    PriorityQueue<String> queue = new PriorityQueue<>(
        (a, b) -> Integer.compare(
            distance.get(a), distance.get(b)
        )
    );

    distance.put(start, 0);
    queue.add(start);

    while (!queue.isEmpty()) {

        String current = queue.poll();

        for (String neighbour : graph.get(current)) {

            int newDistance = distance.get(current) + 1;

            if (newDistance < distance.get(neighbour)) {

                distance.put(neighbour, newDistance);

                previous.put(neighbour, current);

                queue.remove(neighbour);
                queue.add(neighbour);
            }
        }
    }

    if (distance.get(destination) == Integer.MAX_VALUE) {
        System.out.println("No route available!");
        return;
    }

    System.out.println("Shortest Distance: "
            + distance.get(destination));

    System.out.print("Shortest Path: ");

    java.util.LinkedList<String> path =
            new java.util.LinkedList<>();

    String current = destination;

    while (current != null) {
        path.addFirst(current);
        current = previous.get(current);
    }

    System.out.println(path);
}


}
