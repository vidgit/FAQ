/*
Largest Number

Given a list of non negative integers, arrange them such that they form the largest number.

For example:

Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.

 */
import java.util.*;
public class largestNumber{
    public static void main(String[] args) {
        ArrayList<Node> list=new ArrayList<Node>();
        list.add(new Node(3));
        list.add(new Node(30));
        list.add(new Node(34));
        list.add(new Node(5));
        list.add(new Node(9));
        Collections.sort(list);
        for(Node i:list)
            System.out.print(i);
    }
}

class Node implements Comparable<Node>{
    int x;
    public Node(int a)
    {
        this.x=a;
    }

    @Override
    public int compareTo(Node that){
        String a=this.x+""+that.x;
        String b=that.x+""+this.x;
        return b.compareTo(a);
    }

    @Override
    public String toString(){
        return this.x+"";
    }
}