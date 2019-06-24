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

	
public ListNode<T> set(ListNode<T> node)
	{
ListNode<T> current = head;
ListNode<T> temp = null;

while(current != null &&  current.getData().intValue() < node.getData().intValue())
	{
	temp = current;
	current = current.getNext();
	}
if(temp == null)
{
	node.setNext(head);
	head = node;
}
else
{
	node.setNext(current);
	temp.setNext(node);
	
}
	return head;
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