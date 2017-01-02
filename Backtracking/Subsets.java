import java.util.*;
public class Subsets {
    ArrayList<ArrayList<Integer>> ans= new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> curr = new ArrayList<Integer>();
    int n;
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> a) {
        Collections.sort(a);
        ans.add(new ArrayList<Integer>());
        n=a.size();
        subset(0,a);
        return ans;
    }
    
    public void subset(int index,ArrayList<Integer> a){
        /*if(index==n){
            ArrayList<Integer> list= new ArrayList<Integer>(curr);
            ans.add()
        
        }*/
        int l=a.size();
        //System.out.println(curr);
        for(int i=index;i<l;i++){
            curr.add(a.get(i));
            ans.add(new ArrayList<Integer>(curr));
            for(int j=i+1;j<l;j++){
                subset(j,a);
            }
            curr.remove(curr.size()-1);
        }   
    }
    public static void main(String[] args) {
        int[] arr={15, 20, 12, 19, 4};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i:arr){
            list.add(i);
        }
        Subsets o=new Subsets();
        o.subsets(list);
        for(ArrayList<Integer> i:o.ans){
            System.out.println(i);
        }
    }
}