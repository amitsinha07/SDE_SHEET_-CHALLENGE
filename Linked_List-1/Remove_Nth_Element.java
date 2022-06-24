class Solution {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode faster = head;
        
        for(int i=0; i<n; i++){
            faster = faster.next;
        }
        
        if(faster == null){
            head = head.next;
            return head;
        }
        
        ListNode slower = head;
        while(faster.next != null){
            faster = faster.next;
            slower = slower.next;
        }
        
        slower.next = slower.next.next;
        return head;
    }
}