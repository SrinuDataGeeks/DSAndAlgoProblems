/*
  Develop a Stack with Linked List :

	Algorithm :-

	 Initially declare ListNode top = null and int length = 0;
	

	For push(T data)

	=> Create a Temp ListNode with the data.
		ListNode temp = new ListNode(temp);
	=> Make temp node next to top
		temp.setNext = top;
	=> make top = temp;
	=> Increment the length value , length++

	For pop()

	=> Verify  List is empty or not, if empty throw user defined execption.
	=> If it is not empty just update the top = top.getNext();

	if(isEmpty())
		throw new EmptyStackException();
	 top = top.getNext();

	For isEmpty()
		
		return length == 0;

	For peek()

		return top.getData();

	For printing elements :
	
	toString()
		
	ListNode current = top;
	String result = "";
	while( current != null)
		{
	result = result +current.getData()+ "\n";
	current = current.getNext();
		}
	
	
*/
public class Stack<T>
	{
private Integer length = 0;
private ListNode<T> top = null;

public Stack()
{
}

public void push(T data)
	{
	ListNode<T> temp = new ListNode<T>(data);
	temp.setNext(top);
	top = temp;
	length++;
	}

public T pop()
	{
	if( isEmpty())
		throw new EmptyStackException("Stack is Empty");
	T data = top.getData();
	top = top.getNext();
	length--;
	return data;
	}

public T peek()
	{
	if( isEmpty())
		throw new EmptyStackException("Stack is Empty");
	return top.getData();
	}

public boolean isEmpty()
	{
	return length == 0;
	}
public String toString()
{
	ListNode<T> current = top;
	String result = "";
	while(current != null)
	{
		result = result + current.getData()+"\n";
		current = current.getNext();
	}
	return result;
}
	}



