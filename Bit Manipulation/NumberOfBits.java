/*
Check if the last bit is 1.
Increment the count.
Right shift the a.
*/

public class NumberOfBits{
    public int numberOfBits(long a){
        int ans=0;
        while(a>0){
            if(a&1!=0){
                ans++;
            }
            a>>=1;
        } 
        return ans;
    }
}