package com.cybertek.LinkedList;

public class LinkedListApp {
    public static void main(String[] args) {

        var cyLinkedList = new CyLinkedList();
        cyLinkedList.addLast(1);
        cyLinkedList.addLast(2);
        cyLinkedList.addLast(3);
        cyLinkedList.addLast(4);
        cyLinkedList.addLast(5);
        cyLinkedList.addLast(6);
        cyLinkedList.addLast(7);
        cyLinkedList.printLinkedList();
        System.out.println("===============");
        cyLinkedList.deleteLast();
        cyLinkedList.printLinkedList();
        System.out.println("nth element");
        cyLinkedList.nthElementFromEnd(1);
        System.out.println("Reversed one");
        cyLinkedList.reverse();
        System.out.println("nth element");
        cyLinkedList.nthElementFromEnd(1);



    }
}
