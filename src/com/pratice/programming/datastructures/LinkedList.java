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

        if (data >= Integer.MAX_VALUE || data <= Integer.MIN_VALUE) {
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

    void showElements() {
        Node node = head;

        if (head != null) {
            while (node.next != null) {
                System.out.println(node.data + " ");
                node = node.next;
            }
            System.out.println(node.data); // last element only
        } else
            System.out.println("Element not present");
    }
}

class TestRunner {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertElementAtStart(Integer.MIN_VALUE - 5);
        ll.showElements();
    }
}


