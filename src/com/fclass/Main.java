package com.fclass;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CustomLinkedList list = new CustomLinkedList();
        list.show();
        list.insert(5);
        list.insert(6);
        list.insert(9);
        System.out.println("printing the first list");
        list.show();
        list.insertAtIndex(2,1000);
        System.out.println("new list");
        list.show();
        list.deleteAtStart();
        System.out.println("_______________");
        list.show();
    }
}
