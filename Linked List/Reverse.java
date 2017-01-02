public class Reverse{

    public static ListNode reverse(ListNode head){
        printlist(head);
        ListNode curr=head;
        ListNode prev=null;
        ListNode next=null;
        while(curr!=null){
            printlist(prev);
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        printlist(prev);
        return prev;
    }

    public static void printlist(ListNode a){
        if(a==null)
            return;
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
        reverse(head);
    }
}

class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
 }