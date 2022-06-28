public class Solution {
    public static Node merge(Node a, Node b){
        if(a == null) return b;
        if(b == null) return a;
        
        Node result;
        if(a.data < b.data){
            result = a;
            result.child = merge(a.child, b);
        }else {
            result = b;
            result.child = merge(a, b.child);
        }
        result.next = null;
        return result;
    }
    
	public static Node flattenLinkedList(Node start) {
		if(start == null || start.next == null) return start;  
        return merge(start, flattenLinkedList(start.next));
	}
}
