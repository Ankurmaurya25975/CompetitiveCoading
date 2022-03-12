/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 07/02/2022
 *   Time: 10:32 PM
 *   File: Main.java
 */

package assign3;

import java.util.Scanner;
public class triplet {
    private Node head;
    private Node tail;
    private int size;
    public triplet() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    public triplet(Node head, Node tail, int size) {
        this.head = head;
        this.tail = tail;
        this.size = size;
    }
    public static void main(String[] args) {
        triplet l1 = new triplet();
        triplet l2 = new triplet();
        triplet l3 = new triplet();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            l1.addLast(sc.nextInt());
        }
        for (int i = 0; i < m; i++) {
            l2.addLast(sc.nextInt());
        }
        for (int i = 0; i < k; i++) {
            l3.addLast(sc.nextInt());
        }
        int target = sc.nextInt();
        for (Node temp1 = l1.head; temp1 != null; temp1 = temp1.next) {
            for (Node temp2 = l2.head; temp2 != null; temp2 = temp2.next) {
                for (Node temp3 = l3.head; temp3 != null; temp3 = temp3.next) {
                    if (temp1.data + temp2.data + temp3.data == target) {
                        System.out.println(temp1.data + " " + temp2.data + " " + temp3.data);
                        return;
                    }
                }
            }

        }

    }
    public int size() {
        return this.size;
    }
    public boolean isEmpty() {
        return this.size() == 0;
    }
    public void addLast(int data) {
        Node node = new Node(data, null);

        if (this.size() == 0) {
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }

        this.size++;
    }
    private class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
