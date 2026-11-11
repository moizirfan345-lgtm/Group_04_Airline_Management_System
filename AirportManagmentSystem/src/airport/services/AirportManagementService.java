/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.services;

import airport.graphs.AirportGraph;
import airport.datastructures.AirportLinkedList;
import airport.datastructures.AirportHashTable;
import airport.datastructures.AirportQueue;
import airport.datastructures.AirportPriorityQueue;
import airport.datastructures.AirportStack;
import airport.datastructures.PassengerLinkedList;

public class AirportManagementService {

    private AirportGraph graph;
    private AirportLinkedList linkedList;
    private AirportHashTable hashTable;
    private AirportQueue queue;
    private AirportPriorityQueue priorityQueue;
    private AirportStack stack;
    private PassengerLinkedList passengerList;

    public AirportManagementService() {

        graph = new AirportGraph();
        linkedList = new AirportLinkedList();
        hashTable = new AirportHashTable();
        queue = new AirportQueue();
        priorityQueue = new AirportPriorityQueue();
        stack = new AirportStack();
        passengerList = new PassengerLinkedList();
    }

    public AirportGraph getGraph() {
        return graph;
    }

    public AirportLinkedList getLinkedList() {
        return linkedList;
    }

    public AirportHashTable getHashTable() {
        return hashTable;
    }

    public AirportQueue getQueue() {
        return queue;
    }

    public AirportPriorityQueue getPriorityQueue() {
        return priorityQueue;
    }

    public AirportStack getStack() {
        return stack;
    }
    public PassengerLinkedList getPassengerList() {
    return passengerList;
}
}
