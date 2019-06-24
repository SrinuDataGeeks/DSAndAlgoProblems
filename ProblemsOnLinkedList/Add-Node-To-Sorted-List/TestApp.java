public class TestApp
	{
public static void main(String args[])
{

	LinkedList<Integer> list = new LinkedList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);

	System.out.println(" => "+ list.set(new ListNode<Integer>(5)));
	System.out.println(" => "+ list.set(new ListNode<Integer>(35)));
	

}
	}