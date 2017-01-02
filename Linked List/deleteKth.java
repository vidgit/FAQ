public class deleteKth
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
        if(k==1)
            return null;
        Node temp=head;
        Node prev=head;
        
        int i=1;
        while(temp.next!=null){
            
            while(temp.next!=null&&i<k){
                prev=temp;
                temp=temp.next;
                i++;
            }
            
            if(i==(k)){
                prev.next=temp.next;
                if(temp.next==null)
                    break;
            }
            i=0;
        }
        return head;
    }
}