/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 07/02/2022
 *   Time: 10:41 PM
 *   File: Main.java
 */

package assign3;

import java.util.Scanner;
import java.util.Stack;

public class histogram {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        histogram mainobj = new histogram();
        StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
        System.out.println(hist(arr, stack));
    }
    public static long hist(int[] arr, StacksUsingArrays stack) throws Exception {

        //Write Your Code here
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> vis = new Stack<>();
        vis.push(0);
        for (int i = 1; i < n; i++) {
            while (!vis.isEmpty() && arr[vis.peek()] > arr[i]) {
                nse[vis.pop()] = i;

            }
            vis.push(i);
        }
        while (!vis.isEmpty()) {
            nse[vis.pop()] = n;
        }
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        pse[0] = -1;
        st.push(0);
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                pse[i] = st.peek();

            } else {
                pse[i] = -1;
            }
            st.push(i);
        }
        long maxArea = 0;
        for (int i = 0; i < n; i++) {
            long width = nse[i] - pse[i] - 1;
            long area = (long) arr[i] * width;
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;

    }
    private class StacksUsingArrays {
        public static final int DEFAULT_CAPACITY = 10;
        private final int[] data;
        private int tos;

        public StacksUsingArrays() throws Exception {
            // TODO Auto-generated constructor stub
            this(DEFAULT_CAPACITY);
        }
        public StacksUsingArrays(int capacity) throws Exception {
            if (capacity <= 0) {
                System.out.println("Invalid Capacity");
            }
            this.data = new int[capacity];
            this.tos = -1;
        }
        public int size() {
            return this.tos + 1;
        }
        public boolean isEmpty() {
            return this.size() == 0;
        }
        public void push(int item) throws Exception {
            if (this.size() == this.data.length) {
                throw new Exception("Stack is Full");
            }
            this.tos++;
            this.data[this.tos] = item;
        }
        public int pop() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            int retVal = this.data[this.tos];
            this.data[this.tos] = 0;
            this.tos--;
            return retVal;
        }
        public int top() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            int retVal = this.data[this.tos];
            return retVal;
        }
        public void display() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            for (int i = this.tos; i >= 0; i--) {
                System.out.println(this.data[i]);
            }
        }
    }
}