/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

     public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();  // Create LinkedList instance

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        Node current = null;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            int data = sc.nextInt();

            Node newNode = new Node(data);

            if (list.head == null) {
                list.head = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = newNode;
            }
        }

        // Print the LinkedList
        System.out.print("LinkedList: ");
        Node temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        sc.close();
    }
}
