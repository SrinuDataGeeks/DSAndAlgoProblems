public class LinkedList<T>
	{
private ListNode<T> head = null;
private Integer length = 0;
public LinkedList()
{
}

public ListNode<T> getHead()
	{
	return head;
	}

public T add(T data)
	{
	if( head == null)
	{
		head = new ListNode<T>(data);
		length++;
		return data;
	}
	ListNode<T> current = head;
	while(current.getNext() != null)
		{
	current = current.getNext();
		}

	current.setNext(new ListNode<T>(data));
	length++;

	return data;

	}

	/*
		Algo-1 : Just return length-n+1  node. If the count starts from 1.
	*/
public T returnNthNodeAlg1(int n)
{
	int count = 1;
		
	if(count > (length-n+1))
		{
	System.out.println(" No Data Found");
		return null;
		}
	ListNode<T> current = head;

	while( count < (length-n+1))
		{
		current = current.getNext();
		count++;
		}
	return current.getData();
}


	/*
		Algo-2 : Using two pinters refPtr and mainPtr.
		=> Tranverse refPtr till n th node.
		=> Now move mainPtr and refPtr in parllel till the refPtr reaches end of list.
		=> By this time mainPtr reaches to nth node from the end of the list.
	*/
public T returnNthNodeAlg2(int n)
{
	ListNode<T> refPtr = head;
	ListNode<T> mainPtr = head;
	int count = 0;
	while(count < n)
	{
		if(refPtr == null)
		{
		System.out.println(" No Data Found ");
		return null;
		}
		refPtr = refPtr.getNext();
		count++;
	}

	while(refPtr != null)
	{
	refPtr = refPtr.getNext();
	mainPtr = mainPtr.getNext();
	}
	return mainPtr.getData();
}

	}