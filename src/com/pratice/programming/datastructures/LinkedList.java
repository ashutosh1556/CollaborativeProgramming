package com.pratice.programming.datastructures;

class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;

    /***
     *
     * testCase
     * insertElementAtStart(null) // compile time
     * insertElementAtStart(1) // valid case
     * insertElementAtStart('a') // valid case since it takes ASCII value
     * insertElementAtStart(true) // compile time
     * insertElementAtStart("ashu") // compile time
     * insertElementAtStart(-1) // valid case
     * insertElementAtStart(10.0) // compile time
     * insertElementAtStart(MaxInteger + 1) // valid case
     * insertElementAtStart(MinInteger - 1) // valid case
     */
    void insertElementAtStart(int data) {

        if (data > Integer.MAX_VALUE || data < Integer.MIN_VALUE) {
            System.out.println("Number out of boundary");
        } else {
            Node node = new Node();
            node.data = data;
            node.next = null;

            if (head == null) {
                head = node;
            } else {
                node.next = head;
                head = node;
            }
        }
    }

    /***
     * Test Cases:
     * ===========================
     * insertAtLast(3)
     * insertAtLast(null)
     * insertAtLast(-2)
     * insertAtLast('a')
     * insertAtLast("123")
     * insertAtLast(MaxInteger+1)
     * insertAtLast(MinInteger-1)
     * insertAtLast(true)
     */
    void insertAtLast(int data) {
        // Creating new node with data and address
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        Node node = head; // Assigning head reference to node

        if (head == null) head = newNode; // Check for empty list
        else {
            while (node.next != null) { // Iterating to last node in linked list
                node = node.next;
            }
            node.next = newNode; // linking existing last node with newNode
        }
    }

    void insertAt(int index, int data) {

    }

    void showElements() {
        Node node = head;

        if (head != null) {
            while (node.next != null) {
                System.out.println(node.data + " ");
                node = node.next;
            }
            System.out.println(node.data); // last element only
        }
    }

    void removeAtLast() {
    }

    void removeAtFirst() {
    }

    void removeAt(int index) {
    }

}

class TestRunner {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAt(0, 1);
        ll.showElements();
    }
}


