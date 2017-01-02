public class Swap {

    public static ListNode swapPairs(ListNode a) {
        if(a==null)
            return a;
        if(a.next==null)
            return a;
        ListNode head=a.next;
        ListNode prev=a;
        boolean flag=false;
        while(a!=null&&a.next!=null){
            ListNode first=a;
            ListNode second=a.next;
            ListNode temp=second.next;
            if(flag)
                prev.next=second;
            flag=true;
            second.next=first;
            first.next=temp;
            prev=first;
            a=temp;
            printlist(head);
        }
        return head;
    }

    public static void printlist(ListNode a){
        while(a.next!=null){
            System.out.print(a.val+" ");
            a=a.next;
        }
        System.out.println(a.val);
    }
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        ListNode temp=new ListNode(3);
        temp.next=new ListNode(4);
        head.next.next=temp;

        swapPairs(head);
    }
}
class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
 }