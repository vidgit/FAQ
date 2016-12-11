import java.util.*;

public class nextPermutation {
    public void nextPermutation(ArrayList<Integer> A) {
        boolean status;
        status = nextPerm(A);
        if (!status)
            Collections.sort(A);
        return;
    }
    
    
    public boolean nextPerm(ArrayList<Integer> A) {
        
        int i = 0;
        int n = A.size();
        
        for (i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1))
                break;
        }
        
        if (i == -1)
            return false;
       
        int j = n - 1;
        
        for (; j >= i; j--) {
            if (A.get(j) > A.get(i))
                break;
        }
        
        swap(A, i, j);
        
        i++;
        int steps = (n - i + 1) / 2;
        
        for (int k = 0; k < steps; k++) {
            swap(A, i + k, n - k - 1);
        }
        
        return true;
    }
    
    public void swap(ArrayList<Integer> A, int i, int j) {
        int temp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        nextPermutation(list);
        System.out.println(list);
    }
}