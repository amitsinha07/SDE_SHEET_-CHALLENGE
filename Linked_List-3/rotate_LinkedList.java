class Solution {
    public int length(ListNode head){
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode ptr1=head, ptr2 = head;
        int len = length(head);
        k = k%len;
        
        if(k==0) return head;
        
        int n = len - k;
        
        while(ptr1.next != null){
            ptr1 = ptr1.next;
        }
        
        for(int i=1; i<n; i++){
            ptr2 = ptr2.next;
        }
        
        ListNode NewHead = ptr2.next;
        ptr1.next = head;
        ptr2.next = null;
        
        return NewHead;
        
    }
}