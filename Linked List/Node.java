public class Node{
    
    Node next;
    int data;
    public Node(int data){
        this.data=data;
    }

    public Node(int data,Node next){
        this(data);
        this.next=next;
    }

    public int getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }

    public void setData(int data){
        this.data=data;
    }

    public void setNext(Node next){
        this.next=next;
    }
}