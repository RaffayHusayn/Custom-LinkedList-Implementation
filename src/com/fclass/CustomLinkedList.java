package com.fclass;

public class CustomLinkedList {
    Node head; //class level object uninitialized is null, boolean is false and number is 0 so head = null

    //insert method
    public void insert(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;//don't have to do this, it's null by default
        if (head == null) {
            head = node;
        } else {
            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = node;
        }
    }


    public void show() {
        Node tempNode = head;
        if (tempNode == null) {
            System.out.println("Linked List is empty");
        } else {
            while (tempNode != null) {
                System.out.println(tempNode.data);
                tempNode = tempNode.next;
            }
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null; //by default
        node.next = head;
        head = node;
    }

    public void insertAtIndex(int index, int data) {
        if (index < 0) {
            System.out.println("No Element Added, Index can't be negative");
        } else if (index == 0) {
            insertAtStart(data);
        } else {
            // Node to be added
            Node node = new Node();
            node.data = data;
            node.next = null; //by default

            //Temp Node
            Node tempNode = head;
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.next;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }

    }


    public void deleteAtStart() {
        head = head.next;
    }

    public void deleteAtIndex(int index) {
        if (index < 0) {
            System.out.println("Index can't be negative; no changes made");
        } else if (index == 0) {
            deleteAtStart();
        } else {
            Node tempNode = head;
            for (int i = 0; i < index - 1; i++) {
                tempNode = tempNode.next;
            }
            Node nodeToRemove = tempNode.next;
            tempNode.next = nodeToRemove.next;
        }

    }


    public boolean isEmpty() {
        return head == null;
    }

    public boolean contains(int element) {
        Node tempNode = head;
        while (tempNode != null) {
            if (tempNode.data != element) {
                tempNode = tempNode.next;
            } else {
                return true;
            }
        }
        return false;
    }
}
