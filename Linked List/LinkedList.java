public class LinkedList{

    private Node head;
    public LinkedList(){
        head=null;
    }

    public boolean add(int data){
        if(head==null)
        {
            head=new Node(data);
            return true;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new Node(data);
        return true;
    }

    public boolean delete(int data){
        if(head.data==data){
            head=head.next;
            return true;
        }
        Node temp=head,prev=head;
        while(temp.next!=null){
            if(temp.data==data){
                temp.next=temp.next.next;
                return true;
            }
            prev=temp;
            temp=temp.next;
        }
        if(temp.data==data){
            prev.next=null;
            return true;
        }
        else
            return false;

    }

    @Override
    public String toString(){
        StringBuffer sb=new StringBuffer();
        Node temp=head;
        if(head==null)
            return "";
        while(temp.next!=null){
            sb.append(temp.data);
            sb.append(" ");
            temp=temp.next;
        }
        sb.append(temp.data);
        return sb.toString();
    }
}