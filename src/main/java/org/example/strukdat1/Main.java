package org.example.strukdat1;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {
    static Node first;
    static Node last;

    public static void main(String[] args) {
        first = new Node(2);
        Node second = new Node(23);

        first.next = second;
        last = second;

        System.out.println("Sebelum addAll:");
        display();

        int[] arr = {80, 7, 12};
        addAll(arr);

        System.out.println("Setelah addAll:");
        display();
    }

    public static void addAll(int[] arr) {
        for (int num : arr) {
            Node newNode = new Node(num);
            last.next = newNode;
            last = newNode;
        }
    }

    public static void display() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}