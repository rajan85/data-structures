import java.util.*;
class TestMiddle
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
		System.out.println("middle element is "+l.middle());
		
		
	}
}