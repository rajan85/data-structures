import java.util.*;

class LinkedListCRUD
{
	public static void main(String as[])
	{
		LinkedList l = new LinkedList();
		Scanner s = new Scanner(System.in);
		System.out.println("enter choice according to options below:");
		System.out.println("0.	create new empty list");
		System.out.println("1.	print list");
		System.out.println("2.	insert at head");
		System.out.println("3.	insert at tail");
		System.out.println("4.	insert at specific position");
		System.out.println("5.	delete at specific position");
		System.out.println("6.	delete entire list");
		System.out.println("7.	print menu");
		System.out.println("8.	terminate");
		int choice;
		do
		{
		choice = s.nextInt();
		switch(choice)
		{
			case 0:
			{
				l = new LinkedList();
			}
			break;
			case 1:
			{
				l.printList();
			}
			break;
			case 2:
			{
				l.insertAtHead(s.nextInt());
			}
			break;
			case 3:
			{
				l.insertAtTail(s.nextInt());
			}
			break;
			case 4:
			{
				System.out.println("position = ");
				int index = s.nextInt();
				System.out.println("value = ");
				int value = s.nextInt();
				l.insertAt(value,index);
			}
			break;
			case 5:
			{
				System.out.println("position = ");
				int index = s.nextInt();
				l.deleteAt(index);
			}
			break;
			case 6:
			{
				l.deleteList();
			}
			break;
			
			case 7:
			{
				System.out.println("enter choice according to options below:");
			System.out.println("0.	create new empty list");
			System.out.println("1.	print list");
			System.out.println("2.	insert at head");
			System.out.println("3.	insert at tail");
			System.out.println("4.	insert at specific position");
			System.out.println("5.	delete at specific position");
			System.out.println("6.	delete entire list");
			System.out.println("7.	clear screen");
			System.out.println("8.	print menu");
			}
			break;
			case 8:
			{
				System.out.println("thanks!!!");
				return;
			}
		}
		}while(choice!=9);
		
	}
	
}