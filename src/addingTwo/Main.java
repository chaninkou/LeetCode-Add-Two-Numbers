package addingTwo;

public class Main {
	public static void main(String[] args)
	{
		ListNode list1 = new ListNode(2);
		list1.next = new ListNode(4);
		list1.next.next = new ListNode(3);
		
		ListNode list2 = new ListNode(5);
		list2.next = new ListNode(6);
		list2.next.next = new ListNode(4);
		
		System.out.println("List1: ");
		displayLinkedList(list1);
		
		System.out.println("List2: ");
		displayLinkedList(list2);
		
		SumTwoLinkedListFunction solution = new SumTwoLinkedListFunction();
		
		ListNode result = solution.addTwoNumbers(list1, list2);
		
		System.out.println("Sum Linked List: ");
		displayLinkedList(result);
	}
	
	public static void displayLinkedList(ListNode head){
		ListNode current = head;
		
		while(current != null){
			System.out.print(current.val + " ");
			
			current = current.next;
		}
		
		System.out.println(" ");
	}
}
