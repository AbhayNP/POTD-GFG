//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.binaryNextNumber(s));
        }
    }
}
// } Driver Code Ends

class Solution {
    String binaryNextNumber(String s) 
    {
        int n = 0;
        while (n < s.length() && s.charAt(n) == '0')
            n += 1;
        if (n == s.length())
            return "1";
        s = s.substring(n, s.length());
        char res[] = s.toCharArray();
        n = res.length - 1;
        while (res[n] == '1')
        {
            res[n] = '0';
            if (n == 0)
            {
                return 1 + new String(res);
            }
            n -= 1;
        }
        res[n] = '1';
        return new String(res);
    }
}