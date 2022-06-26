class Solution {
    
    public ListNode reverse(ListNode head){
        
        ListNode NewHead = null;
        ListNode temp = null;
        while(head != null){
            temp = head.next;
            head.next = NewHead;
            NewHead = head;
            head = temp;
        }
        
        return NewHead;
    }
    
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        slow.next = reverse(slow.next);
        slow = slow.next;
        
        ListNode dummy = head;
        
        while(slow != null){
            if(dummy.val != slow.val){
                return false;
            }
            dummy = dummy.next;
            slow = slow.next;
        }
        
        return true;
    }
}
