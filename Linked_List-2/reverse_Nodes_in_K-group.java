class Solution {
    
    public void reverse(ListNode s, ListNode e){
        ListNode p = null, c = s, n = s.next;
        while(p != e){
            c.next = p; 
            p = c;
            c = n;
            if(n != null) n = n.next;
        }
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k == 1){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode beforeStart = dummy, e = head;
        int i=0;
        while(e != null){
            i++;
            if(i%k==0){
                ListNode s = beforeStart.next, temp = e.next;
                reverse(s, e);
                beforeStart.next = e;
                s.next = temp;
                beforeStart = s;
                e = temp;
            }else{
                e = e.next;
            }
        }
       
        return dummy.next;
    }
    
    
}