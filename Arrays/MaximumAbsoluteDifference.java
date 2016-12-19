/*
You are given an array of N integers, A1, A2 ,…, AN. Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N.
f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.

For example,

A=[1, 3, -1]

f(1, 1) = f(2, 2) = f(3, 3) = 0
f(1, 2) = f(2, 1) = |1 - 3| + |1 - 2| = 3
f(1, 3) = f(3, 1) = |1 - (-1)| + |1 - 3| = 4
f(2, 3) = f(3, 2) = |3 - (-1)| + |2 - 3| = 5

So, we return 5.
*/
/*
    find max value in terms of a[i]+i
    find max value in terms of a[i]-1
    find min value in terms of a[i]+i
    find min value in terms of a[i]-1

    bigger value out of M(a[i]+i) - m(a[i]+i) and M(a[i]-i) - m(a[i]-i)
 */
public class MaximumAbsoluteDifference{
    public int maxArr(ArrayList<Integer> A) {
        int ans=0,max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        int l=A.size();
        for(int i=0;i<l;i++){
            int a=A.get(i);
            max1=Math.max(max1,a+i);
            max2=Math.max(max2,a-i);
            min1=Math.min(min1,a+i);
            min2=Math.min(min2,a-i);
        }
        
        ans=Math.max(ans,max2-min2);
        ans=Math.max(ans,max1-min1);
        return ans;
    }
}