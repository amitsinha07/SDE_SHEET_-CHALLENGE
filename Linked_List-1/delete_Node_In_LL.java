class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp = node;
        temp.val = temp.next.val;
        
        if(temp.next.next != null){
            temp.next = temp.next.next;
        }else {
            temp.next = null;   
        }
    }
}
