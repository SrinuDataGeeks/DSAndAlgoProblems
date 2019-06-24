public class TestApp
	{
public static void main(String args[])
{

	LinkedList<Integer> list = new LinkedList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);

	
	ListNode<Integer> Node4 = list.get(4);
	ListNode<Integer> Node2 = list.get(2);
	Node4.setNext(Node2);

	System.out.println("\n\n Has Loop "+list.hasCycle(list.getHead()));

	System.out.println(" \n\n Cycle Loop Starting "+list.cycleLoopStartNode(list.getHead()));

	System.out.println("\n\n Length Of Loop "+list.lengthOfLoop(list.getHead()));
	

}
	}