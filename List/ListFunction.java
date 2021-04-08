public class NodeFunction {
    public ListNode reversal(ListNode node){
        if(node==null&&node.next==null) return node;
        ListNode res = node;
        node = node.next;
        res.next = null;
        while(node!=null){
            ListNode tmp = node;
            node = node.next;
            tmp.next = res;
            res = tmp;
        }
        return res;
    }
    public ListNode mergeList(ListNode node1,ListNode node2){
        ListNode res = new ListNode();
        ListNode tmp = res;
        while(node1!=null&&node2!=null){
            if(node1.val<node2.val){
                tmp.next = node1;
                node1 = node1.next;
                tmp = tmp.next;
                tmp.next = null;
            }else{
                tmp.next = node2;
                node2 = node2.next;
                tmp = tmp.next;
                tmp.next = null;
            }
        }
        if(node1!=null){
            tmp.next = node1;
        }
        if(node2!=null){
            tmp.next = node2;
        }
        return res.next;
    }
    public ListNode midNode(ListNode node){
        int count = 0;
        ListNode tmp = node;
        while(tmp!=null){
            count++;
            tmp = tmp.next;
        }
        count /= 2;
        while(count>0){
            node = node.next;
            count--;
        }
        return node;
    }
}
