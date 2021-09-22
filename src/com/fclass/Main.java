package com.fclass;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CustomLinkedList list = new CustomLinkedList();
        list.show();
        System.out.println(list.isEmpty());
        list.insert(5);
        list.insert(6);
        list.insert(9);
        list.deleteAtIndex(2);
        list.insertAtIndex(2,50);
        list.show();
        System.out.println("---------------");
        list.deleteAtStart();
        list.deleteAtStart();
        list.show();
        System.out.println(list.isEmpty());
    }
}
