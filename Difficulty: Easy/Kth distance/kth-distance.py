#User function Template for python3
class Solution:
    def checkDuplicatesWithinK(self, arr, k):
        di={}
        n=len(arr)
        for i in range(n):
            di[arr[i]]=[]
        for i,t in enumerate(arr):
            if di[t] and i-di[t][-1]<=k:
                return True
            di[t].append(i)
        return False


#{ 
 # Driver Code Starts
# Initial Template for Python 3
# Position this line where user code will be pasted.
# Initial Template for Python 3

if __name__ == "__main__":
    t = int(input())
    while t > 0:
        arr = list(map(int, input().split()))
        k = int(input())
        ob = Solution()
        res = ob.checkDuplicatesWithinK(arr, k)
        if res:
            print("true")
        else:
            print("false")
        # print(res)
        print("~")
        t -= 1
# } Driver Code Ends