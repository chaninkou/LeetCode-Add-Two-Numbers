package addingTwo;

public class SumTwoLinkedListFunction {
	public ListNode addTwoNumbers(ListNode list1, ListNode list2) {
		ListNode l1 = list1;
		ListNode l2 = list2;

		ListNode solution = new ListNode(0);

		ListNode head = solution;

		int sum = 0;

		while (l1 != null || l2 != null) {
			// If its more than 10, then sum will start from 1 instead of 0
			sum = sum / 10;

			// Add current node to the sum and go to next node
			if (l1 != null) {
				sum = sum + l1.val;
				l1 = l1.next;
			}

			// Add current node to the sum and go to next node
			if (l2 != null) {
				sum = sum + l2.val;
				l2 = l2.next;
			}

			// Solution next node will be the sum, mod 10 since it is only one
			// digit at most
			head.next = new ListNode(sum % 10);

			// Make the solution head the same as head.next
			head = head.next;
		}

		// This is for 005 + 005 = 0001
		// If sum is 10 or more
		if (sum / 10 == 1) {
			// Then head.next = 1
			head.next = new ListNode(1);
		}

		// Since the linked list start from 0, we need to use solution.next
		return solution.next;
	}
}
