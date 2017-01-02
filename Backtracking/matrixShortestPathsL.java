import java.util.ArrayList;

public class matrixShortestPathL{

    ArrayList<Integer> current = new ArrayList<>();
    ArrayList<ArrayList<Integer>> all = new ArrayList<ArrayList<Integer>>();
    int[][] a;
    int n,m;
    public void findPath(int x,int y){
        //System.out.println("Current: "+current);
        if(x==(m-1)&&y==(n-1))
        {
            ArrayList<Integer> list = new ArrayList<>(current);
            //Collections.sort(list);
            all.add(list);
            //System.out.println("All: "+all);
            return;
        }
        current.add(a[x][y]);
        if(x+1<m){
            findPath(x+1,y);
        }
        if(y+1<n){
            findPath(x,y+1);
        }
        current.remove(current.size()-1);

    }
    public static void main(String[] args) {
        matrixPaths o=new matrixPaths();
        o.a=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        o.n=3;
        o.m=3;
        o.findPath(0,0);
        System.out.println("All: "+o.all);
    }
}