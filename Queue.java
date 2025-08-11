/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class Queue {
    public final int max = 4;
    public int[] arr = new int[max];
    public int Rear = -1;
    public int Front = -1;

    public void enqueue(int data) {
        if (Rear == max - 1) {
            System.out.println("Queue Overflowed");
            return;
        }
        if (Front == -1) {
            Front = 0;
        }
        Rear++;
        arr[Rear] = data;
        System.out.println("Enqueued: " + data);
        printQueue();
        printArray();
    }

    public void dequeue() {
        if (Front == -1 || Front > Rear) {
            System.out.println("Queue Underflowed");
            return;
        }
        int deldata = arr[Front];
        System.out.println("Dequeued: " + deldata);
        Front++;

        if (Front > Rear) { // reset when queue is empty
            Front = Rear = -1;
            System.out.println("Queue is now empty");
        }

        printQueue();
        printArray();
    }

    public void printLastElement() {
        if (Rear == -1) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Last element: " + arr[Rear]);
    }

    public void printQueue() {
        System.out.print("Queue state: [");
        for (int i = 0; i < max; i++) {
            if (Front != -1 && i >= Front && i <= Rear)
                System.out.print(arr[i]);
            else
                System.out.print("_");
            if (i < max - 1) System.out.print(", ");
        }
        System.out.println("]  Front: " + Front + ", Rear: " + Rear);
    }

    public void printArray() {
        System.out.print("Array storage: [");
        for (int i = 0; i < max; i++) {
            System.out.print(arr[i]);
            if (i < max - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(45);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(35);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.printLastElement();
    }
}