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

public int size(ListNode<T> current)
	{
int length = 0;
while(current != null)
{
length++;
current = current.getNext();
}

return length;
	}
  
public ListNode<T> interceptionPoint(ListNode<T> list1 , ListNode<T> list2)
	{
int list1Length = size(list1);
int list2Length = size(list2);
System.out.println(" list1Length "+list1Length);
System.out.println(" list2Length "+list2Length);
if(list1Length > list2Length)
	{
int pos = list1Length - list2Length;
list1  = get(list1,pos);
	}
else
	{
int pos = list2Length - list1Length;
list2  = get(list2,pos);
	}
ListNode<T> temp = null;
while(list1 != null)
	{
if(list1 == list2)
	{
temp = list1;
break;
	}
list1 = list1.getNext();
list2 = list2.getNext();
	}
return temp;
	}

public ListNode<T>  get(ListNode<T> current , int n)
	{
int count = 0;
while(count < n)
	{
	current = current.getNext();
	count++;
	}
return current;

	}

	}