import java.util.*;
class TestUtil
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
		
		System.out.println("enter index on which you wish to find element");
		int index = s.nextInt();
		int found = l.elementAt(index);
		if(found!=0)
		System.out.println(found);
	else
		System.out.println("not valid index");
		
	}
}