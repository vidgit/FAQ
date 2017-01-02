import java.util.*;

public class removeDuplicates {
    public static int removeDuplicate(ArrayList<Integer> a) {
         int index = 1;
        int n = A.size();
        
        if (A == null || A.size() == 0)
            return 0;
        
        for (int i = 1; i < n; i++) {
            
            if (A.get(i).intValue() != A.get(i - 1).intValue()) {
                int temp = A.get(index);
                A.set(index, A.get(i));
                index++;
            }
        }
        
        return index;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        a.add(500);
        a.add(500);
        a.add(500);
        System.out.println(removeDuplicate(a));
    }
}