import java.util.*;
public class LinkedList
{
Node head;

public class Node
{
	int data;
	Node next;
	
	public Node(int d)
	{
		data = d;
		next = null;
	}
	
}

public LinkedList(int s)
{
	head = new Node(s);
}
public LinkedList()
{
	
}

public Node insertAtHead(int d)
{
	if(head ==null)
		head = new Node(d);
	else
	{
		Node temp = head;
		head = new Node(d);
		head.next = temp;
	}
	return head;
}

public void printList()
{
	if(head==null)
	{
		System.out.print("list is empty");
		return;
	}
	Node temp = this.head;
	while(temp!=null)
	{
		System.out.print(temp.data+"-->");
		temp = temp.next;
	}
	System.out.print("null");
}

public void insertAtTail(int d)
{
	if(head == null){
		head = new Node(d);
		return;
	}
	
	Node temp  = head;
	
	while(temp.next!=null)
		temp = temp.next;
	
	Node newNode = new Node(d);
	temp.next = newNode;
	
}

public void insertAt(int d,int index)
{
	if(index==0)
		insertAtHead(d);
	Node temp = this.head;
	int position = 0;
	while(position!=(index-1))
	{
		temp = temp.next;
		position++;
	}
	
	Node newNode = new Node(d);
	newNode.next = temp.next;
	temp.next = newNode;
	
}

public void deleteList()
{
	this.head = null;
}

public void deleteAt(int index)
{
	if(index == 0)
	{
		head = head.next;
		return;
	}
	Node temp = head;
	int position = 0;
	while(position!=(index-1) )
	{
		temp = temp.next;
		position++;
	}
	if(temp.next.next==null)
	{
		temp.next = null;
	}
	temp.next = temp.next.next;	
}

public static int lengthRec(Node n)
{
		if(n==null)
			return 0;
		else return 1+lengthRec(n.next);
}

public int length()
{
	int count = 0;
	Node temp = this.head;
	while(temp!=null)
	{
		count++;
		temp = temp.next;
	}
	return count;
}

public boolean search(int item)
{
	Node temp = head;
	while(temp!=null && temp.data!=item)
		temp = temp.next;
	
	if(temp==null)
		return false;
	else return true;
}

public static boolean searchRec(Node n,int item)
{
	if(n==null)
			return false;
	
	else{
		if(n.data==item)
		return true;
		else return searchRec(n.next,item);
	}
		
}

public int elementAt(int item)
{
		if(item<0)
			return 0;
		Node temp = head;
		int count=0;
		while(temp!=null && count!=item)
		{
			temp = temp.next;
			count++;
	}
		if(temp==null)
			return 0;
		else return temp.data;

}

public int middle()
{
	// this funtion returns the middle element if linked list
	Node temp = this.head;
	Node temp2 = this.head;
	/*
	method-1 implementation-1
	while(temp2!=null )
	{
		
		if(temp2.next!=null)
		temp2 = temp2.next.next;
		else {temp2 = temp2.next;
		break;
	}
	temp = temp.next;
	}*/
	//method-1 implementation-2
	while(temp2!=null && temp2.next!=null)
	{
		temp = temp.next;
		temp2 = temp2.next.next;
	}
	
	return temp.data;


	
}

}