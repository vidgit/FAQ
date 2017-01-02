import java.util.*;

public class KthSmallest {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public static int kthsmallest(final List<Integer> a, int k) {
        PriorityQueue<Integer> minheap=new PriorityQueue<Integer>(1,new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        
        minheap.addAll(a);
        int count=1;
        while(count<k)
        {
            System.out.println(minheap.remove());
            
            count++;
        }
        
        return minheap.remove();
    }

    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        int[] v={94, 87, 100, 11, 23, 98, 17, 35, 43, 66, 34, 53, 72, 80, 5, 34, 64, 71, 9, 16, 41, 66, 96};
        for(int i:v)
            a.add(i);
        kthsmallest(a,19);

    }
}
