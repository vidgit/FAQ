import java.util.*;

public class RearrangeArray{

    public static void arrange(ArrayList<Integer> A) {
        int n = A.size();
        for (int i = 0; i < n; i++)
            A.set(i, A.get(i) + (A.get(A.get(i)) % n) * n );
        for (int i = 0; i < n; i++)
            A.set(i, A.get(i) / n);
        
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(0);
        list.add(2);
        list.add(1);
        list.add(3);
        arrange(list);
    }
}