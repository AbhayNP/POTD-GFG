//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    Node head = null, tail = null;
		    
		    char head_c = sc.next().charAt(0);
		    head = new Node(head_c);
		    tail = head;
		    
		    while(n-- > 1){
		        tail.next = new Node(sc.next().charAt(0));
		        tail = tail.next;
		    }
		    
		    Solution obj = new Solution();
		    //show(head);
		    show(obj.arrangeCV(head));
		    
		}
	}
	
	public static void po(Object o){
	    System.out.println(o);
	}
	
	public static void show(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
}

// } Driver Code Ends


/*
Structure of node class is:
class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    
    public Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
        if(head == null)
           return head;
           
        Node cur = head;
        
        Node vow = new Node('\0');
        Node vow1 = vow;
        Node cons =new Node('\0');
        Node cons1 = cons;
        while(cur != null)
        {
            
            if(cur.data == 'a' || cur.data == 'e' || cur.data == 'i' || cur.data == 'o' || cur.data == 'u')
            {
                Node newNode = new Node(cur.data);
                vow1.next = newNode;
                 vow1 = newNode;
            }
            else
            {
                 Node newNode = new Node(cur.data);
                cons1.next = newNode;
               cons1 =   newNode ;
            }
            cur = cur.next;
        }
        vow1.next = cons.next;
        
        return vow.next;
    }
}