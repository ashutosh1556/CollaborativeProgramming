package com.google.interview;

class Node {
    int data;
    Node next;
}

public class LinkedList {
    Node head = null;

    void addElement(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (head == null) {
            head = newNode;
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    void displayAscending() {
        Node node = head;
        while (node.next != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.print(node.data);
    }

    void displayDescending() {
        Node node = head;
        Node prev = null;
        Node current = node;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        displayAscending();
    }
}

class ListRunner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addElement(1);
        list.addElement(2);
        list.addElement(3);


        list.displayDescending();
    }
}
