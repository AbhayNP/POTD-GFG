//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        char[] Ss= S.toCharArray();
        if(Ss.length%2==1){
            return 0;
        }
        else{
            for(int i=0;i<Ss.length-1;i++){
                if(Ss[i] == Ss[Ss.length-1-i]){
                    continue;
                }
                else{
                    return 0;
                }
            }
        }
        return 1;
    }
};