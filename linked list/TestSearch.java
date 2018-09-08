import java.util.*;
class TestSearch
{
	public static void main(String as[])
	{
		LinkedList l = new LinkedList();
		Scanner s = new Scanner(System.in);
		
		System.out.println("start entering nodes(terminate by 0)");
		int ch;
		do{
			ch = s.nextInt();
			if(ch!=0)
			l.insertAtTail(ch);
		}while(ch!=0);
		/*
		System.out.println("enter what to search ");
		if(l.search(s.nextInt()))
		System.out.println("found");
		else 
			System.out.println("not found");
		*/
		System.out.println("enter what to search ");
		if(LinkedList.searchRec(l.head,s.nextInt()))
		System.out.println("found");
		else 
			System.out.println("not found");
		
		//l.printList();
		
	}
}