class Solution:
    
    def countgroup(self,arr): 

        MOD = 10**9 + 7
        tot_xor = 0
        for i in arr:
            tot_xor ^= i
        if tot_xor != 0:
            return 0
        n = len(arr)
        res = (pow(2, n-1, MOD) - 1) % MOD
        
        return res
#{ 
 # Driver Code Starts
if __name__ == "__main__":
    t = int(input())
    while t > 0:
        arr = list(map(int, input().split()))
        ob = Solution()
        res = ob.countgroup(arr)
        print(res)
        t -= 1
        print("~")

# } Driver Code Ends