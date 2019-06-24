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

	
public ListNode<T> reverse(ListNode<T> node)
	{

	ListNode<T> prev    = null;
	ListNode<T> current = node;
	while(current != null)
	{
	ListNode<T> next = current.getNext();
	current.setNext(prev);
	prev = current;
	current = next;
	}
	
	return prev;
	}

public String iterate(ListNode<T> head)
	{
	String result = " ";
	ListNode<T> current  = head;
	while( current != null)
		{
		result = result + current.getData()+"  ";
		current = current.getNext();
		}
	return result;
	}
	}