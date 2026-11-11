/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.main;

import airport.models.Flight;
import airport.datastructures.CustomHashTable;

public class TestHashTable {

    public static void main(String[] args) {

        CustomHashTable<String, Flight> hashTable =
                new CustomHashTable<>(5);

        Flight f1 = new Flight(
                "PK-301", "Karachi", "10:30 AM", "G-01", "On Time"
        );

        Flight f2 = new Flight(
                "PK-369", "Lahore", "11:45 AM", "G-02", "Boarding"
        );

        Flight f3 = new Flight(
                "PK-450", "Dubai", "01:00 PM", "G-03", "Delayed"
        );

        // Insert Flights
        hashTable.put("PK-301", f1);
        hashTable.put("PK-369", f2);
        hashTable.put("PK-450", f3);

        // Display
        System.out.println("HASH TABLE:");
        hashTable.display();

        // Search
        System.out.println("\nSEARCH FLIGHT:");

        Flight result = hashTable.get("PK-369");

        if (result != null) {
            System.out.println(result);
        } else {
            System.out.println("Flight not found.");
        }

        // Delete
        System.out.println("\nDELETE FLIGHT:");

        System.out.println(hashTable.remove("PK-450"));

        // Updated Size
        System.out.println("\nTOTAL RECORDS: "
                + hashTable.size());

        // Updated Hash Table
        hashTable.display();
    }
}
