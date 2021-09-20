package com.fclass;

public class CustomLinkedList {
    Node head; //class level object uninitialized is null, boolean is false and number is 0 so head = null

    //insert method
    public void insert(int data){
       Node node = new Node();
       node.data = data;
       node.next = null;
       if (head ==null){
        head = node;
       }
       else{
           Node tempNode = head;
           while (tempNode.next != null){
               tempNode = tempNode.next;
           }
            tempNode.next = node;
       }
    }


    public void show(){
        Node tempNode = head;
        if (tempNode == null){
            System.out.println("Linked List is empty");
        }else {
            while (tempNode != null) {
                System.out.println(tempNode.data);
                tempNode = tempNode.next;
            }
        }
    }

}
