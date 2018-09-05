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
	
}