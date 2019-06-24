public class  ListNode<T>
	{
private T data = null;
private ListNode<T> next = null;

public ListNode()
{
}

public ListNode(T data)
{
this.data = data;
}

public void setData(T data)
	{
this.data = data;
	}
public T getData()
	{
return data;
	}

public void setNext(ListNode<T> next)
	{
	this.next = next;
	}

public ListNode<T> getNext()
	{
return next;
	}

public String toString()
{
	String result = data + " ";
	ListNode<T> current = next;
	while(current != null)
	{
		result = result + "  "+current.data;
		current = current.next;
	}
	return result;

}

	}



