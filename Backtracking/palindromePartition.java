/*
Given a string s, partition s such that every string of the partition is a palindrome.

Return all possible palindrome partitioning of s.

For example, given s = "aab",
Return

  [
    ["a","a","b"]
    ["aa","b"],
  ]

    Ordering the results in the answer :

    Entry i will come before Entry j if :

        len(Entryi[0]) < len(Entryj[0]) OR
        (len(Entryi[0]) == len(Entryj[0]) AND len(Entryi[1]) < len(Entryj[1])) OR
        *
        *
        *
        (len(Entryi[0]) == len(Entryj[0]) AND … len(Entryi[k] < len(Entryj[k]))

In the given example,
["a", "a", "b"] comes before ["aa", "b"] because len("a") < len("aa")
*/
import java.util.ArrayList;

public class palindromePartition {
    int n;
    public ArrayList<ArrayList<String>> partition(String a) {
        ArrayList<ArrayList<String>> result=new ArrayList<ArrayList<String>>();
        ArrayList<String> current=new ArrayList<String>();
        n=a.length();
        part(0,current,result,a);
        return result;
    }

    public void part(int index,ArrayList<String> current,ArrayList<ArrayList<String>> result,String a){
        if(index==n)
        {
            ArrayList<String> list = new ArrayList<String>(current);
            result.add(list);
            System.out.println(result);
            return;
        }
        System.out.println(index+" ");
        System.out.println(current);
        for(int i=index;i<n;i++){
            if(palin(a,index,i)){
                System.out.println("Palindrome: "+a.substring(index,i+1));
                current.add(a.substring(index,i+1));
                part(i+1,current,result,a);
                current.remove(current.size()-1);
            }
        }
    }

    public boolean palin(String a, int start, int end){
        System.out.println("Testing: "+a.substring(start,end+1));
        for(int i=start,j=end;i<=j;i++,j--){
            if(a.charAt(i)!=a.charAt(j))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        palindromePartition o=new palindromePartition();
        System.out.println(o.partition("aabb"));
    }
}