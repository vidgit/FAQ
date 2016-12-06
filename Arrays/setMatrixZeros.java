/*
Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0.

Do it in place.

Example

Given array A as

1 0 1
1 1 1 
1 1 1

On returning, the array A should be :

0 0 0
1 0 1
1 0 1


 */

public class setMatrixZeros{

    public static void setZeroes(ArrayList<ArrayList<Integer>> A) {
        int m, n;
        
        if (A == null)
            return;
        
        m = A.size();
        n = A.get(0).size();
        
        if (n == 0)
            return;
        
        for (int i = 0; i < m; i++) {
            boolean zero = false;
            if(A.get(i).indexOf(0)!=-1)
                clearRow(A, i, m, n, 2);
        }
        
        for (int i = 0; i < n; i++) {
            boolean zero = false;
            for (int j = 0; j < m; j++) {
                if (A.get(j).get(i) == 0){
                    clearCol(A, i, m, n, 2);
                    break;
                }
            }   
            
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A.get(i).get(j) == 2)
                    A.get(i).set(j, 0);
            }
        }
        
    }
    public static void clearRow(ArrayList<ArrayList<Integer>> A, int row, int m, int n, int value) {
        
        for (int i = 0; i < n; i++) {
            if (A.get(row).get(i) == 1)
                A.get(row).set(i, value);
        }
    }
    
    public static void clearCol(ArrayList<ArrayList<Integer>> A, int col, int m, int n, int value) {
        for (int i = 0; i < m; i++) {
            if (A.get(i).get(col) == 1)
                A.get(i).set(col, value);
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<ArrayList<Integer>> a= new ArrayList<ArrayList<Integer>>();

        for(int i=0;i<3;i++){
            ArrayList<Integer> b = new ArrayList<Integer>();
            for(int j=0;j)
         }
    }
}