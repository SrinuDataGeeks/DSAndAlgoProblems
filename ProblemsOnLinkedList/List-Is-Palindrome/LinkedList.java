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
ListNode<T> prev = null;
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

public int size(ListNode<T> node)
	{
int length = 0;
ListNode<T> current = node;
	while(current != null)
	{
	length++;
	current = current.getNext();
	}
return length;
	}

public ListNode<T> get(ListNode<T> node,int n)
	{
int count = 0;
ListNode<T> current = node;
	while(count < n)
	{
		current = current.getNext();
		count++;
	}
return current;
	}

public boolean isPalindrome(ListNode<T> head)
	{
int length = size(head);
int n = length / 2;
ListNode<T> node = get(head,n);
node = reverse(node);
ListNode<T> current = node;
ListNode<T> temp = head;
while(current  != null)
{
	if(current .getData().intValue() !=  temp.getData().intValue())
		{
		node = reverse(node);
		return false;
		}
	current  = current .getNext();
	temp = temp.getNext();
}

node = reverse(node);
return true;
	}
	
}