import java.util.*;

class TreeTraversalDemo
{
	public static void main(String as[])
	{
		BinaryTree t = new BinaryTree();
		
		t.root = new Node(1);
		t.root.left = new Node(2);
		t.root.right = new Node(3);
		
		t.root.left.left = new Node(4);
		t.root.left.right = new Node(5);
		
		t.root.right.left = new Node(6);
		t.root.right.right = new Node(7);
		
		/*
		System.out.println("In ORDER is : ");
		BinaryTree.printInOrder(t.root);
		
		System.out.println("In ORDER using stack is : ");
		t.inOrderWithStack();
		*/
		
		/*
		System.out.println("Pre ORDER is : ");
		BinaryTree.printPreOrder(t.root);
		*/
		
		System.out.println("Post ORDER is : ");
		BinaryTree.printPostOrder(t.root);
		
		
		
	}
}
