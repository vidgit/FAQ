public class HCF{
    public static int gcd(int a, int b) {
        if(a>b){
            int x=a;
            a=b;
            b=x;
        }
        
        while(a!=0){
            int temp=b%a;
            b=a;
            a=temp;
        }
        return b;
    }
    public static void main(String[] args) {
        gcd(69,3);
    }
}