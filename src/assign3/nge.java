/*   Created by IntelliJ IDEA.
 *   Author: Ankur Maurya (Ankur-maurya)
 *   Date: 07/02/2022
 *   Time: 10:24 PM
 *   File: Main.java
 */

package assign3;

import java.util.*;
    public class nge {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int t = scn.nextInt();
            while (t > 0) {
                int n = scn.nextInt();
                int[] arr = new int[n];

                for (int i = 0; i < arr.length; i++)
                    arr[i] = scn.nextInt();

                nextLarger(arr);
                t--;
            }
        }
        public static void nextLarger(int[] arr) {
            Stack<Integer>st=new Stack<>();
            int n=arr.length;
            int[]nge =new int[n+1];
            st.push(0);
            for(int i=0;i<n;i++){
                while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                    nge[st.pop()]=arr[i];
                }
                if(i<n){
                    st.push(i);
                }
            }
            while(!st.isEmpty()){
                nge[st.pop()]=-1;
            }
            for(int i=0;i<n;i++){
                System.out.println(arr[i]+","+nge[i]);
            }
        }
    }
