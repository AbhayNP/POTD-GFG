#User function Template for python3


class Solution:
    def compareFrac (self, str):
        first,second=str.split(", ")
        a,b=map(int,first.split("/"))
        c,d=map(int,second.split("/"))
        if a/b>c/d:
            return first
        if a/b<c/d:
            return second
        return "equal"
        
 # Driver Code Starts
#Initial Template for Python 3
import re

if __name__ == '__main__':
    ob = Solution()
    t = int(input())
    for _ in range(t):
        str = input()
        print(ob.compareFrac(str))

# } Driver Code Ends