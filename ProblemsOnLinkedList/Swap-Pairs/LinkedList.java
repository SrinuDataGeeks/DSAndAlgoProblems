public class LinkedList<T extends Number>
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

	public ListNode<T> swapPairs(ListNode<T> head)
	{
	ListNode<T> temp = head;
	while(temp !=  null && temp.getNext() != null)
		{
	T k = temp.getData();
	temp.setData( temp.getNext().getData() );
	temp.getNext().setData(k);
	temp = temp.getNext().getNext();
		}
	return head;
	}
	
}