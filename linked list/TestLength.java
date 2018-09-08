import java.util.*;
class TestLinkedList
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
		
		System.out.println("length of list(iterative) = "+l.length());
		System.out.println("length of list(recursion) = "+LinkedList.lengthRec(l.head));
		l.printList();
		
	}
}