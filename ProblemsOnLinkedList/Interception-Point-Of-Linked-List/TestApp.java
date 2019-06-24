public class TestApp
	{
public static void main(String args[])
{

	LinkedList<Integer> list1 = new LinkedList<Integer>();
	list1.add(10);
	list1.add(20);
	list1.add(30);
	list1.add(40);
	

	LinkedList<Integer> list2 = new LinkedList<Integer>();
	list2.add(50);
	
	
	
	ListNode<Integer> Node2 = list1.get(list1.getHead(),2);
	list2.getHead().setNext(Node2);



	LinkedList<Integer> list = new LinkedList<Integer>();

	System.out.println("\n\n Interception Point :: "+list.interceptionPoint(list1.getHead(),list2.getHead()));

	
	

}
	}