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
        list.insertAtIndex(-1,1000);
        System.out.println("new list");
        list.show();
    }
}
