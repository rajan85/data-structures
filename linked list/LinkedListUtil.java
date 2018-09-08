import java.util.*;
public class LinkedListUtil
{
	public static  int elementAt(LinkedList l ,int item)
{
		
		Node temp = l.head;
		int count=0;
		while(temp!=null && count!=item)
		{
			temp = temp.next;
			count++;
	}
		if(temp==null)
			return 0
		else return temp.data;

}
	
}