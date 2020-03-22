package HackerRank.DataStructure.LinkedList;
import java.util.*;

public class Crush{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // String[] str = sc.nextLine().split(" ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] arr = new long[n];

        for(int i = 0; i < n; i++){
            arr[i] = 0;
        }

        int a, b;
        long k;

        for(int i = 0; i < m; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            k = sc.nextInt();
           
            arr[a-1] += k;
            if (b < n)
                arr[b] -= k;

        }
        long max=0;
        long temp=0;

        for(int i=0;i<n;i++){
            temp += arr[i];
            if(temp> max) max=temp;
        }
        System.out.println(max);
        sc.close();
    }
}
