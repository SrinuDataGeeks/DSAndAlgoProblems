public class TestApp
	{
public static void main(String args[])
{

	LinkedList<Integer> list = new LinkedList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);


	LinkedList<Integer> list2 = new LinkedList<Integer>();
	list2.add(5);
	list2.add(15);
	list2.add(25);
	list2.add(35);

	System.out.println(" => "+list.getHead());
	System.out.println(" => "+list2.getHead());
	System.out.println(" => "+ list.merge(list.getHead(),list2.getHead()));

	

}
	}