/*
Max Distance

Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j].

If there is no solution possible, return -1.

Example :

A : [3 5 4 2]

Output : 2 
for the pair (3, 4)


*/
public class MaxDistance {
    class Pair implements comparable<Pair>{
        int index,val;
        public Pair(int x,int v){
            this.val=v;
            this.index=x;
        }

        public int compareTo(Pair that){
            if(this.val<that.val)
                return -1;
            else if(this.val==that.val)
                return 0;
            else
                return 1;
        }
    }

    public int maximumGap(final List<Integer> a) {
        int l=a.size();
        ArrayList<Pair> list = new ArrayList<Pair>();
        for(int i=0;i<l;i++)
        {
            list.add(new Pair(a.get(i),i));
        }
        Collections.sort(list);
        int index=l-1;
        int maxIndex = list.get(index).index;
        int ans=0;
        for(int i=l-2;i>=0;i--){
            ans=Math.max(ans,maxIndex-list.get(i).index);
            maxIndex=Math.max(maxIndex,list.get(i).index));
        }
        return ans;
    }
}