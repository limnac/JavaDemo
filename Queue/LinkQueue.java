public class LinkQueue{
    private ListNode node;
    public LinkQueue(){
        node = new ListNode();
    }
    public void push(int x){
        if(node==null){
            node = new ListNode(x);
        }else{
            ListNode tmp = node;
            while(tmp.next!=null){
                tmp = tmp.next;
            }
            tmp.next = new ListNode(x);
        }
    }
    public int poll(){
        int res = node.val;
        node = node.next;
        return res;
    }
    public int peek(){
        return node.val;
    }
    public boolean isEmpty(){
        return node == null;
    }
}
