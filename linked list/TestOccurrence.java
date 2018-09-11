import java.util.*;
class TestOccurrence
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
		
		System.out.println("enter the element whose occurrence you wanna find out");
		int a = s.nextInt();
		int occ = l.occurrence(a);
		if(occ==0)
			System.out.println("no such element");
		else
			System.out.println("element occur "+occ+" times");
			
		
	}
}