#User function Template for python3
class Solution:
    def firstElement (self, n):
        mod=10**9+7
        res=[1, 1]
        for i in range(n-1):
            res[0],res[1]=(res[0]+res[1])%mod,res[0]
        return res[1] 


#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        n = int(input())
        
        ob = Solution()
        print(ob.firstElement(n))
# } Driver Code Ends