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

	
public ListNode<T> merge(ListNode<T> node1,ListNode<T> node2)
	{
ListNode<T> head = new ListNode<T>();

ListNode<T> current = head;

while(node1 != null && node2 != null)
{
	if(node1.getData().intValue() < node2.getData().intValue())
		{
		current.setNext(node1);
		node1 = node1.getNext();
		}
	else
		{
		current.setNext(node2);
		node2 = node2.getNext();
		}
	current = current.getNext();
}
	if(node1 != null)
		current.setNext(node1);
	else if(node2 != null)
		current.setNext(node2);
	
	return head.getNext();
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