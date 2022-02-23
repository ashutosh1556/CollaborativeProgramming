package com.pratice.programming.india.datastructures;

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
            // Creating new node
            Node node = new Node();
            node.data = data;
            node.next = null;

            if (head == null) { // Checking for empty list
                head = node;
            } else {
                node.next = head;
                head = node;
            }
        }
    }

    void insertAtLast(int data) {
        // Creating new node
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        Node node = head; // Assigning head reference to node

        if (head == null) { // Check for empty list
            head = newNode;
        } else {
            while (node.next != null) { // Iterating to last node in linked list
                node = node.next;
            }
            node.next = newNode; // linking existing last node with newNode
        }
    }

    /***
     * @param index: Indicates the position where new node will be inserted
     * @param data: Indicates the input parameter passed as argument in calling method
     */
    void insertAt(int index, int data) {

        // Creating new node
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        // Initializing variables
        int nodeCount = 1;
        Node nodeCurrent = head;
        Node nodePrev = null;

        if (head == null) { // Check when list is empty
            System.out.println("List is empty hence adding element at first position");
            insertElementAtStart(data);
        } else if (nodeCurrent.next == null && nodeCount == 1 && index == 1) { // Check when list is having one node with same index input by user
            System.out.println("Only one node present in list hence overriding data");
            head = newNode;
        } else if (nodeCurrent.next == null && nodeCount == 1 && index != 1) { // Check when list is having one node but diff index input by user
            System.out.println("Index not available hence adding element at last position");
            insertAtLast(data);
        } else {
            // Iterating list
            while (nodeCurrent.next != null && nodeCount != index) {
                nodePrev = nodeCurrent;
                nodeCurrent = nodeCurrent.next;
                nodeCount++; // Checking node count at every iteration
            }
            nodePrev = newNode; // Linking previous node with new node
            newNode.next = nodeCurrent; // Updating new node's address with current node}
        }
    }

    void showElements() {
        Node node = head;
        if (head == null) System.out.println("List is empty");

        if (head != null) {
            System.out.print("Available nodes: ");
            while (node.next != null) { // iterating list
                System.out.print(node.data + " "); // printing data from every node
                node = node.next; // moving pointer to next node
            }
            System.out.print(node.data); // last element only
        }
    }

    void removeFromLast() {
        Node nodeCurr = head;
        Node nodePrev = null;
        int nodeCount = 1;

        if (head == null) { // When list is empty
            System.out.println("No Element in list");
        } else if (head.next == null) { // When list is having 1 node
            head = null;
        } else {
            while (nodeCurr.next != null) { // Iterating list
                nodePrev = nodeCurr;
                nodeCurr = nodeCurr.next;
                nodeCount++;
            }
            nodePrev.next = null; // Updating 2nd last node address as null
        }
    }

    void removeFromFirst() {
        Node node = head;
        if (head == null) { // When list is empty
            System.out.print("List is already empty");
        } else if (head.next == null) { // When list is having 1 node
            head = null;
            System.out.print("Single node removed");
        } else {
            head = node.next; // Pointing head to 2nd node from start
            node.next = null; // De-linking node1 and node2
        }
    }

    void removeFrom(int index) {
        Node nodeCurr = head;
        Node nodePrev = null;
        int nodeCount = 1;

        if (head == null) {
            System.out.println("List is already empty" + "\n");
        } else if (nodeCurr.next == null && nodeCount == 1 && index == 1) {
            head = null;
            System.out.println("Single node removed");
        } else if (nodeCurr.next == null && nodeCount == 1 && index != 1) {
            System.out.println("Node with index " + index + " is not available" + "\n");
        } else {
            while (nodeCurr.next != null && nodeCount != index) {
                nodePrev = nodeCurr;
                nodeCurr = nodeCurr.next;
                nodeCount++;
            }
            nodePrev.next = nodeCurr.next;
            nodeCurr.next = null;
        }
    }
}

class TestRunner {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertElementAtStart(1);
        ll.removeFromLast();
        ll.showElements();
    }
}