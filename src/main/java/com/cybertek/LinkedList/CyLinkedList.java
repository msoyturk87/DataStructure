package com.cybertek.LinkedList;

import java.util.NoSuchElementException;

public class CyLinkedList {

    public class Node{
        public int x;
        public Node next;

        public Node(int x) {
            this.x = x;
        }
    }

    public Node first;   // head
    public Node last;    // tail

    public int size;

    public CyLinkedList() {     // LinkedList Creation
        this.first=null;
        this.last=null;
        this.size=0;
    }


        public boolean isEmpty(){       // we can return size too
            return first==null;
        }

        public void reverse( ){

            Node prev=null,next=null;
            Node current=first;

          while (current != null) {
                        // 1.This is for passing next Node
                        next = current.next;
                        // 2.This is for changing direction to back ( reverse )
                        current.next = prev;

                        // 3.This is for passing new Node to do same steps
                        prev = current;
                        // 4.Current goes next node
                        current = next;
                    }
                    // Assigning head
                    first = prev;

            printLinkedList();

            }

        public void nthElementFromEnd(int position){

        int i=0;

            Node current=first;
            Node precursor=first;

            while(precursor!=null){

                if(i<position){
                    // This step to set a rope between end and searching item
                    for (i=0;precursor.next!=null && i <position; i++) {
                    precursor=precursor.next;
                    }
                }
                current=current.next;
                precursor=precursor.next;

                }

                System.out.println(current.x);

            }





    public void addLast(int item){

            var node=new Node(item);
            System.out.println(" adding new item"+item);
            if(isEmpty())
                first=last=node;
            else {
                last.next = node;
                last = node;
            }
            size++;

        }

    public void deleteLast(){
        if (isEmpty()) throw new NoSuchElementException();
        System.out.println("Deleting last :"+ last.x);
        if (first==last) first=last=null;
        else {
            var previous = first;
            var current= first;
            while (current.next !=null){
                previous=current;
                current=current.next;
            }
            previous.next=null;
            last=previous;
        }
        size--;

    }



    public void printLinkedList(){

        if (isEmpty()) throw new NoSuchElementException();
        var current= first;

        while (current!=null){

            System.out.println("Value :"+current.x);
            current=current.next;
        }
    }
}