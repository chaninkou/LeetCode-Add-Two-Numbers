package addTwoNumber;

class Solution {
	public ListNode addTwoNumbers(ListNode list1, ListNode list2)
	{
        ListNode head = new ListNode(0);
        // Initialize current node to dummy head of the returning list.
        ListNode current = head;
        int carry = 0;
        while (list1 != null || list2 != null){
            int x;
            int y;
            int sum;
            if (list1 != null)
                x = list1.val;
            else
            {
                x = 0;
            }
            
            if (list2 != null)
                y = list2.val;
            else
            {
                y = 0;
            }
            
            sum = carry + x + y;
            
            carry = sum/10;
            
            current.next = new ListNode(sum % 10);
            
            current = current.next;
            
            if(list1 != null)
            {
                list1 = list1.next;
            }
             if(list2 != null)
            {
                list2 = list2.next;
            }   
        }
        if(carry > 0)
        {
            current.next = new ListNode(carry);
        }
        return head.next;
	}
}