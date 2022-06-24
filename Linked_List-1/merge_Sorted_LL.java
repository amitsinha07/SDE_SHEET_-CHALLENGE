class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        
        if(list2 == null){
            return list1;
        }
        
        ListNode NewHead = null;
        ListNode NewTail = null;
        
        if(list1.val < list2.val){
            NewHead = list1;
            NewTail = list1;
            list1 = list1.next;
        }else {
            NewHead = list2;
            NewTail = list2;
            list2 = list2.next;
        }
        
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                NewTail.next = list1;
                NewTail = list1;
                list1 = list1.next;
            }else {
                NewTail.next = list2;
                NewTail = list2;
                list2 = list2.next;
            }
        }
        
        if(list1 != null){
            NewTail.next = list1;
        }
        
        if(list2 != null){
            NewTail.next = list2;
        }
        
        return NewHead;
    }
}