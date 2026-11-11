/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package airport.datastructures;

public class CustomHashTable<K, V> {

    // Node Class
    private static class Entry<K, V> {

        K key;
        V value;
        Entry<K, V> next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Entry<K, V>[] table;
    private int capacity;
    private int size;

    // Constructor
    @SuppressWarnings("unchecked")
    public CustomHashTable(int capacity) {
        this.capacity = capacity;
        table = (Entry<K, V>[]) new Entry[capacity];
        size = 0;
    }

    // Hash Function
    private int hash(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    // Insert or Update
    public void put(K key, V value) {

        if (key == null) {
            return;
        }

        int index = hash(key);

        Entry<K, V> current = table[index];

        while (current != null) {

            if (current.key.equals(key)) {
                current.value = value;
                return;
            }

            current = current.next;
        }

        Entry<K, V> newEntry = new Entry<>(key, value);

        newEntry.next = table[index];
        table[index] = newEntry;

        size++;
    }

    // Search
    public V get(K key) {

        if (key == null) {
            return null;
        }

        int index = hash(key);

        Entry<K, V> current = table[index];

        while (current != null) {

            if (current.key.equals(key)) {
                return current.value;
            }

            current = current.next;
        }

        return null;
    }

    // Delete
    public boolean remove(K key) {

        if (key == null) {
            return false;
        }

        int index = hash(key);

        Entry<K, V> current = table[index];
        Entry<K, V> previous = null;

        while (current != null) {

            if (current.key.equals(key)) {

                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }

                size--;
                return true;
            }

            previous = current;
            current = current.next;
        }

        return false;
    }

    // Check Key
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    // Get Size
    public int size() {
        return size;
    }

    // Check Empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Display Hash Table
    public void display() {

        for (int i = 0; i < capacity; i++) {

            System.out.print("Index " + i + ": ");

            Entry<K, V> current = table[i];

            while (current != null) {

                System.out.print(
                    "[" + current.key + " = " + current.value + "] -> "
                );

                current = current.next;
            }

            System.out.println("NULL");
        }
    }
}
