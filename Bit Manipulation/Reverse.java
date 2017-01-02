/*
Run a for loop.
    Right shift the Ans.
    Check if the ith bit is 1 then make the last bit 1

return ans. 
*/
public class Reverse{
    public int reverse(long a){
        long ans=0;

        for(int i=0;i<32;i++){
            ans<<=1;
            if((a&(1<<i))!=0)
                ans|=1;
        }

        return ans;
    }
}