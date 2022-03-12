/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 06/02/2022
 *   Time: 9:37 PM
 *   File: m.java
 */

package assign3;
import java.util.*;

public class mergeSortedLinkedLists {
        public static class Node {
            int data;
            Node next;
        }
        public static class LinkedList {
            Node head;
            Node tail;
            int size;

            void addLast(int val) {
                Node temp = new Node();
                temp.data = val;
                temp.next = null;

                if (size == 0) {
                    head = tail = temp;
                } else {
                    tail.next = temp;
                    tail = temp;
                }

                size++;
            }

            public int size() {
                return size;
            }

            public void display() {
                for (Node temp = head; temp != null; temp = temp.next) {
                    System.out.print(temp.data + " ");
                }
                System.out.println();
            }
            public void removeFirst() {
                if (size == 0) {
                    System.out.println("List is empty");
                } else if (size == 1) {
                    head = tail = null;
                    size = 0;
                } else {
                    head = head.next;
                    size--;
                }
            }
            public int getFirst() {
                if (size == 0) {
                    System.out.println("List is empty");
                    return -1;
                } else {
                    return head.data;
                }
            }

            public int getLast() {
                if (size == 0) {
                    System.out.println("List is empty");
                    return -1;
                } else {
                    return tail.data;
                }
            }

            public int getAt(int idx) {
                if (size == 0) {
                    System.out.println("List is empty");
                    return -1;
                } else if (idx < 0 || idx >= size) {
                    System.out.println("Invalid arguments");
                    return -1;
                } else {
                    Node temp = head;
                    for (int i = 0; i < idx; i++) {
                        temp = temp.next;
                    }
                    return temp.data;
                }
            }
            public void addFirst(int val) {
                Node temp = new Node();
                temp.data = val;
                temp.next = head;
                head = temp;

                if (size == 0) {
                    tail = temp;
                }

                size++;
            }
            public void addAt(int idx, int val) {
                if (idx < 0 || idx > size) {
                    System.out.println("Invalid arguments");
                } else if (idx == 0) {
                    addFirst(val);
                } else if (idx == size) {
                    addLast(val);
                } else {
                    Node node = new Node();
                    node.data = val;

                    Node temp = head;
                    for (int i = 0; i < idx - 1; i++) {
                        temp = temp.next;
                    }
                    node.next = temp.next;

                    temp.next = node;
                    size++;
                }
            }
            public void removeLast() {
                if (size == 0) {
                    System.out.println("List is empty");
                } else if (size == 1) {
                    head = tail = null;
                    size = 0;
                } else {
                    Node temp = head;
                    for (int i = 0; i < size - 2; i++) {
                        temp = temp.next;
                    }

                    tail = temp;
                    tail.next = null;
                    size--;
                }
            }
            public void removeAt(int idx) {
                if (idx < 0 || idx >= size) {
                    System.out.println("Invalid arguments");
                } else if (idx == 0) {
                    removeFirst();
                } else if (idx == size - 1) {
                    removeLast();
                } else {
                    Node temp = head;
                    for (int i = 0; i < idx - 1; i++) {
                        temp = temp.next;
                    }

                    temp.next = temp.next.next;
                    size--;
                }
            }
            private Node getNodeAt(int idx) {
                Node temp = head;
                for (int i = 0; i < idx; i++) {
                    temp = temp.next;
                }
                return temp;
            }
            public void reverseDI() {
                int li = 0;
                int ri = size - 1;
                while (li < ri) {
                    Node left = getNodeAt(li);
                    Node right = getNodeAt(ri);

                    int temp = left.data;
                    left.data = right.data;
                    right.data = temp;

                    li++;
                    ri--;
                }
            }
            public void reversePI() {
                if (size <= 1) {
                    return;
                }
                Node prev = null;
                Node curr = head;
                while (curr != null) {
                    Node next = curr.next;

                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }

                Node temp = head;
                head = tail;
                tail = temp;
            }

            public int kthFromLast(int k) {
                Node slow = head;
                Node fast = head;
                for (int i = 0; i < k; i++) {
                    fast = fast.next;
                }
                while (fast != tail) {
                    slow = slow.next;
                    fast = fast.next;
                }

                return slow.data;
            }
            public int mid() {
                Node f = head;
                Node s = head;

                while (f.next != null && f.next.next != null) {
                    f = f.next.next;
                    s = s.next;
                }

                return s.data;
            }
            public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
                // write your code hered
                LinkedList list = new LinkedList();
                Node a = l1.head;
                Node b = l2.head;
                while(a!=null && b!=null){
                    if(a.data < b.data){
                        list.addLast(a.data);
                        a = a.next;
                    }
                    else{
                        list.addLast(b.data);
                        b = b.next;
                    }
                }
                while(a!=null){

                    list.addLast(a.data);
                    a = a.next;
                }
                while(b!=null){
                    list.addLast(b.data);
                    b= b.next;
                }
                return list;
            }
        }
        public static void main(String[] args) throws Exception {
            Scanner kb = new Scanner(System.in);
            int t = kb.nextInt();
            for(int j=0;j<t;j++){
                int n1 = kb.nextInt();
                LinkedList l1 = new LinkedList();

                for (int i = 0; i < n1; i++) {
                    int d = kb.nextInt();
                    l1.addLast(d);
                }
                int n2 = kb.nextInt();
                LinkedList l2 = new LinkedList();

                for (int i = 0; i < n2; i++) {
                    int d = kb.nextInt();
                    l2.addLast(d);
                }
                LinkedList merged = LinkedList.mergeTwoSortedLists(l1, l2);
                merged.display();
            }
        }
    }
