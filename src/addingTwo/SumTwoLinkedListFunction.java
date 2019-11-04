package addingTwo;

public class SumTwoLinkedListFunction {
	public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
		// Get the reference of both linked list head
		ListNode l1 = list1;
		ListNode l2 = list2;
		
		// solution.next will be the sum of two linked list
		ListNode solution = new ListNode(0);
		
		// Make a new pointer of solution
		ListNode head = solution;
		
		int sum = 0;
		
		while(l1 != null && l2 != null){
			// sum will be 0 or 1 depend if it is over 10 since over 10 means there is a carry
			// Since sum will be 1-18
			sum = sum / 10;
			
			// In case both linked list is not same length
			if(l1 != null){
				sum = sum + l1.val;
				l1 = l1.next;
			}
			
			if(l2 != null){
				sum = sum + l2.val;
				l2 = l2.next;
			}
			
			// Sum % 10 since if its not a single digit like 12, then add 2 instead 
			head.next = new ListNode(sum % 10);
			
			// Make sure to point at the next element for the next loop
			head = head.next;
		}
		
		// If its over 10, that means it is like 0 -> 0 -> 5 + 0 -> 0 -> 5, 
		// it will be 0 -> 0 -> 0 -> 1
		if(sum/10 == 1){
			// Then just next node as 1 since it could only be 1
			head.next = new ListNode(1);
		}
		
		// Since we never moved solution pointer, solution.next will be the beginning of the solution
		return solution.next;
	}
}
