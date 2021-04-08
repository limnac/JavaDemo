public class LinkStack {
    ListNode node;
    public LinkStack(){
        node = new ListNode();
    }
    public void add(int x){
        ListNode tmp = new ListNode(x);
        tmp.next = node;
        node = tmp;
    }
    public int pop(){
        ListNode tmp = node;
        node = node.next;
        return tmp.val;
    }
    public int peek(){
        return node.val;
    }
    public boolean isEmpty(){
        return node == null;
    }
}
