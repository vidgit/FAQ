public class PowerMod{
    public static int pow(int x,int n,int d){
        if(n==0)
            return 1%d;
        long ans=1,base=x;
        while(n>0){
            if(n%2==0)
            {
                base=(base*base)%d;
                n/=2;
            }
            else
            {
                ans=(ans*base)%d;
                n--;
            }
        }

        if(ans<0){
            ans=(ans+d)%d;
        }
        return (int)ans;
    }

    public static void main(String[] args) {
        System.out.println(pow(2132,0,3));
    }
}