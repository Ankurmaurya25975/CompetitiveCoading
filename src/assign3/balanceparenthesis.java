import java.util.Scanner;
import java.util.Stack;

public class balanceparenthesis {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        balanceparenthesis mainobj = new balanceparenthesis();
        StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);
        if (isBalanced(str)) {

            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    public static boolean isBalanced(String s) throws Exception {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (curr == '{' || curr == '(' || curr == '[') {
                stack.push(curr);
            } else if (curr == '}' || curr == ')' || curr == ']') {
                char topCh = stack.pop();
                if (curr == '}' && topCh == '{') {
                    continue;
                }
                if (curr == ')' && topCh == '(') {
                    continue;
                }
                if (curr == ']' && topCh == '[') {
                    continue;
                }
                return false;
            }
        }
        return stack.isEmpty();
    }
    private class StacksUsingArrays {
        public static final int DEFAULT_CAPACITY = 10;
        private final int[] data;
        private int tos;
        public StacksUsingArrays() throws Exception {
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