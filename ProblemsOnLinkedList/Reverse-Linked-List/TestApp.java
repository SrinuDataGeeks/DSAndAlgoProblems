public class TestApp
	{
public static void main(String args[])
{

	LinkedList<Integer> list = new LinkedList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);

	System.out.println(" Before --	   => "+list.getHead());
	System.out.println(" After Reverse => "+list.reverse(list.getHead()));
	

}
	}