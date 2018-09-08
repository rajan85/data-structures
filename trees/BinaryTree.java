import java.util.*;
class Node{
	int data;
	Node left,right;
	
	public Node(int d)
	{
		this.data = d;
	}
	
}

class BinaryTree
{
	Node root;
	
	public BinaryTree()
	{
		root = null;
	}
	
	public BinaryTree(int d)
	{
		root = new Node(d);
	}
	
	public static void printInOrder(Node t)
	{
		if(t==null)
			return;
		
		printInOrder(t.left);
		System.out.println(t.data);
		printInOrder(t.right);
			
	}
	
	public static void printPreOrder(Node t)
	{
		if(t==null)
			return;
		System.out.println(t.data);
		printPreOrder(t.left);
		printPreOrder(t.right);
		
	}
	
	public static void printPostOrder(Node t)
	{
		if(t==null)
			return;
		
		
		printPostOrder(t.left);
		printPostOrder(t.right);
		System.out.println(t.data);
	}
	
	public void inOrderWithStack()
	{
		Stack<Node> st = new Stack<Node>();
		
		Node current = this.root;
		
		while(current!=null)
		{
			st.push(current);
			//System.out.println(current.data);
			current =current.left;
		}
		
		while(current ==null && (!st.isEmpty() ) )
		{
			Node temp = st.pop();
			System.out.println(temp.data);
			current = temp.right;
			while(current!=null)
			{
			st.push(current);
			//System.out.println(current.data);
			current =current.left;
			}
		}
		
	}
	
	public void postOrderWithStack()
	{
		Stack<Node> st = new Node<Node>();
		
		while(current!=null)
		{
			st.push(current);
			current = current.right;
		}
		
		while(current==null &&(!st.isEmpty()))
		{
			Node temp = st.pop();
			current = temp.right;
			while(current!=null)
			{
			st.push(current);
			//System.out.println(current.data);
			current =current.left;
			}
			
			
		}
	
	
	
	
	
	
}