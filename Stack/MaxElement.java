package HackerRank.DataStructure.Stack;

import java.util.Scanner;
import java.util.Stack;

// import java.io.*;
// import java.util.*;

public class MaxElement {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        Stack<StackNode> stack = new Stack<StackNode>();
        for(int i = 0; i < n; i++){
            int choice = sc.nextInt();
            if(choice == 1){
                int val = sc.nextInt();
                max = Math.max(val, max);
                stack.add(new StackNode(val, max));
            }
            if(choice == 2){
                if(!stack.isEmpty()){
                    stack.pop();
                    // max = stack.peek().curMax;
                }
                else if(stack.isEmpty())
                    max = Integer.MIN_VALUE;
                else
                    max = stack.peek().curMax;
            }
            if(choice == 3){
                System.out.println(stack.peek().curMax);
            }
        }
        sc.close();
    }
}

class StackNode {
    int val;
    int curMax;
    public StackNode(int val, int curMax) {
        this.val = val;
        this.curMax = curMax;
    }

    public String toString() {
        return val + " [" + curMax + "]";
    }
}