#User function Template for python3
def compute(head): 
    #return True/False

    # Initialize an empty string to store linked list data
    string = ""
    
    # Traverse the linked list
    while head:
        # Append the data of each node to the string
        string += head.data
        # Move to the next node
        head = head.next
    
    # Check if the constructed string is equal to its reverse
    return string == string[::-1]
#{ 
 # Driver Code Starts
#Initial Template for Python 3


#contributed by RavinderSinghPB
class Node:

    def __init__(self, data):
        self.data = data
        self.next = None


class Llist:

    def __init__(self):
        self.head = None

    def insert(self, data, tail):
        node = Node(data)

        if not self.head:
            self.head = node
            return node

        tail.next = node
        return node


if __name__ == '__main__':
    t = int(input())
    for tcs in range(t):

        n1 = int(input())
        arr1 = input().split()
        ll1 = Llist()
        tail = None
        for nodeData in arr1:
            tail = ll1.insert(nodeData, tail)

        if compute(ll1.head):
            print('true')
        else:
            print('false')

# } Driver Code Ends