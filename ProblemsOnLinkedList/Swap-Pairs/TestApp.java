public class TestApp
	{
public static void main(String args[])
{

	LinkedList<Integer> list = new LinkedList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(20);
	list.add(10);


	

	System.out.println(" => "+list.getHead());
	System.out.println(" => "+ list.swapPairs(list.getHead()));

	

}
	}