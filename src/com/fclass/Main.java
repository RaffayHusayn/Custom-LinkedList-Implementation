package com.fclass;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CustomLinkedList list = new CustomLinkedList();
        list.show();
        System.out.println(list.isEmpty());
        System.out.println(list.contains(5));
        list.insert(5);
        list.insert(6);
        list.insert(9);
        System.out.println("here");
        System.out.println(list.contains(6));
        System.out.println(list.contains(43));
        list.deleteAtIndex(2);
        list.insertAtIndex(2,50);
        list.show();
        System.out.println("---------------");
        list.deleteAtStart();
        list.deleteAtStart();
        System.out.println(list.contains(50));
        list.show();
        System.out.println(list.isEmpty());
    }
}
