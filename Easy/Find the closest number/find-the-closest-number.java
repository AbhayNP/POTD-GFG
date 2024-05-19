//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            int k;
            k = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, n);
            
            Solution obj = new Solution();
            int res = obj.findClosest(n, k, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static int findClosest(int n, int k, int[] arr) {
        int l = 0, h = n - 1;
        int nearest = Integer.MAX_VALUE;
        
        int res = 0;
        
        while(l <= h){
            
            int mid = (l + h) / 2;
            int diff = Math.abs(arr[mid] - k);
            
            if(diff == 0){
                return arr[mid];
            }else if(diff < nearest){
                nearest = diff;
                res = arr[mid];
            }else if(diff == nearest){
                res = Math.max(res, arr[mid]);
            }
            
            if(arr[mid] < k) l = mid + 1;
            else h = mid - 1;
        }
        
        return res;
    }
}
        
