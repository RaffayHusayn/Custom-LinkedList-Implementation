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
        list.insertAtStart(2);
        System.out.println("Printing the appended list");
        list.show();
    }
}
