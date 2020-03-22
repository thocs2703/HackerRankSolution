package HackerRank.DataStructure.LinkedList;

import java.util.*;

public class DynamicArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        
        // int[][] seq = new int[N][Q];
        // int[] lstIndex = new int[N];
        Vector<Vector<Integer>> seq = new Vector<Vector<Integer>>();

        for (int i = 0; i < N; i++){
            seq.add(new Vector<Integer>());
        }

        int lastAnswer = 0;
        for (int i = 0; i < Q; i++){
            int query = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int index = (x ^ lastAnswer) % N;
            Vector<Integer> currSeq = seq.get(index);
            if (query == 1){
                currSeq.add(y);
                // currSeq.
            }
            else {
                lastAnswer = currSeq.get(y % currSeq.size());
                System.out.println(lastAnswer);
            }
        }
        sc.close();
    }
}