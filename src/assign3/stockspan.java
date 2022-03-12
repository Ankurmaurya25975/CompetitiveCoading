/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 07/02/2022
 *   Time: 10:11 PM
 *   File: Main.java
 */

package assign3;

import java.util.Scanner;

public class stockspan {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        stockspan mainobj = new stockspan();
        int[] prices = new int[N];
        for (int i = 0; i < N; i++) {
            prices[i] = s.nextInt();
        }
        StacksUsingArrays stack = mainobj.new StacksUsingArrays(prices.length);
        int[] ans = StockSpanUsingStacks(prices, stack);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println("END");

    }
    public static int[] StockSpanUsingStacks(int[] prices, StacksUsingArrays stack) throws Exception {
        int n = prices.length;
        int[] span = new int[n];
        span[0] = 1;
        stack.push(0);
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.top()] <= prices[i]) {
                stack.pop();

            }
            if (stack.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - stack.top();
            }
            stack.push(i);
        }
        return span;
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
