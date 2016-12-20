public class SquareRoot{
    public static int sqrt(int a) {
        if(a==0||a==1)
        return a;
        long low=1,high=a,ans=0;
        while(low<=high){
            long mid=(high+low)/2;
            long sq=mid*mid;
            System.out.println(sq);
            if(sq==a)
                return (int)mid;
            else if(sq<a){
                low=mid+1;
                ans=mid;
            }
            else
                high=mid-1;
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        System.out.println(sqrt(2147483647));
    }
}