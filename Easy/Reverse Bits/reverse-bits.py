#User function Template for python3

class Solution:
    def reversedBits(self, x):
        reverse=0
        for _ in range(32):
            reverse=reverse<<1
            reverse=reverse|(x&1)
            x=x>>1
        return reverse


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        X=int(input())
        
        ob = Solution()
        print(ob.reversedBits(X))
# } Driver Code Ends