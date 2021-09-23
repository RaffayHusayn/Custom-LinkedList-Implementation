package com.fclass;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CustomLinkedList<String> list = new CustomLinkedList<>();
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
        list.editAtIndex(3, "new");
        list.show();

    }
}
