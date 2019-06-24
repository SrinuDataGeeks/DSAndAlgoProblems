public class TestApp
	{
public static void main(String args[])
{

	LinkedList<Integer> list = new LinkedList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);

	System.out.println("\n Alg -1 From end 2nd Node "+list.returnNthNodeAlg1(2));
	System.out.println("\n Alg -2  From end 2nd Node "+list.returnNthNodeAlg2(2));
	

	System.out.println("\n Alg -1 From end 5th Node ");
	System.out.print(" = > "+list.returnNthNodeAlg1(5));
	System.out.println("\n Alg -2  From end 5th Node ");
	System.out.print(" = > "+list.returnNthNodeAlg2(5));
	

}
	}