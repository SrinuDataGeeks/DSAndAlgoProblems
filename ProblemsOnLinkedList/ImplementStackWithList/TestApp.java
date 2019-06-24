public class TestApp
	{
public static void main(String args[])
{

	Stack<Integer> s = new Stack<Integer>();
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	System.out.println(" Before pop() Stack :: \n"+s);
	s.pop();
	System.out.println(" After pop() Stack :: \n"+s);

	System.out.println(" peek() "+s.peek());

}
	}