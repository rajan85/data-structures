import java.util.*;

class TestDetectLoop
{
	public static void main(String as[])
	{
		LinkedList l = new LinkedList();
		/*LinkedList.Node one = new LinkedList.Node(1);
		LinkedList.Node two = new LinkedList.Node(2);
		LinkedList.Node three = new LinkedList.Node(3);
		LinkedList.Node four = new LinkedList.Node(4);
		//LinkedList.Node five = new LinkedList.Node(2);
		
		l.head = one;
		one.next = two;
		two.next = three;
		three.next = four;
		four.next = two;
		*/
		LinkedList.Node one = new LinkedList.Node(1);
		LinkedList.Node two = new LinkedList.Node(2);
		LinkedList.Node three = new LinkedList.Node(2);
		LinkedList.Node four = new LinkedList.Node(2);
		
		
		l.head = one;
		one.next = two;
		two.next = three;
		three.next = four;
		
		
		System.out.println(l.isThereLoop());
		
	}
}