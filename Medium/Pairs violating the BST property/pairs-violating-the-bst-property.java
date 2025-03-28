//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.charAt(0) == 'N') return null;

        // Creating array of Strings from input
        // String after spliting by space
        String ip[] = str.split(" ");

        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));

        // Push the root to the queue
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        // Starting from the second element
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static Node inputTree(BufferedReader br) throws IOException {
        return buildTree(br.readLine().trim());
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            Node root = Node.inputTree(br);

            Solution obj = new Solution();
            int res = obj.pairsViolatingBST(n, root);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public static int pairsViolatingBST(int n, Node root) {
        List<Integer> list = new ArrayList<>();
        createList(root,list);
        return mergeSort(list,0,list.size()-1);
    
    }
    public static void createList(Node root,List<Integer> list){
        if(root!=null){
            createList(root.left,list);
            list.add(root.data);
            createList(root.right,list);
        }
    }
    
    public static int merge(List<Integer> list,int low,int mid,int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        int c = 0;
        
        while(left<=mid && right<=high){
            if(list.get(left)<=list.get(right)){
                temp.add(list.get(left));
                left++;
            }
            else{
                temp.add(list.get(right));
                c += mid-left+1;
                right++;
            }
        }
        
        while(left<=mid){
            temp.add(list.get(left));
                left++;
        }
        
        while(right<=high){
            temp.add(list.get(right));
                right++;
        }
        for(int i=low;i<=high;i++){
            list.set(i,temp.get(i-low));
        }
        return c;
    }
    
    public static int mergeSort(List<Integer> list,int low,int high){
        int c = 0;
        if(low>=high)
            return 0;
        int mid = low+(high-low)/2;
        c += mergeSort(list,low,mid);
        c += mergeSort(list,mid+1,high);
        c += merge(list,low,mid,high);
        return c;
    }
}
