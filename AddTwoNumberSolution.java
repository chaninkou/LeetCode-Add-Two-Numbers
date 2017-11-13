package addTwoNumber;

public class AddTwoNumberSolution {
	public static void main(String[] args)
	{
		ListNode list1 = new ListNode(2);
		list1.next = new ListNode(4);
		list1.next.next = new ListNode(3);
		
		ListNode list2 = new ListNode(5);
		list2.next = new ListNode(6);
		list2.next.next = new ListNode(4);
		
		System.out.println("  List1: [" + list1.val + "," + list1.next.val + "," + list1.next.next.val + "]");
		System.out.println("+ List2: [" + list2.val + "," + list2.next.val + "," + list2.next.next.val + "]");
		
		ListNode result = new Solution().addTwoNumbers(list1, list2);
		
		System.out.print("\nResult: [" +result.val + "," + result.next.val + "," + result.next.next.val + "]");
	}
}
