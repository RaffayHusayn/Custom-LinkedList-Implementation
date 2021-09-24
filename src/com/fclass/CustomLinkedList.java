package com.fclass;

public class CustomLinkedList<T> {
    Node<T> head; //class level object uninitialized is null, boolean is false and number is 0 so head = null

    //Method used to add an element to the end of the linked list
    public void insertAtEnd(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = null;//don't have to do this, it's null by default
        if (head == null) {
            head = node;
        } else {
            Node<T> tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }
    }

    // Method used to print all the elements of the linked list
    public void show() {
        Node<T> tempNode = head;
        if (tempNode == null) {
            System.out.println("Linked List is empty");
        } else {
            while (tempNode != null) {
                System.out.println(tempNode.data);
                tempNode = tempNode.next;
            }
        }
    }

    //Method used to Add Element at the head of the Linked List
    public void insertAtStart(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = head;
        head = node;
    }


    //Method used to Add an Element to a specific Index of the Linked List
    public void insertAtIndex(int index, T data) {
        if (index < 0) {
            System.out.println("No Element Added, Index can't be negative");
        } else if (index == 0) {
            insertAtStart(data);
        } else {
            // Node to be added
            Node<T> node = new Node<>();
            node.data = data;

            //Temp Node
            Node<T> tempNode = head;
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }

    }


    //Method used to Delete the element at the head of the linked list
    public void deleteAtStart() {
        head = head.next;
    }

    public void deleteAtIndex(int index) {
        if (index < 0) {
            System.out.println("Index can't be negative; no changes made");
        } else if (index == 0) {
            deleteAtStart();
        } else {
            Node<T> tempNode = head;
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.next;
            }
            Node<T> nodeToRemove = tempNode.next;
            tempNode.next = nodeToRemove.next;
            nodeToRemove = null; // so that it is eligible for garbage collection
        }

    }


    //Method returns True if the Head of the Linked List is null ie there are no elements in the list
    public boolean isEmpty() {
        return head == null;
    }


    // Method returns true if the Linked List contains a specific element
    public boolean contains(T element) {
        Node<T> tempNode = head;
        while (tempNode != null) {
            if (tempNode.data != element) {
                tempNode = tempNode.next;
            } else {
                return true;
            }
        }
        return false;
    }


    // Method used to update the value of a specific node of the Linked List
    public void editAtIndex(int index, T element){
        Node<T> tempNode = head;
        for(int i=0; i<index; i++){
            tempNode = tempNode.next;
        }
        tempNode.data = element;
    }


    // Method used to make all the nodes of the Linked List null
    public void removeAll(){
       Node<T> tempNode = head;
       Node<T> nextNode  = head ;
       while(tempNode !=null){
            nextNode = tempNode.next;
            tempNode.next = null;
            tempNode = nextNode;
       }
       head = null;
    }
}