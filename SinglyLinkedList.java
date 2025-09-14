/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

class SinglyLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

  
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    
    public void delFirst() {
        if (head == null) {
            System.out.println("List is empty, cannot delete");
            return;
        }
        head = head.next;
        System.out.println("First element deleted");
    }

    
    public void delLast() {
        if (head == null) {
            System.out.println("List is empty, cannot delete");
            return;
        }
        if (head.next == null) {
            head = null;
            System.out.println("Last element deleted");
            return;
        }
        Node secondLast = head;
        while (secondLast.next.next != null) {
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        System.out.println("Last element deleted");
    }

    
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        System.out.println("Linked list reversed");
    }

   
    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();

        sl.addFirst(10);
        sl.addLast(20);
        sl.addLast(30);
        sl.addLast(40);

        System.out.println("Original list:");
        sl.printList();

        System.out.println("Size of list: " + sl.size());

        sl.reverse();
        sl.printList();

        sl.delFirst();
        sl.printList();

        sl.delLast();
        sl.printList();

        System.out.println("Final size of list: " + sl.size());
    }
}
