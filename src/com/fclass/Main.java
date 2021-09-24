package com.fclass;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CustomLinkedList<Object> list = new CustomLinkedList<>();
        list.show();
        list.insertAtEnd("Raffay");
        list.insertAtEnd("Ayesha");
        list.show();
        list.insertAtStart("Nabia");
        list.insertAtIndex(2,"Ali");
        System.out.println("-----------------");
        list.show();
        list.deleteAtStart();
        list.deleteAtIndex(2);
        System.out.println("---------------");
        list.show();
        System.out.println(list.contains("Raffay"));
        System.out.println(list.isEmpty());
        list.insertAtIndex(1, "ayesha");
        list.insertAtIndex(0,"nabia");
        list.show();
        list.editAtIndex(0, "new");
        list.insertAtIndex(0, 1);
        list.show();
        System.out.println("TTTTTTTTTTTTTTTTTTTTTTTTTTTTt");
        list.removeAll();
        list.show();
        list.isEmpty();

    }
}
