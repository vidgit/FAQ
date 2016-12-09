public class Reverse{
    public static int reverse(int a) {
        int x=0;
        int t=a;
        while(t!=0){
            System.out.println(x);
            if(x*10l+t%10>Integer.MAX_VALUE||x*10l+t%10<Integer.MIN_VALUE)
                return 0;
            x=x*10+t%10;
            t/=10;
        }
        return x;
            
    }
    public static void main(String[] args) {
        System.out.println(reverse(1146467285));
    }
}