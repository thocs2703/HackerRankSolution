package HackerRank.DataStructure.Stack;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BracketBalance {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<char> st = new Stack<String>();
        for(int i = 0; i < s.length(); i++){
            if(s[i].equals("(") || s[i].equals("[") || s[i].equals("{"))
                st.push(s[i]);
            else{
                while(!st.empty() && ((s[i]==')'&&st.top()=='(')||(s[i]==']'&&st.top()=='[')||(s[i]=='}'&&st.top()=='{'))){
                    st.pop(s[i]);
                }
            }
        }
        if(st.isEmpty())
            return "YES";
        else
            return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
