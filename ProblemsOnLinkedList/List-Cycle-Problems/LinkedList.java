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

  public boolean hasCycle(ListNode<T> head)
	{
	ListNode<T> slowPointer = head;
	ListNode<T> fastPointer = head;
	
		while(fastPointer != null && fastPointer.getNext() != null)
			{
			slowPointer = slowPointer.getNext();
			fastPointer = fastPointer.getNext().getNext();
			  if(slowPointer == fastPointer)
				{
				return true;
				}
			} 
		return false;	
	}


public ListNode<T> cycleLoopStartNode(ListNode<T> head)
	{
	ListNode<T> slowPointer = head;
	ListNode<T> fastPointer = head;
	boolean loopExists = false;
		while(fastPointer != null && fastPointer.getNext() != null)
			{
			slowPointer = slowPointer.getNext();
			fastPointer = fastPointer.getNext().getNext();
			  if(slowPointer == fastPointer)
				{
				loopExists = true;
				break;
				}
			} 
		if(loopExists)
		{
		slowPointer = head;
		while(slowPointer != fastPointer)
			{
			slowPointer = slowPointer.getNext();
			fastPointer = fastPointer.getNext();
			}
		//System.out.println(" SlowPointer"+slowPointer);
		return slowPointer;
		}
		
		return null;	
	}

public int lengthOfLoop(ListNode<T> head)
	{
	int length = 0;
	ListNode<T> slowPointer = head;
	ListNode<T> fastPointer = head;
	boolean loopExists = false;
		while(fastPointer != null && fastPointer.getNext() != null)
			{
			slowPointer = slowPointer.getNext();
			fastPointer = fastPointer.getNext().getNext();
			  if(slowPointer == fastPointer)
				{
				loopExists = true;
				break;
				}
			} 
		if(loopExists)
		{
		
			do
			{
			length++;
			slowPointer = slowPointer.getNext();
			
			}while(slowPointer != fastPointer);
		
		}
		return length;
	}

public ListNode<T>  get(int n)
	{
int count = 1;
ListNode<T> current = head;
while(count < n)
	{
	current = current.getNext();
	count++;
	}
return current;

	}

	}