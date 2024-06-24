//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");

            long n = Long.parseLong(S[0]);
            long q = Long.parseLong(S[1]);

            Solution ob = new Solution();
            System.out.println(ob.sumMatrix(n, q));
        }
    }
}
// } Driver Code Ends


class Solution {
    static long sumMatrix(long n, long q) {
        long min_i = Math.max(1, q - n);
        long max_i = Math.min(n, q - 1);
        if (min_i > max_i) {
            return 0;
        }
        return max_i - min_i + 1;
    }
}