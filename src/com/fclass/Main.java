package com.fclass;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CustomLinkedList list = new CustomLinkedList();
        list.show();
        list.deleteAtIndex(2);
        list.insert(5);
        list.insert(6);
        list.insert(9);
        list.insertAtIndex(2,50);
        list.show();
        System.out.println("---------------");
        list.show();
    }
}
