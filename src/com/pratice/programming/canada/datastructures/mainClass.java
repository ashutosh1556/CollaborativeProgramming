package com.pratice.programming.canada.datastructures;



public class mainClass {

    static int numOfNodes = 0;
    Node head;

    public static void main(String[] args) {

        mainClass obj = new mainClass();
       obj.insertFirst(1);
        obj.insertFirst(2);
        obj.insertAtEnd(3);
        //System.out.println(" Linked list -->");
        //obj.printElements();
        //System.out.println("delete last node");*/
        //obj.removeLastNode();
       //System.out.println("After Deleting the last node");
        obj.removeFirstNode();
        System.out.println(" After removing first node the Linked list is -->"); //  1 3
        obj.printElements();


    }





    /*
    Insert element at first position

     */
    public void insertFirst(int data) {
        numOfNodes = numOfNodes + 1;

        Node newNode = new Node();
        newNode.ref = null; //explicitly null
        newNode.data = data;
        if (head != null) {
            newNode.ref = head;
            head = newNode; // point to new node that is on the fist position now
        } else {
            head = newNode;
        }
    }

    /*

    print all the elements of a ll
     */
    void printElements() {

        if (head == null) {
            System.out.println("linked list is empty");
        } else { // atleast one node exist
            Node newNodeRef = head; // address of first node
            //  node = head;
            while (newNodeRef.ref != null) {
                System.out.println(newNodeRef.data);
                //System.out.println();
                newNodeRef = newNodeRef.ref;
            }

            System.out.println(newNodeRef.data);
            System.out.println("Number of noded created -->" + numOfNodes);


        }
    }

    /*
         insertAtEnd (1) // valid test
         insertAtEnd("1") // compile time error
         insertAtEnd(-1) //valid
         insertAtEnd(MaxINt)  //valid
         insertAtEnd(MinINt) // valid
         insertAtEnd(1.0)  //compile time
         insertAtEnd() //compile time error
         insertAtEnd(MaxInt+1)
         insertAtEnd(MinInt-1)

         EXceptions -
         1. Linked list is empty

     */
    void insertAtEnd(int data) {
        numOfNodes = numOfNodes + 1;
        Node newNode = new Node();
        newNode.ref = null;
        newNode.data = data;

        if (head == null) {
            head = newNode;
        } else {
            System.out.println("Inside insert at end method");
            Node nodeRef = head;
            while (nodeRef.ref != null) {
                nodeRef = nodeRef.ref;
            }
            nodeRef.ref = newNode; // last node is pointing to new last node
        }

    }

/*

1. change head node value to point to head.ref

Scenario 2 - additoinal step to make the address field of first node as null
Exceptions -
1. LL empty
2. only 1 node in LL
 */

    void removeFirstNode(){
        Node node = head;
        if (head == null){
            System.out.println("Linked list is empty");
        }else if (head.ref == null){
            head = null; // remove the only existing node
        }else{
            head = head.ref;  // update head to point to second node
            node.ref=null;
        }

    }
void removeAtIndex()
{


}

    /* removeAtIndex


    /*

    /*
     EXception handling :
  1 - link list can be empty
  2- There can be only 1 element in the link list
  */
     /*Algo -
    1. Start from First node and Iterate through linked list untill you find the last node.
        2. Remove last node - i.e. put null value in the address of second last node.
     */
    void removeLastNode() {
        if (head == null) {
            System.out.println("Linked list is empty");
        }else if (head.ref == null) {
            System.out.println("There is only one node and that is removed");
            head = null;
            printElements();
        } else { // more than one node
            Node nodePtrNext = head;
            Node nodePtrPrev = null;
            while (nodePtrNext.ref != null) {
                nodePtrPrev = nodePtrNext;
                nodePtrNext = nodePtrNext.ref;

                /* but how to navigate back to second last node?*/
            }
            nodePtrPrev.ref =null;
        }
    }

}


// end of main class

class Node {
    int data;
    Node ref;
}

