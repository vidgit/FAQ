/*
NEXTGREATERBookmark Suggest Edit
Given an array, find the next greater element G[i] for every element A[i] in the array. The Next greater Element for an element A[i] is the first greater element on the right side of A[i] in array. 
More formally,

G[i] for an element A[i] = an element A[j] such that 
    j is minimum possible AND 
    j > i AND
    A[j] > A[i]
Elements for which no greater element exist, consider next greater element as -1.

Example:

Input : A : [4, 5, 2, 10]
Output : [5, 10, 10, -1]

Example 2:

Input : A : [3, 2, 1]
Output : [-1, -1, -1]
*/
import java.util.*;
public class NextGreater{
    public ArrayList<Integer> nextGreater(ArrayList<Integer> a){
        int[] g=new int[a.size()];
        g[g.length-1]=-1;
        Stack<Integer> st = new Stack<>();
        st.push(a.get(g.length-1));
        for(int i=g.length-2;i>=0;i--){
            int ix=a.get(i);
            while(!st.empty()&&st.peek()<=ix)
                st.pop();
            if(st.empty())
                g[i]=-1;
            else
                g[i]=st.peek();
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i :g ) {
            list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] a={3,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : a) {
            list.add(i);
        }
        System.out.println(new NextGreater().nextGreater(list));
    }
}